/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jirademoapp;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author dbourne
 */
public class JiraDemoApp {
    private Collection<Object> shapes;
    
    public JiraDemoApp() {
        System.out.println( "Creating new JiraDemoApp instance" );
        shapes  = new ArrayList<Object>();
    }
    
    public void addShape( Object obj ) {
        shapes.add( obj );
    }
    
    public void displayShapes() {
        Object[] oArr   = shapes.toArray();
        
        for ( int i=0; i<oArr.length; i++ ) {
            Object shape    = oArr[i];
            
            if ( shape instanceof Square ) {
                System.out.println( ( (Square)shape ).getName() );
            } else if ( shape instanceof Circle ) {
                System.out.println( ( (Circle)shape ).getName() );
            } else if ( shape instanceof Triangle ) {
                System.out.println( ( (Triangle)shape ).getName() );
            }
        }
    }
    
    public Square createSquare( int startX, int startY, int edgeSize ) {
        System.out.println( "Creating new Square instance" );
        return new Square( startX, startY, edgeSize );
    }
    
    public Circle createCircle( int centerX, int centerY, float radius ) {
        System.out.println( "Creating new Circle instance" );
        return new Circle( centerX, centerY, radius );
    }
    
    public Triangle createTriangle( int startX, int startY, int adjacentSize, int oppositeSize, 
            int hypotenuseSize ) {
        
        System.out.println( "Creating new Triangle instance" );
        return new Triangle( startX, startY, adjacentSize, oppositeSize, hypotenuseSize );
    }

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
        System.out.println( "Starting Jira Demo App" );
        JiraDemoApp jda = new JiraDemoApp();
        
        System.out.println( "Create new Triangle" );
        Triangle t1 = jda.createTriangle( 0, 0, 10, 20, 30 );
        
        System.out.println( "Add Triangle" );
        jda.addShape( t1 );
        
        System.out.println( "Create new Square" );
        Square s1   = jda.createSquare( 50, 102, 35 );
        
        System.out.println( "Add Triangle" );
        jda.addShape( s1 );
        
        System.out.println( "Create new Circle" );
        Circle c1    = jda.createCircle( 50, 102, 35f );
        
        System.out.println( "Add Circle" );
        jda.addShape( s1 );
        
        System.out.println( "Display shapes" );
        jda.displayShapes();
        
        System.out.println( "Jira Demo App Finished" );
    }
}
