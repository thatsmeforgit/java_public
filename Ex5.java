//Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado pelo usuário, assim como a quantidade de dias pelos quais o carro foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60,00 por dia e R$0,15 por km rodado.

import java.util.Scanner;

class Ex5 {
    public static void main(String[] args){
        //VARIÁVEIS
        int km, dias;
        double custo;
        Scanner entrada;

        //ENTRADA
        entrada = new Scanner(System.in);
        System.out.println("Quantos KM foram rodados com o veículo: ");
        km = entrada.nextInt();
        System.out.println("Quantos dias o veículo foi alugado: ");
        dias = entrada.nextInt();
        entrada.close();

        //PROCESS
        custo = dias * 60 + km * 0.15;
        
        //SAÍDA
        System.out.printf("O valor final a ser pago é R$%f", custo);
    }    
}
