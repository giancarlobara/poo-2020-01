import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pessoa {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int idade;
        int cpf;
        String nomePessoa;
        String mae;
        String pai;
        
        nomePessoa = JOptionPane.showInputDialog("Digite o nome da pessoa");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf "));
        mae = JOptionPane.showInputDialog("Digite o nome da mãe");
        pai = JOptionPane.showInputDialog("Digite o nome do pai");

         System.out.println("Nome da pessoa: " + nomePessoa + " de " + idade + " anos\nNúmero do CPF: "+ cpf + "\nMãe: " + mae + "\nPai: " + pai );
    }
}
