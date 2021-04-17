package br.com.fiap.Cyrela.model.dto;

import br.com.fiap.Cyrela.model.entity.EmpreendimentoEntity;
import br.com.fiap.Cyrela.model.entity.AtvAgendadaEntity;
import br.com.fiap.Cyrela.model.entity.BlocoEntity;
import br.com.fiap.Cyrela.model.entity.UnidadeEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class AtvAgendadaDTO {

    private Long id;
    private LocalDateTime dataInicio;
    private LocalDateTime dataTermino;
    private String tipoAtividade;
    private String assunto;
    private EmpreendimentoEntity empreendimento;
    private BlocoEntity bloco;
    private UnidadeEntity unidade;


    public AtvAgendadaDTO(AtvAgendadaEntity entity) {
        this.id = entity.getId();
        this.dataInicio = entity.getDataInicio();
        this.dataTermino = entity.getDataTermino();
        this.tipoAtividade = entity.getTipoAtividade();
        this.assunto = entity.getAssunto();
        this.empreendimento = entity.getEmpreendimento();
        this.bloco = entity.getBloco();
        this.unidade = entity.getUnidade();
    }

    public static List<AtvAgendadaDTO> parseToDTO(List<AtvAgendadaEntity> entities) {
        return entities.stream().map(AtvAgendadaDTO::new).collect(Collectors.toList());
    }

    public AtvAgendadaDTO() {
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
