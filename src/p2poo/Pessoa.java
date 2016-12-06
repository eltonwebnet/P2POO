package p2poo;

public class Pessoa {
    private String nome;
    private String sexo;
    private String estado_civil;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "NOME: " + this.getNome() + '\n' +
               "SEXO: " + this.getSexo() + '\n' +
               "ESTADO CIVIL: " + this.getEstado_civil() + '\n' +
               "CPF: " + this.getCpf() + '\n' +
               "ENDERECO: " + this.getEndereco() + '\n' +
               "TEL.: " + this.getTelefone()+ '\n' +
               "EMAIL.: " + this.getEmail()+ '\n';
    }

}
