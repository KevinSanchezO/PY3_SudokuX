/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConeccionProlog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Andrey McCarty
 */
public class Proyecto_SudokuX {
    private List<String[]> matrizPistas;
    private List<String[]> matrizSolucion;
    private int sugerenciasTotal;
    
    private String [][] tablero = {{"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"},
                                   {"0","0","0","0","0","0","0","0","0"}};
    
    private String [][] tableroInicial = {{"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"},
                                          {"0","0","0","0","0","0","0","0","0"}};
    
    public Proyecto_SudokuX(){
        sugerenciasTotal = 0;
    }
    
    /**
     * Objetivo: Obtener la lista con las posiciones de la matriz del sudoku que se mostraran en el tablero
     * E: N/E
     * S: la lista con las posiciones de la matriz del sudoku
     * R: la lista contendra 18 elementos.
     */
    public static List<String[]> pistasSudokuX(){
        String conexion="consult('Prueba.pl')";
        Query con= new Query(conexion);
        con.hasSolution();
        String consulta= "pistasSudokuX(R)";
        Query ejecutar= new Query(consulta);
        Map<String, Term>[] res =ejecutar.allSolutions();
        //System.out.println("Esto es res(lista inicial completa):"+ res[0]);
        List<String[]> resMatrizPistas=new ArrayList<String[]>();
        String[] strSplit=res[0].toString().split(",");
        //System.out.println("Esto es el split con error:"+strSplit[0]);
        for (int i=0; i<strSplit.length-1;i++){
            String[] matrizTemp=new String[2];
            for(int j=0;j<2;j++){
                if(j==0){
                    if(i==0){
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(5));
                        //System.out.println("Elemento pos "+i+" en lista :"+matrizTemp[j]);
                    }else{
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(2));
                        //System.out.println("Elemento pos "+i+" en lista :"+matrizTemp[j]);
                    }
                    i++;
                }else{
                    if(j==1){
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(1));
                        //System.out.println("Elemento pos "+i+" en lista :"+matrizTemp[j]);
                    }else{
                         matrizTemp[j]=String.valueOf(strSplit[i].charAt(1));
                         i++;
                    }
                }
            }
            resMatrizPistas.add(matrizTemp);
        }
        return resMatrizPistas;
    }

    /**
     * Objetivo: Crear una matriz con un juego de sudoku solucionado
     * E: N/E
     * S: una matriz con un sudoku solucionado
     * R: Se escoje una matriz aleatoriamente
     */
    public static List<String[]>solucionSudokuX(){
        String[] listaConsultas ={"tablero1(1,R)","tablero2(2,R)","tablero3(3,R)","tablero4(4,R)",
        "tablero5(5,R)","tablero6(6,R)","tablero7(7,R)","tablero8(8,R)","tablero9(9,R)",
        "tablero10(10,R)"};
        String conexion="consult('Prueba.pl')";
        Query consulta=new Query(conexion);
        consulta.hasSolution();
        consulta=new Query(listaConsultas[(int) Math.floor(Math.random()*10)]+",sudoku(R),maplist(label,R),!.");
        Map<String,Term>[] res=consulta.allSolutions();
        //System.out.println("Esto es res(lista inicial completa):"+ res[0]);
        List<String[]>matrizSolucion=new ArrayList<String[]>();
        String[] strSplit=res[0].toString().split(",");

        for (int i=0; i<strSplit.length-2;i++){
            String[] matrizTemp=new String[9];
            for(int j=0;j<9;j++){
                if(j==0){
                    if(i==0){
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(5));
                    }else{
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(2));
                    }
                    i++;
                }else{
                    if(j==8){
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(1));
                    }else{
                         matrizTemp[j]=String.valueOf(strSplit[i].charAt(1));
                         i++;
                    }
                }
            }
            matrizSolucion.add(matrizTemp);
        }
        return matrizSolucion;
    }
    
    /**
     * Objetivo: resetear los valores del juego a cero para reiniciar el juego 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void crearNuevoJuego(){
        resetearTablero();
        resetearTableroInicial();
        matrizPistas = null;
        matrizSolucion = null;
        matrizPistas = pistasSudokuX();
        matrizSolucion = solucionSudokuX();
        igualarTableroInicialMatrizPistas();
    }
    
    /**
     * Objetivo: Conteo de las posiciones vacias del tablero de juego desde prolog
     * E: N/E
     * S: La cantidad de posiciones vacias del tablero en un String
     * R: N/E
     */
    public String contarVacios(){
        String conexion="consult('Prueba.pl')";
        Query con= new Query(conexion);
        con.hasSolution();
        String consulta= "matrizVerificar("+crearStringMatrizTablero()+",R)";
        Query ejecutar= new Query(consulta);
        
        String res= ejecutar.oneSolution().get("R").toString();
        System.out.println("Esta la cantidad de espacios vacios: "+res);
        return res;
    }
    
    /**
     * Objetivo: Contar la cantidad de matrices erroneas en el tablero de juego
     * E:N/E
     * S:la cantidad de casillas erroneas en el tablero en un string
     * R:N/E
     */
    public String contarErrores(){
        String conexion="consult('Prueba.pl')";
        Query con= new Query(conexion);
        con.hasSolution();
        String consulta= "verificarGane("+crearStringMatrizTablero()+","+crearStringMatrizSolucion()+",R)";
        Query ejecutar= new Query(consulta);
        
        String res= ejecutar.oneSolution().get("R").toString();
        System.out.println("Esta la cantidad de errores: "+res);
        return res;
    }
    
    /**
     * Objetivo: verifica que las posiciones de la sugerencia son validas
     * E: N/E
     * S: La posicion de la sugerencia validada
     * R: N/E
     */
    public List<String[]> sugerenciaProbar(){
        boolean bandera = false;
        List<String[]> res = null;
        while (!bandera){
            res = obtenerSugerencias();
            int posX = Integer.parseInt(res.get(0)[0]);
            int posY = Integer.parseInt(res.get(0)[1]);
            
            if(matrizSolucion.get(posX-1)[posY-1] != tablero[posX-1][posY-1]){
                bandera = true;
            }
        }
        return res;
    }
    
    /**
     * Objetivo: Obtener una posicion aleatoria que sera la sugerencia 
     * E: N/E
     * S: la posicion de la sugerencia del tablero.
     * R: N/E
     */
    public List<String[]> obtenerSugerencias(){    
        String conexion="consult('Prueba.pl')";
        Query con= new Query(conexion);
        con.hasSolution();
        String consulta= "generaPosiciones(2,R)";
        Query ejecutar= new Query(consulta);
        Map<String, Term>[] res = ejecutar.allSolutions();
        
        List<String[]> resMatrizPistas=new ArrayList<String[]>();
        String[] strSplit=res[0].toString().split(",");
        //System.out.println("Esto es el split con error:"+strSplit[0]);
        for (int i=0; i<strSplit.length-1;i++){
            String[] matrizTemp=new String[2];
            for(int j=0;j<2;j++){
                if(j==0){
                    if(i==0){
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(4));
                        System.out.println("Elemento pos "+i+" en lista :"+matrizTemp[j]);
                    }else{
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(2));
                        System.out.println("Elemento pos "+i+" en lista :"+matrizTemp[j]);
                    }
                    i++;
                }else{
                    if(j==1){
                        matrizTemp[j]=String.valueOf(strSplit[i].charAt(1));
                        System.out.println("Elemento pos "+i+" en lista :"+matrizTemp[j]);
                    }else{
                         matrizTemp[j]=String.valueOf(strSplit[i].charAt(1));
                         i++;
                    }
                }
            }
            resMatrizPistas.add(matrizTemp);
        }
        
        return resMatrizPistas;
    }
    
    /**
     * Objetivo: igualar el tablero incial con el valor y posicion de la matriz de pistas 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void igualarTableroInicialMatrizPistas(){
        for (int x = 0; x<9; x++){
            String valor1 = matrizPistas.get(x)[0];
            String valor2 = matrizPistas.get(x)[1];
            
            int valor1_int = Integer.parseInt(valor1);
            int valor2_int = Integer.parseInt(valor2);
            
            tableroInicial[x][valor1_int-1] = matrizSolucion.get(x)[valor1_int-1];
            tableroInicial[x][valor2_int-1] = matrizSolucion.get(x)[valor2_int-1];
        }
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
    
    /**
     * Objetivo: Mostrar el tablero de juego en la terminal 
     * E:N/E
     * S:N/E
     * R:N/E
     */
    public void mostrarTableroTerminal(){
        for (int x=0;x<9;x++){
            for (int y=0;y<9;y++){
                System.out.print("\t"+tablero[x][y]);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
    
    /**
     * Objetivo: cambiar una posicion de la matriz del tablero de juego 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void modifyTablero(int x, int y, String valorCasilla){
        tablero[x-1][y-1] = valorCasilla;
        mostrarTableroTerminal();
    }
    
    /**
     * Objetivo: setea en 0 todas las posiciones de la matriz de tablero de juego.
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void resetearTablero(){
        for (int x=0;x<9;x++){
            for (int y=0;y<9;y++){
                tablero[x][y] = "0";
            }
        }
    }
    
    /**
     * Objetivo: Setea en 0 todas las posiciones de la matriz inicial del juego 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void resetearTableroInicial(){
        for (int x=0;x<9;x++){
            for (int y=0;y<9;y++){
                tableroInicial[x][y] = "0";
            }
        }
    }

    /**
     * Objetivo: iguala todas las posiciones del tablero de juego con el tablero incial 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void repetirTablero(){
        for (int x=0;x<9;x++){
            for (int y=0;y<9;y++){
                tablero[x][y] = tableroInicial[x][y];
            }
        }
    }
    
    /**
     * Objetivo: Iguala las posiciones dela matriz del tablero de juego con las  de la matriz solucionada.
     * E: N/E
     * S: N/E
     * R: N/E
     */
    public void solucionarSudoku(){
        for (int x = 0; x<9; x++){
            for(int y = 0; y<9; y++){
                tablero[x][y] = matrizSolucion.get(x)[y];
                tablero[x][y] = matrizSolucion.get(x)[y];
            }
        }
    }
    
    /**
     * Objetivo: Crea un String de una matriz en base a la matriz tablero.
     * E: N/E
     * S: Un string que es una matriz creada en base a tablero
     * R: N/E
     */
    public String crearStringMatrizTablero(){
        String res = "[";
        for (int x=0;x<9;x++){
            res += "[";
            for (int y=0;y<9;y++){
                res += tablero[x][y];
                if (y != 8){
                    res +=",";
                }
            }
            if (x != 8){
                res +="],";
            } else {
                res +="]]";
            }
        }
        return res;
    }
    
    /**
     * Objetivo: Crea un String de una matriz en base a la matriz solucion.
     * E: N/E
     * S: Un string que es una matriz creada en base a la solucion
     * R: N/E
     */
    public String crearStringMatrizSolucion(){
        String res = "[";
        for (int x=0;x<9;x++){
            res += "[";
            for (int y=0;y<9;y++){
                res += matrizSolucion.get(x)[y];
                if (y != 8){
                    res +=",";
                }
            }
            if (x != 8){
                res +="],";
            } else {
                res +="]]";
            }
        }
        return res;
    }
    
    public String getSolucionPos(int x, int y){
        return matrizSolucion.get(x)[y];
    }
    
    public boolean verificarInicial(int x, int y){
        return tableroInicial[x-1][y-1] == "0";
    }
    
    public void resetSugerencias(){
        sugerenciasTotal = 0;
    }
    
    public int getSugerenciasTotal(){
        return sugerenciasTotal;
    }
    
    public void setSugerenciasTotal(int newValue){
        sugerenciasTotal = newValue;
    }
    
    public String getTableroInicialPos(int x, int y){
        return tableroInicial[x][y];
    }
    
    public String getTableroPos(int x, int y){
        return tablero[x][y];
    }
    
    public List<String[]> getMatrizPistas(){
        return matrizPistas;
    }
    
    public List<String[]> getMatrizSolucion(){
        return matrizSolucion;
    }
}