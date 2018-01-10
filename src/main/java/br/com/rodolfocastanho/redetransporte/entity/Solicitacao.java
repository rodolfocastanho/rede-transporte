package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusSolicitacao;
import br.com.rodolfocastanho.redetransporte.entity.support.TipoSolicitacao;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_solicitacao")
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn
    private Atp atp;

    @OneToOne
    @JoinColumn
    private Usuario solicitante;

    @OneToOne
    @JoinColumn
    private TipoSolicitacao tipo;

    @Column(length = 300)
    private String descricao;

    @OneToOne
    @JoinColumn
    private StatusSolicitacao status;

    @Column
    private Calendar dataAbertura;

    @OneToOne
    @JoinColumn
    private Usuario atendente;

    @Column(length = 300)
    private String solucao;

    @Column
    private Calendar dataSolucao;


}
