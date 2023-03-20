
import java.math.BigInteger;
public class Ficha1 {
    public static double celsiusParaFarenheit(double graus){
        return (graus * 1.8 + 32);
    }

    public int maximoNumeros(int a, int b){
        return Math.max(a, b);
    }

    public String criaDescricaoConta (String nome, double saldo){
        return ("Hola," + " " + nome + "!" + "\n" + "Tu tienes " + String.valueOf(saldo) + " " + "puebre di mierda!");
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        return (taxaConversao * valor);
    }

    public long media(int a, int b){
        long r = (a + b) / 2;
        return r;
    }
    public static BigInteger factorial(int num) {
        BigInteger resultado = BigInteger.valueOf(1);
        if (num == 0){
            return BigInteger.valueOf(0);
        }
        for (int i = 1; i <= num; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    public static long tempoGasto(long startTime) {
        return System.currentTimeMillis() - startTime;
    }
}
