package br.com.rodolfocastanho.redetransporte.repository;

import br.com.rodolfocastanho.redetransporte.entity.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {



}
