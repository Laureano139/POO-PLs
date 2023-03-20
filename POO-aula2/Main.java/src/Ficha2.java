import java.util.Arrays;
import java.time.LocalDate;

public class Ficha2 {

    public int minimo(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    int indices(int[] arr, int i, int j){
        for (int x = i; x <= j; x++) {
            System.out.println(arr[x]);
        }
        return 0;
    }

}
