
package interfaces;

/**
 *
 * @author maikol
 */
public class ventaCatalogo implements TipoDescuento{

     private final int DESCUENTO=20;
     
     private double descuento=0;

    public ventaCatalogo() {
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
     
  
    @Override
    public double TipoDescuento(Venta venta) {
       
        if(venta.getTotalVenta() > 10000){
           descuento= (venta.getTotalVenta() * 20 /100);
        }
        
        
        return descuento;
    }
    
    public void imprimir(){
        
        System.out.println("hola "+ descuento);
    }
    
}
