package sptech.atividade.abstrata;

/**
 *
 * @author alan
 */
public class TesteEmpresa {

    public static void main(String[] args) {
        Vendedor func01 = new Vendedor(400.50, 1.1, "023-123-233-12", "Jarbas");
        Horista func02 = new Horista(100, 70.0, "923-342-090-22", "Tico");
        
        Empresa empresa = new Empresa("Aquela");
        
        empresa.adicionarFunc(func01);
        empresa.adicionarFunc(func02);
        
        empresa.exibeTodos();
        empresa.exibeTotalSalario();
    }
}
