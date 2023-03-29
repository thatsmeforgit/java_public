import java.util.Scanner;

class Ex2{
    public static void main(String[] args){
        //VARIÁVEIS
        int hora, min, seg, tempo;
        Scanner entrada;

        //ENTRADA
        entrada = new Scanner(System.in);
        System.out.println("Hora: ");
        hora = entrada.nextInt();
        System.out.println("Minuto: ");
        min = entrada.nextInt();
        System.out.println("Segundos: ");
        seg = entrada.nextInt();
        entrada.close();

        //PROCESS
        tempo = hora * 3600;
        tempo = tempo + min * 60;
        tempo = tempo + seg;

        //SAÍDA
        System.out.printf("Se passaram %d segundos desde 00:00\n", tempo);
    }
}