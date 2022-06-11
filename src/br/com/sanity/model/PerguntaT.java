
package br.com.sanity.model;


public class PerguntaT {
    private int idPergunta;
    private String texto_Pergunta;
    private String tipo_Resposta;
    private String comentario_Pergunta;
    private int idFormulario;

    public int getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getTexto_Pergunta() {
        return texto_Pergunta;
    }

    public void setTexto_Pergunta(String texto_Pergunta) {
        this.texto_Pergunta = texto_Pergunta;
    }

    public String getTipo_Resposta() {
        return tipo_Resposta;
    }

    public void setTipo_Resposta(String tipo_Resposta) {
        this.tipo_Resposta = tipo_Resposta;
    }

    public String getComentario_Pergunta() {
        return comentario_Pergunta;
    }

    public void setComentario_Pergunta(String comentario_Pergunta) {
        this.comentario_Pergunta = comentario_Pergunta;
    }

    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }
}
