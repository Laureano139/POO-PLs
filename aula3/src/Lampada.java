public class Lampada {
    private boolean onOff;
    private boolean eco;
    private double consumo;
    private double consumoEco;
    private double cTotal;
    private double cPeriodo;
    private long stamp;

    public Lampada(){
        onOff = false;
        eco = false;
        consumo = 1.5;
        consumoEco = 1.10;
        cTotal = 0;
        cPeriodo = 0;
        stamp = System.currentTimeMillis();
    }
    public Lampada(Lampada l){
        onOff = l.getState();
        eco = l.getEcoInfo();
        consumo = l.getConsumed();
        consumoEco = l.getConsumoEco();
        cTotal = l.getTotal();
        cPeriodo = l.getPeriodo();
        stamp = System.currentTimeMillis();
    }
    public boolean getState(){
        return onOff;
    }
    public boolean getEcoInfo(){
        return eco;
    }
    public double getConsumed(){
        return consumo;
    }
    public double getConsumoEco(){return consumoEco;}
    public double getTotal(){return cTotal;}
    public double getPeriodo(){return cPeriodo;}
    public long getStamp(){return stamp;}
    public void setState(boolean onOff){
        this.onOff = onOff;
    }
    public void setEcoInfo(boolean eco){
        this.eco =eco;
    }
    public void setConsume(double consumo){
        this.consumo = consumo;
    }
    public void setConsumoEco(double consumoEco){this.consumoEco = consumoEco;}
    public void setTotal(double cTotal){this.cTotal = cTotal;}
    public void setPeriodo(double cPeriodo){this.cPeriodo = cPeriodo;}
    public void setStamp(long stamp){this.stamp = stamp;}

    @Override
    public String toString() {
        return "Lampada{" +
                "onOff=" + onOff +
                ", eco=" + eco +
                ", consumo=" + consumo +
                ", consumoEco=" + consumoEco +
                ", cTotal=" + cTotal +
                ", cPeriodo=" + cPeriodo +
                ", stamp=" + stamp +
                '}';
    }

    public void lampON(){
        atualizaConsumo();
        if (this.getState() == false){
            setState(true);
        } else System.out.println("A lampada já está ligada!");
    }

    public void lampOFF(){
        atualizaConsumo();
        if (this.getState() == true){
            setState(false);
        } else System.out.println("A lampada já está desligada!");
    }
    public void lampECO(){
        atualizaConsumo();
        if (this.getState() == false){
            setState(true);
            setEcoInfo(true);
        } else setEcoInfo(true);
    }
    private void atualizaConsumo(){
        long periodo = System.currentTimeMillis() - stamp;

        if (this.getState() == true){
            cTotal += periodo * consumo;
            cPeriodo += periodo * consumo;
        } else if (this.getState() == true && this.getEcoInfo() == true){
            cTotal = periodo * consumoEco;
            cPeriodo = periodo * consumoEco;
        }
        stamp = System.currentTimeMillis();
    }

}


