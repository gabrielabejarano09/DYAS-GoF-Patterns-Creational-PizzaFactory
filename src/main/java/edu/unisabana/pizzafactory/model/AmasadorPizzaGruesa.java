package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class AmasadorPizzaGruesa implements IAmasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
