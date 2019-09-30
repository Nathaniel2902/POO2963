import java.util.Scanner;
import java.io.*;

public class Student {

    
    public static void main(String[] args) {
        
    Scanner enter= new Scanner(System.in);
    
    File student = new File ("D:\ESPE\SEGUNDO SEMESTRE\POO2963\Assigments\Assigments04_Files\\Student.csv");
    
    String name, last_name;
    int day_birth, month_birth, year_birth, IC;
        
    if(!.exists(){
        try {
            student.createNewFile();
            System.out.print("Enter your name: ");
            name = enter.next();
            System.out.print("Enter your last name: ");
            last_name = enter.next();
            System.out.print("Enter the day of your birth");
            day_birth = enter.nextInt();            
            System.out.print("Enter the month of your birth: ");
            month_birth = enter.nextInt();
            System.out.print("Enter the year of your bith");
            year_birth = enter.nextInt();            
            System.out.print("Enter the number of your identity card: ");
            IC = enter.nextInt();
                            
            PrintWriter show;
            try (FileWriter write = new FileWriter(student, true)) {
            show = new PrintWriter(write);
                show.println("Name: " + name );
                show.println("Last name: " + last_name );
                show.println("date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                show.println("IC: " + IC);
                show.println("");
            }
            show.close();
        } catch (IOException ex) {
        }
               
    else{
        try {
                //arch.createNewFile();
            System.out.print("Enter your name: ");
            name = enter.next();
            System.out.print("Enter your last name: ");
            last_name = enter.next();
            System.out.print("Enter the day of your birth");
            day_birth = enter.nextInt();            
            System.out.print("Enter the month of your birth: ");
            month_birth = enter.nextInt();
            System.out.print("Enter the year of your bith");
            year_birth = enter.nextInt();            
            System.out.print("Enter the number of your identity card: ");
            IC = enter.nextInt();
           
                
            PrintWriter show;
            try (FileWriter write = new FileWriter(student, true)) {
                show = new PrintWriter(write);
                show.println("Nombre: "+ name);
                show.println("Last name: "+ last_name);
                show.println("date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                show.println("IC: "+ IC);
               
                show.println("");
            }
            show.close();
        } catch (IOException ex) {
        }
    }
    }
    
}