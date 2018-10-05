package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Torre_Uno extends JPanel {

      
    // Metodo Constructor de la clase torre
    
    public Torre_Uno() {
        this.setLayout(null);
    }

    // Metodo que dibuja la torre en el panel
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLACK);
        
        //base
        g.fillRect(10, 270, 200,5);
        
        //asta
        g.fillRect(110, 30, 5, 240);
        
    }
}
