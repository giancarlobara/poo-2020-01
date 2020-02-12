/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaop2.exercicio05;

/**
 *
 * @author usuario
 */
public class Rinoceronte extends Animal {
    
 public Rinoceronte(String nome, String raca) {
        super(nome, raca);
    }
    public String andar() {
        System.out.println("Olá, sou um rinoceronte e não ando.");
    }

    public String correr() {
        System.out.println("Olá, sou um rinoceronte e estou correndo.");
    }

    public String saltar() {
        System.out.println("Olá, sou um rinoceronte e não salto.");
    }

    public String nadar() {
        System.out.println("Olá, sou um rinoceronte e não nado.");

    }

}
