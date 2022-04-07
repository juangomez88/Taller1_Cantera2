package clases.sofka;

import java.util.ArrayList;

/**
 * @author Juan Carlos Gómez Jaramillo
 * Clase clases.sofka.Fruit propuesta en ejercicio taller 1 cantera 2
 * Se  importa de java.util.ArrayList para el array colors
 **/
public class Fruit {
    String name;
    float averageWeigth;
    ArrayList<String> colors = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeigth() {
        return averageWeigth;
    }

    public void setAverageWeigth(float averageWeigth) {
        this.averageWeigth = averageWeigth;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
