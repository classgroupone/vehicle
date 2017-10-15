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
public class General {
 String model, enginepower;
 public General(String a, String b){
     this.model=a;
     this.enginepower=b;
 }
 public String getModel(){
    return model;
}
 public String getEnginepower(){
     return enginepower;
 }
}
