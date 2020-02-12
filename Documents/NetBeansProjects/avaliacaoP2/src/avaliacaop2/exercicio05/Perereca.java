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
public class Perereca extends Animal{
    public Perereca(String nome, String raca) {
        super(nome, raca);
    }
      public String andar() {
          System.out.println("Olá, sou uma perereca e não ando.");
    }

    public String correr() {
        System.out.println("Olá, sou uma perereca e não nado.");
    }

    public String saltar() {
        System.out.println("Olá, sou uma perereca e estou saltando.");
    }

    public String nadar() {
        System.out.println("Olá, sou uma perereca e não nado.");
        
    }
    
}


