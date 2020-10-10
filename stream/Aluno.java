public class Aluno {
    private final String nome;
    private final double media;
    private final double maiorNota;

    public Aluno(String nome, double media, double maiorNota) {
        this.nome = nome;
        this.media = media;
        this.maiorNota = maiorNota;
    }

    public String getNome() {
        return nome;
    }
    public double getMedia() {
        return media;
    }
    public double getMaiorNota() {
        return maiorNota;
    }
}