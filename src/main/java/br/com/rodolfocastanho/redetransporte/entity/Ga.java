package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.support.Fornecedor;
import br.com.rodolfocastanho.redetransporte.entity.support.Tecnologia;
import br.com.rodolfocastanho.redetransporte.entity.support.TipoServico;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Atp getAtp() {
        return atp;
    }

    public void setAtp(Atp atp) {
        this.atp = atp;
    }

    public String getEncaminhamento() {
        return encaminhamento;
    }

    public void setEncaminhamento(String encaminhamento) {
        this.encaminhamento = encaminhamento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoServico getServico() {
        return servico;
    }

    public void setServico(TipoServico servico) {
        this.servico = servico;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getAlcas() {
        return alcas;
    }

    public void setAlcas(int alcas) {
        this.alcas = alcas;
    }

    public Calendar getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Calendar dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Usuario getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Usuario usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
