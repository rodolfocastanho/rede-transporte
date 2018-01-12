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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Calendar getDataRt() {
        return dataRt;
    }

    public void setDataRt(Calendar dataRt) {
        this.dataRt = dataRt;
    }

    public Calendar getDataGa() {
        return dataGa;
    }

    public void setDataGa(Calendar dataGa) {
        this.dataGa = dataGa;
    }

    public Calendar getPrazoOriginal() {
        return prazoOriginal;
    }

    public void setPrazoOriginal(Calendar prazoOriginal) {
        this.prazoOriginal = prazoOriginal;
    }

    public Calendar getPrazoAgendado() {
        return prazoAgendado;
    }

    public void setPrazoAgendado(Calendar prazoAgendado) {
        this.prazoAgendado = prazoAgendado;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public StatusAtp getStatusAtp() {
        return statusAtp;
    }

    public void setStatusAtp(StatusAtp statusAtp) {
        this.statusAtp = statusAtp;
    }

    public Usuario getGestor() {
        return gestor;
    }

    public void setGestor(Usuario gestor) {
        this.gestor = gestor;
    }

    public Calendar getConclusaoAtp() {
        return conclusaoAtp;
    }

    public void setConclusaoAtp(Calendar conclusaoAtp) {
        this.conclusaoAtp = conclusaoAtp;
    }

    public Calendar getConclusaoTarefa() {
        return conclusaoTarefa;
    }

    public void setConclusaoTarefa(Calendar conclusaoTarefa) {
        this.conclusaoTarefa = conclusaoTarefa;
    }

    public List<Ga> getGas() {
        return gas;
    }

    public void setGas(List<Ga> gas) {
        this.gas = gas;
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

    public List<AtpStatus> getHistoricoStatus() {
        return historicoStatus;
    }

    public void setHistoricoStatus(List<AtpStatus> historicoStatus) {
        this.historicoStatus = historicoStatus;
    }

    public List<AtpPrazo> getHistoricoPrazo() {
        return historicoPrazo;
    }

    public void setHistoricoPrazo(List<AtpPrazo> historicoPrazo) {
        this.historicoPrazo = historicoPrazo;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
