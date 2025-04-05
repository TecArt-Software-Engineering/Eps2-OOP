/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tecart.eps2oop;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author gunam
 */
public class CreateUser extends javax.swing.JFrame {

    public Statement statement;
    public ResultSet result;
    Connection connection = DBConnection.OpenConnection();

    /**
     * Creates new form CreateUser
     */
    public CreateUser() {
        initComponents();
    }

    private boolean checkInput(String type, String input) {
        if ("username".equals(type)) {
            if (input.length() < 3) {
                JOptionPane.showMessageDialog(null, "Username must be at least 3 character !", "Data Validation", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }

        if ("password".equals(type)) {
            if (input.length() < 3) {
                JOptionPane.showMessageDialog(null, "Username must be at least 3 character !", "Data Validation", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pageBanner = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();
        inputUsername = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(460, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pageBanner.setText("Registrasi User Perpustakaan TecArt");
        getContentPane().add(pageBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        inputPassword.setText("Enter Password");
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 300, -1));

        inputUsername.setText("Enter your Username");
        getContentPane().add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, -1));

        labelUsername.setText("Username");
        getContentPane().add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        labelPassword.setText("Password");
        getContentPane().add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        btnSubmit.setText("Create");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        btnLogin.setText("Cancel");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            statement = connection.createStatement();
            if (inputUsername.getText().equals("") || inputPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all input form before submitting !", "Data Validation", JOptionPane.INFORMATION_MESSAGE);

            } else if (checkInput("username", inputUsername.getText()) && checkInput("password", inputPassword.getText())) {

                String checkUsername = "SELECT * FROM user WHERE username = '" + inputUsername.getText() + "'";
                result = statement.executeQuery(checkUsername);
                if (result.next()) {
                    JOptionPane.showMessageDialog(null, "Username have already been registered !", "Data Validation", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    LocalDateTime dateToday = LocalDateTime.now();
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String formattedDateToday = dateToday.format(dateFormat);

                    String sql = "INSERT INTO user VALUES ( null, '" + inputUsername.getText() + "', '" + inputPassword.getText() + "', '" + formattedDateToday + "')";

                    statement.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "User have been successfully created !");

                    new Login().setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Account Register Error !");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel pageBanner;
    // End of variables declaration//GEN-END:variables
}
