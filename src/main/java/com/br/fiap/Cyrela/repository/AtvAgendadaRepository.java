package com.br.fiap.Cyrela.repository;

import com.br.fiap.Cyrela.model.entity.AtvAgendadaEntity;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface AtvAgendadaRepository extends JpaRepository<AtvAgendadaEntity, Long> {

    @Query("SELECT a " +
            "FROM AtvAgendadaEntity a " +
            "WHERE a.empreendimento.nome = :empreendimento")
    List<AtvAgendadaEntity> listarPorEmpreendimento(@Param("empreendimento") String empreendimento);


    @Query("SELECT COUNT(a.empreendimento.nome) " +
            "FROM AtvAgendadaEntity a " +
            "WHERE a.empreendimento.nome = :empreendimento")
    String contarVisitasAbertasPorEmpreendimento(@Param("empreendimento") String empreendimento);


    @Query("SELECT a " +
            "FROM AtvAgendadaEntity a " +
            "WHERE a.dataTermino > :data")
    List<AtvAgendadaEntity> agendamentosAbertosDetalhes(@Param("data") String data);
}
