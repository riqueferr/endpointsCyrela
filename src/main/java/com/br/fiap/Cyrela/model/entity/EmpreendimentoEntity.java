package com.br.fiap.Cyrela.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_EMPREENDIMENTO")
public class EmpreendimentoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EMPREENDIMENTO")
    private Long id;

    @Column(name = "NM_EMPREENDIMENTO")
    private String nome;

    public EmpreendimentoEntity(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public EmpreendimentoEntity() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpreendimentoEntity that = (EmpreendimentoEntity) o;
        return id.equals(that.id) && nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
