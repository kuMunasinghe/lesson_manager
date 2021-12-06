/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package less_mang;
import java.awt.Color;

/**
 *
 * @author kasun
 */
public class AdminDash extends javax.swing.JFrame {

    /**
     * Creates new form AdminDash
     */
    // define colors
    Color DefaultColor,ClickedColor;
    public AdminDash() {
        initComponents();
        DefaultColor=new Color(13,36,51);
        ClickedColor=new Color(240,151,57);
        
        //Set defualt color to show on run time
        
        cuspanel.setBackground(DefaultColor);
        notpaidcuspanel.setBackground(DefaultColor);
        paidcuspanel.setBackground(DefaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cuspanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        notpaidcuspanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        paidcuspanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        allcusdesk = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        close_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Welcome ! Lesson Manager"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cuspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuspanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuspanelMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("All Customers");

        javax.swing.GroupLayout cuspanelLayout = new javax.swing.GroupLayout(cuspanel);
        cuspanel.setLayout(cuspanelLayout);
        cuspanelLayout.setHorizontalGroup(
            cuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuspanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        cuspanelLayout.setVerticalGroup(
            cuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuspanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        jPanel2.add(cuspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 110));

        notpaidcuspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notpaidcuspanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                notpaidcuspanelMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Not Paid Customers");

        javax.swing.GroupLayout notpaidcuspanelLayout = new javax.swing.GroupLayout(notpaidcuspanel);
        notpaidcuspanel.setLayout(notpaidcuspanelLayout);
        notpaidcuspanelLayout.setHorizontalGroup(
            notpaidcuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notpaidcuspanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        notpaidcuspanelLayout.setVerticalGroup(
            notpaidcuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notpaidcuspanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jPanel2.add(notpaidcuspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 120));

        paidcuspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paidcuspanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paidcuspanelMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Paid Customers");

        javax.swing.GroupLayout paidcuspanelLayout = new javax.swing.GroupLayout(paidcuspanel);
        paidcuspanel.setLayout(paidcuspanelLayout);
        paidcuspanelLayout.setHorizontalGroup(
            paidcuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paidcuspanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        paidcuspanelLayout.setVerticalGroup(
            paidcuspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paidcuspanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        jPanel2.add(paidcuspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 280, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 299, 520));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setForeground(new java.awt.Color(0, 51, 102));

        allcusdesk.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout allcusdeskLayout = new javax.swing.GroupLayout(allcusdesk);
        allcusdesk.setLayout(allcusdeskLayout);
        allcusdeskLayout.setHorizontalGroup(
            allcusdeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        allcusdeskLayout.setVerticalGroup(
            allcusdeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(allcusdesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(allcusdesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 720, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_btn.setBackground(new java.awt.Color(255, 255, 255));
        close_btn.setForeground(new java.awt.Color(255, 0, 0));
        close_btn.setText("❌");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        jPanel1.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 34, 55, 49));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kasun\\OneDrive\\Desktop\\lesson_manager\\img\\logor.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 13, 119, 100));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Welcome Invoice Calculator  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 27, 264, 59));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_close_btnActionPerformed

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        this.dispose();
    }//GEN-LAST:event_close_btnMouseClicked

    private void cuspanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuspanelMousePressed
        // TODO add your handling code here:
        cuspanel.setBackground(ClickedColor);
        notpaidcuspanel.setBackground(DefaultColor);
        paidcuspanel.setBackground(DefaultColor);
        
        cus_intframe cuspanel= new cus_intframe();
        allcusdesk.removeAll();
        allcusdesk.add(cuspanel).setVisible(true);
        
        
    }//GEN-LAST:event_cuspanelMousePressed

    private void notpaidcuspanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notpaidcuspanelMousePressed
        // TODO add your handling code here:
        cuspanel.setBackground(DefaultColor);
        notpaidcuspanel.setBackground(ClickedColor);
        paidcuspanel.setBackground(DefaultColor);
    }//GEN-LAST:event_notpaidcuspanelMousePressed

    private void paidcuspanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paidcuspanelMousePressed
        // TODO add your handling code here:
        cuspanel.setBackground(DefaultColor);
        notpaidcuspanel.setBackground(DefaultColor);
        paidcuspanel.setBackground(ClickedColor);
    }//GEN-LAST:event_paidcuspanelMousePressed

    private void cuspanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuspanelMouseClicked
        // TODO add your handling code here:
        cus_intframe cuspanel= new cus_intframe();
        allcusdesk.removeAll();
        allcusdesk.add(cuspanel).setVisible(true);
        
        
    }//GEN-LAST:event_cuspanelMouseClicked

    private void notpaidcuspanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notpaidcuspanelMouseClicked
        // TODO add your handling code here:
        notpaid_intframe notpaidcuspanel= new notpaid_intframe();
        allcusdesk.removeAll();
        allcusdesk.add(notpaidcuspanel).setVisible(true);
    }//GEN-LAST:event_notpaidcuspanelMouseClicked

    private void paidcuspanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paidcuspanelMouseClicked
        // TODO add your handling code here:
        paid_intframe paidcuspanel= new paid_intframe();
        allcusdesk.removeAll();
        allcusdesk.add(paidcuspanel).setVisible(true);
        
    }//GEN-LAST:event_paidcuspanelMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane allcusdesk;
    private javax.swing.JButton close_btn;
    private javax.swing.JPanel cuspanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel notpaidcuspanel;
    private javax.swing.JPanel paidcuspanel;
    // End of variables declaration//GEN-END:variables
}
