import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 *-------------------- Lector de entrada lee la entrada de texto mecanografiado de la terminal de texto est�ndar
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    //    /**
    //      * Read a line of text from standard input (the text terminal),
    //      * ----------------------------Leer una l�nea de texto de la entrada est�ndar (el terminal de texto)
    //      * and return it as a String.
    //      *
    //      * @return  A String typed by the user.
    //      */
    //     public String getInput()
    //     {
    //         System.out.print("> ");         // print prompt
    //         String inputLine = reader.nextLine();// en la VL inputLine recogemos lo que el usuaio pone en la terminal  
    //         inputLine.length();
    //         
    //         return inputLine.split(" ")[0];//soluci�n en una l�nea al ---------------------------------------------------- 0094
    //         //String[] ArrayStrings = inputLine.split(" ");//1�rompemos la cadena en funci�n de un espacio, con el mt split() ---0094
    //         //String firstWord = ArrayStrings[0];   // 2� extraemos la 1� cadena "ArrayString[0]" y la guardo en "firstWord" ----0094
    //         //return firstWord;     // ---------------------------------------------------------------------------------------- 0094
    //     }
    
    /**
     * modificamos el mt public String getInput() para que reciba un HashSet en vez de un Strint  ------------------------  0095
     * @return  A String typed by the user.-------------------------------------------------------------------------------  0095
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();// en la VL inputLine recogemos lo que el usuaio pone en la terminal  
        inputLine.length();
        
      
        //String[] ArrayStrings = inputLine.split(" ");//1�rompemos la cadena en funci�n de un espacio, con el mt split() ---0094
        //String firstWord = ArrayStrings[0];   // 2� extraemos la 1� cadena "ArrayString[0]" y la guardo en "firstWord" ----0094
        //return firstWord;     // ---------------------------------------------------------------------------------------- 0094
        //---0095 dividire la cadena en palabras y las guardo en una variable de tipo HashSet 1�creo la VL
        HashSet<String> setOfWords = new HashSet<>();
        //-------0095 //2�Creo un Array de String, separo la cadena en palabras, y las meto en el HashSet con el  bucle for
        String[] arrayStrings = inputLine.split(" ");
        // ------0095  3�   bucle for para reccorer el Array, y cada elemento lo meto en el HashSet con el mt add()
        for(int i = 0; i < arrayStrings.length; i++){
            setOfWords.add(arrayStrings[i]);
        }
        //  return inputLine.split(" ")[0];//soluci�n en una l�nea al ---------------------------------------------------- 0094
        return setOfWords; // -------- 0095 4� le pedimos que devuelva la 
    }

}
