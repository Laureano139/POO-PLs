import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;


public class Exercicio2 {
    public int capacity=10;
    public int indice = 0;
    public LocalDate[] datas = new LocalDate[capacity];

    public void insereData(LocalDate data){
        if(indice < datas.length){
            datas[indice] = data;
            indice++;
        }
        else{
            System.out.println("O array está cheio!");
        }
    }

    public LocalDate dataMaisProxima(LocalDate data){
        LocalDate closest = datas[0];
        for(int i = 1; i < indice; i++){
            if(Math.abs(DAYS.between(closest, datas[i])) > Math.abs(DAYS.between(datas[i], data))){
                closest = datas[i];
            }
        }
        return closest;
    }

    public String toString(){
        StringBuilder s = new StringBuilder("[");

        for (int i = 0; i < indice; i++){
            if(i>0){
                s.append(",");
            }
            s.append(datas[i]);
        }
        s.append("]");

        return s.toString();
    }
}
