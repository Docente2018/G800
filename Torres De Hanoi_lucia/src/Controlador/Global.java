package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Modelo.Argolla;
import Modelo.Torre_Uno;
import Modelo.Torres;

//Clase que representa el mundo de las torres

public class Global extends JPanel implements ActionListener, MouseListener {

    /**
     * variable que aplica la clase de torres de hanoi
     */
    Torres hanoi;

    /**
     * Numero de aros con los que se va jugar en las torres de hanoi
     */
    int aros;

    /**
     * variable que cuenta el numero de pasos echos por el jugador
     */
    int numeroDePasos;

    /**
     * El numero de aros con los que se esta jugando
     */
    int arosJuego;
    
    //torres
    Torre_Uno torre1;
    Torre_Uno torre2;
    Torre_Uno torre3;

    /**
     * Boton iniciar
     */
    JButton iniciar;

    /**
     * ComboBox que se usa para seleccionar el numero de aros
     */
    JComboBox numeroAros;

    //etiquetas
    JLabel pasosEchos;
    JLabel labelPasos;
    JLabel numeroDeAros;
    JLabel nombreTorre1;
    JLabel nombreTorre2;
    JLabel nombreTorre3;

    JButton resolver;

    //para mover el aro
    boolean seleccionado;
    Argolla aroMover;

    /**
     * Constructor de la clase mundo
     */
    public Global() throws IOException {
        numeroDePasos = 0;
        aros = 3;
        aroMover = null;
        seleccionado = false;
        hanoi = new Torres();
        hanoi.hanoi(aros, 1, 2, 3);
        arosJuego=3;
        
        this.setBackground(Color.WHITE);

        this.setLayout(null);

        //label que muestra el numero de pasos optimos para resolver el juego
        labelPasos = new JLabel("Minimo de Movimientos: " + hanoi.getContador());
        labelPasos.setBounds(700, 130, 180, 10);
        this.add(labelPasos);

        //Label que muestra el numero de pasos que ah echo el jugador
        pasosEchos = new JLabel("Tu número de movimientos: ");
        pasosEchos.setBounds(700, 150, 180, 10);
        this.add(pasosEchos);

        //torre1
        torre1 = new Torre_Uno();
        torre1.setBounds(0, 10, 220, 300);
        torre1.addMouseListener(this);
        agregarAros(3);
        this.add(torre1);

        nombreTorre1 = new JLabel("TORRE UNO");
        nombreTorre1.setBounds(80, 0, 150, 10);
        this.add(nombreTorre1);

        //torre2
        torre2 = new Torre_Uno();
        torre2.setBounds(220, 10, 220, 300);
        torre2.addMouseListener(this);
        this.add(torre2);

        nombreTorre2 = new JLabel("TORRE DOS");
        nombreTorre2.setBounds(300, 0, 150, 10);
        this.add(nombreTorre2);

        //torre3
        torre3 = new Torre_Uno();
        torre3.setBounds(440, 10, 220, 300);
        torre3.addMouseListener(this);
        this.add(torre3);

        nombreTorre3 = new JLabel("TORRE TRES");
        nombreTorre3.setBounds(520, 0, 150, 10);
        this.add(nombreTorre3);

        //label numero de aros
        numeroDeAros = new JLabel("Numero de aros:");
        numeroDeAros.setBounds(700, 60, 150, 20);
        this.add(numeroDeAros);

        //boton resolver 
        resolver = new JButton("Solucion");
        resolver.setBounds(700, 200, 90, 30);
        resolver.addActionListener(this);
        this.add(resolver);

        //boton iniciar
        iniciar = new JButton("Inicio");
        iniciar.setBounds(800, 80, 90, 30);
        iniciar.addActionListener(this);
        this.add(iniciar);

        //JcomboBox
        numeroAros = new JComboBox();
        //llenar el jcomboBox
        for (int i = 3; i <= 8; i++) {
            numeroAros.addItem(i);
        }
        numeroAros.setBounds(700, 80, 90, 30);
        this.add(numeroAros);
    }

    /**
     * Método que Agrega el numero determinado de Aros
     *
     * @param n, nuemro de aros que se van a agregar a la torre
     */
    public void agregarAros(int n) {

        String nombreAro = "aro";

        Argolla aro = new Argolla();
        aro.setBounds(90, 250, 45, 20);
        aro.addMouseListener((MouseListener) this);
        torre1.add(aro);
        torre1.updateUI();

        for (int i = 1; i <= n - 1; i++) {
            torre1.add(new Argolla());
            torre1.getComponent(i).addMouseListener(this);
        }

        organizar(n);

        torre1.updateUI();

    }

    /**
     * Método que sirve para que los aros queden ordenados desde el mas grande
     * hasta el mas pequeño
     *
     * @param n, el numero de aros que hay en las torres de hanoi
     */
    public void organizar(int n) {
        if (n >= 0) {
            for (int j = 1; j <= n - 1; j++) {

                //panel Anterior
                JPanel anterior = (JPanel) torre1.getComponent(j - 1);
                //posiciones y tamaño del aro anterior
                int x = anterior.getX();
                int y = anterior.getY();
                int w = anterior.getWidth();
                int h = anterior.getHeight();

                //Panel que se va a modificar
                JPanel aroA = (JPanel) torre1.getComponent(j);
                aroA.setBounds(x, y - h, w, h);
                anterior.setBounds(x - 10, y, w + 20, h);
                torre1.setComponentZOrder(aroA, j);
                torre1.setComponentZOrder(anterior, j - 1);

            }
            organizar(n - 1);
        }

    }

    /**
     * Metodo del evento del boton iniciar
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iniciar) {
            try {
                numeroDePasos = 0;
                int n = (int) numeroAros.getSelectedItem();
                arosJuego=n;
                hanoi.setContador(0);
                aros = n;
                hanoi.setContador(0);
                //calcula la solucion optima para resolver el juego
                hanoi.hanoi(n, 1, 2, 3);
                

                int pasosMinimos = hanoi.getContador();

                //actualiza el Label minimo de pasos
                labelPasos.setText("Minimo de Movimientos: " + pasosMinimos);

                //eliminar los aros de las torres
                torre1.removeAll();
                torre2.removeAll();
                torre3.removeAll();

                //redibujar las torres
                torre1.updateUI();
                torre2.updateUI();
                torre3.updateUI();

                hanoi.setContador(0);
                pasosEchos.setText("Tu numero de movimientos: ");
                agregarAros(n);

            } catch (IOException ex) {
                Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == resolver) {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            if(guarda!=null){
                try {
                    
                    hanoi.hanoi(arosJuego, 1, 2, 3);
                    hanoi.guardarSolucion(guarda);
                } catch (IOException ex) {
                    Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * Metodo que muestra las acciones cuando doy clicks entre las torres para
     * poder mover un aro
     *
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        //mover de la torre 1 a otra torre
        if (torre1.getComponentCount() > 0) {
            if (e.getSource() == torre1.getComponent(torre1.getComponentCount() - 1) && seleccionado == false) {
                //aro que voy a mover
                aroMover = (Argolla) torre1.getComponent(torre1.getComponentCount() - 1);
                seleccionado = true;
                //elimino el aro de la torre
                torre1.remove(torre1.getComponentCount() - 1);
                torre1.updateUI();
            }
        }
        //mover de la torre 2 a otra torre
        if (torre2.getComponentCount() > 0) {
            if (e.getSource() == torre2.getComponent(torre2.getComponentCount() - 1) && seleccionado == false) {

                //aro que voy a mover
                aroMover = (Argolla) torre2.getComponent(torre2.getComponentCount() - 1);
                seleccionado = true;
                //elimino el aro de la torre
                torre2.remove(torre2.getComponentCount() - 1);
                torre2.updateUI();
            }
        }

        //mover de la torre 3 a otra torre
        if (torre3.getComponentCount() > 0) {
            if (e.getSource() == torre3.getComponent(torre3.getComponentCount() - 1) && seleccionado == false) {
                //aro que voy a mover
                aroMover = (Argolla) torre3.getComponent(torre3.getComponentCount() - 1);
                seleccionado = true;
                //elimino el aro de la torre
                torre3.remove(torre3.getComponentCount() - 1);
                torre3.updateUI();
            }
        }

        //para soltar un aro en la torre 1 una vez echo click en un aro de otra torre
        if (e.getSource() == torre1 && seleccionado == true) {
            if (aroMover != null) {
                //guardar el ancho y alto para acomodar
                int x = aroMover.getX();//posicion en x
                int h = aroMover.getHeight();//altura
                int w = aroMover.getWidth();//anchura
                if (torre1.getComponentCount() == 0) {

                    //acomodar el aro que entra
                    aroMover.setBounds(x, 250, w, h);

                    torre1.add(aroMover);
                    torre1.updateUI();
                    numeroDePasos++;
                    aroMover = null;
                    seleccionado = false;

                } else {

                    //ultimo aro que hay en la torre
                    Argolla aroPresente = (Argolla) torre1.getComponent(torre1.getComponentCount() - 1);
                    //si retorna true
                    if (verificar(aroPresente, aroMover)) {

                        aroMover.setBounds(x, 250 - (20 * torre1.getComponentCount() - 1), w, 20);
                        torre1.add(aroMover);
                        torre1.updateUI();
                        numeroDePasos++;
                        aroMover = null;
                        seleccionado = false;

                    } else {
                        JOptionPane.showMessageDialog(null, "Movimiento no valido");
                    }
                }
            }
        }

        //para soltar un aro en la torre 2 una vez echo click en un aro de otra torre
        if (e.getSource() == torre2 && seleccionado == true) {
            if (aroMover != null) {
                //guardar el ancho y alto para acomodar
                int x = aroMover.getX();//posicion en x
                int w = aroMover.getWidth();//anchura
                if (torre2.getComponentCount() == 0) {

                    //acomodar el aro que entra
                    aroMover.setBounds(x, 250, w, 20);

                    torre2.add(aroMover);
                    torre2.updateUI();

                    //contador que aumento para contar el numero de pasos del usuario
                    numeroDePasos++;

                    //Para actualizar el Label de numero de pasos que hace el jugador
                    pasosEchos.setText("Tu número de movimientos: " + numeroDePasos);

                    aroMover = null;
                    seleccionado = false;

                } else {
                    //ultimo aro que hay en la torre
                    Argolla aroPresente = (Argolla) torre2.getComponent(torre2.getComponentCount() - 1);

                    //si retorna true
                    if (verificar(aroPresente, aroMover)) {

                        aroMover.setBounds(x, 250 - (20 * torre2.getComponentCount() - 1), w, 20);
                        torre2.add(aroMover);
                        torre2.updateUI();

                        //contador que aumento para contar el numero de pasos del usuario
                        numeroDePasos++;

                        //Para actualizar el Label de numero de pasos que hace el jugador
                        pasosEchos.setText("Tu número de movimientos: " + numeroDePasos);

                        aroMover = null;
                        seleccionado = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Movimiento no valido");
                    }
                }
            }
        }

        //para soltar un aro en la torre 3 una vez echo click en un aro de la otra torre
        if (e.getSource() == torre3 && seleccionado == true) {
            if (aroMover != null) {

                //guardar el ancho y alto para acomodar
                int x = aroMover.getX();//posicion en x
                int h = aroMover.getHeight();//altura
                int w = aroMover.getWidth();//anchura
                if (torre3.getComponentCount() == 0) {

                    //acomodar el aro que entra
                    aroMover.setBounds(x, 250, w, h);

                    torre3.add(aroMover);
                    torre3.updateUI();
                    aroMover = null;

                    //contador que aumento para contar el numero de pasos del usuario
                    numeroDePasos++;

                    //Para actualizar el Label de numero de pasos que hace el jugador
                    pasosEchos.setText("Tu numero de movimientos: " + numeroDePasos);

                    seleccionado = false;

                } else {

                    //ultimo aro que hay en la torre
                    Argolla aroPresente = (Argolla) torre3.getComponent(torre3.getComponentCount() - 1);
                    //si retorna true
                    if (verificar(aroPresente, aroMover)) {

                        aroMover.setBounds(x, 250 - (20 * torre3.getComponentCount() - 1), w, 20);
                        torre3.add(aroMover);
                        torre3.updateUI();

                        //contador que aumento para contar el numero de pasos del usuario
                        numeroDePasos++;

                        //Para actualizar el Label de numero de pasos que hace el jugador
                        pasosEchos.setText("Tu numero de movimientos: " + numeroDePasos);

                        aroMover = null;
                        seleccionado = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Movimiento no valido");
                    }
                }
            }
        }

        if (e.getSource() == torre3) {
            if (hanoi.verificarFinalJuego(aros, torre3.getComponentCount()) == true) {
                JOptionPane.showMessageDialog(null, "El juego a finalizado");

                System.out.println(numeroDePasos);

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

   //Meotodo para verificar disco  que se va a poner es mas pequeño que el
    public boolean verificar(Argolla aroPresente, Argolla aroAMover) {
        //ancho del aro que hay en la torre
        int w = aroPresente.getWidth();
        //ancho del aro que se quiere poner
        int w2 = aroAMover.getWidth();

        if (w > w2) {
            return true;
        } else {
            return false;
        }
    }
}
