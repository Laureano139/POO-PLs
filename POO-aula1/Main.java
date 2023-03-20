
import java.util.Scanner;
import java.util.Date;
public class Main {

    public static void main(String[] args){

        System.out.println("Seleciona a pergunta:\n");
        System.out.println("1 - Temperatura\n");
        System.out.println("2 - Maximo\n");
        System.out.println("3 - Leitura\n");
        System.out.println("4 - Conversão Euros -> Libras\n");
        System.out.println("5 - Ordem Decrescente + Media\n");
        System.out.println("6 - Factorial\n");
        System.out.println("7 - Tempo -> Fatorial(5000)\n");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {

            // Exercicio 5.1

            Scanner scanner1 = new Scanner(System.in);
            Ficha1 ficha1 = new Ficha1();

            System.out.println("Insira a temperatura em graus celsius: \n");
            double celsius = scanner.nextDouble();
            System.out.println("Temperatura farenheit: " + ficha1.celsiusParaFarenheit(celsius));
            scanner1.close();
        }

        if (input == 2) {
            //Exercicio 5.2
            Scanner scanner2 = new Scanner(System.in);
            Ficha1 ficha1 = new Ficha1();

            System.out.println("Insere 1 numero inteiro: \n");
            int nums = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Insere 1 numero inteiro: \n");
            int nums2 = scanner3.nextInt();
            System.out.println("Maximo:" + "" + ficha1.maximoNumeros(nums, nums2));
            scanner2.close();
            scanner3.close();
        }

        if(input == 3){
            //Exercicio 5.3
            Scanner scanner4 = new Scanner(System.in);
            Ficha1 ficha1 = new Ficha1();

            System.out.println("Cal és tu nombre!?\n");
            String name = scanner4.next();
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Di-mé tu saldo tío!!\n");
            double saldo = scanner5.nextDouble();
            System.out.println("Tus informátioñés, coño: " + ficha1.criaDescricaoConta(name, saldo));
            scanner4.close();
            scanner5.close();
        }

        if(input == 4){
            //Exercicio 5.4
            Scanner scanadeiro = new Scanner(System.in);
            Ficha1 ficha1 = new Ficha1();

            System.out.println("Mete o valor em Euros, de estoura: \n");
            double euros = scanadeiro.nextDouble();
            double taxa = 0.88340/1;
            System.out.println("O valor em libras é: " + ficha1.eurosParaLibras(euros, taxa));
        }

        if(input == 5){
            //Exercicio 5.5
            Scanner scanzin = new Scanner(System.in);
            Ficha1 ficha1 = new Ficha1();

            System.out.println("Insere um inteiro, seu balofo de piroca: \n");
            int a = scanzin.nextInt();
            System.out.println("Insere outro inteiro, sua amostra de cagalhao de texugo: \n");
            Scanner skrt = new Scanner(System.in);
            int b = skrt.nextInt();
            System.out.println("Ordem Decrescente para ti, demente: " + Math.max(a, b) + " " + "," + " " + Math.min(a, b) + "\n" +
                    "E pega lá a puta da média, anormal: " + ficha1.media(a,b));
        }

        if (input == 6){
            //Exercicio 5.6
            Scanner scan = new Scanner(System.in);
            Ficha1 ficha1 = new Ficha1();

            System.out.println("Insere um numero inteiro: \n");
            int x = scan.nextInt();
            System.out.println(ficha1.factorial(x));
        }

        if (input == 7){
            //Exercicio 5.7
            Ficha1 ficha1 = new Ficha1();

            System.out.println("Data e hora do sistema: " + new Date());
            long startTime = System.currentTimeMillis();
            System.out.println("Fatorial de 5000: " + ficha1.factorial(5000));
            System.out.println("Data e hora após o cálculo: " + new Date());
            System.out.println("Tempo gasto em milissegundos: " + ficha1.tempoGasto(startTime));
        }

    }

}
