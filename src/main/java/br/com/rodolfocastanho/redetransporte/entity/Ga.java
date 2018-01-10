package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.support.Fornecedor;
import br.com.rodolfocastanho.redetransporte.entity.support.Tecnologia;
import br.com.rodolfocastanho.redetransporte.entity.support.TipoServico;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_ga")
public class Ga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Atp atp;

    @Column
    private String encaminhamento;

    @OneToOne
    @JoinColumn
    private Fornecedor fornecedor;

    @OneToOne
    @JoinColumn
    private TipoServico servico;

    @OneToOne
    @JoinColumn
    private Tecnologia tecnologia;

    @Column
    private int alcas;

    @Column(name = "data_registro")
    private Calendar dataRegistro;

    @OneToOne
    @JoinColumn(name = "usuario_registro")
    private Usuario usuarioRegistro;

    @OneToMany(mappedBy = "ga")
    private List<Pedido> pedidos = new ArrayList<>();


}
