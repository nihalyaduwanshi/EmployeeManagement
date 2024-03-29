/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.gui;

import empmgmt.dbutil.DBConnection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class OptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form OptionsFrame
     */
    public OptionsFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbSearchEmp = new javax.swing.JRadioButton();
        jrbShowAllEmp = new javax.swing.JRadioButton();
        jrbUpdateEmp = new javax.swing.JRadioButton();
        jrbDeleteEmp = new javax.swing.JRadioButton();
        jrbQuit = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select An Option");

        jrbAddEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbAddEmp.setText("Add Employee");

        jrbSearchEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSearchEmp);
        jrbSearchEmp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbSearchEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbSearchEmp.setText("Search Employee");
        jrbSearchEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSearchEmpActionPerformed(evt);
            }
        });

        jrbShowAllEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbShowAllEmp);
        jrbShowAllEmp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbShowAllEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbShowAllEmp.setText("View All Employee");

        jrbUpdateEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbUpdateEmp);
        jrbUpdateEmp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbUpdateEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbUpdateEmp.setText("Update Employee");

        jrbDeleteEmp.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbDeleteEmp);
        jrbDeleteEmp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbDeleteEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrbDeleteEmp.setText("Delete Employee");

        jrbQuit.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbQuit);
        jrbQuit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrbQuit.setForeground(new java.awt.Color(255, 255, 255));
        jrbQuit.setText("Quit");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbAddEmp)
                            .addComponent(jrbShowAllEmp)
                            .addComponent(jrbSearchEmp)
                            .addComponent(jrbUpdateEmp)
                            .addComponent(jrbDeleteEmp)
                            .addComponent(jrbQuit)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jrbAddEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbSearchEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbShowAllEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbUpdateEmp)
                .addGap(18, 18, 18)
                .addComponent(jrbDeleteEmp)
                .addGap(26, 26, 26)
                .addComponent(jrbQuit)
                .addGap(41, 41, 41)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbSearchEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSearchEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSearchEmpActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(validateOption()==false){
            JOptionPane.showMessageDialog(null, "Please make a selection first");
           return;
        }
        JFrame frame=null;
        if(jrbAddEmp.isSelected()){
            frame=new AddEmployeeFrame();
        }
        else if(jrbShowAllEmp.isSelected()){
            frame=new ViewAllEmployeeFrame();
        }
        else if(jrbSearchEmp.isSelected()){
            frame=new SearchEmployeeFrame();
         }
        else if(jrbUpdateEmp.isSelected()){
            frame=new UpdateEmployeeFrame();
        }
         else if(jrbDeleteEmp.isSelected()){
            frame=new DeleteEmployeeFrame();
        }
       
        else  if(jrbQuit.isSelected()){
         DBConnection.closeConnection();
         System.exit(0);
        }
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbDeleteEmp;
    private javax.swing.JRadioButton jrbQuit;
    private javax.swing.JRadioButton jrbSearchEmp;
    private javax.swing.JRadioButton jrbShowAllEmp;
    private javax.swing.JRadioButton jrbUpdateEmp;
    // End of variables declaration//GEN-END:variables
    
    private boolean validateOption(){
        if(buttonGroup1.getSelection()==null)
           return false;
        return true;
    }
}
