public class Aluno {
    private final String nome;
    private final double media;
    private final double maiorNota;

    public Aluno(String nome, double media) {
        this(nome, media, 0);
    }

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

    @Override
    public String toString() {
        return "Nome: " + nome + " Media: " + media;
    }
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
    }
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}