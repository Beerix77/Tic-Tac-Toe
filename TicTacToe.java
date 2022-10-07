import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel heading = new JPanel();
    JPanel buttonsPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;


    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.getContentPane().setBackground(new Color(182, 100, 256));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void whoIsFirst() {

    }

    public void checkWhoWins(){

    }

    public void xWins(int a, int b, int c){

    }
    public void oWins(int a, int b, int c){

    }
}

