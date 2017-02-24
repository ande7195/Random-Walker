
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
public class RandomWalker {




    private int x;
    private int y;
    private int maxSteps;
    private int currentSteps;
    private int edge;
    private int maxDistance;

    public RandomWalker(int maxSteps, int edge,int maxDistance) {
        this.maxSteps = maxSteps;
        this.edge = edge;
        this.x=0;
        this.y=0;
        this.currentSteps=0;
        this.maxDistance=maxDistance;
    }

    @Override
    public String toString() {
        return "RandomWalk{" + "x=" + x + ", y=" + y + ", currentSteps=" + currentSteps + '}';
    }

    public RandomWalker(int x, int y, int maxSteps, int edge, int maxDistance) {
        this.x = x;
        this.y = y;
        this.maxSteps = maxSteps;
        this.edge = edge;
        this.maxDistance=maxDistance;
    }
    public void takeStep(){
        
        Random ran= new Random() ;
       int step=ran.nextInt(4);
        switch(step){
            case 0: y--;
                    currentSteps++;
            break;
            case 1: y++;
                    currentSteps++;
            break;
            case 2: x--;
                    currentSteps++;
            break;
            case 3: x++;
                    currentSteps++;
            break;
        }
            
        
        
       
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    boolean moreSteps(){
        if(currentSteps<maxSteps){
            return true;
        }
                return false;
            
        
    }
    
    boolean inBounds(){
        if(x<= edge&&x>=-edge){
         if(y<=edge&&y>=-edge){
             return true;
         }else{
             return false;
      
         }    
          
    }
        return false;
    }
    boolean walk(){
        
        while (moreSteps()==true &&inBounds()==true){
            return true;
        }
        return false;
    }
    public int getMaxDistance(){
        int result;
        result=0;
        if(Math.abs(getX())>Math.abs(getY())){
            result= getX();
            
        } if(Math.abs(getX())<Math.abs(getY())){
            result=getY();
        } if(Math.abs(getX())==Math.abs(getY())) {
            result=getX();
        }
       return result; 
    }
}
   

