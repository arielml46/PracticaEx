/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis Enrique
 */
public class Vehiculo {
    private String placa, cantLlantas, cantPasajeros, peso;

    public Vehiculo(String placa, String cantLlantas, String cantPasajeros, String peso) {
        this.placa = placa;
        this.cantLlantas = cantLlantas;
        this.cantPasajeros = cantPasajeros;
        this.peso = peso;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCantLlantas() {
        return cantLlantas;
    }

    public void setCantLlantas(String cantLlantas) {
        this.cantLlantas = cantLlantas;
    }

    public String getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(String cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    public void calcular()
    {
    }
    
}
