public class Esportistas extends Pessoa{
    //Atributos
    private int idFederacao;
    //construtores

    public Esportistas(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportistas() {
    }
    public String sacar(){
        return "Sacando para o jogo...";
    }
}
