package Entidades;

public class SalarioBonificado {
    static double bonificacao(double funcionario){
        if(funcionario > 788)
            return funcionario += 50.00;
        else
            return funcionario += 10.00;
    }

    public static void main(String[] args) {
        double salarioGerente = 8022.00;
        double salarioFaxineira = 789.00;
        double salarioBalconista = 788.00;

        System.out.println(bonificacao(salarioGerente));
        System.out.println(bonificacao(salarioFaxineira));
        System.out.println(bonificacao(salarioBalconista));

    }
}
