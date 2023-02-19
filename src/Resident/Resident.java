/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resident;

/**
 *
 * @author HP
 */
public class Resident {
    private String name;
    private String email;
    private String password;
    private String id;
    private String telno;
    private String role;
    
    
    public Resident(String name, String email, String password, String id, String telno, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
        this.telno = telno;
        this.role = role;
    }
    
    // Getters and Setters for instance variables
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return id;
    }

    public void setUserID(String id) {
        this.id = id;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
