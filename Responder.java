
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{

    private Random aleatorio;
    private ArrayList<String> respuesta; 
    private HashMap<String, String> palabra;
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
        respuesta.add("Recargue la bater�a.");
        respuesta.add("Tiene que llebar el equipo al t�cnico");
        palabra = new HashMap<>();//---------------------------------------------------- 0092
        palabra.put("problema", "Cuando comenzo el problema?");
        palabra.put("reinicie","Pruebe reiniciano el equipo");
        palabra.put("bateria,","Recargue la bater�a." );
        palabra.put("instrucciones", "Lea las instrucciones en el indice 2");

    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String key)
    {

        //         String respuestas = null;
        //         respuestas = respuesta.get(aleatorio.nextInt(respuesta.size()));;
        //         if (palabra.containsKey(key)) {//-------------------------------------------------------------- 0092
        //             respuestas = palabra.get(key);
        //         } 
        return respuesta.get(aleatorio.nextInt(respuesta.size()));
    }
}

