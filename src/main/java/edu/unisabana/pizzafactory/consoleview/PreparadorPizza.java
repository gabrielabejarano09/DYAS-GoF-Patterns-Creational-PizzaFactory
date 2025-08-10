
package edu.unisabana.pizzafactory.consoleview;
import java.util.Arrays;

import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.IAmasador;
import edu.unisabana.pizzafactory.model.IHorneador;
import edu.unisabana.pizzafactory.model.IMoldeador;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.PizzaFactory;
import edu.unisabana.pizzafactory.model.PizzaFactoryGruesa;
import edu.unisabana.pizzafactory.model.Tamano;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    private  PizzaFactory factory;

    public PreparadorPizza(PizzaFactory factory) {
        this.factory = factory;
    }

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PizzaFactory factory = new PizzaFactoryGruesa(); 
            PreparadorPizza pp=new PreparadorPizza(factory);            
            pp.prepararPizza(ingredientes, Tamano.MEDIANO);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza( Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {
        IAmasador  am = factory.crearAmasador();
        IMoldeador mp = factory.crearMoldeador();
        IHorneador  hpd = factory.crearHorneador();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de pizza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
