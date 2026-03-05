 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotation.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Caio
 */
@Target(ElementType.TYPE) /// Here I will saying that only class, interfaces, enums can use this annotation
///
@Retention(RetentionPolicy.RUNTIME)/// This indicate how long the annotation is retained
@Inherited /// Subclasses automatically inherit this annotation from the parent class
public @interface DBTable {
    
    public String table();
    //In this line I´m saying that my annotation will be able to receive an table name
    //Attributes of annotation can only return primitive types, String, class, enum, array
}
