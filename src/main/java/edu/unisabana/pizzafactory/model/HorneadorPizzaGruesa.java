package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;
import java.util.logging.Level;


public class HorneadorPizzaGruesa implements IHorneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Horneando la pizza gruesa con masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
