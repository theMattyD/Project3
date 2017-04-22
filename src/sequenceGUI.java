
import javax.swing.JOptionPane;

// Developer:   Matthew Daniels
// Class:       CMIS 242 - Project 3
// Date:        23 April 2017
// Filename:    sequenceGUI.java
// Purpose:     This file is the GUI class

public class sequenceGUI extends javax.swing.JFrame {
    
    public int number;

    Sequence iterative = new Sequence(0);
    Sequence recursive = new Sequence(0);

    public sequenceGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        iterativeButton = new javax.swing.JRadioButton();
        inputTextField = new javax.swing.JTextField();
        resultTextField = new javax.swing.JTextField();
        efficiencyTextField = new javax.swing.JTextField();
        computeButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        enterLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        efficiencyLabel = new javax.swing.JLabel();
        recursiveButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project 3");

        buttonGroup1.add(iterativeButton);
        iterativeButton.setSelected(true);
        iterativeButton.setText("Iterative");

        computeButton.setText("Compute");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        enterLabel.setText("Enter n:");

        resultLabel.setText("Result:");

        efficiencyLabel.setText("Efficiency:");

        recursiveButton.setText("Recursive");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterLabel)
                    .addComponent(resultLabel)
                    .addComponent(efficiencyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(efficiencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(computeButton)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recursiveButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iterativeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {efficiencyTextField, inputTextField, resultTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {efficiencyLabel, enterLabel, resultLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {iterativeButton, recursiveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(iterativeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recursiveButton)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterLabel)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computeButton)
                    .addComponent(resetButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultLabel)
                        .addGap(18, 18, 18)
                        .addComponent(efficiencyLabel)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(efficiencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ----------------------- RESET EVERYTHING METHOD -------------------------    
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        inputTextField.setText("");
        resultTextField.setText("");
        efficiencyTextField.setText("");
        iterative = new Sequence(0);
        recursive = new Sequence(0);
    }//GEN-LAST:event_resetButtonActionPerformed

    // ---------------------- COMPUTE SEQUENCES METHOD -------------------------   
    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
        
        
        try {
            number = validateAmount();  // Validation checks
        }
        catch (NumberFormatException e) {
            return;
        }
        if (iterativeButton.isSelected()) {
            iterative.computeIterative(number);
            resultTextField.setText(String.valueOf(iterative.getNumber()));
            efficiencyTextField.setText(String.valueOf(iterative.getEfficiency()));
        }
        else if (recursiveButton.isSelected()) {
            recursive.computeRecursive(number);
            resultTextField.setText(String.valueOf(recursive.getNumber()));
            efficiencyTextField.setText(String.valueOf(recursive.getEfficiency()));            
        }
    }//GEN-LAST:event_computeButtonActionPerformed

    // -----------------------VALIDATE AMOUNT METHOD ---------------------------
    private int validateAmount() throws NumberFormatException {
        int userInput;
        String message;
        
        try {
            userInput = Integer.parseInt(inputTextField.getText());
        // Ensure user input is a number
        } catch (NumberFormatException e) {
            message = "Input Error - PLEASE ENTER A NUMBER";
            JOptionPane.showMessageDialog(null, message);
            throw new NumberFormatException(message);
        }
        return(userInput);
    }
    
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sequenceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton computeButton;
    private javax.swing.JLabel efficiencyLabel;
    private javax.swing.JTextField efficiencyTextField;
    private javax.swing.JLabel enterLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JRadioButton iterativeButton;
    private javax.swing.JRadioButton recursiveButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField resultTextField;
    // End of variables declaration//GEN-END:variables
}
