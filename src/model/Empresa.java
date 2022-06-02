
package model;


public class Empresa {
    private int idEmpresa;
    private String nome_Empresa;
    private String cnpj;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome_Empresa() {
        return nome_Empresa;
    }

    public void setNome_Empresa(String nome_Empresa) {
        this.nome_Empresa = nome_Empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
