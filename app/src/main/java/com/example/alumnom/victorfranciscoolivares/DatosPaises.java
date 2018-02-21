package com.example.alumnom.victorfranciscoolivares;

import java.io.Serializable;
/**
 * Created by alumnom on 21/02/2018.
 */

public class DatosPaises implements Serializable{
        private String NombreI;
        private String NombreC;
        private String Clave;
        private String Capital;
        private String Continente;
        private String Poblacion;
        private String Latitud;
        private String Longitud;
        private String Paisesfron;

        public DatosPaises(String NombreI, String NombreC, String Clave, String Capital, String Continente, String Poblacion, String Latitud, String Longitud, String Paisesfron) {
            this.NombreI = NombreI;
            this.NombreC = NombreC;
            this.Clave = Clave;
            this.Capital = Capital;
            this.Continente =Continente;
            this.Poblacion = Poblacion;
            this.Latitud = Latitud;
            this.Longitud = Longitud;
            this.Paisesfron = Paisesfron;
        }

        public String getNombreI() {
            return NombreI;
        }

        public void setNombreI(String NombreI) {
            this.NombreI = NombreI;
        }

        public String getNombreC() {
            return NombreC;
        }

        public void setNombreC(String NombreC) {
            this.NombreC = NombreC;
        }

        public String getClave() {
            return Clave;
        }

        public void setClave(String Clave) {
            this.Clave = Clave;
        }

        public String getCapital() {
            return Capital;
        }

        public void setCapital(String Capital) {
            this.Capital = Capital;
        }

        public String getContinente() {
            return Continente;
        }

        public void setContinente(String icono) {
            this.Continente = Continente;
        }

        public String getPoblacion() {
            return Poblacion;
        }

        public void setPoblacion(String Poblacion) {  this.Poblacion = Poblacion; }

        public String getLatitud() {
            return Latitud;
        }

        public void Latitud(String Latitud) { this.Latitud = Latitud; }

        public String getLongitud() {
            return Longitud;
        }

        public void setLongitud(String Longitud) {
            this.Longitud = Longitud;
        }

        public String getPaisesfron() {
            return Paisesfron;
        }

        public void setPaisesfron(String Paisesfron) {
            this.Paisesfron = Paisesfron;
        }
    }

