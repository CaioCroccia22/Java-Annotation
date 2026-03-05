/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import ann.DBTable;

/**
 *
 * @author Caio
 */
/// here I created a class to simulate an database object
@DBTable(table="Products")
public class Products {
    private int     product_id;
    private String  product_name;
    private int     product_count;
    private boolean is_active;
    
    public Products(
            int product_id,
            String product_name,
            int product_count,
            boolean is_active
    ){
            this.product_id     = product_id;
            this.product_name   = product_name;
            this.product_count  = product_count;
            this.is_active      = is_active;
    }
    
    public void setProductId(int product_id){
        this.product_id = product_id;
    }
    
    public int getProductId(){
        return product_id;
    }
    
    public void setProductName(String product_name){
        this.product_name = product_name;
    }
    
    public String getProductName(){
        return product_name;
    }
    
    
    public void setProductCount(int product_count){
        this.product_count = product_count;
    }
    
    public int getProductCount(){
        return product_count;
    }
    
    public void setIsActive(boolean is_active){
        this.is_active = is_active;
    }
}
