/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anders
 */
public class TestWalk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           /** RandomWalk walk1 = new RandomWalk(10, 5);
        RandomWalk walk2 = new RandomWalk(0, 0, 1000, 10);
        for(int i=0; i<5;i++){
        walk1.takeStep();
        walk2.takeStep();
    }**/
       /*RandomWalker walker = new RandomWalker(0, 0, 200, 10,0);
      while(walker.inBounds()==true){
       if(walker.moreSteps()==true){
       walker.takeStep(); 
       System.out.println(walker);
       }}
        
        System.out.println(walker);
        System.out.println(walker.getMaxDistance());**/
    RandomWalker walker = new RandomWalker(0, 0, 5, 10, 0);
        walker.takeStep();
        System.out.println(walker);
        System.out.println("the greatest distace is "+walker.getMaxDistance());
           walker.takeStep();
        System.out.println(walker);
        System.out.println("the greatest distace is "+walker.getMaxDistance());
           walker.takeStep();
        System.out.println(walker);
        System.out.println("the greatest distace is "+walker.getMaxDistance());
           walker.takeStep();
        System.out.println(walker);
        System.out.println("the greatest distace is "+walker.getMaxDistance());
           walker.takeStep();
        System.out.println(walker);
        System.out.println("the greatest distace is "+walker.getMaxDistance());
       
}
    }
    

