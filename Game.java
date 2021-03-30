import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;
    private boolean isRunning = false; 
    


    public Game(){

        new Window(800, 600, "TwentyTwenty Vision" , this);
        
    }
  
    public void run() {
        
    }


    public static void main(String[] args){

        new Game();

    }



}
