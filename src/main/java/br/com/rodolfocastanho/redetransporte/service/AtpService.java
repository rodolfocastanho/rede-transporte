package br.com.rodolfocastanho.redetransporte.service;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import br.com.rodolfocastanho.redetransporte.repository.AtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtpService {

    @Autowired
    private AtpRepository atpRepository;

    public List<Atp> ListAll(){
        return atpRepository.findAll();
    }

    public Atp Save(Atp atp){
        return atpRepository.save(atp);
    }



}
