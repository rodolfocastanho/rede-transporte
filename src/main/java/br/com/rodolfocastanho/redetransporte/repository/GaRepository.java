package br.com.rodolfocastanho.redetransporte.repository;

import br.com.rodolfocastanho.redetransporte.entity.Ga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GaRepository extends JpaRepository<Ga, Long> {



}
