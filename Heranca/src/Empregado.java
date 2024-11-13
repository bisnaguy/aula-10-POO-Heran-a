public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public double calcularINSS(){
        return (0.075*salario);
    }

    public double calcularIR(){
        double ir;
        if (salario < 2000){
            ir = 0.1*salario;
        }else{
            ir = 0.28*salario;
        }
        return ir;
    }

    
    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}