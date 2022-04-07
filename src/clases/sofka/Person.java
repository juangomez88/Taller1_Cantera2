package clases.sofka;

import java.util.Date;

/**
 * @author Juan Carlos Gómez Jaramillo
 * Clase clases.sofka.Person propuesta en ejercicio taller 1 cantera 2
 * Se importa de java.util.Date para el atributo fecha (dateBirth)
 **/
public class Person {
    /**
     * Atributos de la clase clases.sofka.Person
     */
    String name;
    String lastName1;
    String lastName2;
    Date dateBirth;
    float height;

    /**
     * métodos getter and setters
     * En el diagrama se proponen unicamente estos métodos para el atributo Name.
     * Genero los metodos getter and setter para todos los atributos propuestos
     */

    /**
     * Método para obtener el atributo nombre
     **/
    public String getName() {
        return name;
    }
    /**
     * Método para fijar el atributo nombre
     **/
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Método para obtener el atributo apellido1
     **/
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Método para fijar el atributo apellido1
     **/
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Método para obtener el atributo apellido2
     **/
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Método para fijar el atributo aepllido2
     * */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Método para obtener el atributo fecha cumpleaños
     **/
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Método para fijar el atributo fecha cumpleaños
     **/
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Metodo para obtener el atributo altura
     **/
    public float getHeight() {
        return height;
    }

    /**
     * Metodo para fijar el atributo altura
     **/
    public void setHeight(float height) {
        this.height = height;
    }
}
