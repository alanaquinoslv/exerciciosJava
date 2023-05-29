package consultoria;

/**
 *
 * @author alan
 */
public class TesteConsultoria {

    public static void main(String[] args) {
        Desenvolvedor dev01 = new Desenvolvedor("Alan",
                34, 150.0);
        Desenvolvedor dev02 = new Desenvolvedor("Diego",
                72, 200.0);
        Desenvolvedor dev03 = new Desenvolvedor("Rafael",
                34, 350.0);

        DesenvolvedorMobile devMobile01 = new DesenvolvedorMobile(24,
                400.0, "Carlos",
                50, 230.0);
        DesenvolvedorMobile devMobile02 = new DesenvolvedorMobile(230,
                280.0, "Marina",
                100, 290.0);
        DesenvolvedorMobile devMobile03 = new DesenvolvedorMobile(360,
                500.0, "Visconde",
                734, 550.0);

        Consultoria consultoria = new Consultoria("NeXT", 5);

        consultoria.contratar(dev03);
        consultoria.contratar(dev02);
        consultoria.contratar(dev01);
        consultoria.contratar(devMobile01);
        consultoria.contratar(devMobile02);
        //consultoria.contratar(devMobile03);
        System.out.println(consultoria.existePorNome("Andressa"));
        System.out.println(consultoria.existePorNome("marina"));
        System.out.println("Devs: " + consultoria.getQuantidadeDesenvolvedores());
        System.out.println("Devs mobile: " + consultoria.getQuantidadeDesenvolvedoresMobile());
        System.out.println("Total de salários: " + consultoria.getTotalSalarios());
        System.out.println(consultoria.buscarDesenvolverPorNome("alan"));
        System.out.println(consultoria.buscarDesenvolverPorNome("marina"));
        System.out.println(consultoria.buscarDesenvolverPorNome("sara"));
    }
}
