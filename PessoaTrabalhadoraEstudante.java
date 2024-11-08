public class PessoaTrabalhadoraEstudante extends Pessoa implements Trabalhador, Estudante{

    public PessoaTrabalhadoraEstudante(String nome, int idade) throws IllegalArgumentException, Exception {
        super(nome, idade);
    }

    @Override
    public void estudar() {

    }

    @Override
    public int tirarNota() {
        return 0;
    }

    public int tirarNota(String descricao) {
        System.out.println(descricao);
        return 0;
    }

    @Override
    public void trabalhar() {

    }

    @Override
    public double receberSalario(int salario) {
        return salario*2;
    }


}
