package fr.laposte.defi2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CercleBleu extends Circle {

	

	public CercleBleu(double x, double y, double rayon) {
		super(x, y, rayon);
		this.setFill(Color.BLUE);
		this.setStroke(Color.RED);
		this.setStrokeWidth(5);
		// TODO Auto-generated constructor stub
	}

}
