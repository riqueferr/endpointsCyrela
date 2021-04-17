package br.com.fiap.Cyrela.model.dto;

import br.com.fiap.Cyrela.model.entity.EmpreendimentoEntity;

import java.util.List;
import java.util.stream.Collectors;

public class EmpreendimentoDTO {

    private Long id;
    private String nome;

    public EmpreendimentoDTO(EmpreendimentoEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
    }

    public static List<EmpreendimentoDTO>parseToDTO(List<EmpreendimentoEntity> entities) {
        return entities.stream().map(EmpreendimentoDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
