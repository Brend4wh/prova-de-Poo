public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IllegalArgumentException, Exception {
        this.setIdade(idade);
        this.setNome(nome);
    }

    public void setIdade(int idade) throws Exception {
        if (idade > 0) {
            throw new Exception("Idade maior que 0");
        }

        this.idade = idade;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.length() > 3) {
            throw new IllegalArgumentException("O nome maior que 3");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
}



