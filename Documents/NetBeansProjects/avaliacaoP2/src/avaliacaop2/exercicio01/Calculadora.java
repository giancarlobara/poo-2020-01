/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaop2.exercicio01;

/**
 *
 * @author usuario
 */
public class Calculadora {
   

    public int somar(int a, int b){
        return a + b;
    }

    public int somar(int[] n){
        int soma = 0;
        int t = n.length;
        for(int i = 0; i < t; i++){
            soma += i;
        }
        return soma;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public int dividir(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public double extrairRaizQuadrada(int n){
        return Math.sqrt(n);
    }

    public double elevarPotencia(int a, int b){
        return Math.pow(a, b);
    }
}
//vi q n daria conta nem tentei, tenho q treinar.
