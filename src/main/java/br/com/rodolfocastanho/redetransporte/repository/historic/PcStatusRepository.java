package br.com.rodolfocastanho.redetransporte.repository.historic;

import br.com.rodolfocastanho.redetransporte.entity.historic.PcStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcStatusRepository extends JpaRepository<PcStatus, Long> {



}
