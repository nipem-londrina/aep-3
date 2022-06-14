package br.com.sanity.model;

public class Usuario {

    int id;
    char perfil;
    int idEmpresa;
    String nome;
    String email;
    String cpf;
    boolean ativo;

    public Usuario() {
    }
    
    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public static boolean validarCpf(String cpf) {

        int o = 0;
        int sum1 = 0;
        int sum2 = 0;
        boolean rep = true;

        for (int i = 0; i < 13; i++) {
            if (i % 4 != 3) {
                //multiplica e soma os digitos. sum1 não recebe o digito 12
                sum1 += (i != 12) ? ((cpf.charAt(i) - '0') * (10 - i + o)) : 0;
                sum2 += (cpf.charAt(i) - '0') * (11 - i + o);
                //verifica se todos iguais
                rep = rep ? cpf.charAt(0) == cpf.charAt(i) : false;
            } else {
                //pula pontos e traços
                o++;
            }
        }

        //retorna se não é repetido e se as somas batem
        return !rep && sum1 * 10 % 11 % 10 == cpf.charAt(12) - '0' && sum2 * 10 % 11 % 10 == cpf.charAt(13) - '0';
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
