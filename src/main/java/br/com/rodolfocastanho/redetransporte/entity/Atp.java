package br.com.rodolfocastanho.redetransporte.entity;


import br.com.rodolfocastanho.redetransporte.entity.historic.AtpPrazo;
import br.com.rodolfocastanho.redetransporte.entity.historic.AtpStatus;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusAtp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_atp")
public class Atp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private String numero;

    @Column
    private String cliente;

    @Column
    private Calendar dataAbertura;

    @Column
    private Calendar dataRt;

    @Column
    private Calendar dataGa;

    @Column
    private Calendar prazoOriginal;

    @Column
    private Calendar prazoAgendado;

    @Column
    private Float valor;

    @OneToOne
    @JoinColumn
    private StatusAtp statusAtp;

    @OneToOne
    @JoinColumn
    private Usuario gestor;

    @Column
    private Calendar conclusaoAtp;

    @Column
    private Calendar conclusaoTarefa;

    @OneToMany(mappedBy = "atp")
    private List<Ga> gas = new ArrayList<>();

    @OneToMany(mappedBy = "atp")
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    @OneToMany(mappedBy = "atp")
    private List<AtpStatus> historicoStatus = new ArrayList<>();

    @OneToMany(mappedBy = "atp")
    private List<AtpPrazo> historicoPrazo = new ArrayList<>();

    @OneToMany(mappedBy = "atp")
    private List<Tarefa> tarefas = new ArrayList<>();




}
