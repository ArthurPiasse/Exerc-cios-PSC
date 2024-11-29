public class Disciplina
{
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    public Disciplina(String nome, String professor, int semestre, boolean ofertada) {
        this.nome = nome;
        this.professor = professor;
        this.semestre = semestre;
        this.ofertada = ofertada;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public boolean isOfertada() {
        return ofertada;
    }
    public void exibirInformacoes() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Professor: " + professor);
        System.out.println("Semestre: " + semestre);
        System.out.println("Ofertada: " + ofertada);
    }
}