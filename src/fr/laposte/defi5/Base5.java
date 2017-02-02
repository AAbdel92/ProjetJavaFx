package fr.laposte.defi5;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Base5 extends Application {
	Group voiture;
	Group garage;
	Rectangle batiment;
	Rectangle corpsVoiture;
	Rectangle toitVoiture;
	Circle roueGauche;
	Circle roueDroite;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(Base5.class, args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root = new BorderPane();
		
		Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Défi java 4");					
			
			Button nouveau = new Button("Nouveau");
			
				nouveau.setOnAction(new EventHandler<ActionEvent>() {
				
					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						voiture = new Group();						
						
						corpsVoiture = new Rectangle();
						
							corpsVoiture.setWidth(300);
							corpsVoiture.setHeight(50);
							corpsVoiture.setY(525);
							corpsVoiture.setFill(Color.CHOCOLATE);
							
						toitVoiture = new Rectangle();
						
							toitVoiture.setWidth(150);
							toitVoiture.setHeight(40);
							toitVoiture.setY(485);
							toitVoiture.setX(75);
							toitVoiture.setFill(Color.CHOCOLATE);
						
						roueGauche = new Circle();
						
							roueGauche.setRadius(20);
							roueGauche.setCenterY(580);
							roueGauche.setCenterX(30);
						
						roueDroite = new Circle();
						
							roueDroite.setRadius(20);
							roueDroite.setCenterY(580);
							roueDroite.setCenterX(270);
							
						voiture.getChildren().addAll(toitVoiture, corpsVoiture, roueGauche, roueDroite);
						root.getChildren().add(voiture);
						
						
						
					}
				});
			
			
			Button moveLeft = new Button("Gauche");
			
				moveLeft.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						if (voiture.getTranslateX() > 0) {
							voiture.setTranslateX(voiture.getTranslateX() - 5);
							System.out.println(voiture.getTranslateX());
						}
						
							
						}
					});
			
			Button moveRight = new Button("Droite");
			
				moveRight.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						
						voiture.setTranslateX(voiture.getTranslateX() + 50);
						
						if (voiture.getTranslateX() == 375) {
							System.out.println(voiture.getTranslateX());
							
						}
						
//						if (corpsVoiture.getX() < 675) {
//							corpsVoiture.setX(corpsVoiture.getX() + 5);
//						}
							
						}
					});
		
			ToolBar barreOutils = new ToolBar();
			
			barreOutils.setMaxHeight(50);
			barreOutils.getItems().setAll(nouveau, new Separator(), moveLeft, 
					new Separator(), moveRight);
			
			
			
		Rectangle batiment = new Rectangle();
		
			batiment.setHeight(300);
			batiment.setWidth(200);
			batiment.setX(600);
			batiment.setY(300);
			batiment.setFill(Color.RED);
		
		Rectangle porte = new Rectangle();
		
			porte.setHeight(100);
			porte.setWidth(50);
			porte.setX(675);
			porte.setY(500);
		
		Text nomGarage = new Text();
		
			nomGarage.setText("Simplon");
			nomGarage.setX(675);
			nomGarage.setY(400);
			nomGarage.setFill(Color.BLUE);
			nomGarage.setStyle("-fx-font-weight: bold;");
			
		garage = new Group();
		
		garage.getChildren().addAll(batiment, porte, nomGarage);
				
		root.setTop(barreOutils);
		root.getChildren().add(garage);	
		
		primaryStage.show();		
	}

}
