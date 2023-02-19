/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Account_Executive;
import assignment_oopj.LoginDetails;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ryan
 */
public class Account_Executive_Payment_Management extends javax.swing.JFrame {
    LoginDetails logindetails;
    /**
     * Creates new form Account_Executive_Payment_Management
     */
    public Account_Executive_Payment_Management(LoginDetails logindetails1) {
        initComponents();
        SetDatainTable();
        this.logindetails = logindetails1;
        String id = logindetails.getId();
        
        try (BufferedReader br = new BufferedReader (new FileReader ("AccountExecutive.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String [] data = line.split(":");
                String userid = data[0];
                String username = data[1];
                
                if (id.equals(userid)){
                    Username.setText(username);
                }
            }
            
        } catch (Exception e){
    
        }
        
//        NameTF.setText(username);
//        IdTF.setText(id);
//        EmailTF.setText(email);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel20 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AccountExecutive = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        Record = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        Update = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel25 = new javax.swing.JPanel();
        Payment7 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        Invoice = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        Receipt = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        Fee = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(114, 126, 224));

        AccountExecutive.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        AccountExecutive.setForeground(new java.awt.Color(255, 255, 255));
        AccountExecutive.setText("Account Executive");

        Username.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(AccountExecutive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Username)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountExecutive)
                    .addComponent(Username))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PAYMENT MANAGEMENT");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User iD", "Unit ID", "Payment ID", "Role", "Amount", "Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel21.setBackground(new java.awt.Color(114, 126, 224));

        Record.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Record.setForeground(new java.awt.Color(255, 255, 255));
        Record.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Record.setText("Record");
        Record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(Record, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Record, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(114, 126, 224));

        Update.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Update.setText("Update");
        Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        Time.setBackground(new java.awt.Color(0, 0, 0));
        Time.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time.setText("Time");

        Date.setBackground(new java.awt.Color(255, 255, 255));
        Date.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("Date");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time)
                    .addComponent(Date))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel24.setBackground(new java.awt.Color(67, 63, 113));

        jLabel13.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Parkhill Residence");

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        jPanel25.setBackground(new java.awt.Color(67, 63, 113));

        Payment7.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Payment7.setForeground(new java.awt.Color(255, 255, 255));
        Payment7.setText(" Payment Management");
        Payment7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Payment7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Payment7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Payment7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel26.setBackground(new java.awt.Color(67, 63, 113));

        Invoice.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Invoice.setForeground(new java.awt.Color(255, 255, 255));
        Invoice.setText(" Issue Invoice");
        Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Invoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Invoice, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel27.setBackground(new java.awt.Color(67, 63, 113));

        Receipt.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Receipt.setForeground(new java.awt.Color(255, 255, 255));
        Receipt.setText(" Issue Receipt");
        Receipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceiptMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Receipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Receipt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel28.setBackground(new java.awt.Color(67, 63, 113));

        Fee.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Fee.setForeground(new java.awt.Color(255, 255, 255));
        Fee.setText(" Outstanding Fee");
        Fee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fee, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(67, 63, 113));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Logout.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("    Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void RecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordMouseClicked
        MessageFormat header = new MessageFormat("Payment History");
        MessageFormat footer = new MessageFormat("valid(0,number,integer)");
        try {
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
            JOptionPane.showMessageDialog(null, "\n" + "Printed Successfully!");
        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(null, "\n" + "Failed to Print!" + "\n" + e);
        }   

    }//GEN-LAST:event_RecordMouseClicked
    
    public void SetDatainTable() {
        try (BufferedReader br = new BufferedReader (new FileReader("AE_Payment.txt"))){

                String line;
                Scanner reader = new Scanner(br);
                while ((line = br.readLine()) != null) {
                String[] data = line.split(":");
                String Name = data[0];
                String UserID = data[1];
                String UnitID = data[2];
                String PID = data[3];
                String Role = data[4];
                String Amount = data[5];
                String Date = data[6];
                String Status = data[7];
                
                Object [] obj = {Name,UserID,UnitID,PID,Role,Amount,Date,Status};
                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                tableModel.addRow(obj);
                
          //      tableModel.setRowCount(0);
                }
                } catch (Exception e) {
                    
                }
        
    }
    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        Account_Executive_Update_Payment AE_UP = new Account_Executive_Update_Payment(logindetails);
        AE_UP.show(); //display Account Executive Update Payment Page

        dispose(); //close current frame after open new frame
    }//GEN-LAST:event_UpdateMouseClicked

    private void Payment7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payment7MouseClicked
        Account_Executive_Payment_Management AE_PM = new Account_Executive_Payment_Management(logindetails);
        AE_PM.show(); //display Account Executive Payment Management Page

        dispose(); //close current frame after open new frame

    }//GEN-LAST:event_Payment7MouseClicked

    private void InvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceMouseClicked
        Account_Executive_Issue_Invoice AE_II = new Account_Executive_Issue_Invoice(logindetails);
        AE_II.show(); //display Account Executive Issue Invoice Page

        dispose(); //close current frame after open new frame
    }//GEN-LAST:event_InvoiceMouseClicked

    private void ReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceiptMouseClicked
        Account_Executive_Issue_Receipt AE_IR = new Account_Executive_Issue_Receipt(logindetails);
        AE_IR.show(); //display Account Executive Issue Receipt Page

        dispose(); //close current frame after open new frame
    }//GEN-LAST:event_ReceiptMouseClicked

    private void FeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeeMouseClicked
        Account_Executive_OutstandingFee AE_OF = new Account_Executive_OutstandingFee(logindetails);
        AE_OF.show(); //display Account Executive Issue Invoice Page

        dispose(); //close current frame after open new frame
    }//GEN-LAST:event_FeeMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LogoutMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Account_Executive_Payment_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Account_Executive_Payment_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Account_Executive_Payment_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Account_Executive_Payment_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Account_Executive_Payment_Management().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountExecutive;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Fee;
    private javax.swing.JLabel Invoice;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Payment7;
    private javax.swing.JLabel Receipt;
    private javax.swing.JLabel Record;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel Update;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
