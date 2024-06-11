package model.venda;

import model.notafiscal.NotaFiscal;

import java.util.ArrayList;
import java.util.List;

public class Vendas {

    private static double totalFaturamento = 0;
    private static double impostos = 0.1;
    private static double totalLucro = totalFaturamento - (totalFaturamento * impostos);

    private static List<NotaFiscal> notasFiscais = new ArrayList<NotaFiscal>();

    public static void addNotaFiscal(NotaFiscal n) {
        notasFiscais.add(n);
        totalFaturamento += n.getTotalCompras();
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getTotalLucro() {
        return totalLucro;
    }


    public void printImposto() {
        System.out.println("Imposto: " + (totalFaturamento * impostos));
    }

    public void printLucro() {
        System.out.println("Lucro: " + totalLucro);
    }

    public void printFaturamento() {
        System.out.println("Faturamento Total: " + totalFaturamento);
    }
}
