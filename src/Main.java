public class Main {
    public static void main(String[] args) {

        Pessoa qualquer = new Pessoa();
        // Encapsulamento
        qualquer.setNome("Raíssa Leal"); // Atribuição
        System.out.println(qualquer.getNome()); // Saída de dados
    Esportistas jogadora = new Esportistas();
    Esportistas surfista = new Esportistas(345);
    jogadora.setNome("Taissa volei");
        System.out.println(jogadora.getNome());

        //Polimorfismo
        qualquer = new Esportistas();
        String resultado = qualquer.sacar();
        System.out.println(resultado);

    }
}