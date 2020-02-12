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
public class TestaAluno {
    public static void main(String[] args) {
		Matricula m = new Matricula();
                Aluno a = new Aluno("Giancarlo Silva", "Engenharia de Software", "UFG");
                System.out.println("Mudar estados da matrícula do Aluno\n" + a);
                
		System.out.println(m.getEstadoAtual().getClass().getSimpleName());	
		m.trancar();
		System.out.println(m.getEstadoAtual().getClass().getSimpleName());	
		m.ativar();
		System.out.println(m.getEstadoAtual().getClass().getSimpleName());	
		m.ativar();
		System.out.println(m.getEstadoAtual().getClass().getSimpleName());	
		m.jubilar();
		System.out.println(m.getEstadoAtual().getClass().getSimpleName());	
		m.ativar();
                System.out.println(m.getEstadoAtual().getClass().getSimpleName());	
		m.trancar();
                System.out.println(m.getEstadoAtual().getClass().getSimpleName());
	}

}

