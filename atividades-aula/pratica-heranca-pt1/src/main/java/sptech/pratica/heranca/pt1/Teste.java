package sptech.pratica.heranca.pt1;

/**
 *
 * @author alan
 */
public class Teste {

    public static void main(String[] args) {
        Time time01 = new Time("São Paulo", "São Paulo", "SP",
                80.0, 30, 28000.0);
        Time time02 = new Time("Ituano", "Itú", "SP",
                40.0, 20, 10000.0);
        Time time03 = new Time("Flamengo", "Rio de janeiro", "RJ",
                150.0, 36, 45000.0);

        CategoriaBase timeBase01 = new CategoriaBase("Sub-20",
                30.0, 56, 2000.0,
                "Santos", "Santos", "SP",
                70.0, 27, 17000.0);
        CategoriaBase timeBase02 = new CategoriaBase("Sub-17",
                25.0, 50, 1500.0,
                "Fluminense", "Rio de janeiro", "RJ",
                90.0, 33, 20000.0);
        
        Liga liga = new Liga("Brasileirão", "Brasil");
        
        liga.cadastrarTime(time01);
        liga.cadastrarTime(time02);
        liga.cadastrarTime(timeBase02);
        
        System.out.println(liga.existePorNome("ituano"));
        System.out.println(liga.existePorNome("palmeiras"));
        System.out.println(liga.getQtdTimes());
        //System.out.println(liga.buscarTimePorNome("fluminense"));
        System.out.println(String.format("Valor movimentado: R$%.2f", liga.valorMovimentado()));
    }
}
