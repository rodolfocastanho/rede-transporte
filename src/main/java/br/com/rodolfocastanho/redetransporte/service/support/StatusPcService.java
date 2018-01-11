package br.com.rodolfocastanho.redetransporte.service.support;

import br.com.rodolfocastanho.redetransporte.repository.support.StatusPcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusPcService {

    @Autowired
    private StatusPcRepository statusPcRepository;



}
