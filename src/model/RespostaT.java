
package model;


public class RespostaT {
    private int idResposta;
    private double resposta;
    private String comentario_resposta;
    private int idPergunta;

    public int getIdResposta() {
        return idResposta;
    }

    public void setIdResposta(int idResposta) {
        this.idResposta = idResposta;
    }

    public double getResposta() {
        return resposta;
    }

    public void setResposta(double resposta) {
        this.resposta = resposta;
    }

    public String getComentario_resposta() {
        return comentario_resposta;
    }

    public void setComentario_resposta(String comentario_resposta) {
        this.comentario_resposta = comentario_resposta;
    }

    public int getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }
    
}
