
package model;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class Payment {
    private String nomTitular;
    private String tipoDeTarjeta;
    private String numTarjeta;
    private int dia;
    private int mes;
    private int codigoDeSeguridad;
    
    public Payment(String nomTitular, String tipoDeTarjeta, String numTarjeta, int dia, int mes, int codigoDeSeguridad) {
        this.nomTitular = nomTitular;
        this.tipoDeTarjeta = tipoDeTarjeta;
        this.numTarjeta = numTarjeta;
        this.dia = dia;
        this.mes = mes;
        this.codigoDeSeguridad = codigoDeSeguridad;
    }
    
    public Payment(){
        
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public String getTipoDeTarjeta() {
        return tipoDeTarjeta;
    }

    public void setTipoDeTarjeta(String tipoDeTarjeta) {
        this.tipoDeTarjeta = tipoDeTarjeta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public void setCodigoDeSeguridad(int codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    @Override
    public String toString() {
        return "nomTitular: " + nomTitular + ", tipoDeTarjeta: " + tipoDeTarjeta + ", numTarjeta: " + numTarjeta + ", dia: " + dia + ", mes: " + mes + ", codigoDeSeguridad: " + codigoDeSeguridad + "\n";
    }
    
}
