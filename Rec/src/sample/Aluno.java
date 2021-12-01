package sample;

public class Aluno {
    private String matricula;
    private String media;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMedia() {
        return media;
    }
    public void setMedia(String Media) {
        this.media = media;
    }

    @Override
    public String toString(){
        return "Aluno: " + matricula +", media: ";
    }
}
