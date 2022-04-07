package clases.sofka;


/**
 * @author Juan Carlos Gomez Jaramillo
 */
public class CellPhone {
    public String brand;
    public String color;
    private double price;
    private String contacts;
    public String message;

    /**
     * metodo que retunra un mensaje
     * @param message
     * @return
     */

    public String sendMessage(String message){
        return message;
    }

    /**
     * metodo que recibe un mensaje
     */
    public void reciveMessage(){
        System.out.println("mensaje: hola");
    }

    /**
     * metodo para realizar una llamada
     */
    public void makeCall(){

    }

    /**
     * metodo para recivir una llamada
     */
    public void receiveCall(){

    }

    /**
     * metodo para cargar saldo que retorna el saldo cargado
     * @param charge
     * @return
     */
    private double chargeSald(double charge){
        return charge;
    }
}
