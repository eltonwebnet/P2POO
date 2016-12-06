package p2poo;

public class Professor extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "NOME: " + this.getNome() + '\n' +
               "SEXO: " + this.getSexo() + '\n' +
               "ESTADO CIVIL: " + this.getEstado_civil() + '\n' +
               "CPF: " + this.getCpf() + '\n' +
               "ENDERECO: " + this.getEndereco() + '\n' +
               "TEL.: " + this.getTelefone()+ '\n' +
               "EMAIL.: " + this.getEmail()+ '\n' +
               "MATRICULA.: " + this.getMatricula() + '\n';
    }      
}
