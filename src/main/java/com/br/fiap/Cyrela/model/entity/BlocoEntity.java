package com.br.fiap.Cyrela.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_BLOCO")
public class BlocoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BLOCO")
    private Long id;

    @Column(name = "NM_BLOCO")
    private String nome;

    public BlocoEntity(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public BlocoEntity() {
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
