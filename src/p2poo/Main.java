package p2poo;

public class Main {

    public static void main(String[] args) {
        Aluno aln1 = new Aluno();
        Aluno aln2 = new Aluno();
        Aluno aln3 = new Aluno();
        
        
        Professor prf1 = new Professor();
        Professor prf2 = new Professor();
        Professor prf3 = new Professor();
        
        Escola esc1 = new Escola();
        Escola esc2 = new Escola();
        Escola esc3 = new Escola();
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();
        
        Disciplina disc1 = new Disciplina();
        Disciplina disc2 = new Disciplina();
        Disciplina disc3 = new Disciplina();
        
        Curso curs1 = new Curso();
        Curso curs2 = new Curso();
        Curso curs3 = new Curso();
        
        Departamento dep1 = new Departamento();
        Departamento dep2 = new Departamento();
        Departamento dep3 = new Departamento();
        
        Setor set1 = new Setor();
        Setor set2 = new Setor();
        Setor set3 = new Setor();
        
        aln1.setNome("ELTON");
        aln1.setSexo("M");
        aln1.setEstado_civil("Solteiro");
        aln1.setCpf("856.604.714.256");
        aln1.setEndereco("Rua da Ceramica, 522 - Joao Paulo");
        aln1.setTelefone("8740-3360");
        aln1.setEmail("eltonwebnet@gmail.com");        
        aln1.setMatricula("123456");                       

        prf1.setNome("CLERISTON");
        prf1.setSexo("M");
        prf1.setEstado_civil("Solteiro");
        prf1.setCpf("456.293.001.72");
        prf1.setEndereco("Cantinho do Ceu, 4585 - Heaven");
        prf1.setTelefone("8952-1460");
        prf1.setEmail("cleriston@gmail.com");        
        prf1.setMatricula("654321");
        
        
        func1.setNome("CLERISTON");
        func1.setSexo("M");
        func1.setEstado_civil("Solteiro");
        func1.setCpf("456.293.001.72");
        func1.setEndereco("Cantinho do Ceu, 4585 - Heaven");
        func1.setTelefone("8952-1460");
        func1.setEmail("cleriston@gmail.com");        
        func1.setMatricula("654321");
        func1.setCargo("COORDENADOR");
        
        disc1.setNome("MATEMATICA");
        
        curs1.setCodigo(4589);
        curs1.setNome("CIENCIA DA COMPUTACAO");
        
        dep1.setNome("FINANCEIRO");
        
        set1.setNome("LICITACAO");
        
        esc1.setNome("DOM BOSCO");
        esc1.setEndereco("Av. Colares Moreira, 443 - Renascenca II, Sao Luas - MA, 65075-441");
        esc1.setSetor(set1);
        esc1.setDepartamento(dep1);
        esc1.setCurso(curs1);
        esc1.setDisciplina(disc1);
    }
    
}
