package assignment_oopj;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class login extends LoginPage {

 
public boolean login(String email, String password) throws IOException {
        FileReader fr = new FileReader("userProfile.txt");
        BufferedReader br = new BufferedReader(fr);
        // declare username_lst arrayList to store username in text file
        ArrayList<String> email_lst = new ArrayList<String>();
        // declare password_lst arrayList to store password in text file
        ArrayList<String> password_lst = new ArrayList<String>();
        // declare repeatedPosition arrayList to store the repeated password index in text file
        ArrayList<Integer> repeatedPosition = new ArrayList<Integer>();

        // extract data from text file
        for (String line = br.readLine(); line != null; line = br.readLine()){
            String[] userInfo = line.split(";");
            String email_temp = userInfo[1];
            String password_temp = userInfo[2];
            email_lst.add(email_temp);
            password_lst.add(password_temp);
        } br.close(); fr.close();

        // scan for repeated password
        for (int i = 0; i < password_lst.size(); i++) {
            if (password_lst.get(i).equals(password)) {
                // add index of repeated password to repeatedPosition arrayList
                repeatedPosition.add(i);
            } 
        }
        // if username from text field contains in arrayList 
        if (email_lst.contains(email) && password_lst.contains(password) &&
                // and password index in password_lst contains in repeatedPosition arrayList
                repeatedPosition.contains(password_lst.indexOf(password))) {
            setCurrentSession(email);
            // if password from text field contains in arrayList
            return true;
        } else {
            return false;
        }
    }

    private void setCurrentSession(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


