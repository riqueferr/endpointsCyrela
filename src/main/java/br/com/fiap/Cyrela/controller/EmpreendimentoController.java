package br.com.fiap.Cyrela.controller;

import br.com.fiap.Cyrela.model.dto.EmpreendimentoDTO;
import br.com.fiap.Cyrela.model.entity.EmpreendimentoEntity;
import br.com.fiap.Cyrela.repository.EmpreendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empreendimentos")
public class EmpreendimentoController {

    @Autowired
    EmpreendimentoRepository repository;


    @GetMapping
    public List<EmpreendimentoDTO> listar() {
            List<EmpreendimentoEntity> entities = repository.findAll();
        return EmpreendimentoDTO.parseToDTO(entities);
    }
}
