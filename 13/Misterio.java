import java.util.Scanner;
import javax.swing.JOptionPane;

public class Misterio {
        public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int patas;
        String tamanho; 
        String ser = null;

        patas = Integer.parseInt(JOptionPane.showInputDialog("Quantas patas tinha o ser que o senhor viu?"));

        if(patas == 1){
            System.out.println("Não era bicho o que o senhor viu, era o saci a toda velocidade.");
        }
        else{
            tamanho = JOptionPane.showInputDialog("Era grande ou pequeno?");
            if(patas == 2){
                if("grande".equals(tamanho)){
                ser = "o tio Rex";
                }
                else{
                    ser = "um gnomo";
                }
            }
            if(patas == 4){
                if("grande".equals(tamanho)){
                    ser = "a mula sem cabeça";
                }
                else{
                    ser = "o Bulbasaur";
                }
            }
            
            System.out.println("O bicho que o senhor viu era " + ser + ".\n");
        }
    }
}
