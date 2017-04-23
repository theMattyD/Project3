
import java.io.FileWriter;
import javax.swing.JOptionPane;

// Developer:   Matthew Daniels
// Class:       CMIS 242 - Project 3
// Date:        23 April 2017
// Filename:    sequenceGUI.java
// Purpose:     This file is the GUI class/component constructor for Sequence.java

public class sequenceGUI extends javax.swing.JFrame {
    
    public int number;
    public int z;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Project 3");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        buttonGroup1.add(iterativeButton);
        iterativeButton.setSelected(true);
        iterativeButton.setText("Iterative");

        resultTextField.setEditable(false);

        efficiencyTextField.setEditable(false);

        computeButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        computeButton.setText("Compute");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        enterLabel.setText("Enter n:");

        resultLabel.setText("Result:");

        efficiencyLabel.setText("Efficiency:");

        buttonGroup1.add(recursiveButton);
        recursiveButton.setText("Recursive");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterLabel)
                            .addComponent(resultLabel)
                            .addComponent(efficiencyLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(recursiveButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(iterativeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(2, 2, 2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(computeButton))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(efficiencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {efficiencyTextField, inputTextField, resultTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {efficiencyLabel, enterLabel, resultLabel});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {iterativeButton, recursiveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iterativeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recursiveButton))
                    .addComponent(resetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterLabel)
                    .addComponent(computeButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLabel)
                    .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efficiencyLabel)
                    .addComponent(efficiencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {efficiencyLabel, efficiencyTextField, enterLabel, inputTextField, resultLabel, resultTextField});

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

    // ---------------------- CALL SEQUENCES METHOD(S) -------------------------   
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
    // ---------------------- OUTPUT DATA FILE UPON WINDOW CLOSE ---------------    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        // OutputData.txt File Header
        iterative = new Sequence(0);
        recursive = new Sequence(0);
        
        try (FileWriter dataOutput = new FileWriter("outputData.txt")) {
            
            dataOutput.append("n,\t");
            dataOutput.append("Iterative Passes,\t");
            dataOutput.append("Recursive Passes");
            dataOutput.append("\n");
 
            // outputData.txt Recursive and Iterative efficiency
            for (z = 0; z <= 10; z++) {
                dataOutput.append(String.valueOf(z));
                dataOutput.append(",\t");
                
                iterative.computeIterative(z+1);
                dataOutput.append(String.valueOf(iterative.getEfficiency()));
                dataOutput.append(",\t\t\t");
                System.out.print("iterative success " + z + " ");
                
                recursive.computeRecursive(z);
                dataOutput.append(String.valueOf(recursive.getEfficiency()));             
                dataOutput.append("\n");
                
                System.out.println("recursive success " + z);


            }
            dataOutput.flush();
            dataOutput.close();
            System.exit(0);
        } 
        catch (Exception e) {
            evt.getID();
            System.exit(0);
        }
    
    }//GEN-LAST:event_formWindowClosing
// --------------------- VALIDATE USER-INPUT METHOD ------------------------
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
    
    // ---------------------------- MAIN METHOD --------------------------------    
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
