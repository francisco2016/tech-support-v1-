/**
 * This class implements a technical support system. It is the top
 * level class in this project. The support system communicates via
 * text input/output in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from
 * the user, and an object of class Responder to generate responses.
 * It contains a loop that repeatedly reads input and generates output
 * until the users wants to leave.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();//capturamos la frase puesta por el usuario y la guardo en la VL input.
            input = input.trim();//quito los espacios a la VL con el mt trim()------------------------------------------- 0083
                                  //o con una línea  if(input.trim().startsWith("bye"))----------------------------------  0083
            input = input.toLowerCase();//hace que las mayusculas dentro de la cadena input se hagam minusculas. --------  0083
                                  //o con una línea  if(input.toLowerCase().trim().startsWith("bye"))---------------------  0083
            if(input.startsWith("bye")) {//comprobamos si la frase puesta por el usuario empieza por bye
                finished = true;//si empieza por bye cambio el valor true y el bucle ya no se ejecuta
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }
        printGoodbye();// y pasa a ejecutarse el mt  printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
