/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ann;

import java.lang.annotation.*;


/**
 *
 * @author Caio
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTableColumn {
    public String table();
    public String column();
    public String value() default "null";
}
