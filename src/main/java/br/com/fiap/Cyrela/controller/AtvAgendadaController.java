package br.com.fiap.Cyrela.controller;

import br.com.fiap.Cyrela.model.dto.AtvAgendadaDTO;
import br.com.fiap.Cyrela.model.entity.AtvAgendadaEntity;
import br.com.fiap.Cyrela.repository.AtvAgendadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/atividades-agendadas")
public class AtvAgendadaController {

    @Autowired
    AtvAgendadaRepository repository;

    //http://localhost:8080/cyrela/atividades-agendadas
    @GetMapping
    public List<AtvAgendadaDTO> listar(){
        List<AtvAgendadaEntity> entities = repository.findAll();
        return AtvAgendadaDTO.parseToDTO(entities);
    }

    //http://localhost:8080/cyrela/atividades-agendadas/empreendimentos?empreendimento=Lins+de+Vasconcelos
    @GetMapping("/empreendimentos")
    public List<AtvAgendadaDTO> listarPorEmpreendimento(String empreendimento) {
        if (empreendimento == null) {
            List<AtvAgendadaEntity> entities = repository.findAll();
            return AtvAgendadaDTO.parseToDTO(entities);
        } else {
            List<AtvAgendadaEntity> entities = repository.listarPorEmpreendimento(empreendimento);
            return AtvAgendadaDTO.parseToDTO(entities);
        }
    }

    //http://localhost:8080/cyrela/atividades-agendadas/empreendimentos/quantidade-abertos?empreendimento=Lins+de+Vasconcelos
    @GetMapping("/empreendimentos/quantidade-abertos")
    public Long contar(String empreendimento) {
        String entity = repository.contarVisitasAbertasPorEmpreendimento(empreendimento);
        Long quantidade = Long.parseLong(entity);
        return quantidade;
    }

//    @GetMapping("/abertos")
//    public List<AtvAgendadaDTO> listarAgendamentosAbertos(@PathVariable("data")String data) {
//        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
//        SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
//        String dataFormatada = null;
//        try {
//            dataFormatada = formatt.format(format.parse(data));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        List<AtvAgendadaEntity> entities = repository.agendamentosAbertosDetalhes(dataFormatada);
//        return AtvAgendadaDTO.parseToDTO(entities);
//    }
}
