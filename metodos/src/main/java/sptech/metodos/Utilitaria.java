package sptech.metodos;

/**
 *
 * @author alan
 */
public class Utilitaria {

    //retorno - void nao tem retorno
    //nome - exibirLinha
    //argumentos - não tem, fica dentro dos ()
    //corpo - fica dentro das {}
    void exibirLinha() {
        System.out.println("*------*-----*");
    }

    void exibirNome(String nome) {
        System.out.println("Meu nome é " + nome);
    }

    // metodos podem chamar outros metodos
    //pode ter metodos diferentes com mesmo nome de argumento
    // variavel do argumento morre no corpo do metodo
    void exibirNomeFormatado(String nome) {
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }

}
