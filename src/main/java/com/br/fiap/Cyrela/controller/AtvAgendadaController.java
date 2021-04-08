package com.br.fiap.Cyrela.controller;

import com.br.fiap.Cyrela.model.dto.AtvAgendadaDTO;
import com.br.fiap.Cyrela.model.dto.EmpreendimentoDTO;
import com.br.fiap.Cyrela.model.entity.AtvAgendadaEntity;
import com.br.fiap.Cyrela.model.entity.EmpreendimentoEntity;
import com.br.fiap.Cyrela.repository.AtvAgendadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
    @RequestMapping("/atividades-agendadas")
public class AtvAgendadaController {

    @Autowired
    AtvAgendadaRepository repository;

    @GetMapping
    public List<AtvAgendadaDTO> listar(){
        List<AtvAgendadaEntity> entities = repository.findAll();
        return AtvAgendadaDTO.parseToDTO(entities);
    }

    //http://localhost:8080/atividades-agendadas/empreendimentos?empreendimento=Lins+de+Vasconcelos
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

    //http://localhost:8080/atividades-agendadas/empreendimentos/quantidade-abertos?empreendimento=Lins+de+Vasconcelos
    @GetMapping("/empreendimentos/quantidade-abertos")
    public Long contar(String empreendimento) {
        String entity = repository.contarVisitasAbertasPorEmpreendimento(empreendimento);
        Long quantidade = Long.parseLong(entity);
        return quantidade;
    }

    @GetMapping("/abertos/{data}")
    public List<AtvAgendadaDTO> listarAgendamentosAbertos(@PathVariable("data")String data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
        formatt.format(format.parse(data));
        List<AtvAgendadaEntity> entities = repository.agendamentosAbertosDetalhes(data);
        return AtvAgendadaDTO.parseToDTO(entities);
    }
}
