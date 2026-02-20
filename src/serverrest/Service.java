/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class Service {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param giocata
     * @param numero
     * @param 
     * @return 
     * @throws IllegalArgumentException se ...
     */
    public static Boolean logicaDiCalcolo( String giocata, Integer numero) 
            throws IllegalArgumentException {
        
        // Controllo se i parametri passati sono validi
                if (!parametriValidi(giocata,numero)) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
                
        Boolean vittoria;
        
        try {
            
            if(("PARI".equals(giocata) && numero!=0 & numero%2 ==0) || ("DISPARI".equals(giocata) && numero!=0 & numero%2 ==1))
            {
                vittoria = true;
            }
            else{
                vittoria = false;
            }
            
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. Opzione deve essere DA FARE");
        }
        
        
        return vittoria; // Placeholder, da sostituire con il risultato della logica di calcolo
    }

    // Metodo di validazione dei parametri (da implementare)
    private static boolean parametriValidi(String giocata, Integer numero)
    {
        Boolean tf;
        if(giocata==null || numero==null){
            tf=false;
        }
        else{
            tf=true;
        }
        return tf;
    }
}
