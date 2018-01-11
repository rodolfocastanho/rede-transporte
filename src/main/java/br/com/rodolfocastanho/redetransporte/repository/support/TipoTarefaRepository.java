package br.com.rodolfocastanho.redetransporte.repository.support;

import br.com.rodolfocastanho.redetransporte.entity.support.TipoTarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTarefaRepository extends JpaRepository<TipoTarefa, String> {



}
