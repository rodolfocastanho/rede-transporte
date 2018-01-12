package br.com.rodolfocastanho.redetransporte.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(length = 10)
    private String login;

    @NotBlank
    @Column(length = 100)
    private String nome;

    @Column(length = 200)
    private String senha;

    @NotBlank
    @Column(length = 100)
    private String email;

    @NotNull
    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "tipoPerfil")
    private Perfil tipoPerfil;

    @Transient
    private boolean resetaSenha;

    @Column
    private int primeiroAcesso;

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(Perfil tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    public boolean isResetaSenha() {
        return resetaSenha;
    }

    public void setResetaSenha(boolean resetaSenha) {
        this.resetaSenha = resetaSenha;
    }

    public int getPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(int primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }
}