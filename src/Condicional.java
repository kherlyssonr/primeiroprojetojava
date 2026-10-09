public class Condicional {
    public static void main(String[] args){
        int anoDeLançamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLançamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "Normal";

        if(anoDeLançamento > 2022){
            System.out.println("Lançamento que os clientes estao curtindo!!");
        }else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("Plus")){
            System.out.println("Filme liberado!!!");
        }else{
            System.out.println("Deve pagar o aluguel");
        }
    }
}