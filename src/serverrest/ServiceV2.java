/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ServiceV2 {
    
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
        Integer rossi[] = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
        Integer neri[] = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
        
        try {
            
            if(("ROSSO".equals(giocata) && numero!=0 & numero%2 ==0) || ("DISPARI".equals(giocata) && numero!=0 & numero%2 ==1))
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
