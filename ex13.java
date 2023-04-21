import java.util.Scanner;

class ex13 {
    public static void main(String[] args){
        //variáveis
        int a, b, c;
        Scanner entrada;
        
        //entrada
        entrada = new Scanner(System.in);

        System.out.println("Informe o lado A: ");
        a = entrada.nextInt();
        System.out.println("Informe o lado B: ");
        b = entrada.nextInt();
        System.out.println("Informe o lado C: ");
        c = entrada.nextInt();
        entrada.close();

        //process
        if(b + c <= a || a + c <= b || a + b <= c){
            System.out.println("Lados não podem formar um triângulo");
        } else {
            System.out.println("Lados podem formar um triângulo");
        }
    }
}