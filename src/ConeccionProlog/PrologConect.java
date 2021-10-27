/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConeccionProlog;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

/**
 *
 * @author Kevin Sanchez y Jirgort McCarty
 */
public class PrologConect {
    private int sugerenciasTotal;
    private int [][] tablero = {{0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {0,0,0,0,0,0,0,0,0}};
    
    private int [][] tableroInicial = {{0,2,0,0,0,0,8,0,0},
                                      {0,0,9,1,0,0,0,5,0},
                                      {4,0,0,0,8,0,0,0,3},
                                      {0,0,8,0,0,7,0,0,0},
                                      {0,0,0,5,0,0,2,0,0},
                                      {0,0,2,0,9,0,0,0,0},
                                      {3,0,0,0,0,2,0,0,7},
                                      {0,0,1,0,0,5,0,0,2},
                                      {0,0,0,0,7,1,3,0,0}};
    
    
    public PrologConect(){
        sugerenciasTotal = 0;
    }
    
    /**
     * Objetivo: Modificar la cantidad de sugerencias realizadas sumando 1 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void updateSugerencias(){
        sugerenciasTotal += 1;
    }
    
    private void mostrarTableroTerminal(){
        for (int x=0;x<9;x++){
            for (int y=0;y<9;y++){
                System.out.print("\t"+tablero[x][y]);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    
    public void modifyTablero(int x, int y, int valorCasilla){
        tablero[x-1][y-1] = valorCasilla;
        mostrarTableroTerminal();
    }
    
    public void resetearTablero(){
        for (int x=0;x<9;x++){
            for (int y=0;y<9;y++){
                tablero[x][y] = 0;
            }
        }
        mostrarTableroTerminal();
    }
    
    public void repetirTablero(){
        for (int x=0;x<9;x++){
            for (int y=0;y<9;y++){
                tablero[x][y] = tableroInicial[x][y];
            }
        }
    }
    
    public boolean verificarInicial(int x, int y){
        return tableroInicial[x-1][y-1] == 0;
    }
    
    public int getSugerenciasTotal(){
        return sugerenciasTotal;
    }
    
    public void setSugerenciasTotal(int newValue){
        sugerenciasTotal = newValue;
    }
    
    public int getTableroInicialPos(int x, int y){
        return tableroInicial[x][y];
    }
    
}
 