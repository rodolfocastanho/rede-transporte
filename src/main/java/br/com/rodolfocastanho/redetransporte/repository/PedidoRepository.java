package br.com.rodolfocastanho.redetransporte.repository;

import br.com.rodolfocastanho.redetransporte.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {



}
