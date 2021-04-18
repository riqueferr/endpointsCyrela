package br.com.fiap.Cyrela.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_ATV_AGENDADA")
public class AtvAgendadaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AGENDA")
    private Long id;

    @Column(name = "ACTUALSTART")
    private LocalDateTime dataInicio;

    @Column(name = "ACTUALEND")
    private LocalDateTime dataTermino;

    @Column(name = "PJO_TIPODEATIVIDADE")
    private String tipoAtividade;

    @Column(name = "SUBJECT")
    private String assunto;

    @ManyToOne
    @JoinColumn(name = "PJO_EMPREENDIMENTOID")
    private EmpreendimentoEntity empreendimento;

    @ManyToOne
    @JoinColumn(name = "PJO_BLOCOID")
    private BlocoEntity bloco;

    @ManyToOne
    @JoinColumn(name = "PJO_UNIDADEID")
    private UnidadeEntity unidade;

    public AtvAgendadaEntity(Long id, LocalDateTime dataInicio, LocalDateTime dataTermino, String tipoAtividade, String assunto, EmpreendimentoEntity empreendimento, BlocoEntity bloco, UnidadeEntity unidade) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.tipoAtividade = tipoAtividade;
        this.assunto = assunto;
        this.empreendimento = empreendimento;
        this.bloco = bloco;
        this.unidade = unidade;
    }

    public AtvAgendadaEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDateTime dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
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

    public UnidadeEntity getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeEntity unidade) {
        this.unidade = unidade;
    }
}
