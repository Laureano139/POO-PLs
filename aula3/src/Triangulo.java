public class Triangulo {

    private Ponto a;
    private Ponto b;
    private Ponto c;
    public Triangulo(){
        this.a = new Ponto(0, 0);
        this.b = new Ponto(0, 3);
        this.c = new Ponto(3, 0);
    }

    public Triangulo(Triangulo t){
        a = t.getCoordsA();
        b = t.getCoordsB();
        c = t.getCoordsC();
    }
    public Ponto getCoordsA(){
        int xa = a.getX();
        int ya = a.getY();
        return new Ponto(xa, ya);
    }
    public Ponto getCoordsB(){
        int xb = b.getX();
        int yb = b.getY();
        return new Ponto(xb, yb);
    }
    public Ponto getCoordsC(){
        int xc = c.getX();
        int yc = c.getY();
        return new Ponto(xc, yc);
    }
    public void setCoordsA(int x, int y){
        this.a = new Ponto(x, y);
    }
    public void setCoordsB(int x, int y){
        this.b = new Ponto(x, y);
    }
    public void setCoordsC(int x, int y){
        this.c = new Ponto(x, y);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int maiorY(Ponto a, Ponto b, Ponto c){
        int[] arr = {a.getY(), b.getY(), c.getY()};
        int mY = -1;
        for(int i=0; i<arr.length; i++){
            if (mY < arr[i]){
               mY = arr[i];
            }
        }
        return mY;
    }

    public int menorY(Ponto a, Ponto b, Ponto c){
        int[] arr = {a.getY(), b.getY(), c.getY()};
        int menorY = 9999;
        for(int i=0; i<arr.length; i++){
            if (menorY > arr[i]){
                menorY = arr[i];
            }
        }
        return menorY;
    }
    public double calculaAreaTriangulo(){
        double base = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
        int altura = altura();
        double area = (base*altura)/2;
        return area;
    }

    public double calculaPerimetroTriangulo(){
        double lado1 = Math.abs(Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2)));
        double lado2 = Math.abs(Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2)));
        double lado3 = Math.abs(Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2)));

        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public int altura(){
        int maiorY = maiorY(this.a, this.b, this.c);
        int menorY = menorY(this.a, this.b, this.c);
        return maiorY - menorY;
    }

}
