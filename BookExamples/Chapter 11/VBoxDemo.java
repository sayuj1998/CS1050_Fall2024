import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

/**
 *  VBox Demo
 */

public class VBoxDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create three Button components.
      Button button1 = new Button("Button 1");
      Button button2 = new Button("Button 2");
      Button button3 = new Button("Button 3");
      
      // Create a VBox.
      VBox vbox = new VBox(10, button1, button2, button3);
      vbox.setPadding(new Insets(10));
      
      // Create a Scene with the VBox as its root node.
      // The Scene is 300 pixels wide by 200 pixels high.
      Scene scene = new Scene(vbox, 300, 200);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("VBox Demo");
      
      // Show the window.
      primaryStage.show();
   }
}