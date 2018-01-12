package br.com.rodolfocastanho.redetransporte.service;

import br.com.rodolfocastanho.redetransporte.entity.Ga;
import br.com.rodolfocastanho.redetransporte.repository.GaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GaService {

    @Autowired
    private GaRepository gaRepository;

    public Ga Save(Ga ga){
        return gaRepository.save(ga);
    }



}
