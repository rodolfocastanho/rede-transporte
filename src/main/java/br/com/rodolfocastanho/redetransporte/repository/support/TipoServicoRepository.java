package br.com.rodolfocastanho.redetransporte.repository.support;

import br.com.rodolfocastanho.redetransporte.entity.support.TipoServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoServicoRepository extends JpaRepository<TipoServico, String> {



}
