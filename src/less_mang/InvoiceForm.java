/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package less_mang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kasun
 */
public class InvoiceForm extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceForm
     */ 
    public InvoiceForm() {
        initComponents();
    }
    
    public InvoiceForm(String CustID,String InvoiceID){
        initComponents();
         
        System.out.println(InvoiceID);
         Connection dbconn=DBConnection.connectDB();
        if(dbconn!=null){
           
            try{
                PreparedStatement st=(PreparedStatement)
                        dbconn.prepareStatement("SELECT invoice.month,invoice.customer_ID,invoice.payment,customer_lessons.duration,customer.fname,customer.sname "
                                + "from invoice "
                                + "JOIN customer_lessons on invoice.customer_ID=customer_lessons.customer_ID "
                                + "JOIN customer on invoice.customer_ID=customer.ID "
                                + "where invoice.ID='"+InvoiceID+"'");
                ResultSet res=st.executeQuery();
                if(res.next()){
                    fn.setText(res.getString("fname"));
                    sn.setText(res.getString("sname"));
                    in.setText(InvoiceID);
                    mnth.setText(res.getString("month"));
                    String duration=res.getString("duration");
                    int dur=Integer.parseInt(duration);
                    int hr=dur/60;
                    String h=String.valueOf(hr);  
                    hour.setText(h);
                    pay.setText(res.getString("payment"));
                      
               
                }
            }
            catch(SQLException ex){
                Logger.getLogger(NotPaidCusId.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        sn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mnth = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Hours :");

        setAlwaysOnTop(true);
        setName("Invoice"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 99, 63, -1));

        fn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fn.setForeground(new java.awt.Color(0, 0, 0));
        fn.setText("fn");
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 99, 140, 15));

        sn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        sn.setForeground(new java.awt.Color(0, 0, 0));
        sn.setText("sn");
        jPanel1.add(sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 120, 140, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Invoice No: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 164, 63, -1));

        in.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        in.setForeground(new java.awt.Color(0, 0, 0));
        in.setText("jLabel4");
        jPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 164, 80, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Month :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 228, 63, -1));

        mnth.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnth.setForeground(new java.awt.Color(0, 0, 0));
        mnth.setText("jLabel5");
        jPanel1.add(mnth, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 228, 100, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rate per Hour : Rs:1000");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 283, 210, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Hours :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 341, 62, -1));

        hour.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hour.setForeground(new java.awt.Color(0, 0, 0));
        hour.setText("jLabel7");
        jPanel1.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 344, 90, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Payment :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 395, -1, -1));

        pay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pay.setForeground(new java.awt.Color(0, 0, 0));
        pay.setText("jLabel9");
        jPanel1.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 395, 120, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Send via Email");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Lesson Manager®");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fn;
    private javax.swing.JLabel hour;
    private javax.swing.JLabel in;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mnth;
    private javax.swing.JLabel pay;
    private javax.swing.JLabel sn;
    // End of variables declaration//GEN-END:variables
}
