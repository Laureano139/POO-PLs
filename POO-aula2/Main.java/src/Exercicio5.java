import java.util.Arrays;

public class Exercicio5 {
    public final int NUM_ALUNOS = 5;
    public final int  NUM_UCS = 5;
    public int[][] notasTurma = {
            {20, 15, 16, 14, 13},
            {16, 13, 9, 3, 7},
            {10, 12, 10, 11, 12},
            {9, 8, 4, 20, 15},
            {17, 18, 20, 4, 14}
    };

    // Vou considerar a matriz notasTurma[Aluno][UC]

    public void matrixToArray() {
        int arr[] = new int[notasTurma.length*notasTurma[0].length];
        for (int i = 0; i < NUM_ALUNOS; i++){
            int row[] = notasTurma[i];
            for (int j = 0; j < row.length; j++){
                int value = notasTurma[i][j];
                arr[i*row.length+j] = value;
            }
        }
        for(int x = 0; x < arr.length; x++){
            System.out.print(arr[x] + ", ");
        }
    }

    public int[] somaNotas(){
        int soma = notasTurma[0][0];
        for(int j = 1; j < NUM_UCS; j++){
            int coluna[] = notasTurma[j];
            for(int i = 1; i < coluna.length; i++){
                soma += notasTurma[i][j];
            }
        }

        int[] somas = new int[NUM_UCS];
        Arrays.stream(somas).map((algo)->0); //Preenche array tudo com 0
        for (int i=0 ; i<notasTurma.length; i++){
            for (int j=0 ; j<notasTurma[0].length ; j++){
               somas[i] += notasTurma[j][i];
            }
        }

        return somas;
    }

}
