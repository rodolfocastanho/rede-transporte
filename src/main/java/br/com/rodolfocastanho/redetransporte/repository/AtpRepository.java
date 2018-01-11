package br.com.rodolfocastanho.redetransporte.repository;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtpRepository extends JpaRepository<Atp, String> {



}
