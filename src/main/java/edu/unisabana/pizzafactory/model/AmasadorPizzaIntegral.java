package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class AmasadorPizzaIntegral implements IAmasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza integral con masa especial.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
