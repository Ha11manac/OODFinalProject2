/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Day2.Command;

import FinalProject.Day2.SandwichStuff.*;


/**
 *
 * @author pokem
 */
public class SandwichCooking implements Work{
    Sandwich sandwich;
    
    public SandwichCooking(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public void execute(){
        sandwich.Cooking();
    }   
}
