package aep;

public class Usuario {

    int id;
    char perfil;
    String senha;
    int idEmpresa;
    String nome;
    String email;
    String cpf;
    byte status;

    public int getId() {
        return id;
    }

    public void setId(int idUsuario) {
        this.id = idUsuario;
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
