public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, String cpf, int idade, double salario, String cargo, String area) {
        super(nome, cpf, idade, salario, cargo);
        this.area = area;
    }

    @Override
    public double calcularSalarioAnual() {
        double salarioAnualBase = super.calcularSalarioAnual();
        double bonus = salarioAnualBase * 0.15;
        double salarioAnualTotal = salarioAnualBase + bonus;

        System.out.println("Bonus de 15% (Gerente) adicionado para a area: " + this.area);
        
        return salarioAnualTotal;
    }
}