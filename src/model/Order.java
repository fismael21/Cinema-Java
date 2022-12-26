
package model;

import java.util.LinkedList;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class Order {
    private Movie pelicula;
    private Ticket ticket;
    private Payment pago;
    private LinkedList<Seat> asientos;
    private int numBoletos;
    private String dia;
    private String mes;
    private String hora;
    private String tipoDeFuncion = "";
    private double costoTotal;
    
    private final double CLASICO = 43.00;
    private final double CUATRODX = 73.00;
    private final double TRESD = 62.00;
    
    public Order(Movie pelicula, Ticket ticket, LinkedList<Seat> asientos, int numBoletos, String dia, String mes, String hora, String tipoDeFuncion) {
        this.pelicula = pelicula;
        this.ticket = ticket;
        this.asientos = asientos;
        this.numBoletos = numBoletos;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.tipoDeFuncion = tipoDeFuncion;
    }
    
    public Order(Movie pelicula, int numBoletos, String dia, String mes, String hora, String tipoDeFuncion) {
        this.pelicula = pelicula;
        this.numBoletos = numBoletos;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.tipoDeFuncion = tipoDeFuncion;
    }
    
    public Order(){
        
    }

    public Movie getPelicula() {
        return pelicula;
    }

    public void setPelicula(Movie pelicula) {
        this.pelicula = pelicula;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LinkedList<Seat> getAsientos() {
        return asientos;
    }

    public void setAsientos(LinkedList<Seat> asientos) {
        this.asientos = asientos;
    }

    public int getNumBoletos() {
        return numBoletos;
    }

    public void setNumBoletos(int numBoletos) {
        this.numBoletos = numBoletos;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoDeFuncion() {
        return tipoDeFuncion;
    }

    public void setTipoDeFuncion(String tipoDeFuncion) {
        this.tipoDeFuncion = tipoDeFuncion;
    }

    public Payment getPago() {
        return pago;
    }

    public void setPago(Payment pago) {
        this.pago = pago;
    }

    //CONSTANTES ---> COSTO BOLETOS
    public double getCLASICO() {
        return CLASICO;
    }

    public double getCUATRODX() {
        return CUATRODX;
    }

    public double getTRESD() {
        return TRESD;
    }
    
    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public String getFechaPelicula(){
        String fechaPelicula = "Fecha: 2022-" + mes + "-" + dia + "\nHora: " + hora;
        return fechaPelicula;
    }
    
}
