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

    Random aleatorio;
    ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new  ArrayList<String>();
        respuestas.add("¿estas seguro?");
        respuestas.add("necesito mas informacion");
        respuestas.add("¿has probado a reiniciar el ordenador y el rutel?");
        respuestas.add("ese es culpa de la bios cambie de ordenaodr");
        respuestas.add("tu ordenandor tiene suficiente memoria compruebalo");
        respuestas.add("eso es un problema de hardware no podemos ayudarte");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroObtener = aleatorio.nextInt(5);
        return respuestas.get(numeroObtener);
    }
}
