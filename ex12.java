import java.util.Scanner;

public class Ex12{
    public static void main(String[] args) {
        //variáveis
        float a, b;
        String op;
        Scanner entrada;
        // boolean nao_calculado = true;
        
        entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        a = entrada.nextFloat();

        System.out.print("Digite o segundo valor: ");
        b = entrada.nextFloat();

        System.out.print("Digite o operador (+, -, / ou *): ");
        op = entrada.next();
        entrada.close();

        //process
        if(op.equals("+")){
            System.out.printf("%.2f+%,2f = %.2f\n", a, b, a+b);
            // nao_calculado = false;
        }
        if(op.equals("-")){
            System.out.printf("%.2f+%,2f = %.2f\n", a, b, a-b);
            // nao_calculado = false;
        }
        if(op.equals("*")){
            System.out.printf("%.2f+%,2f = %.2f\n", a, b, a*b);
            // nao_calculado = false;
        }
        if(op.equals("/")){
            System.out.printf("%.2f+%,2f = %.2f\n", a, b, a/b);
            // nao_calculado = false;
        }
        
        if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
            System.out.println("Operador inválido");
        }
        
        // if(nao_calculado = true){
        //     System.out.println("Operador inválido");
        // }
    }
}
