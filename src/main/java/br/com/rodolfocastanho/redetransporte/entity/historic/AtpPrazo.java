package br.com.rodolfocastanho.redetransporte.entity.historic;

import br.com.rodolfocastanho.redetransporte.entity.Atp;
import br.com.rodolfocastanho.redetransporte.entity.Usuario;
import br.com.rodolfocastanho.redetransporte.entity.support.Ofensor;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_hist_atp_prazo")
public class AtpPrazo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
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

}
