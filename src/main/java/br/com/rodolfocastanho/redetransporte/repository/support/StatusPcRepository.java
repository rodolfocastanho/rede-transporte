package br.com.rodolfocastanho.redetransporte.repository.support;

import br.com.rodolfocastanho.redetransporte.entity.support.StatusPc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusPcRepository extends JpaRepository<StatusPc, String> {



}
