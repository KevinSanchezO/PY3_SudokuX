package gui;

import ConeccionProlog.Proyecto_SudokuX;
import javax.swing.JButton;
import javax.swing.JOptionPane;
        
/**
 * @author Kevin Sanchez y Jirgort McCarty
 */
public class VentanaJuego extends javax.swing.JFrame {
    public Proyecto_SudokuX juegoSudoku = new Proyecto_SudokuX();
    public JButton casilla = null;
    public int posX = 0;
    public int posY = 0;
    public int cantJuegos = 0;
    public String tipoFinalizacion= "";
    
    public VentanaJuego() {
        initComponents();
        deshabilitarBotonesNumeros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCeldas = new javax.swing.JLabel();
        txtVerificaciones = new javax.swing.JLabel();
        txtErrores = new javax.swing.JLabel();
        txtSugerencias = new javax.swing.JLabel();
        txtCantIngresos = new javax.swing.JLabel();
        txtCantVerificaciones = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtCantErrores = new javax.swing.JLabel();
        btnCrearNuevo = new javax.swing.JButton();
        txtCantSugerencias = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        btnSugerencia = new javax.swing.JButton();
        btnSolucion = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        btn67 = new javax.swing.JButton();
        btn68 = new javax.swing.JButton();
        btn69 = new javax.swing.JButton();
        btn71 = new javax.swing.JButton();
        btn72 = new javax.swing.JButton();
        btn73 = new javax.swing.JButton();
        btn74 = new javax.swing.JButton();
        btn75 = new javax.swing.JButton();
        btn76 = new javax.swing.JButton();
        btn77 = new javax.swing.JButton();
        btn78 = new javax.swing.JButton();
        btn79 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();
        btn82 = new javax.swing.JButton();
        btn83 = new javax.swing.JButton();
        btn84 = new javax.swing.JButton();
        btn85 = new javax.swing.JButton();
        btn86 = new javax.swing.JButton();
        btn87 = new javax.swing.JButton();
        btn88 = new javax.swing.JButton();
        btn89 = new javax.swing.JButton();
        btn91 = new javax.swing.JButton();
        btn92 = new javax.swing.JButton();
        btn93 = new javax.swing.JButton();
        btn94 = new javax.swing.JButton();
        btn95 = new javax.swing.JButton();
        btn96 = new javax.swing.JButton();
        btn97 = new javax.swing.JButton();
        btn98 = new javax.swing.JButton();
        btn99 = new javax.swing.JButton();
        btnNumero0 = new javax.swing.JButton();
        btnNumero1 = new javax.swing.JButton();
        btnNumero2 = new javax.swing.JButton();
        btnNumero3 = new javax.swing.JButton();
        btnNumero4 = new javax.swing.JButton();
        btnNumero5 = new javax.swing.JButton();
        btnNumero6 = new javax.swing.JButton();
        btnNumero7 = new javax.swing.JButton();
        btnNumero8 = new javax.swing.JButton();
        btnNumero9 = new javax.swing.JButton();
        parentesis1 = new javax.swing.JLabel();
        txtSugerenciasRestantes = new javax.swing.JLabel();
        parentesis2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCeldas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCeldas.setText("Cantidad de celdas de ingreso de dígitos: ");

        txtVerificaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVerificaciones.setText("Cantidad de verificaciones realizadas: ");

        txtErrores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtErrores.setText("Cantidad de errores de verificación: ");

        txtSugerencias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSugerencias.setText("Cantidad de sugerencias utilizadas:");

        txtCantIngresos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCantIngresos.setText("0");

        txtCantVerificaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCantVerificaciones.setText("0");

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Sudoku X");

        txtCantErrores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCantErrores.setText("0");

        btnCrearNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCrearNuevo.setText("Generar nuevo juego");
        btnCrearNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoActionPerformed(evt);
            }
        });

        txtCantSugerencias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCantSugerencias.setText("0");

        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnVerificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnSugerencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSugerencia.setText("Sugerencia");
        btnSugerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSugerenciaActionPerformed(evt);
            }
        });

        btnSolucion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSolucion.setText("Ver solución");
        btnSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(0, 204, 255));
        btn11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(102, 102, 102));
        btn12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setBackground(new java.awt.Color(102, 102, 102));
        btn13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setBackground(new java.awt.Color(102, 102, 102));
        btn14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setBackground(new java.awt.Color(102, 102, 102));
        btn15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setBackground(new java.awt.Color(102, 102, 102));
        btn16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setBackground(new java.awt.Color(102, 102, 102));
        btn17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setBackground(new java.awt.Color(102, 102, 102));
        btn18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setBackground(new java.awt.Color(0, 204, 255));
        btn19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn21.setBackground(new java.awt.Color(102, 102, 102));
        btn21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setBackground(new java.awt.Color(0, 204, 255));
        btn22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn29.setBackground(new java.awt.Color(102, 102, 102));
        btn29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn23.setBackground(new java.awt.Color(102, 102, 102));
        btn23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setBackground(new java.awt.Color(102, 102, 102));
        btn24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setBackground(new java.awt.Color(102, 102, 102));
        btn25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setBackground(new java.awt.Color(102, 102, 102));
        btn26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.setBackground(new java.awt.Color(102, 102, 102));
        btn27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.setBackground(new java.awt.Color(0, 204, 255));
        btn28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn31.setBackground(new java.awt.Color(102, 102, 102));
        btn31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setBackground(new java.awt.Color(102, 102, 102));
        btn32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setBackground(new java.awt.Color(0, 204, 255));
        btn33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.setBackground(new java.awt.Color(102, 102, 102));
        btn34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn35.setBackground(new java.awt.Color(102, 102, 102));
        btn35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn36.setBackground(new java.awt.Color(102, 102, 102));
        btn36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        btn37.setBackground(new java.awt.Color(0, 204, 255));
        btn37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });

        btn38.setBackground(new java.awt.Color(102, 102, 102));
        btn38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });

        btn39.setBackground(new java.awt.Color(102, 102, 102));
        btn39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });

        btn41.setBackground(new java.awt.Color(102, 102, 102));
        btn41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn42.setBackground(new java.awt.Color(102, 102, 102));
        btn42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });

        btn43.setBackground(new java.awt.Color(102, 102, 102));
        btn43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });

        btn44.setBackground(new java.awt.Color(0, 204, 255));
        btn44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });

        btn45.setBackground(new java.awt.Color(102, 102, 102));
        btn45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });

        btn46.setBackground(new java.awt.Color(0, 204, 255));
        btn46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });

        btn47.setBackground(new java.awt.Color(102, 102, 102));
        btn47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });

        btn48.setBackground(new java.awt.Color(102, 102, 102));
        btn48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });

        btn49.setBackground(new java.awt.Color(102, 102, 102));
        btn49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });

        btn51.setBackground(new java.awt.Color(102, 102, 102));
        btn51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });

        btn52.setBackground(new java.awt.Color(102, 102, 102));
        btn52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52ActionPerformed(evt);
            }
        });

        btn53.setBackground(new java.awt.Color(102, 102, 102));
        btn53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn53ActionPerformed(evt);
            }
        });

        btn54.setBackground(new java.awt.Color(102, 102, 102));
        btn54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn54ActionPerformed(evt);
            }
        });

        btn55.setBackground(new java.awt.Color(0, 204, 255));
        btn55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn55ActionPerformed(evt);
            }
        });

        btn56.setBackground(new java.awt.Color(102, 102, 102));
        btn56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn56ActionPerformed(evt);
            }
        });

        btn57.setBackground(new java.awt.Color(102, 102, 102));
        btn57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn57ActionPerformed(evt);
            }
        });

        btn58.setBackground(new java.awt.Color(102, 102, 102));
        btn58.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn58ActionPerformed(evt);
            }
        });

        btn59.setBackground(new java.awt.Color(102, 102, 102));
        btn59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn59ActionPerformed(evt);
            }
        });

        btn61.setBackground(new java.awt.Color(102, 102, 102));
        btn61.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn61ActionPerformed(evt);
            }
        });

        btn62.setBackground(new java.awt.Color(102, 102, 102));
        btn62.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn62ActionPerformed(evt);
            }
        });

        btn63.setBackground(new java.awt.Color(102, 102, 102));
        btn63.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn63ActionPerformed(evt);
            }
        });

        btn64.setBackground(new java.awt.Color(0, 204, 255));
        btn64.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn64ActionPerformed(evt);
            }
        });

        btn65.setBackground(new java.awt.Color(102, 102, 102));
        btn65.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn65ActionPerformed(evt);
            }
        });

        btn66.setBackground(new java.awt.Color(0, 204, 255));
        btn66.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn66ActionPerformed(evt);
            }
        });

        btn67.setBackground(new java.awt.Color(102, 102, 102));
        btn67.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn67ActionPerformed(evt);
            }
        });

        btn68.setBackground(new java.awt.Color(102, 102, 102));
        btn68.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn68ActionPerformed(evt);
            }
        });

        btn69.setBackground(new java.awt.Color(102, 102, 102));
        btn69.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn69ActionPerformed(evt);
            }
        });

        btn71.setBackground(new java.awt.Color(102, 102, 102));
        btn71.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn71ActionPerformed(evt);
            }
        });

        btn72.setBackground(new java.awt.Color(102, 102, 102));
        btn72.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn72ActionPerformed(evt);
            }
        });

        btn73.setBackground(new java.awt.Color(0, 204, 255));
        btn73.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn73ActionPerformed(evt);
            }
        });

        btn74.setBackground(new java.awt.Color(102, 102, 102));
        btn74.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn74ActionPerformed(evt);
            }
        });

        btn75.setBackground(new java.awt.Color(102, 102, 102));
        btn75.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn75ActionPerformed(evt);
            }
        });

        btn76.setBackground(new java.awt.Color(102, 102, 102));
        btn76.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn76ActionPerformed(evt);
            }
        });

        btn77.setBackground(new java.awt.Color(0, 204, 255));
        btn77.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn77ActionPerformed(evt);
            }
        });

        btn78.setBackground(new java.awt.Color(102, 102, 102));
        btn78.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn78ActionPerformed(evt);
            }
        });

        btn79.setBackground(new java.awt.Color(102, 102, 102));
        btn79.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn79ActionPerformed(evt);
            }
        });

        btn81.setBackground(new java.awt.Color(102, 102, 102));
        btn81.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn81ActionPerformed(evt);
            }
        });

        btn82.setBackground(new java.awt.Color(0, 204, 255));
        btn82.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn82ActionPerformed(evt);
            }
        });

        btn83.setBackground(new java.awt.Color(102, 102, 102));
        btn83.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn83ActionPerformed(evt);
            }
        });

        btn84.setBackground(new java.awt.Color(102, 102, 102));
        btn84.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn84ActionPerformed(evt);
            }
        });

        btn85.setBackground(new java.awt.Color(102, 102, 102));
        btn85.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn85ActionPerformed(evt);
            }
        });

        btn86.setBackground(new java.awt.Color(102, 102, 102));
        btn86.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn86ActionPerformed(evt);
            }
        });

        btn87.setBackground(new java.awt.Color(102, 102, 102));
        btn87.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn87ActionPerformed(evt);
            }
        });

        btn88.setBackground(new java.awt.Color(0, 204, 255));
        btn88.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn88ActionPerformed(evt);
            }
        });

        btn89.setBackground(new java.awt.Color(102, 102, 102));
        btn89.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn89ActionPerformed(evt);
            }
        });

        btn91.setBackground(new java.awt.Color(0, 204, 255));
        btn91.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn91ActionPerformed(evt);
            }
        });

        btn92.setBackground(new java.awt.Color(102, 102, 102));
        btn92.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn92ActionPerformed(evt);
            }
        });

        btn93.setBackground(new java.awt.Color(102, 102, 102));
        btn93.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn93ActionPerformed(evt);
            }
        });

        btn94.setBackground(new java.awt.Color(102, 102, 102));
        btn94.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn94ActionPerformed(evt);
            }
        });

        btn95.setBackground(new java.awt.Color(102, 102, 102));
        btn95.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn95ActionPerformed(evt);
            }
        });

        btn96.setBackground(new java.awt.Color(102, 102, 102));
        btn96.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn96ActionPerformed(evt);
            }
        });

        btn97.setBackground(new java.awt.Color(102, 102, 102));
        btn97.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn97ActionPerformed(evt);
            }
        });

        btn98.setBackground(new java.awt.Color(102, 102, 102));
        btn98.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn98ActionPerformed(evt);
            }
        });

        btn99.setBackground(new java.awt.Color(0, 204, 255));
        btn99.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn99ActionPerformed(evt);
            }
        });

        btnNumero0.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero0.setText("0");
        btnNumero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero0ActionPerformed(evt);
            }
        });

        btnNumero1.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero1.setText("1");
        btnNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero1ActionPerformed(evt);
            }
        });

        btnNumero2.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero2.setText("2");
        btnNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero2ActionPerformed(evt);
            }
        });

        btnNumero3.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero3.setText("3");
        btnNumero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero3ActionPerformed(evt);
            }
        });

        btnNumero4.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero4.setText("4");
        btnNumero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero4ActionPerformed(evt);
            }
        });

        btnNumero5.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero5.setText("5");
        btnNumero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero5ActionPerformed(evt);
            }
        });

        btnNumero6.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero6.setText("6");
        btnNumero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero6ActionPerformed(evt);
            }
        });

        btnNumero7.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero7.setText("7");
        btnNumero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero7ActionPerformed(evt);
            }
        });

        btnNumero8.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero8.setText("8");
        btnNumero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero8ActionPerformed(evt);
            }
        });

        btnNumero9.setBackground(new java.awt.Color(255, 102, 0));
        btnNumero9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNumero9.setText("9");
        btnNumero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumero9ActionPerformed(evt);
            }
        });

        parentesis1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        parentesis1.setText("(");

        txtSugerenciasRestantes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSugerenciasRestantes.setText("5");

        parentesis2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        parentesis2.setText(")");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCrearNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSugerencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblTitle))
                                    .addComponent(btnSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(parentesis1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSugerenciasRestantes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parentesis2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtErrores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSugerencias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantSugerencias, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtVerificaciones)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantVerificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtCeldas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero5, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero6, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumero9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSugerencia)
                    .addComponent(parentesis1)
                    .addComponent(txtSugerenciasRestantes)
                    .addComponent(parentesis2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolucion)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCeldas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantIngresos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVerificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantVerificaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtErrores)
                    .addComponent(txtCantErrores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSugerencias)
                    .addComponent(txtCantSugerencias))
                .addGap(69, 259, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Objetivo: habilitar todos los numeros para indicar el numero de una casilla
     * E: N/E
     * S: N/E
     * R: N/E
     */
    private void habilitarBotonesNumeros(){
        btnNumero0.setEnabled(true);
        btnNumero1.setEnabled(true);
        btnNumero2.setEnabled(true);
        btnNumero3.setEnabled(true);
        btnNumero4.setEnabled(true);
        btnNumero5.setEnabled(true);
        btnNumero6.setEnabled(true);
        btnNumero7.setEnabled(true);
        btnNumero8.setEnabled(true);
        btnNumero9.setEnabled(true);
    }
    
    /**
     * Objetivo: deshabilitar todos los numeros para indicar el numero de una casilla
     * E: N/E
     * S: N/E
     * R: N/E
     */
    private void deshabilitarBotonesNumeros(){
        btnNumero0.setEnabled(false);
        btnNumero1.setEnabled(false);
        btnNumero2.setEnabled(false);
        btnNumero3.setEnabled(false);
        btnNumero4.setEnabled(false);
        btnNumero5.setEnabled(false);
        btnNumero6.setEnabled(false);
        btnNumero7.setEnabled(false);
        btnNumero8.setEnabled(false);
        btnNumero9.setEnabled(false);
    }
    
    /**
     * Objetivo: cambiar el numero de una casilla de juego
     * E: int value, el numero que se le otorgara a la casilla 
     * S: N/E
     * R: Al asignar el numero a la casilla se desabilita los botones para indicar el numero
     */
    private void rellenarCasilla(int value){
        if (juegoSudoku.verificarInicial(posX,posY)){
            String str;
            if (value == 0){
                str = "";
                int cant = Integer.parseInt(txtCantIngresos.getText());
                if (cant>0){
                    cant -= 1;
                }
                txtCantIngresos.setText(Integer.toString(cant));
            } else {
                str = Integer.toString(value);
                int cant = Integer.parseInt(txtCantIngresos.getText());
                cant += 1;
                txtCantIngresos.setText(Integer.toString(cant));
            }
            String valueString = Integer.toString(value);
            casilla.setText(str);
            deshabilitarBotonesNumeros();
            juegoSudoku.modifyTablero(posX,posY,valueString);
        } else {
            System.out.println("Error");
        }
    }
    
    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn11;
        posX = 1;
        posY = 1;
    }//GEN-LAST:event_btn11ActionPerformed

    /**
     * Objetivo: resetea el texto de todos los botones que conforman las casillas 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    private void resetearBotonesCasillas(){
        btn11.setText("");
        btn12.setText("");
        btn13.setText("");
        btn14.setText("");
        btn15.setText("");
        btn16.setText("");
        btn17.setText("");
        btn18.setText("");
        btn19.setText("");
        btn21.setText("");
        btn22.setText("");
        btn23.setText("");
        btn24.setText("");
        btn25.setText("");
        btn26.setText("");
        btn27.setText("");
        btn28.setText("");
        btn29.setText("");
        btn31.setText("");
        btn32.setText("");
        btn33.setText("");
        btn34.setText("");
        btn35.setText("");
        btn36.setText("");
        btn37.setText("");
        btn38.setText("");
        btn39.setText("");
        btn41.setText("");
        btn42.setText("");
        btn43.setText("");
        btn44.setText("");
        btn45.setText("");
        btn46.setText("");
        btn47.setText("");
        btn48.setText("");
        btn49.setText("");
        btn51.setText("");
        btn52.setText("");
        btn53.setText("");
        btn54.setText("");
        btn55.setText("");
        btn56.setText("");
        btn57.setText("");
        btn58.setText("");
        btn59.setText("");
        btn61.setText("");
        btn62.setText("");
        btn63.setText("");
        btn64.setText("");
        btn65.setText("");
        btn66.setText("");
        btn67.setText("");
        btn68.setText("");
        btn69.setText("");
        btn71.setText("");
        btn72.setText("");
        btn73.setText("");
        btn74.setText("");
        btn75.setText("");
        btn76.setText("");
        btn77.setText("");
        btn78.setText("");
        btn79.setText("");
        btn81.setText("");
        btn82.setText("");
        btn83.setText("");
        btn84.setText("");
        btn85.setText("");
        btn86.setText("");
        btn87.setText("");
        btn88.setText("");
        btn89.setText("");
        btn91.setText("");
        btn92.setText("");
        btn93.setText("");
        btn94.setText("");
        btn95.setText("");
        btn96.setText("");
        btn97.setText("");
        btn98.setText("");
        btn99.setText("");
    }
    
    
    private void btnCrearNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevoActionPerformed
        if (cantJuegos > 0){
            if (tipoFinalizacion == "autosolucion" || tipoFinalizacion == "exitosa"){
                tipoFinalizacion = "abandono";
            } else {
                tipoFinalizacion = "abandono";
                JOptionPane.showMessageDialog(null, "Tipo Finalizacion: "+tipoFinalizacion);
            }
        }
        resetearBotonesCasillas();
        juegoSudoku.crearNuevoJuego();
        juegoSudoku.repetirTablero();
        setTextCasillasNumeros();
        juegoSudoku.mostrarTableroTerminal();
        cantJuegos += 1;
        juegoSudoku.resetSugerencias();
        
        txtCantIngresos.setText("0");
        txtCantVerificaciones.setText("0");
        txtCantErrores.setText("0");
        txtCantSugerencias.setText("0");
        txtSugerenciasRestantes.setText("5");
    }//GEN-LAST:event_btnCrearNuevoActionPerformed

    /**
     * Objetivo: cambiar el texto de una casilla de boton especifica 
     * E: N/E
     * S: N/E
     * R: N/E
     */
    private void setTextCasillasNumeros(){
        for(int x=0;x<9;x++){
            for(int y=0;y<9;y++){
                String valor = juegoSudoku.getTableroInicialPos(x, y);
                String valorString;
                
                if (valor == "0"){
                    valorString = " ";
                } else {
                    valorString = valor;
                }
                String str1 = Integer.toString(x+1);
                String str2 = Integer.toString(y+1);
                String posString = str1 + str2;
                setTextCasillasNumerosAux(posString, valorString);
            }
        }
    }
    
    private void setTextCasillasNumerosAux(String casilla, String valor){
        switch (casilla){
            case "11":
                btn11.setText(valor);
                break;
            case "12":
                btn12.setText(valor);
                break;
            case "13":
                btn13.setText(valor);
                break;
            case "14":
                btn14.setText(valor);
                break;
            case "15":
                btn15.setText(valor);
                break;
            case "16":
                btn16.setText(valor);
                break;
            case "17":
                btn17.setText(valor);
                break;
            case "18":
                btn18.setText(valor);
                break;
            case "19":
                btn19.setText(valor);
                break;
            case "21":
                btn21.setText(valor);
                break;
            case "22":
                btn22.setText(valor);
                break;
            case "23":
                btn23.setText(valor);
                break;
            case "24":
                btn24.setText(valor);
                break;
            case "25":
                btn25.setText(valor);
                break;
            case "26":
                btn26.setText(valor);
                break;
            case "27":
                btn27.setText(valor);
                break;
            case "28":
                btn28.setText(valor);
                break;
            case "29":
                btn29.setText(valor);
                break;
            case "31":
                btn31.setText(valor);
                break;
            case "32":
                btn32.setText(valor);
                break;
            case "33":
                btn33.setText(valor);
                break;
            case "34":
                btn34.setText(valor);
                break;
            case "35":
                btn35.setText(valor);
                break;
            case "36":
                btn36.setText(valor);
                break;
            case "37":
                btn37.setText(valor);
                break;
            case "38":
                btn38.setText(valor);
                break;
            case "39":
                btn39.setText(valor);
                break;
            case "41":
                btn41.setText(valor);
                break;
            case "42":
                btn42.setText(valor);
                break;
            case "43":
                btn43.setText(valor);
                break;
            case "44":
                btn44.setText(valor);
                break;
            case "45":
                btn45.setText(valor);
                break;
            case "46":
                btn46.setText(valor);
                break;
            case "47":
                btn47.setText(valor);
                break;
            case "48":
                btn48.setText(valor);
                break;
            case "49":
                btn49.setText(valor);
                break;
            case "51":
                btn51.setText(valor);
                break;
            case "52":
                btn52.setText(valor);
                break;
            case "53":
                btn53.setText(valor);
                break;
            case "54":
                btn54.setText(valor);
                break;
            case "55":
                btn55.setText(valor);
                break;
            case "56":
                btn56.setText(valor);
                break;
            case "57":
                btn57.setText(valor);
                break;
            case "58":
                btn58.setText(valor);
                break;
            case "59":
                btn59.setText(valor);
                break;
            case "61":
                btn61.setText(valor);
                break;
            case "62":
                btn62.setText(valor);
                break;
            case "63":
                btn63.setText(valor);
                break;
            case "64":
                btn64.setText(valor);
                break;
            case "65":
                btn65.setText(valor);
                break;
            case "66":
                btn66.setText(valor);
                break;
            case "67":
                btn67.setText(valor);
                break;
            case "68":
                btn68.setText(valor);
                break;
            case "69":
                btn69.setText(valor);
                break;
            case "71":
                btn71.setText(valor);
                break;
            case "72":
                btn72.setText(valor);
                break;
            case "73":
                btn73.setText(valor);
                break;
            case "74":
                btn74.setText(valor);
                break;
            case "75":
                btn75.setText(valor);
                break;
            case "76":
                btn76.setText(valor);
                break;
            case "77":
                btn77.setText(valor);
                break;
            case "78":
                btn78.setText(valor);
                break;
            case "79":
                btn79.setText(valor);
                break;
            case "81":
                btn81.setText(valor);
                break;
            case "82":
                btn82.setText(valor);
                break;
            case "83":
                btn83.setText(valor);
                break;
            case "84":
                btn84.setText(valor);
                break;
            case "85":
                btn85.setText(valor);
                break;
            case "86":
                btn86.setText(valor);
                break;
            case "87":
                btn87.setText(valor);
                break;
            case "88":
                btn88.setText(valor);
                break;
            case "89":
                btn89.setText(valor);
                break;
            case "91":
                btn91.setText(valor);
                break;
            case "92":
                btn92.setText(valor);
                break;
            case "93":
                btn93.setText(valor);
                break;
            case "94":
                btn94.setText(valor);
                break;
            case "95":
                btn95.setText(valor);
                break;
            case "96":
                btn96.setText(valor);
                break;
            case "97":
                btn97.setText(valor);
                break;
            case "98":
                btn98.setText(valor);
                break;
            case "99":
                btn99.setText(valor);
                break;
        }
    }
    
    private void btnNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero1ActionPerformed
        int value = 1;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero1ActionPerformed

    private void btnNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero2ActionPerformed
        int value = 2;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero2ActionPerformed
    
    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn22;
        posX = 2;
        posY = 2;
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn21;
        posX = 2;
        posY = 1;
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn32;
        posX = 3;
        posY = 2;
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn33;
        posX = 3;
        posY = 3;
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn34;
        posX = 3;
        posY = 4;
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn36;
        posX = 3;
        posY = 6;
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn61ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn61;
        posX = 6;
        posY = 1;
    }//GEN-LAST:event_btn61ActionPerformed

    private void btn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn62ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn62;
        posX = 6;
        posY = 2;
    }//GEN-LAST:event_btn62ActionPerformed

    private void btnNumero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero0ActionPerformed
        int value = 0;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero0ActionPerformed

    private void btnNumero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero3ActionPerformed
        int value = 3;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero3ActionPerformed

    private void btnNumero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero4ActionPerformed
        int value = 4;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero4ActionPerformed

    private void btnNumero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero5ActionPerformed
        int value = 5;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero5ActionPerformed

    private void btnNumero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero6ActionPerformed
        int value = 6;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero6ActionPerformed

    private void btnNumero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero7ActionPerformed
        int value = 7;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero7ActionPerformed

    private void btnNumero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero8ActionPerformed
        int value = 8;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero8ActionPerformed

    private void btnNumero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumero9ActionPerformed
        int value = 9;
        rellenarCasilla(value);
    }//GEN-LAST:event_btnNumero9ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn13;
        posX = 1;
        posY = 3;
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn14;
        posX = 1;
        posY = 4;
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn15;
        posX = 1;
        posY = 5;
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn16;
        posX = 1;
        posY = 6;
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn17;
        posX = 1;
        posY = 7;
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn18;
        posX = 1;
        posY = 8;
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn19;
        posX = 1;
        posY = 9;
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn12;
        posX = 1;
        posY = 2;
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn23;
        posX = 2;
        posY = 3;
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn24;
        posX = 2;
        posY = 4;
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn25;
        posX = 2;
        posY = 5;
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn26;
        posX = 2;
        posY = 6;
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn27;
        posX = 2;
        posY = 7;
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn28;
        posX = 2;
        posY = 8;
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn29;
        posX = 2;
        posY = 9;
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn31;
        posX = 3;
        posY = 1;
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn35;
        posX = 3;
        posY = 5;
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn37;
        posX = 3;
        posY = 7;
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn38;
        posX = 3;
        posY = 8;
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn39;
        posX = 3;
        posY = 9;
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn41;
        posX = 4;
        posY = 1;
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn42;
        posX = 4;
        posY = 2;
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn43;
        posX = 4;
        posY = 3;
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn44;
        posX = 4;
        posY = 4;
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn45;
        posX = 4;
        posY = 5;
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn46;
        posX = 4;
        posY = 6;
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn47;
        posX = 4;
        posY = 7;
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn48;
        posX = 4;
        posY = 8;
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn49;
        posX = 4;
        posY = 9;
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn51;
        posX = 5;
        posY = 1;
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn52;
        posX = 5;
        posY = 2;
    }//GEN-LAST:event_btn52ActionPerformed

    private void btn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn53;
        posX = 5;
        posY = 3;
    }//GEN-LAST:event_btn53ActionPerformed

    private void btn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn54;
        posX = 5;
        posY = 4;
    }//GEN-LAST:event_btn54ActionPerformed

    private void btn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn55;
        posX = 5;
        posY = 5;
    }//GEN-LAST:event_btn55ActionPerformed

    private void btn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn56;
        posX = 5;
        posY = 6;
    }//GEN-LAST:event_btn56ActionPerformed

    private void btn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn57ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn57;
        posX = 5;
        posY = 7;
    }//GEN-LAST:event_btn57ActionPerformed

    private void btn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn58ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn58;
        posX = 5;
        posY = 8;
    }//GEN-LAST:event_btn58ActionPerformed

    private void btn59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn59ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn59;
        posX = 5;
        posY = 9;
    }//GEN-LAST:event_btn59ActionPerformed

    private void btn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn63ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn63;
        posX = 6;
        posY = 3;
    }//GEN-LAST:event_btn63ActionPerformed

    private void btn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn64ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn64;
        posX = 6;
        posY = 4;
    }//GEN-LAST:event_btn64ActionPerformed

    private void btn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn65ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn65;
        posX = 6;
        posY = 5;
    }//GEN-LAST:event_btn65ActionPerformed

    private void btn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn66ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn66;
        posX = 6;
        posY = 6;
    }//GEN-LAST:event_btn66ActionPerformed

    private void btn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn67ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn67;
        posX = 6;
        posY = 7;
    }//GEN-LAST:event_btn67ActionPerformed

    private void btn68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn68ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn68;
        posX = 6;
        posY = 8;
    }//GEN-LAST:event_btn68ActionPerformed

    private void btn69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn69ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn69;
        posX = 6;
        posY = 9;
    }//GEN-LAST:event_btn69ActionPerformed

    private void btn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn71ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn71;
        posX = 7;
        posY = 1;
    }//GEN-LAST:event_btn71ActionPerformed

    private void btn72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn72ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn72;
        posX = 7;
        posY = 2;
    }//GEN-LAST:event_btn72ActionPerformed

    private void btn73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn73ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn73;
        posX = 7;
        posY = 3;
    }//GEN-LAST:event_btn73ActionPerformed

    private void btn74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn74ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn74;
        posX = 7;
        posY = 4;
    }//GEN-LAST:event_btn74ActionPerformed

    private void btn75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn75ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn75;
        posX = 7;
        posY = 5;
    }//GEN-LAST:event_btn75ActionPerformed

    private void btn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn76ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn76;
        posX = 7;
        posY = 6;
    }//GEN-LAST:event_btn76ActionPerformed

    private void btn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn77ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn77;
        posX = 7;
        posY = 7;
    }//GEN-LAST:event_btn77ActionPerformed

    private void btn78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn78ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn78;
        posX = 7;
        posY = 8;
    }//GEN-LAST:event_btn78ActionPerformed

    private void btn79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn79ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn79;
        posX = 7;
        posY = 9;
    }//GEN-LAST:event_btn79ActionPerformed

    private void btn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn81ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn81;
        posX = 8;
        posY = 1;
    }//GEN-LAST:event_btn81ActionPerformed

    private void btn82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn82ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn82;
        posX = 8;
        posY = 2;
    }//GEN-LAST:event_btn82ActionPerformed

    private void btn83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn83ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn83;
        posX = 8;
        posY = 3;
    }//GEN-LAST:event_btn83ActionPerformed

    private void btn84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn84ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn84;
        posX = 8;
        posY = 4;
    }//GEN-LAST:event_btn84ActionPerformed

    private void btn85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn85ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn85;
        posX = 8;
        posY = 5;
    }//GEN-LAST:event_btn85ActionPerformed

    private void btn86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn86ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn86;
        posX = 8;
        posY = 6;
    }//GEN-LAST:event_btn86ActionPerformed

    private void btn87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn87ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn87;
        posX = 8;
        posY = 7;
    }//GEN-LAST:event_btn87ActionPerformed

    private void btn88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn88ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn88;
        posX = 8;
        posY = 8;
    }//GEN-LAST:event_btn88ActionPerformed

    private void btn89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn89ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn89;
        posX = 8;
        posY = 9;
    }//GEN-LAST:event_btn89ActionPerformed

    private void btn91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn91ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn91;
        posX = 9;
        posY = 1;
    }//GEN-LAST:event_btn91ActionPerformed

    private void btn92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn92ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn92;
        posX = 9;
        posY = 2;
    }//GEN-LAST:event_btn92ActionPerformed

    private void btn93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn93ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn93;
        posX = 9;
        posY = 3;
    }//GEN-LAST:event_btn93ActionPerformed

    private void btn94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn94ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn94;
        posX = 9;
        posY = 4;
    }//GEN-LAST:event_btn94ActionPerformed

    private void btn95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn95ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn95;
        posX = 9;
        posY = 5;
    }//GEN-LAST:event_btn95ActionPerformed

    private void btn96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn96ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn96;
        posX = 9;
        posY = 6;
    }//GEN-LAST:event_btn96ActionPerformed

    private void btn97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn97ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn97;
        posX = 9;
        posY = 7;
    }//GEN-LAST:event_btn97ActionPerformed

    private void btn98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn98ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn98;
        posX = 9;
        posY = 8;
    }//GEN-LAST:event_btn98ActionPerformed

    private void btn99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn99ActionPerformed
        habilitarBotonesNumeros();
        casilla = btn99;
        posX = 9;
        posY = 9;
    }//GEN-LAST:event_btn99ActionPerformed

    private void btnSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSugerenciaActionPerformed
        if (juegoSudoku.getSugerenciasTotal() == 5){
            JOptionPane.showMessageDialog(null, "No se pueden solicitar más de 5 sugerencias por juego");
        } else {
            //muestra sugerencia
            juegoSudoku.updateSugerencias();
            int numRestantes = Integer.parseInt(txtSugerenciasRestantes.getText())-1;
            txtSugerenciasRestantes.setText(Integer.toString(numRestantes));
        }
        int x = juegoSudoku.getSugerenciasTotal();
        String str = Integer.toString(x);
        txtCantSugerencias.setText(str);
    }//GEN-LAST:event_btnSugerenciaActionPerformed

    private void btnSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionActionPerformed
        tipoFinalizacion = "autosolucion";
        juegoSudoku.solucionarSudoku();
        for (int x=0; x<9; x++){
            for (int y=0; y<9; y++){
                String str1 = Integer.toString(x+1);
                String str2 = Integer.toString(y+1);
                String casilla = str1 + str2;
                String valor = juegoSudoku.getTableroPos(x, y);
                setTextCasillasNumerosAux(casilla, valor);
            }
        }
        JOptionPane.showMessageDialog(null, "Tipo Finalización: autosolución");
    }//GEN-LAST:event_btnSolucionActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        resetearBotonesCasillas();
        juegoSudoku.resetearTablero();
        juegoSudoku.repetirTablero();
        setTextCasillasNumeros();
        
        juegoSudoku.resetSugerencias();
        
        txtCantIngresos.setText("0");
        txtCantVerificaciones.setText("0");
        txtCantErrores.setText("0");
        txtCantSugerencias.setText("0");
        txtSugerenciasRestantes.setText("5");
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        System.out.println(juegoSudoku.crearStringMatrizTablero());
        System.out.println(juegoSudoku.crearStringMatrizSolucion());
        
        String cantVacios = juegoSudoku.contarVacios();
        String cantErrores = juegoSudoku.contarErrores();
        
        int cantVaciosInt = Integer.parseInt(cantVacios);
        int cantErroresInt = Integer.parseInt(cantErrores);
        
        int total = cantErroresInt - cantVaciosInt;
        
        if (cantErroresInt == 0){
            tipoFinalizacion = "exitosa";
            JOptionPane.showMessageDialog(null, "Juego finalizado exitosamente, felicidades!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Casillas vacias: "+cantVacios+"\nDigitos incorectos: "+total);
            int valueX = Integer.parseInt(txtCantErrores.getText());
            valueX += 1;
            txtCantErrores.setText(Integer.toString(valueX));
        }
        int value = Integer.parseInt(txtCantVerificaciones.getText());
        value += 1;
        txtCantVerificaciones.setText(Integer.toString(value));
        
    }//GEN-LAST:event_btnVerificarActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JButton btn67;
    private javax.swing.JButton btn68;
    private javax.swing.JButton btn69;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn72;
    private javax.swing.JButton btn73;
    private javax.swing.JButton btn74;
    private javax.swing.JButton btn75;
    private javax.swing.JButton btn76;
    private javax.swing.JButton btn77;
    private javax.swing.JButton btn78;
    private javax.swing.JButton btn79;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn82;
    private javax.swing.JButton btn83;
    private javax.swing.JButton btn84;
    private javax.swing.JButton btn85;
    private javax.swing.JButton btn86;
    private javax.swing.JButton btn87;
    private javax.swing.JButton btn88;
    private javax.swing.JButton btn89;
    private javax.swing.JButton btn91;
    private javax.swing.JButton btn92;
    private javax.swing.JButton btn93;
    private javax.swing.JButton btn94;
    private javax.swing.JButton btn95;
    private javax.swing.JButton btn96;
    private javax.swing.JButton btn97;
    private javax.swing.JButton btn98;
    private javax.swing.JButton btn99;
    private javax.swing.JButton btnCrearNuevo;
    private javax.swing.JButton btnNumero0;
    private javax.swing.JButton btnNumero1;
    private javax.swing.JButton btnNumero2;
    private javax.swing.JButton btnNumero3;
    private javax.swing.JButton btnNumero4;
    private javax.swing.JButton btnNumero5;
    private javax.swing.JButton btnNumero6;
    private javax.swing.JButton btnNumero7;
    private javax.swing.JButton btnNumero8;
    private javax.swing.JButton btnNumero9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSolucion;
    private javax.swing.JButton btnSugerencia;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel parentesis1;
    private javax.swing.JLabel parentesis2;
    private javax.swing.JLabel txtCantErrores;
    private javax.swing.JLabel txtCantIngresos;
    private javax.swing.JLabel txtCantSugerencias;
    private javax.swing.JLabel txtCantVerificaciones;
    private javax.swing.JLabel txtCeldas;
    private javax.swing.JLabel txtErrores;
    private javax.swing.JLabel txtSugerencias;
    private javax.swing.JLabel txtSugerenciasRestantes;
    private javax.swing.JLabel txtVerificaciones;
    // End of variables declaration//GEN-END:variables
}

    /**
     * Objetivo: 
     * E:
     * S:
     * R:
     */