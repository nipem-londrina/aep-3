package br.com.sanity.model;

public class Formulario {

    private int id;
    private String titulo;
    private String descricao;
    private int idEmpresa;
    private boolean ativo;
    
    public Formulario() {
    }

    public Formulario(int id) {
        this.id = id;
    }
    
    public Formulario(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
