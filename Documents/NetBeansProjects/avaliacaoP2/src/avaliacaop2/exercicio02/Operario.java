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
public class Operario extends Empregado{
    private Empregado operario;

    public Operario(String nome, double salario, ArrayList<Empregado> listaEmpregados) {
        super(nome, salario, listaEmpregados);
    }
}