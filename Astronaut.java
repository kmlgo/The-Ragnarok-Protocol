/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public class Astronaut implements Harmable {
    private String name;
    private double planetWeight;
    private int hp;
    
    public Astronaut(String n, double pw, int hp) {
        name = n;
        planetWeight = pw;
        this.hp = hp;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPlanetWeight() {
        return planetWeight;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setPlanetWeight(double pw) {
        planetWeight = pw;
    }
    
    public int getHP(){
        return hp;
    }
    
    //part is irrelevant since astronaut only has 1 HP field
    @Override
    public void gainHP(int n, int part){
        if(hp + n <= 100){
            hp += n;
        }
    }
    
    @Override
    public void loseHP(int n, int part){
        hp -= n;
        if(hp <= 0){
            hp = 0;
        }
    }
}
