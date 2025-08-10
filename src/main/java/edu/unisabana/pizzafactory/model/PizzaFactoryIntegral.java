package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class PizzaFactoryIntegral implements PizzaFactory {

    @Override
    public IAmasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public IMoldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public IHorneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
    
}
