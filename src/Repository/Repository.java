/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 *
 * @author Caio
 *
 */
// This class will simulate the database methods
public class Repository {
    
    public Repository(){
        
    }
    
    public <O> void insert(O Object){
        Annotation[] A = Object.getClass().getDeclaredAnnotations();
        System.out.println(Arrays.toString(A));
    }
    
}
