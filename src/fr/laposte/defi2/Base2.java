package fr.laposte.defi2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Base2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(Base2.class, args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Défi java 2");
		
		CarreNoir carreNoir = new CarreNoir(400, 400, 200);       
		
		CercleBleu cercleBleu = new CercleBleu(200, 200, 100);
		
		RectangleRouge rectangleRouge = new RectangleRouge(400, 200, 100, 200);
		
		root.getChildren().add(carreNoir);
		root.getChildren().add(cercleBleu);
		root.getChildren().add(rectangleRouge);
		
		primaryStage.show();		
	}

}
