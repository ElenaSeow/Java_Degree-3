package assignment_oopj;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package assignment_oopj;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author Megan
// */
//public class userlogin extends LoginPage {
//    public static void main(String[] args) {
//        String id = EmailTF.getText();
//        String email = EmailTF.getText();
//        String password = PasswordTF.getText();
//        String ae = selection.getSelectedItem().toString();
//        ///////////////////////// ADMIN EXECUTIVE /////////////////////////
//        if (ae.equals("Admin Executive")){
//           
//            try (BufferedReader brr = new BufferedReader(new FileReader("AdminExecutive.txt"))) {
//                String line;
//                while ((line = brr.readLine()) != null) {
//                String[] list = line.split(":");
//                String eml = list[2];
//                String pwd = list[3];
//                String roles = list[4];
//                
//                    if (email.equals(eml) && password.equals(pwd) && roles.equals("AdminExecutive")) {
//                        JOptionPane.showMessageDialog(null,"Login Successful!");  
//                        JOptionPane.showMessageDialog(null,"You are entering Admin Executive Page....");
//                        Admin_Executive_Sample AE = new Admin_Executive_Sample();
//                        AE.show();
//                        dispose();
//                        break;
//                    } 
//                } 
//                      
//                if (line == null) {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials or Role, Try Again!");
//                }
//            
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        ///////////////////////// ACCOUNT EXECUTIVE /////////////////////////
//        else if (ae.equals("Account Executive")) {
//            
//            try (BufferedReader brr = new BufferedReader(new FileReader("AccountExecutive.txt"))) {
//                String line;
//                while ((line = brr.readLine()) != null) {
//                String[] list = line.split(":");
//                String eml = list[2];
//                String pwd = list[3];
//                String roles = list[4];
//                
//                    if (email.equals(eml) && password.equals(pwd) && roles.equals("AccountExecutive")) {
//                        JOptionPane.showMessageDialog(null, "Login Successful!");
//                        JOptionPane.showMessageDialog(null, "You are entering Account Executive Page");
//                        Account_Executive_Sample ACE = new Account_Executive_Sample();
//                        ACE.show();
//                        dispose();
//                        break;
//                    }
//                }
//                
//                if (line == null) {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials or Role, Try Again!");
//                }   
//                
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }           
//        }
//        ///////////////////////// BUILDING EXECUTIVE /////////////////////////
//        else if (ae.equals("Building Executive")) {
//            
//            try (BufferedReader brr = new BufferedReader(new FileReader("BuildingExecutive.txt"))) {
//                String line;
//                while ((line = brr.readLine()) != null) {
//                String[] list = line.split(":");
//                String eml = list[2];
//                String pwd = list[3];
//                String roles = list[4];
//                
//                    if (email.equals(eml) && password.equals(pwd) && roles.equals("BuildingExecutive")) {
//                        JOptionPane.showMessageDialog(null, "Login Successfull!");
//                        JOptionPane.showMessageDialog(null, "You are entering Building Executive Page");
//                        Building_Executive_Sample BE = new Building_Executive_Sample();
//                        BE.show();
//                        dispose();
//                        break;
//                    }
//                }
//                
//                if (line == null) {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials or Role, Try Again!");
//                } 
//                
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        ///////////////////////// BUILDING MANAGER /////////////////////////
//        else if (ae.equals("Building Manager")) {
//        
//            try (BufferedReader brr = new BufferedReader(new FileReader("BuildingManager.txt"))) {
//                String line;
//                while ((line = brr.readLine()) != null) { 
//                String[] list = line.split(":");
//                String eml = list[2];
//                String pwd = list[3];
//                String roles = list[4];
//                
//                    if (email.equals(eml) && password.equals(pwd) && roles.equals("BuildingManager")) {
//                        JOptionPane.showMessageDialog(null, "Login Successfull!");
//                        JOptionPane.showMessageDialog(null, "You are entering Building Manager Page");
//                        Building_Manager_Sample BM = new Building_Manager_Sample();
//                        BM.show();
//                        dispose();
//                        break;
//                    }
//                }
//                
//                if (line == null) {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials or Role, Try Again!");
//                } 
//                
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        ///////////////////////// RESIDENT /////////////////////////
//        else if (ae.equals("Resident")) {
//        
//            try (BufferedReader brr = new BufferedReader(new FileReader("Resident.txt"))) {
//                String line;
//                while ((line = brr.readLine()) != null) { 
//                String[] list = line.split(":");
//                String ID = list[0];
//                String name = list [1];
//                String eml = list[2];
//                String pwd = list[3];
//                String roles = list[4];
//                String number = list [5];
//                
//                    if (id.equals(ID) && password.equals(pwd) && roles.equals("Resident")) {
//                        JOptionPane.showMessageDialog(null, "Login Successfull!");
//                        JOptionPane.showMessageDialog(null, "You are entering Resident Page");
//                      
//                        LoginDetails logindetails = new LoginDetails (ID, name, eml, pwd, roles, number);
//                        Resident_Main_Page rmp = new Resident_Main_Page(logindetails);
//                        rmp.setVisible(true);
//                        break;
////                        Resident_Main_Page RMP = new Resident_Main_Page();
////                        RMP.show();
////                        dispose();
////                        break;
//                    }
//                }
//                
//                if (line == null) {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials or Role, Try Again!");
//                } 
//                
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        ///////////////////////// BUILDING MANAGER /////////////////////////
//        else if (ae.equals("Security")) {
//        
//            try (BufferedReader brr = new BufferedReader(new FileReader("Security.txt"))) {
//                String line;
//                while ((line = brr.readLine()) != null) { 
//                String[] list = line.split(":");
//                String eml = list[2];
//                String pwd = list[3];
//                String roles = list[4];
//                
//                    if (email.equals(eml) && password.equals(pwd) && roles.equals("Security")) {
//                        JOptionPane.showMessageDialog(null, "Login Successfull!");
//                        JOptionPane.showMessageDialog(null, "You are entering Security Page");
//                        Security_Page SP = new Security_Page();
//                        SP.show();
//                        dispose();
//                        break;
//                    }
//                }
//                
//                if (line == null) {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials or Role, Try Again!");
//                } 
//                
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        ///////////////////////// BUILDING MANAGER /////////////////////////
//        else if (ae.equals("Vendor")) {
//        
//            try (BufferedReader brr = new BufferedReader(new FileReader("Vendor.txt"))) {
//                String line;
//                while ((line = brr.readLine()) != null) { 
//                String[] list = line.split(":");
//                String eml = list[2];
//                String pwd = list[3];
//                String roles = list[4];
//                
//                    if (email.equals(eml) && password.equals(pwd) && roles.equals("Vendor")) {
//                        JOptionPane.showMessageDialog(null, "Login Successfull!");
//                        JOptionPane.showMessageDialog(null, "You are entering Vendor Page");
//                        Vendor_Page VP = new Vendor_Page();
//                        VP.show();
//                        dispose();
//                        break;
//                    }
//                }
//                
//                if (line == null) {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials or Role, Try Again!");
//                } 
//                
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//    }
//    
//}
