package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,0);
            
            giroDerecha();
            avanzar(1);
            estudiante.turnLeft();
            avanzar(1);
            estudiante.turnLeft();
            avanzar(1);
            estudiante.pickThing();
            mediaVuelta();
            avanzar(1);
            giroDerecha();
            avanzar(1);
            giroDerecha();
            avanzar(1);
            giroDerecha();
            
            
            
	}
        
        public static void mediaVuelta(){
            for (int i = 0; i < 2; i++){ 
                estudiante.turnLeft();
            }
        }
        public static void giroDerecha(){
            for (int i = 0; i < 3; i++){
                estudiante.turnLeft();
            }
        }
        public static void avanzar(int a){
            for (int i = 0; i < a; i++){
                estudiante.move();
            }
        }
}