package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusSolicitacao;
import br.com.rodolfocastanho.redetransporte.entity.support.TipoSolicitacao;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
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

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public TipoSolicitacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoSolicitacao tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusSolicitacao getStatus() {
        return status;
    }

    public void setStatus(StatusSolicitacao status) {
        this.status = status;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
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
