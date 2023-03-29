//importa a classe Scanner
import java.util.Scanner;

//declara a classe que o corpo do código
class Ex1{
    public static void main(String[] args){
        //Declarando VARIÁVEIS em java: (tipo + nome_variavel, nome_variavel2...)
        int valor, cubo;
        //Declara uma entrada na classe scanner 
        Scanner entrada;

        //ENTRADA
        //objeto do tipo Scanner que passa como argumento (System.in) com objetivo de ler a entrada
        entrada = new Scanner(System.in);

        //PRINT PARA SOLICITAÇÃO DE ENTRADA
        System.out.println("Valor: ");
        //INVOCA UM MÉTODO DO TIPO INTEIRO PARA RETORNAR UM VALOR DO TIPO INTEIRO "nextTipoDado()" 
        valor = entrada.nextInt();
        //INFORMA O FIM DA ENTRADA PARA O SCANNER
        entrada.close();

        //PROCESS
        cubo = valor * valor * valor;

        //SAÍDA
        //System.out.(printf) = Print com formatação ("%d recebe a variavel sucessivamente %d", variavel_1, variavel_2)
        System.out.printf("%d ao cubo é %d\n", valor, cubo);
    }
}
