package clases.sofka;

public class Calculator {

    /**
     *  @author Juan Carlos Gomez Jarramillo
     */

    /**
     * atributos de la clase Calculator en paquete clases.sofka
     */
    public double number1;
    public double number2;
    public double amount;
    public double multiplication;
    public double division;
    protected double memory;


    /**
     *
     * metodo que realiza la suma de los parametros number1 y number2
     * @param number1
     * @param number2
     */
    public void amount(double number1, double number2) {
        this.amount = number1 + number2;
    }

    /**
     *
     * metodo que realiza la multiplicacion de los parametos number1 y number2
     * @param number1
     * @param number2
     */
    public void multiplication(double number1, double number2){
        this.multiplication = number1 * number2;
    }


    /**
     * metodo que realiza la division de los parametos number1 y number2
     * @param number1
     * @param number2
     */
    public void division(double number1, double number2){
        this.division = number1 * number2;
    }

    /**
     * metodo para obtener el valor de parametro memory
     * @return
     */
    public double getMemory() {
        return memory;
    }

    /**
     * metodo para fijar el valor del parametro memory
     * @param memory
     */
    public void setMemory(double memory) {
        this.memory = memory;
    }
}
