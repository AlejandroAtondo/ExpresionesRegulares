import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        /* Expresiones Regulares
        1. Hola mundo
        2. (?i).*hola mundo,*
        3. \\b(Java|Python|Go|Pascal|Perl)\\b
        4. ^[a-zA-Z0-9._%+-]+@(unison\.mx|uson\.mx)$
        5. ^ISI[0-9]{4}-[12](\.txt|\.csv)$
        */

        if (args.length != 1) {
            System.out.println("Escribe una cadena entre comillas para comprobar si es válida");
            return;
        }

        String entrada = args[0];

        ValidarHolaMundo(entrada);
        ValidarHolaMundoMayus(entrada);
        ValidarJavaPython(entrada);
        ValidarCorreo(entrada);
        ValidarNombreArchivo(entrada);
    }

    public static boolean ValidarHolaMundo(String cadena){
        Pattern pat = Pattern.compile("Hola mundo");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()){
            System.out.println("Hola mundo es válido.");
        } else {
            System.out.println("Hola mundo no es válida.");
        }

        return mat.matches();
    }

    public static boolean ValidarHolaMundoMayus(String cadena){
        Pattern pat = Pattern.compile("(?i).*hola mundo.*");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()){
            System.out.println("Hola mundo con mayusculas o minúsculas es válido.");
        } else {
            System.out.println("Hola mundo con mayusculas o minúsculas no es válido.");
        }

        return mat.matches();
    }

    public static boolean ValidarJavaPython(String cadena){
        Pattern pat = Pattern.compile("\\b(Java|Python|Go|Pascal|Perl)\\b");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()){
            System.out.println("Java, Python, Go, Pascal o Perl es válido.");
        } else {
            System.out.println("Java, Python, Go, Pascal o Perl no es válido.");
        }

        return mat.matches();
    }

    public static boolean ValidarCorreo(String cadena){
        Pattern pat = Pattern.compile("^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()){
            System.out.println("El correo es válido.");
        } else {
            System.out.println("El correo no es válido.");
        }

        return mat.matches();
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
