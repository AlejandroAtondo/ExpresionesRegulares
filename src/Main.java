import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /* Expresiones Regulares
        1. Hola mundo
        2. (?i)hola mundo
        3. Java | Python | Go | Pascal | Perl
        4. @(unison\.mx|uson\.mx)$
        5. ^ISI[0-9]{4}-[12](\.txt|\.csv)$
        */

        if (args.length != 1) {
            System.out.println("Escribe una cadena para validar si es un nombre de archivo válido");
            return;
        }

        String entrada = args[0];
        ValidarNombreArchivo(entrada);

    }

    public static boolean ValidarNombreArchivo(String cadena){
        Pattern pat = Pattern.compile("^ISI[0-9]{4}-[12](\\.txt|\\.csv)$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()){
            System.out.println("El nombre del archivo es válido.");
        } else {
            System.out.println("El nombre del archivo no es válido.");
        }

        return mat.matches();
    }

}
