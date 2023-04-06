import java.util.Scanner;

class Ex8 {
    public static void main(String[] args){
        float v_f, v_total;
        Scanner entrada;


        //ENTRADA 
        entrada = new Scanner(System.in);
        System.out.println("Qual o valor do veicúlo na fábríca: R$");
        v_f = entrada.nextFloat();
        entrada.close();

        //PROCESS
        v_total = v_f + v_f * 28/100 + v_f * 45/100;

        //SAÍDA
        System.out.printf("O valor do carro somado aos impostos resulta na quantia de R$%.2f", v_total);
    }
}
