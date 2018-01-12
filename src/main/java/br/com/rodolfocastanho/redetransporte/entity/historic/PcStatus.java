package br.com.rodolfocastanho.redetransporte.entity.historic;

import br.com.rodolfocastanho.redetransporte.entity.Pedido;
import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusPc;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_hist_pc_status")
public class PcStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Pedido pedido;

    @OneToOne
    @JoinColumn
    private StatusPc status;

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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public StatusPc getStatus() {
        return status;
    }

    public void setStatus(StatusPc status) {
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
