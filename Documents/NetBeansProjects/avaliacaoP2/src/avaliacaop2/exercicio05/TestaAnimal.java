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
public class TestaAnimal {
    public static void main(String[] args) {
        
        Animal bicho[];
        bicho = new Animal[4];
        
        bicho[0] = new Girino("Girino");
        bicho[1] = new Perereca("Perereca");
        bicho[2] = new Rinoceronte("Rinoceronte");
        bicho[3] = new Suricato("Suricato");
        
        
        for (int i = 0; i < 4; i++) {
            bicho[i].andar();
        }
        for (int i = 0; i < 4; i++) {
            bicho[i].nadar();
        }
        for (int i = 0; i < 4; i++) {
            bicho[i].correr();
        }
        for (int i = 0; i < 4; i++) {
            bicho[i].saltar();
        }
    }
}
