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

   /**
     * Read a line of text from standard input (the text terminal),
     * ----------------------------Leer una l�nea de texto de la entrada est�ndar (el terminal de texto)
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();//1�en la VL inputLine recogemos lo que el usuaio pone en la terminal --    0094
        inputLine.length();
        
        return inputLine.split(" ")[0];//soluci�n en una l�nea al ---------------------------------------------------- 0094
        //String[] ArrayStrings = inputLine.split(" ");//2�rompemos la cadena en funci�n de un espacio, con el mt split() ---0094
        //String firstWord = ArrayStrings[0];   // 3� extraemos la 1� cadena "ArrayString[0]" y la guardo en "firstWord" ----0094
        //return firstWord;     // ---------------------------------------------------------------------------------------- 0094
    }

}
