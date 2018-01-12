package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.support.StatusTarefa;
import br.com.rodolfocastanho.redetransporte.entity.support.TipoTarefa;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
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

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Atp getAtp() {
        return atp;
    }

    public void setAtp(Atp atp) {
        this.atp = atp;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public TipoTarefa getTipo() {
        return tipo;
    }

    public void setTipo(TipoTarefa tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public Calendar getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(Calendar dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public Usuario getAtendente() {
        return atendente;
    }

    public void setAtendente(Usuario atendente) {
        this.atendente = atendente;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public Calendar getDataSolucao() {
        return dataSolucao;
    }

    public void setDataSolucao(Calendar dataSolucao) {
        this.dataSolucao = dataSolucao;
    }
}
