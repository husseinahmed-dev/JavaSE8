package ite409.GUI;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

/**
 * Created by Hussein on 4/6/17.
 */
public class CalculatorFrame extends JFrame implements ActionListener {
    private static JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn0, bplus, bminus, bmultiply, bdivide, bequal, bdot;
    private static JTextField window;
    private static String sign="";
    private static double n1=0;
    private static double n2=0;
    private static double answer=0;

    public CalculatorFrame() {
        super("Calculator");
        setLayout(new FlowLayout());

        window = new JTextField();
        window.setColumns(25);
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bn0 = new JButton("0");
        bplus = new JButton("+");
        bminus = new JButton("-");
        bmultiply = new JButton("*");
        bdivide = new JButton("/");
        bequal = new JButton("=");
        bdot = new JButton(".");

        add(window);
        add(bn7);
        add(bn8);
        add(bn9);
        add(bdivide);
        add(bn4);
        add(bn5);
        add(bn6);
        add(bmultiply);
        add(bn1);
        add(bn2);
        add(bn3);
        add(bminus);
        add(bn0);
        add(bdot);
        add(bequal);
        add(bplus);

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn0.addActionListener(this);
        bminus.addActionListener(this);
        bplus.addActionListener(this);
        bmultiply.addActionListener(this);
        bdivide.addActionListener(this);
        bequal.addActionListener(this);
        bdot.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bn1)
            window.setText(window.getText().concat("1"));

        if(e.getSource()==bn2)
            window.setText(window.getText().concat("2"));

        if(e.getSource()==bn3)
            window.setText(window.getText().concat("3"));

        if(e.getSource()==bn4)
            window.setText(window.getText().concat("4"));

        if(e.getSource() == bn5)
            window.setText(window.getText().concat("5"));

        if(e.getSource()==bn6)
            window.setText(window.getText().concat("6"));

        if(e.getSource()==bn7)
            window.setText(window.getText().concat("7"));

        if(e.getSource()==bn8)
            window.setText(window.getText().concat("8"));

        if(e.getSource()==bn9)
            window.setText(window.getText().concat("9"));

        if(e.getSource()==bn0)
            window.setText(window.getText().concat("0"));

        if(e.getSource()==bdot)
            window.setText(window.getText().concat("."));

        if(e.getSource()==bplus) {
            n1 = Double.parseDouble(window.getText());
            sign = "addition";
            window.setText("");
        }

        if(e.getSource()==bminus) {
            n1 = Double.parseDouble(window.getText());
            sign="subtraction";
            window.setText("");
        }

        if(e.getSource()==bmultiply) {
            n1 = Double.parseDouble(window.getText());
            sign="multiplication";
            window.setText("");
        }

        if(e.getSource()==bdivide) {
            n1=Double.parseDouble(window.getText());
            sign="division";
            window.setText("");
        }

        if(e.getSource()==bequal) {
            n2=Double.parseDouble(window.getText());

            switch(sign) {
                case "addition": answer=n1+n2;
                    break;

                case "subtraction": answer=n1-n2;
                    break;

                case "multiplication": answer=n1*n2;
                    break;

                case "division": answer=n1/n2;
                    break;

                default: answer=0;
            }

            window.setText(""+answer);
        }

    }

}