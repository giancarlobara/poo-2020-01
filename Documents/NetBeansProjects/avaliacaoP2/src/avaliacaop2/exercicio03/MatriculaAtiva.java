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
public class MatriculaAtiva implements EstadoMatricula {

    public void ativar(Matricula m) {
        System.out.println("Mátricula já se encontra ativa!");
    }

    @Override
    public void trancar(Matricula m) {
        m.setEstadoAtual(new MatriculaTrancada());
    }

    @Override
    public void jubilar(Matricula m) {
        m.setEstadoAtual(new MatriculaJubilada());
    }
}