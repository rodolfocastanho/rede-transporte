package br.com.rodolfocastanho.redetransporte.entity.historic;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusAtp;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_hist_atp_status")
public class AtpStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Atp atp;

    @OneToOne
    @JoinColumn
    private StatusAtp status;

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

    public StatusAtp getStatus() {
        return status;
    }

    public void setStatus(StatusAtp status) {
        this.status = status;
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
