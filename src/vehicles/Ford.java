/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author KAMWANA
 */
public class Ford extends General{
   String color;
    int stock,available;
    public Ford(String a, String b, String c,int d, int e){
        super(a,b);
        this.color=c;
        this.stock=d;
        this.available=e;
    }
    public String getColor(){
        return color;
    }
    public int getStock(){
        return stock;
    }
    public int getAvailable(){
        return available;
    } 
}
