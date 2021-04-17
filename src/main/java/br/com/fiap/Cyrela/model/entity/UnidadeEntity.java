package br.com.fiap.Cyrela.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_UNIDADE")
public class UnidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UNIDADE")
    private Long id;

    @Column(name = "NR_UNIDADE")
    private String numero;


    public UnidadeEntity(Long id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public UnidadeEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
