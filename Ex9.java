import java.util.Scanner;

class Ex9 {
    public static void main(String[] args){
        
        //VARÍAVEIS
        float sal_f , total, salFinal;
        Scanner entrada;
        
        
        //ENTRADA
        entrada = new Scanner(System.in);
        
        System.out.println("Informe a quantia do salário bruto: R$");
        sal_f = entrada.nextFloat();

        System.out.println("Informe seu total de vendas: R$");
        total = entrada.nextFloat();
        entrada.close();

        //PROCESS
        salFinal = sal_f + total * 5/100;
        
        //SAÍDA
        System.out.printf("O salário bruto do funcíonario é: R$%.2f", salFinal );
    }

    
}
