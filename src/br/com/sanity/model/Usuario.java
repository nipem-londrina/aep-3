package br.com.sanity.model;

public class Usuario {

    int id;
    char perfil;
    int idEmpresa;
    String nome;
    String email;
    String cpf;
    boolean ativo;
    
    public Usuario() {}
    
    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getEmpresa() {
        return br.com.sanity.connection.ConnectionFactory.getEmpresa(this.idEmpresa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getPerfil() {
        return perfil;
    }

    public void setPerfil(char perfil) {
        this.perfil = perfil;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
