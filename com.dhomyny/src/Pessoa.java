import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private Enum<Nacionalidades> nacionalidade;
    private String CPF;
    private List<Numero> numeros;

    public Pessoa(String nome, int idade, Enum<Nacionalidades> nacionalidade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.CPF = CPF;
        this.numeros = new ArrayList<>();
    }

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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public List<Numero> getNumero() {
        return numeros;
    }

    public void setNumero(Numero numero) {
        this.numeros.add(numero);
    }
}
