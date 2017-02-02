package fr.laposte.defi4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Base4 extends Application {
	Rectangle carre;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(Base4.class, args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Défi java 4");
		
		
		Button boutonCreer = new Button("Créer un carré");
		
		boutonCreer.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				carre = new Rectangle();
				carre.setWidth(100);
				carre.setHeight(100);
				carre.setX(350);
				carre.setY(250);
				carre.setFill(Color.DARKRED);
				carre.setStroke(Color.BLACK);
				carre.setStrokeWidth(5);			
				root.getChildren().add(carre);				
			}
		});
		Button moveUp = new Button("Haut");
		
		moveUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (carre.getY() > 40) {
				carre.setY(carre.getY() - 5);
				}
			}
		});
		Button moveDown = new Button("Bas");
		
		moveDown.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if (carre.getY() < 500) {
				carre.setY(carre.getY() + 5);		
				}
			}
			
		});
		Button moveLeft = new Button("Gauche");
		
		moveLeft.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if (carre.getX() > 0) {
				carre.setX(carre.getX() - 5);
				}
								
			}
			
		});
		
		Button moveRight = new Button("Droite");
		
		
		moveRight.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if (carre.getX() < 700) {
				carre.setX(carre.getX() + 5);
				}
				
			}
			
		});
		
		ToolBar barreOutils = new ToolBar();
	
		
		barreOutils.getItems().setAll(boutonCreer, new Separator(), moveUp, new Separator(), 
				moveDown, new Separator(), moveLeft, new Separator(), moveRight);
		
		root.setTop(barreOutils);
		
		

		
		primaryStage.show();		
	}

}
