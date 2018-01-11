package br.com.rodolfocastanho.redetransporte.repository.support;

import br.com.rodolfocastanho.redetransporte.entity.support.StatusGa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusGaRepository extends JpaRepository<StatusGa, String> {



}
