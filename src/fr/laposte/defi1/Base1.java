package fr.laposte.defi1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Base1 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(Base1.class, args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Défi java 1");
		
		Circle cercle = new Circle();
		
		cercle.setCenterX(300);
        cercle.setCenterY(200);
        cercle.setRadius(100);
        cercle.setFill(Color.YELLOW);
        cercle.setStroke(Color.ORANGE);
        cercle.setStrokeWidth(5);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setX(300);
        rectangle.setY(200);
        rectangle.setWidth(300);
        rectangle.setHeight(200);
        rectangle.setFill(Color.GREEN);
        rectangle.setStroke(Color.DARKGREEN);
        rectangle.setStrokeWidth(5);
        rectangle.setArcHeight(30);
        rectangle.setArcWidth(30);
		
		root.getChildren().add(cercle);
		root.getChildren().add(rectangle);
		
		primaryStage.show();		
	}

}
