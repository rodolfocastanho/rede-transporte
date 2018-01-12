package br.com.rodolfocastanho.redetransporte.service;

import br.com.rodolfocastanho.redetransporte.entity.Tarefa;
import br.com.rodolfocastanho.redetransporte.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> ListAll(){
        return tarefaRepository.findAll();
    }

    public Tarefa Save(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }



}
