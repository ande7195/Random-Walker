/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class Collisions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
      RandomWalker partikel1 = new RandomWalker(3, 0, 0,2000000,0);
      RandomWalker partikel2 = new RandomWalker(-3, 0, 0,2000000,0);
      int counter= 0;
      
     
for (int i = 0; i < 100000; i++) {
            partikel1.takeStep();
            partikel2.takeStep();
            if(samePostion(partikel1, partikel2)==true){
                System.out.println("hit");
                counter++;
            }

          
            /**if(partikel1.getX()==partikel2.getX()){
                if(partikel1.getY()==partikel2.getY()){
                System.out.println(partikel1);
                System.out.println(partikel2);
                counter++;
                System.out.println("the particles hit "+ counter+" time(s)" );
            }
            
        }**/
       
    }
     System.out.println("the total hits were "+counter);
     
}
      public static boolean samePostion(RandomWalker p1,RandomWalker p2){
          if(p1.getX()==p2.getX()){
              if(p1.getY()==p2.getY()){
              return true;
                  
              }
          
          }
          return false;
      
      }
}