package br.com.sanity.model;

public class Pergunta {

    private int id;
    private String texto;
    private int idFormulario;
    private boolean ativo;

    public Pergunta(int id, String texto, int idFormulario, boolean ativo) {
        this.id = id;
        this.texto = texto;
        this.idFormulario = idFormulario;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
