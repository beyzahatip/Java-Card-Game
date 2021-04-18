package Ssun;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Player extends Gamer {

    private ActionListener chooseCardB1;
    private ActionListener chooseCardB2;
    private ActionListener chooseCardB3;
    private ActionListener chooseCardB4;
    private ActionListener chooseCardB5;
    private ActionListener chooseCardB6;
    private ActionListener chooseCardB7;
    private ActionListener chooseCardB8;
    private int choosenCard;
    private int pScore;
    private String playerName;

    public Player(int pScore, String playerName) {
        super(pScore, playerName);

    }
    
     public Player() {
   
    }
    

    //Insan oyuncusunda kart secimi elle yapilir, tiklanan kartin indisi dondurulur
    @Override
    public int pickCard(JButton card1, JButton card2, JButton card3, JButton card4, JButton card5, JButton card6, JButton card7, JButton card8, ArrayList dnmf, ArrayList dnmv, int test) {
        choosenCard = -1;
        if (test == 0) {
            chooseCardB1 = (ActionEvent e) -> {
                choosenCard = 0;
            };

            chooseCardB2 = (ActionEvent e) -> {
                choosenCard = 1;
            };

            chooseCardB3 = (ActionEvent e) -> {
                choosenCard = 2;
            };

            chooseCardB4 = (ActionEvent e) -> {
                choosenCard = 3;
            };

            chooseCardB5 = (ActionEvent e) -> {
                choosenCard = 4;
            };

            chooseCardB6 = (ActionEvent e) -> {
                choosenCard = 5;
            };

            chooseCardB7 = (ActionEvent e) -> {
                choosenCard = 6;
            };

            chooseCardB8 = (ActionEvent e) -> {
                choosenCard = 7;
            };

            card1.addActionListener(chooseCardB1);
            card2.addActionListener(chooseCardB2);
            card3.addActionListener(chooseCardB3);
            card4.addActionListener(chooseCardB4);
            card5.addActionListener(chooseCardB5);
            card6.addActionListener(chooseCardB6);
            card7.addActionListener(chooseCardB7);
            card8.addActionListener(chooseCardB8);

            while (choosenCard == -1) {
                try {
                    Thread.sleep(250);
                } catch (java.lang.InterruptedException e) {
                    System.out.println("Hata");
                }
            }

            card1.removeActionListener(chooseCardB1);
            card2.removeActionListener(chooseCardB2);
            card3.removeActionListener(chooseCardB3);
            card4.removeActionListener(chooseCardB4);
            card5.removeActionListener(chooseCardB5);
            card6.removeActionListener(chooseCardB6);
            card7.removeActionListener(chooseCardB7);
            card8.removeActionListener(chooseCardB8);

        }
        if (test % 2 == 0 && test != 0) {

            chooseCardB1 = (ActionEvent e) -> {
                choosenCard = 0;
            };

            chooseCardB2 = (ActionEvent e) -> {
                choosenCard = 1;
            };

            chooseCardB3 = (ActionEvent e) -> {
                choosenCard = 2;
            };

            chooseCardB4 = (ActionEvent e) -> {
                choosenCard = 3;
            };
            card1.addActionListener(chooseCardB1);
            card2.addActionListener(chooseCardB2);
            card3.addActionListener(chooseCardB3);
            card4.addActionListener(chooseCardB4);
            while (choosenCard == -1) {
                try {
                    Thread.sleep(250);
                } catch (java.lang.InterruptedException e) {
                    System.out.println("Hata");
                }
            }
            card1.removeActionListener(chooseCardB1);
            card2.removeActionListener(chooseCardB2);
            card3.removeActionListener(chooseCardB3);
            card4.removeActionListener(chooseCardB4);
        }

        if (test % 2 == 1) {

            chooseCardB5 = (ActionEvent e) -> {
                choosenCard = 4;
            };

            chooseCardB6 = (ActionEvent e) -> {
                choosenCard = 5;
            };

            chooseCardB7 = (ActionEvent e) -> {
                choosenCard = 6;
            };

            chooseCardB8 = (ActionEvent e) -> {
                choosenCard = 7;
            };
            card5.addActionListener(chooseCardB5);
            card6.addActionListener(chooseCardB6);
            card7.addActionListener(chooseCardB7);
            card8.addActionListener(chooseCardB8);
            while (choosenCard == -1) {
                try {
                    Thread.sleep(250);
                } catch (java.lang.InterruptedException e) {
                    System.out.println("Hata");
                }
            }
            card5.removeActionListener(chooseCardB5);
            card6.removeActionListener(chooseCardB6);
            card7.removeActionListener(chooseCardB7);
            card8.removeActionListener(chooseCardB8);

        }

        return choosenCard;
    }
}

