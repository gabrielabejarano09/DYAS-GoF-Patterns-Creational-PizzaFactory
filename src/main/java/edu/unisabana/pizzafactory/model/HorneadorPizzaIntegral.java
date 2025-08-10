package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class HorneadorPizzaIntegral implements IHorneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Horneando la pizza integral con masa especial.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
