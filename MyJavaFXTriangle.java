import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class MyJavaFXTriangle extends Application
{
	
	public void start(Stage stage) 
	{
		Line line1 = new Line(100, 70, 100, 250);
		Line line2 = new Line(100, 250, 400, 250);
		Line line3 = new Line(400, 250, 100, 70);
		
		line1.setStroke(Color.BLUE);
		line1.setStroke(Color.RED);
		line1.setStroke(Color.GREEN);
		
		Group group = new Group(line1, line2, line3);
		
		Scene scene = new Scene(group, 450, 450, Color.YELLOW);
		stage.setScene(scene);
		stage.setTitle("My Triangle");		
		stage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	

}
