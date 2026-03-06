/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package annotation;

import Repository.Repository;
import domain.Products;

/**
 *
 * @author Caio
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Products p1 = new Products(1, "Dipirona", 1, true);
        Repository database = new Repository();
        try{
            database.insert(p1);
        }catch(Exception E){
            System.out.println("Error: Can´t insert product");
        }
    }
    
}
