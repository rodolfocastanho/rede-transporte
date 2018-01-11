package br.com.rodolfocastanho.redetransporte.service.support;

import br.com.rodolfocastanho.redetransporte.repository.support.TipoTarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoTarefaService {

    @Autowired
    private TipoTarefaRepository tipoTarefaRepository;



}
