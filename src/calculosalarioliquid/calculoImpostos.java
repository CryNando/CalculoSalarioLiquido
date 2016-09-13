/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosalarioliquid;

/**
 *
 * @author Luis
 */
public class calculoImpostos {

    private double inss;
    private double irrf;
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public double getInss() {
        return inss;
    }

    public double getIrrf() {
        return irrf;
    }
    //tabela inss http://www.calculador.com.br/tabela/trabalhista/INSS/2016 

    public double calculoInss(double salarioBruto, int numDependentes) {
        if (salarioBruto <= 1556.94) {
            inss = salarioBruto * 8 / 100;
        } else if (salarioBruto >= 1556.95 && salarioBruto <= 2594.92) {
            inss = salarioBruto * 9 / 100;
        } else if (salarioBruto >= 2594.93 && salarioBruto <= 5189.82) {
            inss = salarioBruto * 11 / 100;
        } else if (salarioBruto > 5189.82) {
            inss = salarioBruto + 570.88;
        }
                
        return (salarioBruto - inss) - (189.59 * numDependentes);
    } 
    

    //tabela irff http://www.calculador.com.br/tabela/trabalhista/IRRF/2015
    public double calculoIrff(double salarioBruto) {
        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            irrf = (salarioBruto * 7.5 / 100) - 142.80;
        } else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            irrf = (salarioBruto * 15 / 100) - 354.80;
        } else if (salarioBruto >= 3751 && salarioBruto <= 4664.68) {
            irrf = (salarioBruto * 22.5 / 100) - 636.13;
        } else if (salarioBruto > 4464.68) {
            irrf = (salarioBruto * 27.5 / 100) - 869.36;
        }

        return salarioBruto - irrf;
    }

}
