/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaop2.exercicio03;

/**
 *
 * @author usuario
 */
public class MatriculaJubilada implements EstadoMatricula {

    public void ativar(Matricula m) {
        System.out.println("Matrícula jubilada, passe no ENEM de novo para efetuar nova matrícula");
    }

    @Override
    public void trancar(Matricula m) {
        System.out.println("Matrícula jubilada, não pode efetuar o trancamento!");
    }

    @Override
    public void jubilar(Matricula m) {
        System.out.println("Essa matrícula já se encontra jubilada!");;
    }
}