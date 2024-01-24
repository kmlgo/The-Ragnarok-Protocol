/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSAA2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ConstantTask extends Task{
    private int taskMeter;
    private int maxMeter;
    
    
    public ConstantTask(int taskMeter, int maxMeter, String n) {
        super(n);
        this.taskMeter = taskMeter;
        this.maxMeter = 10;
    }
    
    public int getCompletionStatus(){
        return taskMeter;
    }
   
    @Override
    public void doTask(){
        if(taskMeter < 10) taskMeter++;
    }
    
    @Override
    public void penalty(Spaceship s, Astronaut a, int task) throws TaskOutOfBoundsException {
        //case-by-case penalty for all relevant constant tasks
        //O2 valve = 1; generator status = 2; landing gear check = 3; warp drive check = 4; engine updates = 5;
        
        try{
            if(task == 1){
                a.loseHP(20, 0);
            }
            else if(task == 2){
                s.loseHP(65, 2);
            }
            else if(task == 3){
                s.loseHP(65, 1);
            }
            else if(task == 4){
                s.loseHP(75, 2);
            }
            else if(task == 5){
                s.loseHP(25, 2);
            }
            else {
                throw new TaskOutOfBoundsException("Selected task " + task + " is out of range!");
            }
        }
        catch (PartSelectionException ex){
            System.out.println(ex.getMessage());
        }
    }
}
