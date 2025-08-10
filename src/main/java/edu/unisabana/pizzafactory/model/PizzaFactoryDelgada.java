package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class PizzaFactoryDelgada implements PizzaFactory{

    @Override
    public IAmasador crearAmasador(){
        return new AmasadorPizzaDelgada();
    };

    @Override
    public IMoldeador crearMoldeador(){
        return new MoldeadorPizzaDelgada();
    };

    @Override
    public IHorneador crearHorneador(){
        return new HorneadorPizzaDelgada();
    };
}
