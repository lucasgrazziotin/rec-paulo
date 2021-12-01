package sample;

public class Pessoal {
    private String Nome;
    private String Telefone;
    public String Email;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = Email;
    }

    @Override
    public String toString (){
        return "Pessoal: " + Nome +", telefone: "
                + Telefone +" Email: " + Email;
    }
}
