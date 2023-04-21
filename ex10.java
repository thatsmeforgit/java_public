import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        //variáveis
        int a, b, c, menor;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        
        System.out.println("Digite A: ");
        a = entrada.nextInt();

        System.out.println("Digite B: ");
        b = entrada.nextInt();

        System.out.println("Digite C: ");
        c = entrada.nextInt();
        entrada.close();

        //process
        menor = a;
        if(b < menor){
            menor = b;
        }
        if(c < menor){
            menor = c;
        }
        System.out.printf("Menor valor é %d", menor);
    }
}
