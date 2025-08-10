package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class MoldeadorPizzaIntegral implements IMoldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza integral pequeña.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza integral mediana.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
