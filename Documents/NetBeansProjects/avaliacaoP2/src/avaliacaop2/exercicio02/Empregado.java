/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaop2.exercicio02;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Empregado {
    private String nome;
    private double salario;
    private int contador = 2;
    private ArrayList<Empregado> listaEmpregados;

    public Empregado(String nome, double salario, ArrayList<Empregado> listaEmpregados) {
        this.nome = nome;
        this.salario = salario;
        listaEmpregados = new ArrayList<Empregado>();
    }
    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    public String imprimir() {
        return "Nome do Empregado: " + nome + " - Salário de R$" + salario;
    }
    public void adicionar(Empregado e) {
        listaEmpregados.add(e);
    }   
    public void remover(Empregado e) {
        listaEmpregados.remove(e);
    }  
    
    public int obterQuantidade(){
        return contador;
    }
    public ArrayList<Empregado> getlistarEmpregados(){
        return listaEmpregados;
    }
}
