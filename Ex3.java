import java.util.Scanner;

class Ex3 {
    public static void main(String[] args){
        //VARIÁVEIS
        String nome;
        Scanner entrada;

        //ENTRADA
        entrada = new Scanner(System.in);
        System.out.println("Seu nome: ");
        nome = entrada.next();
        entrada.close();

        //PROCESS
        
        //SAÍDA
        System.out.printf("Boa noite, %s!\n", nome);
    }
}
