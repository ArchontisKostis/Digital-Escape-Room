/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EscapeRoom;

/**
 *
 * @author Archontis
 */
public class Game {
    // Properties Declaration
    private static SplashScreenFrame SplashScreen;
    
    
    // MAIN method
    public static void main(String[] args) {
        // Splash Screen Load
        SplashScreen = new SplashScreenFrame();
        SplashScreen.setVisible(true);
        startSplashScreen(SplashScreen);
    }
    
      
    /*
    * NAME: startSplashScreen
    * INPUT: A SplashScreenFrame Instance
    * ACTION: Starts loading the splash screen (sets the JProgressbar & JLabel for loading values)
    */
    public static void startSplashScreen(SplashScreenFrame sp){
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(100);
                
                if(i==10){
                    sp.setLoadingText("Brewing Coffee...");
                }
                if(i==20){
                    sp.setLoadingText("Swapping time and space...");
                }
                if(i==30){
                    sp.setLoadingText("Generating witty dialog...");
                }
                if(i==40){
                    sp.setLoadingText("The bits are breeding...");
                }
                if(i==55){
                    sp.setLoadingText("Cleaning off the cobwebs...");
                }
                if(i==60){
                    sp.setLoadingText("99 bottles of beer on the wall...");
                }
                if(i==70){
                    sp.setLoadingText("Computing the secret to life and universe...");
                }
                if(i==85){
                    sp.setLoadingText("Are we there yet?");
                }
                if(i==90){
                    sp.setLoadingText("Don't panic...");
                }
                if(i==100){
                    sp.setLoadingText("See? Its done!");
                }
                sp.setProgressValue(i);
            }
        }
        catch(Exception e){
            e.printStackTrace(System.out);
        }
    }
    
}
