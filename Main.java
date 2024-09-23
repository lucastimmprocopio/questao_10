import java.time.LocalDate;
import java.time.Period;

class Pessoa {
    
    private String nome;
    private LocalDate dataNascimento;
    private double altura; 

    
    public Pessoa(String nome, LocalDate dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }
}

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Lucas Timm", LocalDate.of(1998, 11, 15), 1.70);

        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Altura: " + pessoa.getAltura() + " m");
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
    }
}



