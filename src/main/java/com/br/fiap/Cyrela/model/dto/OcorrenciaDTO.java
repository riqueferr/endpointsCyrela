package com.br.fiap.Cyrela.model.dto;

import com.br.fiap.Cyrela.model.entity.BlocoEntity;
import com.br.fiap.Cyrela.model.entity.EmpreendimentoEntity;
import com.br.fiap.Cyrela.model.entity.OcorrenciaEntity;
import com.br.fiap.Cyrela.model.entity.UnidadeEntity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class OcorrenciaDTO {

    private Long id;
    private Long numeroTicket;
    private String clienteUnidade;
    private EmpreendimentoEntity empreendimento;
    private BlocoEntity bloco;
    private String bandeira;
    private UnidadeEntity unidade;
    private String descricao;

    public OcorrenciaDTO(OcorrenciaEntity entity) {
        this.id = entity.getId();
        this.numeroTicket = entity.getNumeroTicket();
        this.clienteUnidade = entity.getClienteUnidade();
        this.empreendimento = entity.getEmpreendimento();
        //this.bloco = entity;
        this.bandeira = bandeira;
        this.unidade = unidade;
        this.descricao = descricao;
    }

    public OcorrenciaDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(Long numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getClienteUnidade() {
        return clienteUnidade;
    }

    public void setClienteUnidade(String clienteUnidade) {
        this.clienteUnidade = clienteUnidade;
    }

    public EmpreendimentoEntity getEmpreendimento() {
        return empreendimento;
    }

    public void setEmpreendimento(EmpreendimentoEntity empreendimento) {
        this.empreendimento = empreendimento;
    }

    public BlocoEntity getBloco() {
        return bloco;
    }

    public void setBloco(BlocoEntity bloco) {
        this.bloco = bloco;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public UnidadeEntity getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeEntity unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
