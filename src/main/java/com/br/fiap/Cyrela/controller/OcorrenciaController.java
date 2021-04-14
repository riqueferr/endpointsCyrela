package com.br.fiap.Cyrela.controller;

import com.br.fiap.Cyrela.model.dto.OcorrenciaDTO;
import com.br.fiap.Cyrela.model.entity.OcorrenciaEntity;
import com.br.fiap.Cyrela.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {


    @Autowired
    OcorrenciaRepository repository;

    @GetMapping
    public List<OcorrenciaDTO> listarTodasAsOcorrencias() {
        List<OcorrenciaEntity> entities = repository.findAll();
        return OcorrenciaDTO.parseToDTO(entities);
    }


    @GetMapping("/{id}")
    public ResponseEntity<OcorrenciaDTO> buscarPorId(@Param("id") Long id) {
        Optional<OcorrenciaEntity> entity = repository.findById(id);
        if(entity.isPresent()) {
            return ResponseEntity.ok(new OcorrenciaDTO(entity.get()));
        }
        return ResponseEntity.notFound().build();
    }
}
