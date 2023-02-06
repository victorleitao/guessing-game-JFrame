package view;

import estudos.guessinggame.MysteriousNumber;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainScreen extends javax.swing.JFrame {

    MysteriousNumber chosenNumber = new MysteriousNumber();
    int tries = 0;

    public MainScreen() {
        initComponents();
        jButtonAgain.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGuessTheNumber = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelRules = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();
        jPanelNumberSeparator = new javax.swing.JPanel();
        jTextFieldNumber = new javax.swing.JTextField();
        jLabelYourGuess = new javax.swing.JLabel();
        jPanelYourGuessSeparator = new javax.swing.JPanel();
        jTextFieldYourGuess = new javax.swing.JTextField();
        jButtonGuess = new javax.swing.JButton();
        jLabelYourGuessWas = new javax.swing.JLabel();
        jPanelYourGuessWasSeparator = new javax.swing.JPanel();
        jTextFieldYourGuessWas = new javax.swing.JTextField();
        jButtonAgain = new javax.swing.JButton();
        jLabelTries = new javax.swing.JLabel();
        jTextFieldTries = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Guess the Number!");
        jLabelTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelRules.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRules.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRules.setText("(From 1 to 999)");
        jLabelRules.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelNumber.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabelNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNumber.setText("Number:");

        javax.swing.GroupLayout jPanelNumberSeparatorLayout = new javax.swing.GroupLayout(jPanelNumberSeparator);
        jPanelNumberSeparator.setLayout(jPanelNumberSeparatorLayout);
        jPanelNumberSeparatorLayout.setHorizontalGroup(
            jPanelNumberSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelNumberSeparatorLayout.setVerticalGroup(
            jPanelNumberSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextFieldNumber.setEditable(false);
        jTextFieldNumber.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jTextFieldNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumber.setText("?");

        jLabelYourGuess.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabelYourGuess.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelYourGuess.setText("Your guess:");

        javax.swing.GroupLayout jPanelYourGuessSeparatorLayout = new javax.swing.GroupLayout(jPanelYourGuessSeparator);
        jPanelYourGuessSeparator.setLayout(jPanelYourGuessSeparatorLayout);
        jPanelYourGuessSeparatorLayout.setHorizontalGroup(
            jPanelYourGuessSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanelYourGuessSeparatorLayout.setVerticalGroup(
            jPanelYourGuessSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jTextFieldYourGuess.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        jTextFieldYourGuess.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonGuess.setBackground(new java.awt.Color(153, 255, 153));
        jButtonGuess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonGuess.setText("Guess!");
        jButtonGuess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuessMouseClicked(evt);
            }
        });

        jLabelYourGuessWas.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabelYourGuessWas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelYourGuessWas.setText("Your guess was:");

        javax.swing.GroupLayout jPanelYourGuessWasSeparatorLayout = new javax.swing.GroupLayout(jPanelYourGuessWasSeparator);
        jPanelYourGuessWasSeparator.setLayout(jPanelYourGuessWasSeparatorLayout);
        jPanelYourGuessWasSeparatorLayout.setHorizontalGroup(
            jPanelYourGuessWasSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelYourGuessWasSeparatorLayout.setVerticalGroup(
            jPanelYourGuessWasSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextFieldYourGuessWas.setEditable(false);
        jTextFieldYourGuessWas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextFieldYourGuessWas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldYourGuessWas.setToolTipText("");

        jButtonAgain.setBackground(new java.awt.Color(255, 153, 153));
        jButtonAgain.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAgain.setText("Again!");
        jButtonAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgainMouseClicked(evt);
            }
        });

        jLabelTries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTries.setText("Number of Tries:");

        jTextFieldTries.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldTries.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTries.setText("0");

        javax.swing.GroupLayout jPanelGuessTheNumberLayout = new javax.swing.GroupLayout(jPanelGuessTheNumber);
        jPanelGuessTheNumber.setLayout(jPanelGuessTheNumberLayout);
        jPanelGuessTheNumberLayout.setHorizontalGroup(
            jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelGuessTheNumberLayout.createSequentialGroup()
                .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelYourGuessWas, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jLabelYourGuess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelYourGuessSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelNumberSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelYourGuessWasSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGuessTheNumberLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTries, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTries, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldYourGuessWas)
                    .addGroup(jPanelGuessTheNumberLayout.createSequentialGroup()
                        .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jTextFieldYourGuess, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGuess, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jButtonAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelGuessTheNumberLayout.setVerticalGroup(
            jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuessTheNumberLayout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRules)
                .addGap(18, 18, 18)
                .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelNumberSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldNumber)
                        .addComponent(jLabelNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuessTheNumberLayout.createSequentialGroup()
                        .addComponent(jButtonAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(9, 9, 9)
                .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelGuessTheNumberLayout.createSequentialGroup()
                        .addComponent(jButtonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanelGuessTheNumberLayout.createSequentialGroup()
                        .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelYourGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelYourGuessSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldYourGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelYourGuessWas, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(jPanelYourGuessWasSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldYourGuessWas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGuessTheNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTries, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabelTries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGuessTheNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGuessTheNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuessMouseClicked
        if (jTextFieldYourGuess.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "You must take a guess!");
        } else {
            if (!Pattern.matches("^[0-9]+$", jTextFieldYourGuess.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Your guess must be a positive integer.");
            } else {
                if (Integer.parseInt(jTextFieldYourGuess.getText()) < 1 || (Integer.parseInt(jTextFieldYourGuess.getText()) > 999)) {
                    JOptionPane.showMessageDialog(rootPane, "Your guess has to be between 1 and 999.");
                } else {
                    int yourGuess = Integer.parseInt(jTextFieldYourGuess.getText());
                    jTextFieldYourGuessWas.setText(verifyNumber(yourGuess, chosenNumber.getNumber()));
                }
            }
        }
    }//GEN-LAST:event_jButtonGuessMouseClicked

    private void jButtonAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgainMouseClicked
        jTextFieldNumber.setText("?");
        jButtonAgain.setVisible(false);
        jTextFieldYourGuess.setText("");
        jTextFieldTries.setText("0");
        tries = 0;
        changeNumber();
    }//GEN-LAST:event_jButtonAgainMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgain;
    private javax.swing.JButton jButtonGuess;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelRules;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTries;
    private javax.swing.JLabel jLabelYourGuess;
    private javax.swing.JLabel jLabelYourGuessWas;
    private javax.swing.JPanel jPanelGuessTheNumber;
    private javax.swing.JPanel jPanelNumberSeparator;
    private javax.swing.JPanel jPanelYourGuessSeparator;
    private javax.swing.JPanel jPanelYourGuessWasSeparator;
    private javax.swing.JTextField jTextFieldNumber;
    private javax.swing.JTextField jTextFieldTries;
    private javax.swing.JTextField jTextFieldYourGuess;
    private javax.swing.JTextField jTextFieldYourGuessWas;
    // End of variables declaration//GEN-END:variables

    //private String verifyNumber(int guess, int number) {
    private String verifyNumber(int guess, int number) {
        if (guess > number) {
            tries++;
            jTextFieldTries.setText(Integer.toString(tries));
            return "Too high!";
        } else {
            if (guess < number) {
                tries++;
                jTextFieldTries.setText(Integer.toString(tries));
                return "Too low!";
            } else {
                tries++;
                jTextFieldTries.setText(Integer.toString(tries));
                jButtonAgain.setVisible(true);
                jTextFieldNumber.setText(Integer.toString(chosenNumber.getNumber()));
                return "Right!";
            }
        }
    }
    private void changeNumber() {
        chosenNumber.generateAgain();
    }
}