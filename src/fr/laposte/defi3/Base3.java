package fr.laposte.defi3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Base3 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(Base3.class, args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Défi java 3");
		
		Button bouton1 = new Button("Bouton1");
		
		bouton1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				Text texte = new Text("Tu as appuyé sur le bouton 1, GG !");
				texte.setFill(Color.RED);
				texte.setX(100);
				texte.setY(100);
				root.getChildren().add(texte);
			
				
				
			}
		});
		Button bouton2 = new Button("Bouton2");
		Button bouton3 = new Button("Bouton3");
		
		ToolBar barreOutils = new ToolBar();
		
		barreOutils.getItems().setAll(bouton1, new Separator(), bouton2, new Separator(), bouton3);
		
		root.setTop(barreOutils);
		
//		root.getChildren().add(barreOutils);
//		root.getChildren().add(bouton2);
//		root.getChildren().add(bouton3);
		
		primaryStage.show();		
	}

}
