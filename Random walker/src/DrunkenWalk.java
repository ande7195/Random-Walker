
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class DrunkenWalk {
        
      public static void main(String[] args) {
          int counter;
          counter =0;
          RandomWalker drunkie = new RandomWalker(0, 0, 0, 0,0 );
         //chang the number i is smaller than to change the amout of steps that should be taken
          for (int i = 0; i < 500; i++) {
              drunkie.setEdge(10);
              drunkie.takeStep();
              if(drunkie.inBounds()==false){
                 drunkie.setX(0);
                 drunkie.setY(0);
                 counter++;
                  System.out.println("He fell over");
              }
              System.out.println(drunkie); 
              
          }
          System.out.println("he fell over "+counter+" time(s)");
                 
      }
      }
      
      
      
          
     
 

