package segundo_bimestre.br.com.brunodezorzi.polimorfismo.exercicios.exercicio1;

public class Main {
    public static void main(String[] args) {
        // Usando polimorfismo para criar instâncias de diferentes funcionários
        Funcionario gerente = new Gerente("Carlos", 5000, 2000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000, 1500);
        Funcionario analista = new Analista("Pedro", 3000, 1000);

        // Calculando o salário total para cada funcionário
        double salarioGerente = gerente.calcularSalarioTotal(gerente.getSalarioBase(), 2000, 500);
        double salarioDesenvolvedor = desenvolvedor.calcularSalarioTotal(desenvolvedor.getSalarioBase(), 1500, 300);
        double salarioAnalista = analista.calcularSalarioTotal(analista.getSalarioBase(), 1000, 200);

        // Exibindo os resultados
        System.out.println("Salário total do gerente: " + salarioGerente);
        System.out.println("Salário total do desenvolvedor: " + salarioDesenvolvedor);
        System.out.println("Salário total do analista: " + salarioAnalista);
    }
}
