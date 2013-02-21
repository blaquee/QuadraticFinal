
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author glindor
 */
public class JFrameMain extends javax.swing.JFrame
{

    /**
     * Creates new form JFrameMain
     */
    Quadratic qd;

    public JFrameMain()
    {
        qd = new Quadratic();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabelA = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jTextFieldB = new javax.swing.JTextField();
        jTextFieldC = new javax.swing.JTextField();
        jTextFieldResultTwo = new javax.swing.JTextField();
        jLabelC = new javax.swing.JLabel();
        jTextFieldResultOne = new javax.swing.JTextField();
        jButtonCalculate = new javax.swing.JButton();
        jButtonGraph = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quadratic Solver & Grapher");
        setMaximumSize(new java.awt.Dimension(460, 280));
        setMinimumSize(new java.awt.Dimension(420, 240));

        jPanel1.setFocusable(false);

        jLabelA.setText("Coeff-A");

        jTextFieldA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldAActionPerformed(evt);
            }
        });

        jLabel1.setText("                   Solutions");

        jLabelB.setText("Coeff-B");

        jTextFieldB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldBActionPerformed(evt);
            }
        });

        jTextFieldC.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldCActionPerformed(evt);
            }
        });

        jTextFieldResultTwo.setEditable(false);
        jTextFieldResultTwo.setText(" ");
        jTextFieldResultTwo.setFocusable(false);

        jLabelC.setText("Coeff-C");

        jTextFieldResultOne.setEditable(false);
        jTextFieldResultOne.setFocusable(false);

        jButtonCalculate.setText("Calculate");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCalculateActionPerformed(evt);
            }
        });

        jButtonGraph.setText("Graph");
        jButtonGraph.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGraphActionPerformed(evt);
            }
        });

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(jButtonCalculate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabelA)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jLabelB)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabelC)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(44, 44, 44)
                        .add(jLabel1)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTextFieldResultOne)
                            .add(jTextFieldResultTwo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .add(31, 31, 31))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jButtonClose, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jButtonGraph, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .add(18, 18, 18)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelA)
                    .add(jTextFieldA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelB)
                    .add(jTextFieldB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldResultOne, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelC)
                    .add(jTextFieldC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldResultTwo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonCalculate)
                    .add(jButtonGraph)
                    .add(jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonClose, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed

        //Check input for digits only
        char[] input = jTextFieldA.getText().trim().toCharArray();
        for (char c : input)
        {
            if (!Character.isDigit(c))
            {
                jTextFieldA.setText(null);
            } else
            {
                jTextFieldA.transferFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jTextFieldBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBActionPerformed

        //Check input for digits only
        char[] input = jTextFieldB.getText().trim().toCharArray();
        for (char c : input)
        {
            if (!Character.isDigit(c))
            {
                jTextFieldB.setText(null);
            } else
            {
                jTextFieldB.transferFocus();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBActionPerformed

    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed

        DecimalFormat df = new DecimalFormat("0.000");


        //double a, b, c, dis, check;
        qd.setA(Double.parseDouble(jTextFieldA.getText()));
        qd.setB(Double.parseDouble(jTextFieldB.getText()));
        qd.setC(Double.parseDouble(jTextFieldC.getText()));
        
        
        double Positive = qd.roots(true);
        double Negative = qd.roots(false);

        int d = qd.checkDiscriminate();
        if (d <= 0)
        {
            jTextFieldResultOne.setText("Imaginary #");
            jTextFieldResultTwo.setText("Imaginary #");
        } else
        {
            jTextFieldResultOne.setText(df.format(Positive));
            jTextFieldResultTwo.setText(df.format(Negative));
        }



    }//GEN-LAST:event_jButtonCalculateActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed

        int answer = JOptionPane.showConfirmDialog(null, "Are You Sure?");
        if (answer == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraphActionPerformed


        JDialogGraph myGraph = new JDialogGraph(this, true);
        myGraph.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGraphActionPerformed

    private void jTextFieldCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCActionPerformed

        char[] input = jTextFieldC.getText().trim().toCharArray();
        for (char c : input)
        {
            if (!Character.isDigit(c))
            {
                jTextFieldC.setText(null);
            } else
            {
                jButtonCalculate.doClick();
                //jTextFieldB.transferFocus();
            }
        }
    }//GEN-LAST:event_jTextFieldCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jTextFieldA.setText(null);
        jTextFieldB.setText(null);
        jTextFieldC.setText(null);
        jTextFieldResultOne.setText(null);
        jTextFieldResultTwo.setText(null);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new JFrameMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonGraph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldC;
    private javax.swing.JTextField jTextFieldResultOne;
    private javax.swing.JTextField jTextFieldResultTwo;
    // End of variables declaration//GEN-END:variables
}
