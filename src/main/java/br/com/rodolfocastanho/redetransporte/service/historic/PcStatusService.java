package br.com.rodolfocastanho.redetransporte.service.historic;

import br.com.rodolfocastanho.redetransporte.entity.historic.PcStatus;
import br.com.rodolfocastanho.redetransporte.repository.historic.PcStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcStatusService {

    @Autowired
    private PcStatusRepository pcStatusRepository;

    public PcStatus Save(PcStatus pcStatus){
        return pcStatusRepository.save(pcStatus);
    }



}
