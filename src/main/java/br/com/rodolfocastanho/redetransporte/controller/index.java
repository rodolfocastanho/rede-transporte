package br.com.rodolfocastanho.redetransporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class index {

    private final String INDEX = "index";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return INDEX;
    }

}
