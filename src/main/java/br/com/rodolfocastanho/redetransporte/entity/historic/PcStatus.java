package br.com.rodolfocastanho.redetransporte.entity.historic;

import br.com.rodolfocastanho.redetransporte.entity.Pedido;
import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.entity.support.StatusPc;

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
    private Pedido pedido;

    @OneToOne
    @JoinColumn
    private StatusPc status;

    @Column(name = "data_registro")
    private Calendar dataRegistro;

    @OneToOne
    @JoinColumn(name = "usuario_registro")
    private Usuario usuarioRegistro;

}
