import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TrafficLight extends Application 
{

	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	    // Create three circles and set their properties
	    Circle circleR = new Circle();
	    circleR.setCenterX(150);
	    circleR.setCenterY(50);
	    circleR.setRadius(20);
	    circleR.setStroke(Color.BLACK); 
	    circleR.setFill(Color.TRANSPARENT);
	    
	    Circle circleY = new Circle();
	    circleY.setCenterX(150);
	    circleY.setCenterY(100);
	    circleY.setRadius(20);
	    circleY.setStroke(Color.BLACK); 
	    circleY.setFill(Color.TRANSPARENT);
	    
	    Circle circleG = new Circle();
	    circleG.setCenterX(150);
	    circleG.setCenterY(150);
	    circleG.setRadius(20);
	    circleG.setStroke(Color.BLACK); 
	    circleG.setFill(Color.TRANSPARENT);
	    
	    Rectangle r1 = new Rectangle(125, 20, 50, 165);
	    r1.setStroke(Color.BLACK);
	    r1.setFill(Color.TRANSPARENT);    
	    
	    RadioButton buttonR = new RadioButton("RED");
	    buttonR.setLayoutX(90);
	    buttonR.setLayoutY(280);
	    	    
	    RadioButton buttonY = new RadioButton("YELLOW");
	    buttonY.setLayoutX(140);
	    buttonY.setLayoutY(280);
	    
	    RadioButton buttonG = new RadioButton("GREEN");
	    buttonG.setLayoutX(210);
	    buttonG.setLayoutY(280);
	    
	    
	    // Create a pane to hold everything 
	    Pane pane = new Pane();
	    pane.getChildren().add(circleR);
	    pane.getChildren().add(circleY);
	    pane.getChildren().add(circleG);
	    pane.getChildren().add(r1);
	    pane.getChildren().add(buttonR);
	    pane.getChildren().add(buttonY);
	    pane.getChildren().add(buttonG);
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 300, 300);
	    primaryStage.setTitle("Exercise16-03"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	    
	    buttonR.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	    	public void handle(ActionEvent event) {	    	
	    	buttonR.setSelected(true);
	    	buttonY.setSelected(false);
	    	buttonG.setSelected(false);
	     
	    	circleR.setFill(Color.RED);
	    	circleY.setFill(Color.TRANSPARENT);
	    	circleG.setFill(Color.TRANSPARENT);
	    		    
	    	}
	  });
	    
	    buttonY.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	    	public void handle(ActionEvent event) {
	    	
	    	buttonR.setSelected(false);
	    	buttonY.setSelected(true);
	    	buttonG.setSelected(false);
	    	// set the color of the radio button
	    	circleR.setFill(Color.TRANSPARENT);
	    	circleY.setFill(Color.YELLOW);
	    	circleG.setFill(Color.TRANSPARENT);
	    		    
	    	}
	  });
	    buttonG.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
	    	public void handle(ActionEvent event) {
	    	buttonR.setSelected(false);
	    	buttonY.setSelected(false);
	    	buttonG.setSelected(true);
	     
	    	circleR.setFill(Color.TRANSPARENT);
	    	circleY.setFill(Color.TRANSPARENT);
	    	circleG.setFill(Color.GREEN);
	    		    
	    	}
	  });

	  
	  }
	  public static void main(String[] args) {
	    launch(args);
	  }

 	
    }	
  
