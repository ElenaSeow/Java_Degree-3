/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JClasses;


import Admin.Admin_Executive_UnitManagement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;   
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author User
 */
public class Functions {
    
    public static ArrayList<String> Read(String file){
        ArrayList<String> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            
            while((line=br.readLine())!=null){
                data.add(line);
            }
        br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return data; 
    }
    
   public static void Write ( String file, ArrayList<String> data){
        try {
            PrintWriter pr = new PrintWriter(file);
            for (String i: data){
                pr.println(i);
            }
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}
   
    public static void Delete(String file, String ID){
        ArrayList<String> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            
            while((line=br.readLine())!=null){
                String [] list = line.split(":");
                String id = list[0];
                
                if(ID.equals(id)){
                }else{
                    data.add(line);
                }
            }
            PrintWriter pr = new PrintWriter(file);
            for (String i: data){
                pr.println(i);
            }
        br.close();
        pr.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    
    public static void Update(String file, String ID, String ... item){
        ArrayList<String> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            
            while((line=br.readLine())!=null){
                String [] list = line.split(":");
                String id = list[0];
                
                if(ID.equals(id)){
                    String temp=id;
                        for(String i:item){
                            temp += ":"+i;
                        }
                    data.add(temp);
                }else{
                    data.add(line);
                }
            }
            PrintWriter pr = new PrintWriter(file);
                for (String i: data){
                    pr.println(i);
                }
            pr.close();
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    public static String IdGenerate(String file){
        ArrayList<String> filedata;
        filedata =Functions.Read(file);
        ArrayList<String> Ids = new ArrayList<>();
        for(String str:filedata){
            String[] list = str.split(":");
            Ids.add(list[0]);
        }
        int len = Ids.size();
        String lastID = Ids.get(len-1);
        String code = lastID.substring(0,2);
        int digit = Integer.parseInt(lastID.substring(2));
        digit += 1;
        String pattern ="000";
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String newDigit = myFormatter.format(digit);
        String newId= code+newDigit;
        return newId;
    }
    
        public static void Search(String str, JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + str));
    }
        
        public static ArrayList<String> ConditionalRead(String file, String condition, int index){
            ArrayList<String> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            
            while((line=br.readLine())!=null){
                String[] list = line.split(":");
                if(list[index].equals(condition)){
                data.add(line);
                }
            }
        br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            return data; 
        }
        
        
        
        public static String date(){
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            Date date = new Date(); 
            String strDate = formatter.format(date);
            return strDate;
        }

        public static String getFile(String id){
            String code = id.substring(0,2);
            String file = null;
            if(code.equals("BM")){
                file = "BuildingManager.txt";
            }else if(code.equals("AD")){
                file = "AdminExecutive.txt";
            }else if(code.equals("AE")){
                file = "AccountExecutive.txt";
            }else if(code.equals("BE")){
                file = "BuildingExecutive.txt";
            }else if(code.equals("RE")){
                file = "Resident.txt";
            }else if(code.equals("SG")){
                file = "Security.txt";
            }else if(code.equals("VE")){
                file = "Vendor.txt";
            }
            return file;
            
        }
        
         public static void outstandingStatus(){
        ArrayList<String> data;
        data = Functions.Read("AE_Payment.txt");
        for(String str:data){
            try {
                String[] list = str.split(":");
                String duedate = list[3];
                SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
                Date date = sf.parse(duedate);
                String cdate = Functions.date();
                Date currentdate = sf.parse(cdate);
                if(date.compareTo(currentdate) > 0){
                    Functions.Update(cdate, str, list);
                }
            } catch (ParseException ex) {
                Logger.getLogger(Admin_Executive_UnitManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
        
    public static void main(String[] args) {
        String id = Functions.getFile("AD001");
        System.out.println(id);

    }
}



