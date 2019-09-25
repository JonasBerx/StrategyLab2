package ui;

import domain.CeasarEncoder;
import domain.EncoderContext;

import javax.swing.*;
import java.awt.*;

public class EncoderUI {
    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("Wat wil je versleutelen");

        //slaat string op in
        String toBeEncoded = string;

        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog("Hoe wil je het versleutelen \n1.CaeserSalad\n2.MirrorView");

            if (choiceString == null) {
                choice = 0;
                continue;
            }
            if (choiceString.isEmpty()) {
                continue;
            }
            try {
                choice = Integer.parseInt(choiceString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid menu choice: \"" + choiceString + "\", try again.");
                continue;
            }
            if (choice == 1) {
                //yeet1
                EncoderContext context = new EncoderContext(new CeasarEncoder());
                JOptionPane.showMessageDialog(null, context.encode(toBeEncoded));
            } else if (choice == 2) {
                //yeet2
                JOptionPane.showMessageDialog(null, "YEET2");
            }

        }
    }

}
