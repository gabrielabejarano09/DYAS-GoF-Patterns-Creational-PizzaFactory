package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public interface PizzaFactory {
    IAmasador crearAmasador();
    IMoldeador crearMoldeador();
    IHorneador crearHorneador(); 
}