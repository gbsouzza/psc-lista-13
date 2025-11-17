public class TesteHeranca {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Joao Silva", "111.222.333-44", 30);
        
        Funcionario funcionario = new Funcionario("Maria Souza", "222.333.444-55", 25, 3000.00, "Analista");
        
        Gerente gerente = new Gerente("Carlos Pereira", "333.444.555-66", 40, 8000.00, "Gerente de TI", "Desenvolvimento");

        System.out.println("--- Exibindo dados (Gerente) ---");
        gerente.exibirDados();
        System.out.println("---------------------------------");


        System.out.println("\n--- Calculo Salario Anual ---");
        
        double salarioAnualFunc = funcionario.calcularSalarioAnual();
        System.out.println("Salario Anual (Funcionario): R$ " + salarioAnualFunc);

        System.out.println("---");

        double salarioAnualGer = gerente.calcularSalarioAnual();
        System.out.println("Salario Anual (Gerente - Total c/ Bonus): R$ " + salarioAnualGer);
        
        System.out.println("-------------------------------");
    }
}