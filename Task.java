/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public abstract class Task {
    protected String name;
    
    public Task(String n){
        name = n;
    }
   
    public abstract void doTask();
    
    public abstract void penalty(Spaceship s, Astronaut a, int task) throws TaskOutOfBoundsException; //task int is for selection of task
    
    
}
