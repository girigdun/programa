package sql;

public class ClienteBD {

    private String nome;
    private int id;
    private String resultadonome;
    private String resultadoid;
    private int teste;

    public int getTeste() {
        return teste;
    }

    public void setTeste(int teste) {
        this.teste = teste;
    }

    public String getResultadoid() {
        return resultadoid;
    }

    public void setResultadoid(String resultadoid) {
        this.resultadoid = resultadoid;
    }

    public String getResultadonome() {
        return resultadonome;
    }

    public void setResultadonome(String resultadonome) {
        this.resultadonome = resultadonome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
