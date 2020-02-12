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
public class Matricula {
    private int numero;
    
    
    
    EstadoMatricula estadoAtual;
    

   public Matricula() {
		estadoAtual = new MatriculaAtiva();
	}
	
	public void ativar() {
		estadoAtual.ativar(this);
	}
	
	public void trancar() {
		estadoAtual.trancar(this);
	}
	
	public void jubilar() {
		estadoAtual.jubilar(this);
	}
        public EstadoMatricula getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoMatricula estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
    }

    
    
    

