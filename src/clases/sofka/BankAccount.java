package clases.sofka;

/**
 * @author Juan Carlos Gómez Jaramillo
 * Clase clases.sofka.BankAccount propuesta en ejercicio taller 1 cantera 2
 **/

public class BankAccount {
    private int accountNumber;
    protected boolean actived;

    /***
     * metodo pora obtener el valor del atributo accountNumber
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * metodo para fijar el valor del atributo accountNumber
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * metodo que returna un valor logico para el atributo actived
     * @return
     */
    public boolean isActived() {
        return actived;
    }

    /**
     * metodo para fijar el valor del atributo actived
     * @param actived
     */

    public void setActived(boolean actived) {
        this.actived = actived;
    }
}
