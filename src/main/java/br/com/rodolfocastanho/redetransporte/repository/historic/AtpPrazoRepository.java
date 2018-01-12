package br.com.rodolfocastanho.redetransporte.repository.historic;

import br.com.rodolfocastanho.redetransporte.entity.historic.AtpPrazo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtpPrazoRepository extends JpaRepository<AtpPrazo, Long> {



}
