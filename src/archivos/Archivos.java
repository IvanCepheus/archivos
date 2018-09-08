/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ivan_
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        try {
            Scanner entrada = new Scanner(new FileReader("C:\\Users\\ivan_\\Documents\\NetBeansProjects\\Archivos\\archivo.txt"));
            
            while(entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
            
            
        }catch(FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        
        try{
            Files.write(Paths.get("C:\\Users\\ivan_\\Documents\\NetBeansProjects\\Archivos\\archivo.txt"),"\nNueva Linea".getBytes(),StandardOpenOption.APPEND);
        
        }catch (IOExeption e){
            System.err.println(e.getMessage());
            
        }
    }
    
}
