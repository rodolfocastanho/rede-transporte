package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.historic.PcStatus;
import br.com.rodolfocastanho.redetransporte.entity.support.Emissao;
import br.com.rodolfocastanho.redetransporte.entity.support.Fornecedor;
import br.com.rodolfocastanho.redetransporte.entity.support.SolicitantePc;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusPc;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Ga ga;

    @Column
    private String numero;

    @Column
    private String pep;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "emissao")
    private Emissao tipoEmissao;

    @OneToOne
    @JoinColumn
    private SolicitantePc solicitante;

    @OneToOne
    @JoinColumn
    private Fornecedor fornecedor;

    @OneToOne
    @JoinColumn
    private StatusPc status;

    @OneToMany(mappedBy = "pedido")
    //@JoinColumn(referencedColumnName = "pedido")
    private List<PcStatus> historico = new ArrayList<>();


}
