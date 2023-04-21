import java.util.Scanner;

class Beecrowd1 {
    public static void main(String[] args){
        //var
        int d, pontos = 0;
        Scanner entrada;

        //entrada
        entrada = new Scanner(System.in);
        d = entrada.nextInt();
        entrada.close();

        //process
        if(d <= 800){
            pontos = 1;
        }
        if(800 < d && d <= 1400){
            pontos = 2;
        }
        if(1400 < d && d <= 2000){
            pontos = 3;
        }

        System.out.println(pontos);
    }
}
