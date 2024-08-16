package atividade3;
import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(new Figuras());
        janela.setSize(300, 1080);
        janela.setVisible(true);
    }
}
