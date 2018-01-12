package br.com.rodolfocastanho.redetransporte.repository;

import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
