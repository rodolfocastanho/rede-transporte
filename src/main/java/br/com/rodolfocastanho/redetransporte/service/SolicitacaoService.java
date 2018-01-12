package br.com.rodolfocastanho.redetransporte.service;

import br.com.rodolfocastanho.redetransporte.entity.Solicitacao;
import br.com.rodolfocastanho.redetransporte.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitacaoService {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    public List<Solicitacao> ListAll(){
        return solicitacaoRepository.findAll();
    }

    public Solicitacao Save(Solicitacao solicitacao){
        return solicitacaoRepository.save(solicitacao);
    }



}
