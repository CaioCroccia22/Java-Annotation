/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ann.DBTable;
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
    
    public <O> void insert(O Object) throws Exception{
        DBTable A = Object.getClass().getAnnotation(DBTable.class);
        System.out.println(A);
        
        if(A != null){
            String tableName = A.table();
            System.out.println("Register at table:" + " " + tableName);
        }
    }
}
