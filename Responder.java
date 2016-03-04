
import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    
    private Random aleatorio;
    private ArrayList<String> respuesta;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuesta = new ArrayList<>();
        respuesta.add("Cuando comenzo el problema?");
        respuesta.add("Pruebe reiniciano el equipo.");
        respuesta.add("Lea las instrucciones en el indice 2");
        respuesta.add("Recargue la batería.");
        respuesta.add("Tiene que llebar el equipo al técnico");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
       int solucion = aleatorio.nextInt(respuesta.size());
       
       return  respuesta.get(solucion);
        
        // return "That sounds interesting. Tell me more...";
       
    }
}
