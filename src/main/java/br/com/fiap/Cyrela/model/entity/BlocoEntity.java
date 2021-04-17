package br.com.fiap.Cyrela.model.entity;

import javax.persistence.*;
import java.util.Objects;

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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlocoEntity that = (BlocoEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
