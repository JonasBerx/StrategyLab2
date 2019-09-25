package ui;

import domain.CeasarEncoder;
import domain.EncoderContext;
import domain.MirrorEncoder;

import javax.swing.*;

public class EncoderUI {
    public static void main(String[] args) {
        //slaat string op in
        String toBeModified = JOptionPane.showInputDialog("Met welke zin/woord wil je iets doen?");

        keuzeversleutel(toBeModified);
        //Vraag voor encode of decode

    }

    //Keuze ding
    private static String KeuzeVerOfNiet() {
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog("\n1.Encode\n2.Decode");

            if (choiceString == null || choiceString.isEmpty()) {
                continue;
            }
            try {
                choice = Integer.parseInt(choiceString);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid menu choice: \"" + choiceString + "\", try again.");
                continue;
            }
            if (choice == 1) {
                return "encode";
            } else if (choice == 2) {
                return "decode";
            }

        }
        return "";
    }


    //Keuze ding voor versleutelingstype
    private static void keuzeversleutel(String toBeEncoded) {
            int choice = -1;
            while (choice != 0) {
                String choiceString = JOptionPane.showInputDialog("Op welke manier? \n1.CaeserSalad\n2.MirrorView");

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
                    if (KeuzeVerOfNiet().equals("encode")) {
                        JOptionPane.showMessageDialog(null, context.encode(toBeEncoded));
                    } else {
                        JOptionPane.showMessageDialog(null, context.decode(toBeEncoded));
                    }
                } else if (choice == 2) {
                    //yeet2
                    EncoderContext context = new EncoderContext(new MirrorEncoder());
                    if (KeuzeVerOfNiet().equals("encode")) {
                        JOptionPane.showMessageDialog(null, context.encode(toBeEncoded));
                    } else {
                        JOptionPane.showMessageDialog(null, context.decode(toBeEncoded));
                    }
                }

            }
        }
    }

