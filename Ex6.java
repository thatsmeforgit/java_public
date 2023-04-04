import java.util.Scanner;

class Ex6 {
    public static void main(String[] args){
        //VARIAVEIS
        float valor, juros, total;
        int dias;
        Scanner entrada;

        //ENTRADA
        entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor do seu boleto:\n R$");
        valor = entrada.nextFloat();

        System.out.println("Informe o juros(%) cobrado ao dia: ");
        juros = entrada.nextFloat();

        System.out.println("Informe a quantidade de dias que se passaram após o vencimento: ");
        dias = entrada.nextInt();
        
        entrada.close();

        //PROCESS
        total = valor + valor * juros/100 * dias;

        //SAIDA
        System.out.printf("O valor do boleto com juros é %.2f\n", total);
    }
}