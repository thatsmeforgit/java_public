import java.util.Scanner;

class Ex7 {
    public static void main(String[] args){
        //VARÍAVEIS 
        int c1 , c2, c3, v_nulo, v_branco, v_total;
        float pc1, pc2, pc3, pn, pb;
        Scanner entrada;

        //ENTRADA
        entrada = new Scanner(System.in);
        
        System.out.println("Informe os votos do Candidato A: ");
        c1 = entrada.nextInt();
        System.out.println("Informe os votos do Candidato B: ");
        c2 = entrada.nextInt();
        System.out.println("Informe os votos do Candidato C: ");
        c3 = entrada.nextInt();
        System.out.println("Informe os votos do Candidato A: ");
        v_nulo = entrada.nextInt();
        System.out.println("Informe os votos do Candidato A: ");
        v_branco = entrada.nextInt();
        entrada.close();

        //PROCESS
        v_total = c1 + c2 + c3 + v_nulo + v_branco;
        pc1 = (float) c1 * 100/v_total;
        pc2 = (float) c2 * 100/v_total;
        pc3 = (float) c3 * 100/v_total;
        pn = (float) v_nulo * 100/v_total;
        pb = (float) v_branco * 100/v_total;

        //SAIDA
        System.out.printf("=================================\n");
        System.out.printf("TOTAL DE VOTOS: \n", v_total);
        System.out.printf("=================================\n");
        System.out.printf("PERCENTUAL CANDITADO A: %.2f\n", pc1);
        System.out.printf("=================================\n");
        System.out.printf("PERCENTUAL CANDITADO B: %.2f\n", pc2);
        System.out.printf("=================================\n");
        System.out.printf("PERCENTUAL CANDITADO C: %.2f\n", pc3);
        System.out.printf("=================================\n");
        System.out.printf("PERCENTUAL VOTOS NULOS: %.2f\n", pn);
        System.out.printf("=================================\n");
        System.out.printf("PERCENTUAL VOTOS BRANCOS: %.2f\n", pb);
    }
    
}
