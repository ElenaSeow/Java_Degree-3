/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_oopj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class testfile {
        static ArrayList<Class> classes = new ArrayList<Class>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("1. Add class");
            System.out.println("2. View classes");
            System.out.println("3. Remove class");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    addClass();
                    break;
                case 2:
                    viewClasses();
                    break;
                case 3:
                    removeClass();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    
    private static void addClass() {
        Scanner sc = new Scanner(System.in);
        String subject;
        String teacher;
        int time;
        
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
        
        System.out.print("Enter teacher: ");
        teacher = sc.nextLine();
        
        System.out.print("Enter time: ");
        time = sc.nextInt();
        
        Class c = new Class(subject, teacher, time);
        classes.add(c);
    }
    
    private static void viewClasses() {
        System.out.println("Subject\tTeacher\tTime");
        for (Class c : classes) {
            System.out.println(c.getSubject() + "\t" + c.getTeacher() + "\t" + c.getTime());
        }
    }
    
    private static void removeClass() {
        Scanner sc = new Scanner(System.in);
        int index;
        
        System.out.print("Enter index of class to remove: ");
        index = sc.nextInt();
        
        classes.remove(index);
    }
}
class Class {
    private String subject;
    private String teacher;
    private int time;
    
    public Class(String subject, String teacher, int time) {
        this.subject = subject;
        this.teacher = teacher;
        this.time = time;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public String getTeacher() {
        return teacher;
    }
    
    public int getTime() {
        return time;
    }
}
