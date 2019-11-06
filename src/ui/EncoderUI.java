package ui;

import domain.CeasarEncoder;
import domain.EncoderContext;
import domain.MirrorEncoder;

import javax.swing.*;

public class EncoderUI {
    public static void main(String[] args) {
        //slaat string op in
        String toBeModified = JOptionPane.showInputDialog("Met welke zin/woord wil je iets doen?");

        if (toBeModified.equals("Q")) {
            System.exit(0);
        }

        keuzeversleutel(toBeModified);
        //Vraag voor encode of decode

    }

    //Keuze ding
    private static String KeuzeVerOfNiet() {
        int choice = -1;
        Object[] code = {"Encode", "Decode"};
        JPanel panel = new JPanel();
//        JButton encode = new JButton("Encode");
//        JButton decode = new JButton("Decode");
//        panel.add(encode);
//        panel.add(decode);


        while (choice != 0) {

            JOptionPane option = new JOptionPane();
            int result = JOptionPane.showOptionDialog(null, panel, "Encode or Decode?", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, code, null);

//            String choiceString = (String) option.get
//            System.out.println(result);

//            if (choiceString == null || choiceString.isEmpty()) {
//                continue;
//            }
//            try {
//                choice = Integer.parseInt(choiceString);
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Invalid menu choice: \"" + choiceString + "\", try again.");
//                continue;
//            }
            if (result == -1) {
                System.exit(0);
            }
            if (result == 0) {
                return "encode";
            } else if (result == 1) {
                return "decode";
            }

        }
        return "";
    }


    //Keuze ding voor versleutelingstype
    private static void keuzeversleutel(String toBeEncoded) {
        int choice = -1;
        String[] algo = {"Caesar", "Mirror","Quit"};
        JComboBox<String> algos = new JComboBox<>(algo);
            while (choice != 0) {



                JOptionPane option = new JOptionPane();
                JOptionPane.showMessageDialog(null, algos, "select or type a value", JOptionPane.QUESTION_MESSAGE);
//                option.add(algos);


                String choiceString = (String) algos.getSelectedItem();

                if (choiceString == null) {
                    continue;
                }
//                if (choiceString.isEmpty()) {
//                    continue;
//                }

                if (choiceString.equals("Quit")) {
                    System.exit(0);

                }



                if (choiceString.equals("Caesar")) {
                    //yeet1
                    EncoderContext context = new EncoderContext(new CeasarEncoder());
                    if (KeuzeVerOfNiet().equals("encode")) {
                        JOptionPane.showMessageDialog(null, context.encode(toBeEncoded));
                    } else {
                        JOptionPane.showMessageDialog(null, context.decode(toBeEncoded));
                    }
                } else if (choiceString.equals("Mirror")) {
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

