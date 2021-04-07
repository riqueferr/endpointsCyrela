package com.br.fiap.Cyrela.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_OCORRENCIA")
public class OcorrenciaEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OCORRENCIA")
    private Long id;

    @Column(name = "TICKETNUMBER")
    private Long numeroTicket;

    @Column(name = "PJO_CLIENTEDAUNIDADE ")
    private String clienteUnidade;

    @ManyToOne
    @JoinColumn(name = "PJO_EMPREENDIMENTOID")
    private EmpreendimentoEntity empreendimento;

    @ManyToOne
    @JoinColumn(name = "PJO_BLOCO")
    private BlocoEntity bloco;

    @Column(name = "PJO_BANDEIRA")
    private String bandeira;

    @ManyToOne
    @JoinColumn(name = "PJO_UNIDADE")
    private UnidadeEntity unidade;

    @Column(name = "DESCRIPTION")
    private String descricao;

    public OcorrenciaEntity(Long id, Long numeroTicket, String clienteUnidade, EmpreendimentoEntity empreendimento, BlocoEntity bloco, String bandeira, UnidadeEntity unidade, String descricao) {
        this.id = id;
        this.numeroTicket = numeroTicket;
        this.clienteUnidade = clienteUnidade;
        this.empreendimento = empreendimento;
        this.bloco = bloco;
        this.bandeira = bandeira;
        this.unidade = unidade;
        this.descricao = descricao;
    }

    public OcorrenciaEntity() {
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

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
