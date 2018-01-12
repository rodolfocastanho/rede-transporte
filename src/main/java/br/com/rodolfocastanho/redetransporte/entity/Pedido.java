package br.com.rodolfocastanho.redetransporte.entity;

import br.com.rodolfocastanho.redetransporte.entity.historic.PcStatus;
import br.com.rodolfocastanho.redetransporte.entity.support.Emissao;
import br.com.rodolfocastanho.redetransporte.entity.support.Fornecedor;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusPc;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
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
    private Usuario solicitante;

    @OneToOne
    @JoinColumn
    private Fornecedor fornecedor;

    @OneToOne
    @JoinColumn
    private StatusPc status;

    @OneToMany(mappedBy = "pedido")
    //@JoinColumn(referencedColumnName = "pedido")
    private List<PcStatus> historico = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ga getGa() {
        return ga;
    }

    public void setGa(Ga ga) {
        this.ga = ga;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPep() {
        return pep;
    }

    public void setPep(String pep) {
        this.pep = pep;
    }

    public Emissao getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(Emissao tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public StatusPc getStatus() {
        return status;
    }

    public void setStatus(StatusPc status) {
        this.status = status;
    }

    public List<PcStatus> getHistorico() {
        return historico;
    }

    public void setHistorico(List<PcStatus> historico) {
        this.historico = historico;
    }
}
