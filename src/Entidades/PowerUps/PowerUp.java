package Entidades.PowerUps;

import java.awt.Point;

import Colisionador.Colisionador;
import Entidades.Entidad;

/**
 * 
 * @author
 *
 */
public abstract class PowerUp extends Entidad{
	
	//Constructor
	protected PowerUp(Point p) {
		super(p);
	}
	
	//Metodos
	
	public void mover() {
		
	}

	public void meColisionan(Colisionador c) {
		c.colisionarPowerUp(this);
	}
}