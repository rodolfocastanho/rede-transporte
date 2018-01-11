package br.com.rodolfocastanho.redetransporte.service.support;

import br.com.rodolfocastanho.redetransporte.repository.support.OfensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfensorService {

    @Autowired
    private OfensorRepository ofensorRepository;



}
