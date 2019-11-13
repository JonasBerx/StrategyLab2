package ui;

import domain.*;

import javax.swing.*;

public class EncoderUI {
    public static void main(String[] args) {

        String toBeModified = JOptionPane.showInputDialog("Met welke zin/woord wil je iets doen?");
        if (toBeModified.equals("Q")) {
            System.exit(0);
        }
        keuzeversleutel(toBeModified);
    }

    //Keuze ding
    private static String KeuzeVerOfNiet() {
        int choice = -1;
        Object[] code = {"Encode", "Decode"};
        JPanel panel = new JPanel();
        while (true) {

//            JOptionPane option = new JOptionPane();
            int result = JOptionPane.showOptionDialog(null, panel, "Encode or Decode?", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, code, null);
            if (result == -1) {
                System.exit(0);
            }
            if (result == 0) {
                return "encode";
            } else if (result == 1) {
                return "decode";
            }

        }
    }

    //Keuze ding voor versleutelingstype
    private static void keuzeversleutel(String toBeEncoded) {
        EncoderFactory factory = new EncoderFactory();
        IEncoder encoder = null;
        int choice = -1;
        String[] algo = {"CAESAR", "MIRROR","RANDOM","SECRET","Quit"};
        JComboBox<String> algos = new JComboBox<>(algo);
            while (true) {

                JOptionPane option = new JOptionPane();
                JOptionPane.showMessageDialog(null, algos, "select or type a value", JOptionPane.QUESTION_MESSAGE);

                String choiceString = (String) algos.getSelectedItem();

                if (choiceString == null) {
                    continue;
                }

                if (choiceString.equals("Quit")) {
                    System.exit(0);

                }

                encoder = factory.createObject(choiceString);
                if (KeuzeVerOfNiet().equals("encode")) {
                    JOptionPane.showMessageDialog(null, encoder.encode(toBeEncoded));
                } else {
                    JOptionPane.showMessageDialog(null, encoder.decode(toBeEncoded));
                }

            }
        }
    }

