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
public class Vehicles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        General gen=new General("Hiace","2000");
        Toyota tot=new Toyota("Mitubishi","3000","blue",50,20);
        Honda hd=new Honda("Sample","2500","grey",45,15);
        Ford fd=new Ford("Mfano","2100","black",35,20);
        
        System.out.println("the vehicles in store are "+gen.getModel()+" of engine power "+gen.getEnginepower());
        System.out.println("for toyota we have "+tot.getModel()+" and are "+tot.getAvailable()+" in our store");
        System.out.println("for honda we have "+hd.getModel()+" and are "+hd.getAvailable()+" in our store");
        System.out.println("for ford we have "+fd.getModel()+" and are "+fd.getAvailable()+" in our store");
    }
    
}
