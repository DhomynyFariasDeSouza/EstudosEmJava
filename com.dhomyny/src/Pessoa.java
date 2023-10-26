import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private Enum<Nacionalidades> nacionalidade;
    private long CPF;
    private List<Numero> numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Enum<Nacionalidades> getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Enum<Nacionalidades> nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public List<Numero> getNumero() {
        return numero;
    }

    public void setNumero(List<Numero> numero) {
        this.numero = numero;
    }
}
