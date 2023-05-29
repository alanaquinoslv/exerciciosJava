package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {
    
    private List<Integer> inteiros;
    
    public ListaUtil() {
        inteiros = new ArrayList();
    }
    
    public Integer count() {
        return inteiros.size();
    }
    
    public void add(Integer valor) {
        
        if (valor == null) {
            
        } else {
            inteiros.add(valor);
        }
    }
    
    public void remove(Integer valor) {
        if (valor == null) {
            
        } else {
            inteiros.remove(valor);
        }
    }
    
    public Integer countPares() {
        Integer pares = 0;
        for (Integer par : inteiros) {
            if (par % 2 == 0) {
                pares += 1;
            }
        }
        return pares;
    }
    
    public Integer countImpares() {
        Integer impares = 0;
        for (Integer par : inteiros) {
            if (par % 2 != 0) {
                impares += 1;
            }
        }
        return impares;
    }
    
    public Integer somar() {
        Integer soma = 0;
        for (Integer numero : inteiros) {
            soma += numero;
        }
        return soma;
    }
    
    public Integer getMaior() {
        Integer maiorNum = Integer.MIN_VALUE;
        
        for (Integer numero : inteiros) {
            if (numero > maiorNum) {
                maiorNum = numero;
            }
        }
        if (inteiros.isEmpty()) {
            maiorNum = 0;
        }
        return maiorNum;
    }
    
    public Integer getMenor() {
        Integer menorNum = Integer.MAX_VALUE;
        for (Integer numero : inteiros) {
            if (numero < menorNum) {
                menorNum = numero;
            }
        }
        if (inteiros.isEmpty()) {
            menorNum = 0;
        }
        return menorNum;
    }
    
    public Boolean hasDuplicidade() {
        Boolean temIgual = false;
        
        for (int i = 0; i < inteiros.size(); i++) {
            for (int j = i + 1; j < inteiros.size(); j++) {
                if (inteiros.get(i) != null && inteiros.get(i).equals(inteiros.get(j))) {
                    return true;
                }
            }
        }
        
        return temIgual;
    }
}
