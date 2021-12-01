package sample;

public class Professor {
    private String Salario;

    public String getSalario() {
        return Salario;
    }
    public void setSalario(String salario) {
        Salario = salario;
    }

    @Override
    public String toString(){
        return "Professor: " + Salario + "Salario";
    }
}
