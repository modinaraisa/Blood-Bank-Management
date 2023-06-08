/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class DonationDetails extends javax.swing.JFrame {

    static void setModel(DefaultTableModel dtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
Connection conn= null;
PreparedStatement pst =null;
    /**
     * Creates new form DonationDetails
     */
    public DonationDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        hospital = new javax.swing.JLabel();
        given = new javax.swing.JLabel();
        dateT = new javax.swing.JTextField();
        hospitalT = new javax.swing.JTextField();
        givenT = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        save = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        back = new javax.swing.JButton();
        table = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setLayout(null);

        heading.setBackground(new java.awt.Color(211, 211, 211));
        heading.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 0, 0));
        heading.setText("DONATION DETAILS");
        heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(heading);
        heading.setBounds(380, 30, 390, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(60, 102, 990, 10);

        date.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 0, 0));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Collection Date :");
        date.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(date);
        date.setBounds(550, 260, 180, 50);

        hospital.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        hospital.setForeground(new java.awt.Color(255, 0, 0));
        hospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hospital.setText("Hospital :");
        hospital.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(hospital);
        hospital.setBounds(550, 180, 180, 50);

        given.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        given.setForeground(new java.awt.Color(255, 0, 0));
        given.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        given.setText("Given Amount : ");
        given.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(given);
        given.setBounds(550, 340, 180, 50);

        dateT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel1.add(dateT);
        dateT.setBounds(790, 260, 210, 50);

        hospitalT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel1.add(hospitalT);
        hospitalT.setBounds(790, 180, 210, 50);

        givenT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jPanel1.add(givenT);
        givenT.setBounds(790, 340, 210, 50);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(540, 420, 580, 10);

        save.setBackground(new java.awt.Color(211, 211, 211));
        save.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 0, 0));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(490, 460, 130, 50);

        Reset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 0, 0));
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset);
        Reset.setBounds(680, 460, 130, 50);

        back.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("Back to Menu");
        back.setActionCommand("Back to Menu");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(60, 30, 170, 50);

        table.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        table.setForeground(new java.awt.Color(255, 0, 0));
        table.setText("Show data ");
        table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableActionPerformed(evt);
            }
        });
        jPanel1.add(table);
        table.setBounds(870, 460, 157, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DDForm.jpg"))); // NOI18N
        bg.setText("Donation Details");
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1130, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1146, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = BloodBank.db();
            String query="insert into DonationDetails(Hospital,CollectionDate,GivenAmount)values(?,?,?)";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, hospitalT.getText());
            ps.setString(2, dateT.getText());
            ps.setString(3, givenT.getText());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Inserted Succesfully");
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
       HomePage h = new HomePage();
        h.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backActionPerformed

    private void tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableActionPerformed
        // TODO add your handling code here:
        DDTable dt = new DDTable();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tableActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        hospitalT.setText("");
        dateT.setText("");
        givenT.setText("");
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(DonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonationDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateT;
    private javax.swing.JLabel given;
    private javax.swing.JTextField givenT;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel hospital;
    private javax.swing.JTextField hospitalT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton save;
    private javax.swing.JButton table;
    // End of variables declaration//GEN-END:variables
}
