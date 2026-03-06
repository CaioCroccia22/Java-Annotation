/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ann.DBTable;
import ann.DBTableColumn;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Caio
 *
 */
// This class will simulate the database methods
public class Repository<K,V> {
        Map<K ,V> Table = new HashMap<>();
        
    public Repository(){
        
    }
    
    public <O> void insert(O Object) throws Exception{
        DBTable A = Object.getClass().getAnnotation(DBTable.class);
        
        
        if(A != null){
            String tableName = A.table();

            InsertValue(Object, tableName);
        }
    }
    
    public <O> void InsertValue(O Object, String tableName){
        Set<K> row = null;
        Field[] Fields = Object.getClass().getFields();
        for(Field field:Fields){
            DBTableColumn column    = field.getAnnotation(DBTableColumn.class);
            
            
            if(column != null){
                String columnName       = column.column();
                //put on Table column and value
                field.setAccessible(true); // we need to do that to hang with IllegalAcessException
                try{
                    Table.put((K) columnName, (V) field.get(Object).toString());
                    System.out.print("Insert into: "+ " " 
                            + tableName + "Colum:" + columnName + "Value:" + Table.get((K) columnName));
                }catch(IllegalAccessException E){
                    System.out.print("There isnt any column to this attribute");
                }
                
                row = Table.keySet();
                //Here I´m considering one value its equal one row
                
                
            }else{
                System.out.print("There isnt any column to this attribute");
                
            
            }
            
            
        }
    }
}   
