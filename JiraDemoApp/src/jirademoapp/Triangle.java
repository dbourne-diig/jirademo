/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jirademoapp;

/**
 *
 * @author dbourne
 */
public class Triangle implements IShape {
    
    public Triangle( int startX, int startY, int adjacentSize, int oppositeSize, 
            int hypotenuseSize ) {
        
        
    }
    
    @Override
    public String getName() {
        return "Triangle";
    }
}
