package br.com.rodolfocastanho.redetransporte.service;

import br.com.rodolfocastanho.redetransporte.entity.Pedido;
import br.com.rodolfocastanho.redetransporte.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> ListAll(){
        return pedidoRepository.findAll();
    }

    public Pedido Save(Pedido pedido){
        return pedidoRepository.save(pedido);
    }



}
