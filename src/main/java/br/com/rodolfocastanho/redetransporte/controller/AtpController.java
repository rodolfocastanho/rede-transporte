package br.com.rodolfocastanho.redetransporte.controller;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import br.com.rodolfocastanho.redetransporte.service.AtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/atp")
public class AtpController {

    @Autowired
    private AtpService atpService;

    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public Atp Save(@RequestBody Atp atp){
        return atpService.Save(atp);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Atp> List(){
        return atpService.ListAll();
    }


}
