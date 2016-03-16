import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 *-------------------- Lector de entrada lee la entrada de texto mecanografiado de la terminal de texto estándar
 * The text typed by a user is returned.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
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

   /**
     * Read a line of text from standard input (the text terminal),
     * ----------------------------Leer una línea de texto de la entrada estándar (el terminal de texto)
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();//1ºen la VL inputLine recogemos lo que el usuaio pone en la terminal --    0094
        inputLine.length();
        
        return inputLine.split(" ")[0];//solución en una línea al ---------------------------------------------------- 0094
        //String[] ArrayStrings = inputLine.split(" ");//2ºrompemos la cadena en función de un espacio, con el mt split() ---0094
        //String firstWord = ArrayStrings[0];   // 3º extraemos la 1º cadena "ArrayString[0]" y la guardo en "firstWord" ----0094
        //return firstWord;     // ---------------------------------------------------------------------------------------- 0094
    }

}
