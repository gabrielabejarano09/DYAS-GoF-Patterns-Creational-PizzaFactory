package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class PizzaFactoryGruesa implements PizzaFactory {

    @Override
    public IAmasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public IMoldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public IHorneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
    
}
