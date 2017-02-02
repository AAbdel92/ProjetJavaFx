package fr.laposte.defi2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleRouge extends Rectangle {


	public RectangleRouge(double x, double y, double largeur, double hauteur) {
		super(x, y, largeur, hauteur);
		this.setFill(Color.RED);
		this.setStroke(Color.BLUE);
		this.setStrokeWidth(5);
		// TODO Auto-generated constructor stub
	}

}
