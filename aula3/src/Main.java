public class Main {
    public static void main(String[] args){
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(1.0, 1.0, 2.0);
        Circulo c3 = c2.clone();

        System.out.println("c1" + c1);
        System.out.println("c2" + c2);
        System.out.println("c3" + c3);

        Lampada l = new Lampada();

        l.lampON();
        System.out.println("Teste da função lampON: " + l.toString());
        l.lampOFF();
        System.out.println("Teste da função lampOFF: " + l.toString());
        l.lampECO();
        System.out.println("Teste da função lampECO: " + l.toString());

        Triangulo t = new Triangulo();

        Ponto a = new Ponto(0, 0);
        Ponto b = new Ponto(0, 3);
        Ponto c = new Ponto(3, 0);

        System.out.println("Area = " + t.calculaAreaTriangulo());
        System.out.println("Perimetro = " + t.calculaPerimetroTriangulo());
        System.out.println("Altura = " + t.altura());
    }
}