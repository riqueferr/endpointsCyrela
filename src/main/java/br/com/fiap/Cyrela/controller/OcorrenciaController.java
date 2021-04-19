package br.com.fiap.Cyrela.controller;

import br.com.fiap.Cyrela.model.dto.OcorrenciaDTO;
import br.com.fiap.Cyrela.model.entity.OcorrenciaEntity;
import br.com.fiap.Cyrela.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {


    @Autowired
    OcorrenciaRepository repository;

    //http://localhost:8080/cyrela/ocorrencias
    @GetMapping
    public List<OcorrenciaDTO> listarTodasAsOcorrencias() {
        List<OcorrenciaEntity> entities = repository.findAll();
        return OcorrenciaDTO.parseToDTO(entities);
    }

    //http://localhost:8080/cyrela/ocorrencias/3
    @GetMapping("/{id}")
    public ResponseEntity<OcorrenciaDTO> buscarPorId(@PathVariable("id") Long id) {
        Optional<OcorrenciaEntity> entity = repository.findById(id);
        if(entity.isPresent()) {
            return ResponseEntity.ok(new OcorrenciaDTO(entity.get()));
        }
        return ResponseEntity.notFound().build();
    }

    //http://localhost:8080/cyrela/ocorrencias/ticket/876621213
    @GetMapping("/ticket/{ticket}")
    public ResponseEntity<OcorrenciaDTO> buscarPorTicket(@PathVariable("ticket") Long ticket) {
        Optional<OcorrenciaEntity> entity = repository.buscarPorTicket(ticket);
        if(entity.isPresent()) {
            return ResponseEntity.ok(new OcorrenciaDTO(entity.get()));
        }
        return ResponseEntity.notFound().build();
    }
}
