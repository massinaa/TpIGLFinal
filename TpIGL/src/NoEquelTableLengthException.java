
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamoud Radja et Abderrahman Massina.
 * @version 3.0
 * @see  VectorHelper
 */
public class NoEquelTableLengthException extends Exception {

    /**
     *constructeur de la classe  NoEquelTableLengthException elle affiche un message si les deux tabeaux n'ont pas
     * la meme taille.
     */
    public  NoEquelTableLengthException()
    {
        System.out.println("vous ne pouvez pas sommer deux tablesux de taille differents !!!!") ;
    }
}

