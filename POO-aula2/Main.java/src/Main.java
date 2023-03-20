import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ficha2 ficha2 = new Ficha2();
        Exercicio2 e2 = new Exercicio2();
        Exercicio5 e5 = new Exercicio5();
        int[] arr = {1, 0, 9, 10, 5};
        LocalDate data = LocalDate.of(2000,12,3);
        LocalDate data1 = LocalDate.of(2002,11,16);
        LocalDate data2 = LocalDate.of(2002,11,15);


        System.out.println("Minimo: " + ficha2.minimo(arr));
        System.out.println("Indices: " + ficha2.indices(arr,0,2));

        e2.insereData(data);
        e2.insereData(data1);
        System.out.println("Datas: " + Arrays.toString(e2.datas));
        System.out.println("Data mais proxima: " + e2.dataMaisProxima(data2));
        System.out.println("Datas: " + e2.toString());

        e5.matrixToArray();
        System.out.println("Soma: " + Arrays.toString(e5.somaNotas()));
    }
}