import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CasaInteligente {

    private List<Lampada> lamps;

    public CasaInteligente(List<Lampada> lamps) {
        this.lamps = new ArrayList<>(lamps);
    }

    public CasaInteligente(CasaInteligente casa){
        this.setlamps(casa.getlamps());
    }

    public List<Lampada> getlamps() {
        return new ArrayList<>(lamps);
    }

    public void setlamps(List<Lampada> lamps) {
        this.lamps = new ArrayList<>(lamps);
    }

    public CasaInteligente clone(){
        return new CasaInteligente(this);
    }

    public void addLampada(Lampada l){
        lamps.add(l);
    } //Agregação pode ser assim, composição é com clone
    public void ligaLampadaNormal(int index){
        Lampada lamp = lamps.get(index);
        lamp.lampON();
    }

    public void ligaLampadaEco(int index){
        Lampada lamp = lamps.get(index);
        lamp.lampECO();
    }

    public int qtEmEco(){
        int counter = 0;
        for(Lampada l : lamps){
            if (l.getModo() == Lampada.Modo.ECO) counter += 1;
        }
        return counter;
    }

    public void removeLampada(int index){
        lamps.remove(index);
    }

    public void ligaTodasEco(){
        for(Lampada l : lamps){
            l.lampECO();
        }
    }
    public void ligaTodasMax(){
        for(Lampada l : lamps){
            l.lampON();
        }
    }

    public double consumoTotal(){
        double consumo = 0;
        for(Lampada l : lamps){
            consumo += l.getConsumoTotal();
        }
        return consumo;
    }

    public Lampada maisGastadora(){
        double consumo = 0;
        Lampada aux = new Lampada();

        for(Lampada l : lamps){
            if(l.getConsumoTotal() > consumo){
                consumo = l.getConsumoTotal();
                aux = l;
            }
        }
        return aux;
    }

    public Set<Lampada> lampadasEmModoEco(){
        Set<Lampada> lampadas = new HashSet<>();
        for(Lampada l : lamps){
            if (l.getModo() == Lampada.Modo.ECO) lampadas.add(l);
        }
        return lampadas;
    }

    public void reset(){
        for (Lampada l : lamps){
            l.resetPeriodo();
        }
    }

    public Lampada menosGastadora(){
        double consumo = 99999;
        Lampada aux = new Lampada();

        for(Lampada l : lamps){
            if(l.getConsumoTotal() < consumo){
                consumo = l.getConsumoTotal();
                aux = l;
            }
        }
        return aux;
    }


    public Set<Lampada> podiumEconomia(){
        Set<Lampada> podium = new HashSet<>();
        List<Lampada> lamps2 = new ArrayList<>(lamps);
        for(Lampada l :  lamps2){
            while(podium.size() != 3){
                Lampada l1 = menosGastadora();
                podium.add(l1);
                lamps2.remove(l1);
            }
        }
        return podium;
    }
}