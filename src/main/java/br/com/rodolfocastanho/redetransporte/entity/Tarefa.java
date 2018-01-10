package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.support.StatusTarefa;
import br.com.rodolfocastanho.redetransporte.entity.support.TipoTarefa;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn
    private Atp atp;

    @OneToOne
    @JoinColumn
    private Usuario responsavel;

    @OneToOne
    @JoinColumn
    private TipoTarefa tipo;

    @Column(length = 300)
    private String descricao;

    @OneToOne
    @JoinColumn
    private StatusTarefa status;

    @Column
    private Calendar dataAgendada;

    @OneToOne
    @JoinColumn
    private Usuario atendente;

    @Column(length = 300)
    private String solucao;

    @Column
    private Calendar dataSolucao;


}
