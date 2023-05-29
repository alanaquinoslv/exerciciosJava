package com.mycompany.correcao.colaborador.rh;

/**
 *
 * @author Admin
 */
public class Colaborador {
    //Modificador de acesso: private
    private String nome;
    private String cargo;
    private Double salario;
    
    //Construtor:
    // Sempre é publico
    // Sempre tem o mesmo nome da classe

    public Colaborador(String nome, 
            String cargo, 
            Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    //Sobrecarga de construtor
    public Colaborador(String nome, 
            String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 1300.0;
    }
        
    // Já que os atributos são privados
    // Criamos métodos publicos, para que 
    // eles sejam acessados em outras classes
    // no padrão de nome get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if(salario > 1500.0){
          this.salario = salario;  
        }else{
            System.out.println("Ai é trabalho voluntário");
        }
        
    }
    
    // Sobrescrita

    @Override
    public String toString() {
        return  String.format("Colaborador: "
                + "\nNome: %s"
                + "\nCargo: %s"
                + "\nSalário: %.3f", 
                nome,
                cargo,
                salario);
    }
    
    
}
