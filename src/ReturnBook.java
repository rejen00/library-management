/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ReturnBook extends javax.swing.JFrame {
    Connection c=Connect.ConnectToDB();
    PreparedStatement pst;
    ResultSet rs;
                
    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
        initComponents();
    }
    public void clear(){
        txtbookid.setText("");
        txtbookname.setText("");
        txtduedate.setText("");
        txtissuedate.setText("");
        txtstudentid.setText("");
        txtstudentname.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
   
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        txtduedate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtissuedate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        txtbookid = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtstudentname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue back button60.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 0, 60, -1));

        txtduedate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 240, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 130, 50));

        txtissuedate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 240, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 270, 50));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 270, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Book Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 220, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Due Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 270, 50));

        txtbookname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 240, 40));

        txtbookid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookidActionPerformed(evt);
            }
        });
        getContentPane().add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 240, 40));

        txtstudentid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 350, 40));

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg small.jpg"))); // NOI18N
        jLabel1.setText("Return Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 60));

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        txtstudentname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtstudentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtstudentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 350, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Student Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student registration.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            pst=c.prepareStatement("SELECT * FROM library.book where studentid=?");
            pst.setString(1, txtstudentid.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                    txtbookname.setText(rs.getString("name"));
                    txtbookid.setText(rs.getString("studentid"));
                    txtissuedate.setText(rs.getString("issuedate"));
                    txtduedate.setText(rs.getString("due"));
            }
            else
                JOptionPane.showMessageDialog(this, "Please Enter Valid Student ID");
            pst=c.prepareStatement("SELECT * FROM library.student where studentid=?");
            pst.setString(1, txtstudentid.getText());
            rs=pst.executeQuery();
            if(rs.next())
                    txtstudentname.setText(rs.getString("name"));
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtbookid.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter Student ID and Search it again");
                txtstudentid.requestFocus();
        }
        else{
            try{
            pst=c.prepareStatement("UPDATE `library`.`book` SET `status` = 'NotIssue', `issuedate` = NULL, `due` = NULL, `studentid` = NULL WHERE (`studentid` = ?)");
            pst.setString(1, txtstudentid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Return Successfully");
            clear();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookidActionPerformed

    private void txtstudentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentnameActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtstudentid;
    private javax.swing.JTextField txtstudentname;
    // End of variables declaration//GEN-END:variables
}
