package com.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {


// all the add on, on the form
    private JButton btnNoodles;
    private JPanel PanelMenu;
    private JButton btnChicken;
    private JButton btnBurrito;
    private JButton bntAmount1;
    private JButton btnButton2;
    private JButton bntAmount3;
    private JLabel bntAmoun2;


//global varubles for the food options
    double chicken = 105;
    double noodles = 45;
    double burrito = 60;

    //global varubles for the time options
    double amount1 = 1;
    double amount2 = 2;
    double amount3 = 3;

// what the users selects / final results
    double total = 0;
    String nameItem ;

    /*
    * this program gets the user's input and dose calculations to find out the amount of time it take's a food order in
    * in a microwave and how many orders there was
     */


    //make the form show up and run the form
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public App() {
        //click this button and it will select noodles
        btnNoodles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //selctiing the user option
                total = noodles;
                String Item1 = "noodles";
                nameItem = Item1;
            }
        });
        //click this button and it will select chicken
        btnChicken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //selctiing the user option
                total = chicken;
                String Item2 = "Chicken";
                nameItem = Item2;
            }
        });
        //click this button and it will select burrito
        btnBurrito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //selctiing the user option
                total = burrito;
                String Item3 = "burrito";
                nameItem = Item3;
            }
        });
        //click this button and it will select
        bntAmount1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //selctiing the user option
                total = total * amount1;
                String.valueOf(amount1);
                String.valueOf(total);
                //displaying what user chose
                JOptionPane.showMessageDialog(null, total + " seconds " + nameItem +" "+ amount1 );
            }
        });
        //click this button and it will select
        btnButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //selctiing the user option
                total = total * amount2;
                String.valueOf(total);
                //displaying what user chose
                JOptionPane.showMessageDialog(null, total + " seconds " + nameItem +" "+ amount2 );
            }
        });
        //click this button and it will select
        bntAmount3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //selctiing the user option
                total = total * amount3;
                String.valueOf(total);
                //displaying what user chose
                JOptionPane.showMessageDialog(null, total + " seconds " + nameItem +" "+ amount3 );
            }
        });
    }
}
