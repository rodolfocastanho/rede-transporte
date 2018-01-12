package br.com.rodolfocastanho.redetransporte.service.historic;

import br.com.rodolfocastanho.redetransporte.entity.historic.AtpStatus;
import br.com.rodolfocastanho.redetransporte.repository.historic.AtpStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtpStatusService {

    @Autowired
    private AtpStatusRepository atpStatusRepository;

    public AtpStatus Save(AtpStatus atpStatus){
        return atpStatusRepository.save(atpStatus);
    }



}
