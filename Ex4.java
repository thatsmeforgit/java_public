import java.util.Scanner;

class Ex4 {
    public static void main(String[] args){
        //VARIÁVEIS
        String nome;
        int idade;
        Float altura;
        Scanner entrada;

        //ENTRADA
        entrada = new Scanner(System.in);
        System.out.println("Seu nome: ");
        nome = entrada.next();
        System.out.println("Sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Sua altura: ");
        altura = entrada.nextFloat();
        entrada.close();
        
        //SAÍDA
        System.out.printf("Boa noite, %s.\nSua idade: %d\nSua altura em metros: %fm", nome, idade, altura);
    }    
}
