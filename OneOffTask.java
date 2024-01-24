/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public class OneOffTask extends Task {
    private boolean taskCompleted;

    public OneOffTask(boolean taskCompleted, String n) {
        super(n);
        this.taskCompleted = taskCompleted;
    }
    
    public boolean getCompletionStatus(){
        return taskCompleted;
    }
   
    @Override
    public void doTask(){
        taskCompleted = true;
    }
    
    @Override
    public void penalty(Spaceship s, Astronaut a, int task) throws TaskOutOfBoundsException{
        //case-by-case penalty for all relevant one-off tasks (warp drive repair, engine preparation, damage control)
        //warp repair = 1;  engine prep = 2; damage control = 3;
        try {
            if(task == 1){
                s.loseHP(50, 1);
            }
            else if(task == 2){
                s.loseHP(25, 3);
            }
            else if(task == 3){
                s.loseHP(30, 3);
            }
            else {
                throw new TaskOutOfBoundsException("Selected task " + task + " is out of range!");
            }
        }
        catch (PartSelectionException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
