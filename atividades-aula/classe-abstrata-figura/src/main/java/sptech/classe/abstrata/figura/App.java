package sptech.classe.abstrata.figura;

/**
 *
 * @author alan
 */
public class App {

    public static void main(String[] args) {
        Quadrado q = new Quadrado(1.2, "Azul", 20);
        q.setLado(20.0);
        System.out.println(q);

        Retangulo r = new Retangulo(32.0, 12.0, "Vermelho", 9);
        r.setBase(54.2);
        r.setAltura(11.9);
        System.out.println(r);

        Triangulo t = new Triangulo(12.2, 43.9, "Roxo", 10);
        t.setBase(2.2);
        t.setAltura(3.1);
        System.out.println(t);

        Circulo c = new Circulo(1.3, "Amarelo", 67);
        c.setRaio(2.4);
        System.out.println(c);

        Imagem img = new Imagem();
        img.adicionaFigura(q);
        img.adicionaFigura(r);
        img.adicionaFigura(t);
        img.adicionaFigura(c);

        img.exibeFiguras();
        img.exibeSomaAreas();
        img.exibeFiguraAreaMaior20();
        img.exibeQuadrados();
    }
}
