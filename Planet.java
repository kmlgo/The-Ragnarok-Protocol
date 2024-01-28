/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSAA2;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public abstract class Planet {
    protected String name;
    protected double eccentricity, radius, surfaceTemp, gravConstant, atmoPressure;
    protected ArrayList<String> atmoComp = new ArrayList<String>();
    protected ArrayList<Double> atmoConcentration = new ArrayList<Double>();
    protected ArrayList<String> seaComp = new ArrayList<String>();
    protected ArrayList<Double> seaConcentration = new ArrayList<Double>();
    protected ArrayList<Moon> moonsList = new ArrayList<Moon>();

    public Planet(String name, double eccentricity, double radius, double surfaceTemp, double gravConstant, double atmoPressure) {
        this.name = name;
        this.eccentricity = eccentricity;
        this.radius = radius;
        this.surfaceTemp = surfaceTemp;
        this.gravConstant = gravConstant;
        this.atmoPressure = atmoPressure;
    }
    
    public String getName() {
        return name;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceTemp() {
        return surfaceTemp;
    }

    public double getGravConstant() {
        return gravConstant;
    }

    public double getAtmoPressure() {
        return atmoPressure;
    }

    public ArrayList<String> getAtmoComp() {
        return atmoComp;
    }

    public ArrayList<String> getSeaComp() {
        return seaComp;
    }

    public ArrayList<Moon> getMoonsList() {
        return moonsList;
    }
    
    public void addAtmo(String chem, double conc) {
        atmoComp.add(chem);
        atmoConcentration.add(conc);
    }
    
    public void addSea(String chem, double conc) {
        seaComp.add(chem);
        seaConcentration.add(conc);
    }
    
    public void randomMoons() {
        //supposed to randomly assign existing moons; not used yet
    }
}   
