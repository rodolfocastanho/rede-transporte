package br.com.rodolfocastanho.redetransporte.entity;

public enum Perfil {

    ADMIN("Administrador"),
    OPER("Operador");

    private String tipoPerfil;

    Perfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }

    public String getTipoPerfil() {
        return tipoPerfil;
    }

}
