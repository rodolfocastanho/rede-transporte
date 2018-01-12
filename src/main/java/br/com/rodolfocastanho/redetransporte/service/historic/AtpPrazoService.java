package br.com.rodolfocastanho.redetransporte.service.historic;

import br.com.rodolfocastanho.redetransporte.entity.historic.AtpPrazo;
import br.com.rodolfocastanho.redetransporte.repository.historic.AtpPrazoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtpPrazoService {

    @Autowired
    private AtpPrazoRepository atpPrazoRepository;

    public AtpPrazo Save(AtpPrazo atpPrazo){
        return atpPrazoRepository.save(atpPrazo);
    }



}
