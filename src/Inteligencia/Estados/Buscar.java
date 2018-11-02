package Inteligencia.Estados;

import java.awt.Point;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;
import Juego.JuegoEnemigo;

public class Buscar extends Estado{
	
	public Buscar(Inteligencia i, Enemigo enemigo) {
		super(i,enemigo);
	}
	
	public void ejecutar() {
		
		JuegoEnemigo juegoEnem = JuegoEnemigo.getInstance();
		Point posJug = juegoEnem.obtenerJugador().getPosition();
		Point posEnem=enemigo.getPosition();
		Point posNueva=new Point(0,0);
        int alto = juegoEnem.obtenerGrafica().altoGrafica();
	    if(posEnem.x < posJug.x && posEnem.y < posJug.y) //Derecha
		    posNueva.setLocation(posEnem.x + velocidad, posEnem.y + velocidad);
	    if(posEnem.x > posJug.x && posEnem.y < posJug.y) //Izquierda
	    	posNueva.setLocation(posEnem.x - velocidad, posEnem.y + velocidad);
        if(posEnem.x == posJug.x && posEnem.y < posJug.y){ //Solo bajar
            posNueva.setLocation(posEnem.x, posEnem.y + velocidad);
    		
        }
        enemigo.setPosition(posNueva);
        enemigo.setGrafico(0);
        if(enemigo.getPosition().y >= alto) {
        	inteligencia.setEstado(new VolverFormacion(inteligencia, enemigo));
           
	}

}
	
}
