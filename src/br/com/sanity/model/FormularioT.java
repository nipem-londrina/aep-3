
package br.com.sanity.model;
    
import java.util.Date;


public class FormularioT {
    private int idFormulario;
    private String titulo_Formulario_Padrao;
    private String descricao_Formulario_Padrao;
    private Date dataPreenchido;
    private int idUsuario;

    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    public String getTitulo_Formulario_Padrao() {
        return titulo_Formulario_Padrao;
    }

    public void setTitulo_Formulario_Padrao(String titulo_Formulario_Padrao) {
        this.titulo_Formulario_Padrao = titulo_Formulario_Padrao;
    }

    public String getDescricao_Formulario_Padrao() {
        return descricao_Formulario_Padrao;
    }

    public void setDescricao_Formulario_Padrao(String descricao_Formulario_Padrao) {
        this.descricao_Formulario_Padrao = descricao_Formulario_Padrao;
    }

    public Date getDataPreenchido() {
        return dataPreenchido;
    }

    public void setDataPreenchido(Date dataPreenchido) {
        this.dataPreenchido = dataPreenchido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
