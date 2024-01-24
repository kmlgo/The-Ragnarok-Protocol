/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public interface Harmable {
    public abstract void gainHP(int n, int part) throws PartSelectionException ;
    public abstract void loseHP(int n, int part) throws PartSelectionException ;
}
