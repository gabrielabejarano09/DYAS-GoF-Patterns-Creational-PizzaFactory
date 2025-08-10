package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements IMoldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza gruesa pequeña.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Moldeando la pizza gruesa mediana.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
