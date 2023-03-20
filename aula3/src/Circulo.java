public class Circulo {
    private double x;
    private double y;
    private double raio;

    //Construtor tem sempre o mesmo nome que a classe
    public Circulo(){
        x = 0;
        y = 0;
        raio = 0;
    }

    public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo c){
        x = c.getX();
        y = c.getY();
        raio = c.getRaio();
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getRaio(){
        return raio;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Circulo c = (Circulo)o;
        return x == c.getX() && y == c.getY() &&raio == c.getRaio();
    }
    public String toString(){
        return "Circulo("
                + "x = " + x + ", " + "y = " + y + ", " + "raio = " + raio + ")";
    }
    public Circulo clone(){
        return new Circulo(this);
    }
    public void alteraCentro(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double calculaArea(){
        return Math.PI + Math.pow(raio, 2);
    }
    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }
}
