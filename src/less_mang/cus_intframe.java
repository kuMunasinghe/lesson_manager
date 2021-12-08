/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package less_mang;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kasun
 */
public class cus_intframe extends javax.swing.JInternalFrame {

    /**
     * Creates new form cus_intframe
     */
        DBConnection conn;
        
    public cus_intframe() {
        initComponents();
        conn=new DBConnection();
        if(conn==null){
              JOptionPane.showMessageDialog(this,"DB ERROR !","Caution ",JOptionPane.ERROR_MESSAGE);
              
        }
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(834, 524));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("All Students");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CustomerID ", "Firstname", "Surname", "Month", "Duration", "InvoiceID", "Payement", "PaymentStatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 610, 210));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setText("Refresh 🔃");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 40));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        
        //databse connection
        Connection dbconn=DBConnection.connectDB();
        if(dbconn!=null){
            try{
                PreparedStatement st=(PreparedStatement)
                        dbconn.prepareStatement("SELECT invoice.month,invoice.ID,invoice.customer_ID,invoice.payment,invoice.status,customer_lessons.duration,customer.fname,customer.sname \n" +
"from invoice \n" +
"JOIN customer_lessons on invoice.customer_ID=customer_lessons.customer_ID\n" +
"JOIN customer on invoice.customer_ID=customer.ID;");
                ResultSet res=st.executeQuery();
                while(res.next()){
                // data will be add until finish
                String InvoiceID=String.valueOf(res.getInt("ID"));
                String Firstname=res.getString("fname");
                String Surname=res.getString("sname");
                String Duration=String.valueOf(res.getInt("duration"));
                String CustomerID=String.valueOf(res.getInt("customer_ID"));
                String Month=res.getString("month");
                String Payment=String.valueOf(res.getFloat("payment"));
                String PaymentStatus=res.getString("status");
                
                
                String tbData[]={CustomerID,Firstname,Surname,Month,Duration,InvoiceID,Payment,PaymentStatus};
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                
                //add string arrya data into jtable
                 tblModel.addRow(tbData);
            }
            
        }
            catch(SQLException ex){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
             System.out.println("The connection is not available");
        }
        /**try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson_manager?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            
            Statement st=con.createStatement();
            String sql="SELECT invoice.ID,invoice.customer_ID,invoice.payment,invoice.status,customer_lessons.duration,customer.fname,customer.sname \n" +
"from invoice \n" +
"JOIN customer_lessons on invoice.customer_ID=customer_lessons.customer_ID\n" +
"JOIN customer on invoice.customer_ID=customer.ID;";
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                // data will be add until finish
                String InvoiceID=String.valueOf(rs.getInt("ID"));
                String FirstName=rs.getString('fname');
                String Surname=rs.getString("sname");
                String Duration=String.valueOf(rs.getInt("duration"));
                String CustomerID=String.valueOf(rs.getInt("customer_ID"));
                String Month=rs.getString("month");
                String Payment=String.valueOf(rs.getFloat("payment"));
                String PaymentStatus=rs.getString("status");
                
                
                String tbData[]={CustomerID,CustomerName,Month,InvoiceID,Payment,PaymentStatus};
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                
                //add string arrya data into jtable
                 tblModel.addRow(tbData);
                 
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }*/
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
