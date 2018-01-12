package br.com.rodolfocastanho.redetransporte.service;

import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> ListAll(){
        return usuarioRepository.findAll();
    }

    public Usuario Save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }



}
