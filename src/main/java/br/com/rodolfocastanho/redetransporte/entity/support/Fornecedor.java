package br.com.rodolfocastanho.redetransporte.entity.support;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_sup_fornecedor")
public class Fornecedor {

    @Id
    @Column(length = 5)
    private String id;

    @Column(length = 20)
    private String descricao;

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
