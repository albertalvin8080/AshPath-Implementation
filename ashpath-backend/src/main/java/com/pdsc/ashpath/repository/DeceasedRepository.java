package com.pdsc.ashpath.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdsc.ashpath.domain.entity.Deceased;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface DeceasedRepository extends JpaRepository<Deceased, Long>
{
  @Query("SELECT d FROM Deceased d WHERE d.cremationEntry.id = :cremationID")
  List<Deceased> findAllDeceasedByQueueId(@Param("cremationID") Long cremationId);

  @Query("SELECT d FROM Deceased d WHERE d.grave.location = :graveLocation")
  List<Deceased> findAllDeceasedByGraveLocation(@Param("graveLocation") String graveLocation);

  @Query("SELECT d FROM Deceased d WHERE d.deathDate = :deathDate")
  List<Deceased> findAllDeceasedByDeathDate(@Param("deathDate") LocalDate deathDate);
}
