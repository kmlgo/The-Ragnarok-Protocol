/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public class Moon extends Planet {

    public Moon(String name, double eccentricity, double radius, double surfaceTemp, double gravConstant, double atmoPressure) {
        super(name, eccentricity, radius, surfaceTemp, gravConstant, atmoPressure);
        this.radius = (radius * 1/9);
    }
    
    public void randomMoons() {
        //supposed to disable ability to assign moons to moons
    }
}
