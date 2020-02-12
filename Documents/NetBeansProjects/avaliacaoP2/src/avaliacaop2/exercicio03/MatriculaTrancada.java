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
public class MatriculaTrancada implements EstadoMatricula {

    public void ativar(Matricula m) {
        m.setEstadoAtual(new MatriculaAtiva ());
    }

    @Override
    public void trancar(Matricula m) {
        System.out.println("Matrícula já está trancada!");
    }

    @Override
    public void jubilar(Matricula m) {
        m.setEstadoAtual(new MatriculaJubilada());
    }
}
