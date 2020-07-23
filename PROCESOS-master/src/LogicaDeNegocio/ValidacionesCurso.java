/*MARIO DORANTES
**22/07/2020
*/
package LogicaDeNegocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author mario
 */
public class ValidacionesCurso {
    
    boolean validarPorcentajeAvance;
    
    public boolean validarPorcentaje(String porcentajeAvance){
        return validarPorcentajeAvance = porcentajeAvance.matches("^[0-9|%]{1,4}$"); 
    }
    
    SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
    public boolean validarFecha(String fecha){
        try{
            format.parse(fecha);
            return true;
        }catch(ParseException e){
            return false;
        }
    }
    
    
    
}
