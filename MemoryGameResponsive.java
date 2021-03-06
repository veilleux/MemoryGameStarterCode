import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color; 
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.util.*; 

/**
 *  A JavaFX: Memory Game 
 */
public class MemoryGameResponsive extends Application
{

   MemoryGame mg;  
      
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage stage)
   {  
      mg = new MemoryGame();
      /*Scene scene = new Scene(vbox,400,400);      
      // Add the Scene to the Stage.
      stage.setScene(scene);    
      // Set the stage title.
      stage.setTitle("Memory Game ");
      */
      // Show the window.
      stage.show();
   }
   
   Label makeLabel(String s){
   // just a stub
      return(new Label()); 
   }
   
   Button makeButton(int num){
   // just a stub
      return(new Button()); 
   }

   
   Button [] makeAGrid(GridPane grid, int size){
   // button from 1 to 10
      Button [] b = new Button[size];
   
      return(b);  // the array of buttons 
   }
  
        
   class ButtonClickHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
      }
   
   
   } // inner class
}