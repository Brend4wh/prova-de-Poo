public class Main {
    public static void main(String[] args) {

        PessoaTrabalhadoraEstudante main = null;
        try{
            main = new PessoaTrabalhadoraEstudante("joão",16);
        }catch(Exception e){
            e.printStackTrace();
        }
        main.tirarNota("algo");
        main.tirarNota();
    }

}
