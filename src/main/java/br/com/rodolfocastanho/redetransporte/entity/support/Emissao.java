package br.com.rodolfocastanho.redetransporte.entity.support;

public enum Emissao {

    WCD("WCD"),
    EXTERNO("Externo");

    private String TipoEmissao;

    Emissao(String tipoEmissao) {
        TipoEmissao = tipoEmissao;
    }

    public String getTipoEmissao() {
        return TipoEmissao;
    }

}
