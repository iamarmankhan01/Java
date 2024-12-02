import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHeandilig{
    public static void main(String[] args) {

        //File Create
        /* 
        File myFile =new File("file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create a file");
            e.printStackTrace();
        } 
        

            //==========Writing to a file=============
             File myFile = new File("file.txt");
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
                


            // ================Reading a file=========================== 
          File myFile = new File("file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
        
            //======================Deleting a file==================
            File myFile = new File("file.txt");
            if(myFile.delete()){
                System.out.println("I have deleted: " + myFile.getName());
            }
            else{
                System.out.println("Some problem occurred while deleting the file");
            }
                    */
       
    }
}