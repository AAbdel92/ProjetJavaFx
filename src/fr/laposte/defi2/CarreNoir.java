package fr.laposte.defi2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



public class CarreNoir extends Rectangle{

	public CarreNoir(double x, double y, double mesure) {
		super(x, y, mesure, mesure);
		this.setFill(Color.BLACK);
		this.setStroke(Color.WHITE);
		this.setStrokeWidth(5);
		// TODO Auto-generated constructor stub
	}
	
	

}
	