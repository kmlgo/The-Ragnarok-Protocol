/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public class CSAA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SCENARIO 1
        Spaceship s = new Spaceship(100,100,100,100,100);
        Astronaut a = new Astronaut("John", 0, 100);
        RockyPlanet p1 = new RockyPlanet("RS 1880 424 32-3", 5, 40000, 32, 8, 1.234);
        p1.addAtmo("SO2", 80.0);
        System.out.println(p1.getAtmoComp());
        
        try{ 
            s.land(p1);
        }
        catch(PartSelectionException e){
            System.out.println(e.getMessage());   
        }
        
        System.out.println("Landing gear is in state " + s.isLandingGearState());
        a.loseHP(77, 0);
        try {
            s.loseHP(10, 3);
        } 
        catch (PartSelectionException ex) {
            System.out.println(ex.getMessage());
        }
        
        //SCENARIO 2
        s.setOxygenValveState(false);
        ConstantTask t1 = new ConstantTask(0,2,"O2task");
        s.setWarpDriveState(true);
        s.setReactorGenState(false);
        OneOffTask t2 = new OneOffTask(false, "warpdrivetask");
        
        while(t1.getCompletionStatus() < 2){
            System.out.println("Oxygen task status is at " + t1.getCompletionStatus());
            try {
                t1.penalty(s,a,1);
                System.out.println("Astronaut health is now " + a.getHP());
                t2.penalty(s,a,1);
                System.out.println("Spaceship reactor health is now " + s.getReactorGenHealth());
            } 
            catch (TaskOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            }    
            
            t1.doTask();
            System.out.println(a.getName() + " worked towards the completion of the oxygen task");
            
        } 
        
        System.out.println("Oxygen is now in optimal operation");
        s.setOxygenValveState(true);
        
        try {
            t2.penalty(s,a,1);
            System.out.println("Spaceship reactor health is now " + s.getReactorGenHealth());
        } 
        catch (TaskOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }    
        
        t2.doTask();
        System.out.println(a.getName() + " worked towards the completion of the warp drive task");
        
        System.out.println("Warp drive is closed, reactor is in optimal operation");
        s.setWarpDriveState(false);
        s.setReactorGenState(true);
        
        //SCENARIO 3 
        GasPlanet p2 = new GasPlanet("RS 1999 2334 52-6", 0.03, 70100, -179, 344000000, 1.5);
        p2.addAtmo("CH4", 70.0);
        
        try{ 
            s.land(p2);
            if((s.getLandingGearHealth() == 0) || (s.getReactorGenHealth() == 0)|| (s.getWindowHealth() == 0)){
                a.loseHP(100, 0); //This will be put in a loop once we learn game ticks, so this will be changed later on
        }
        }
        catch(PartSelectionException e){
            System.out.println(e.getMessage());   
        }
    }
    }
    
}
