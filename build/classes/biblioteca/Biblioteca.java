package biblioteca;

import javax.swing.JFrame;
import view.TelaInicial;

public class Biblioteca {

    public static void main(String[] args) {
        TelaInicial telIni = new TelaInicial();
        telIni.setVisible(true);
        telIni.setSize(700,500);
        telIni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
