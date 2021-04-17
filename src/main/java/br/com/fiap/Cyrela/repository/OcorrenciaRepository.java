package br.com.fiap.Cyrela.repository;

import br.com.fiap.Cyrela.model.entity.OcorrenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface OcorrenciaRepository extends JpaRepository<OcorrenciaEntity, Long> {


    @Query("SELECT o " +
            "FROM OcorrenciaEntity o " +
            "WHERE o.numeroTicket = :ticket")
    Optional<OcorrenciaEntity> buscarPorTicket(@Param("ticket") Long ticket);
}
