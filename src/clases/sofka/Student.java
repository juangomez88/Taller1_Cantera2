package clases.sofka;

public class Student {
    /**
     * @author Juan Carlos Gomez Jaramillo
     *Atributos de la clase Student del paquete clases.sofka
     */

    public String name;
    public String lastName;
    protected double average;
    private int note1;
    private int note2;
    private int note3;

    /**
     * métodos getter and setters
     * En el diagrama se proponen unicamente estos métodos para el atributo Name.
     * Genero los metodos getter and setter para todos los atributos propuestos
     */


    /**
     * Meetodo que retorna el valor del atributo averege
     * @return
     */
    public double getAverage() {
        return average;
    }

    /**
     *metodo que fija el valor para el atributo average
     * @param average
     */

    public void setAverage(double average) {
        this.average = average;
    }

    /**
     *retorna el valor del atributo note1
     * @return
     */
    public int getNote1() {
        return note1;
    }

    /**
     *metodo que fija el valor del atributo note1
     * @param note1
     */
    public void setNote1(int note1) {
        this.note1 = note1;
    }

    /**
     *retorna el valor del atributo note2
     * @return
     */
    public int getNote2() {
        return note2;
    }

    /**
     *metodo que fija el valor del atributo note2
     * @param note2
     */
    public void setNote2(int note2) {
        this.note2 = note2;
    }

    /**
     *retorna el valor del atributo note3
     * @return
     */
    public int getNote3() {
        return note3;
    }

    /**
     *metodo que fija el valor del atributo note3
     * @param note3
     */
    public void setNote3(int note3) {
        this.note3 = note3;
    }
}
