package br.com.rodolfocastanho.redetransporte.entity.historic;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.entity.support.Ofensor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_hist_atp_prazo")
public class AtpPrazo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Atp atp;

    @Column
    private Calendar prazo;

    @OneToOne
    @JoinColumn
    private Ofensor ofensor;

    @Column
    private String observacao;

    @Column(name = "data_registro")
    private Calendar dataRegistro;

    @OneToOne
    @JoinColumn(name = "usuario_registro")
    private Usuario usuarioRegistro;

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

    public Calendar getPrazo() {
        return prazo;
    }

    public void setPrazo(Calendar prazo) {
        this.prazo = prazo;
    }

    public Ofensor getOfensor() {
        return ofensor;
    }

    public void setOfensor(Ofensor ofensor) {
        this.ofensor = ofensor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
}
