/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GroupOfWalls;
import Model.Tank;
import Model.TankConsumable;
import Model.groupOfInvaders;
import java.util.ArrayList;

/**
 * Controlador para el tanque
 * @author Juan Sebastian Cardenas, Santiago Jimenez
 */
public class ControllerTank {
        
    private Tank tank;
    
 //-----------------Constructor---------------------------------------
    
    /**
     * constructor null de tank
     */
     public ControllerTank() {
         tank = new Tank();
    }
    /**
    * 
    * Crea un tanque con su forma principal (addShape) y crea el disparo con su tasa de movimiento
    * @param x ubicacion del x inicial
    * @param y ubicacion del y inicial
    * @param width anchura de la forma principal
    * @param height altura de la forma inicial
    * @param speed velocidad de movimiento del tanque
    * @param speedBullet velocidad de  bala del tanqeu
    * @param refreshShoot fps de bala del tanque
    */
    public ControllerTank(int x, int y, int width, int height, int speed,int speedBullet, long  refreshShoot) {
        this.tank = new Tank(x, y, width, height, speed, speedBullet, refreshShoot);
    }
    
    //------------------Methods-------------------------------------------

    //mover
    /**
     * mueve para la izquierda el tanque y el disparo
     * @param Steps pasos a dar a la izquierda
     */
    public void moveLeftWithShoot(){
        tank.moveLeftWithShoot();
    }
    /**
     * mueve para la derecha el tanque y el disparo
     * @param Steps pasos a dar a la derecha
     */
    public void moveRightWithShoot(){
        tank.moveRightWithShoot();
    }
    //disparar
    /**
     * dispara para arriba hasta detectar una colision
     * @param enemy grupo de enemigos a los cuales les afecta el disparo
     */
    public int shoot(groupOfInvaders enemy, ArrayList<GroupOfWalls> walls){
       return tank.shoot(enemy,walls);
    }
    /**
     * dispara una bala con menos velocidad y solo retorna si llega al limite 
   * @param enemy el grupo de enmigos al cual le puede afectar la bala
    * @param walls muros a los cuales la bala le puede dar
     * @return <b>-1</b> si no pasa nada y puede seguir la bala adelante
     *         <br></b>0</b> si el disparo choco con una nave
     *         <br></b>1</b> si le dio a un muro
     *         <br></b>2</b> si llego al limite superiro(position/limitUp)
    */
    public int SuperShoot(groupOfInvaders enemy,ArrayList<GroupOfWalls> walls){
     return tank.SuperShoot(enemy, walls);
      }
    
    //------------------GetSetters----------------------------------------
    
    /**
     * retorna el tanque(model.Tank/tank) utilizado en el controlador
     * @return Tank(tank)
     */
    public Tank getTank() {
        return tank;
    }
    /**
     * destina el tanque utilizado en el controlador
     * @param tank  destinado al objeto
     */
    public void setTank(Tank tank) {
        this.tank = tank;
    }
    /**
     * retorna los consumbles de el tanque
     * @return (Consumable)
     */
    public TankConsumable getConsumable(){
        return tank.getConsumable();
    }
    
    //-------------------Override-----------------------------------------   

    @Override
    public String toString() {
        return  "";
                 
    }

  
}
