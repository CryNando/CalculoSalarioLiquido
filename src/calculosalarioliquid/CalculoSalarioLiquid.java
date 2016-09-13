/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosalarioliquid;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class CalculoSalarioLiquid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //váriaveis
        double valorFinal;
        double salarioBruto;
        int numDependentes;
        Scanner input = new Scanner(System.in);
        //
        //Entrada do usuário
        System.out.println("Digite o valor do Sálario Bruto");       
        salarioBruto = input.nextDouble();
        System.out.println("Digte o número de Dependentes");
        numDependentes = input.nextInt();
        //
        //Calculo
        DecimalFormat df = new DecimalFormat("0.00");
        calculoImpostos calculo = new calculoImpostos();
        valorFinal = calculo.calculoInss(salarioBruto, numDependentes);
        valorFinal = calculo.calculoIrff(valorFinal);
        valorFinal = 3000 - calculo.getInss() - calculo.getIrrf();
        //
        //mensagem de saida
        System.out.println("Inss : " + df.format(calculo.getInss()) + " Irrf : " + df.format(calculo.getIrrf()) + " Salário Liquido : " + df.format(valorFinal));
        //
    }

}
