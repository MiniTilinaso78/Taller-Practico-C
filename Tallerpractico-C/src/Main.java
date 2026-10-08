//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String usuario = "Tilinaso78";
        //int edad = 20;
        String json = """
                {
                  "user": "admin",
                  "active": true
                
                }
                """;
        json=json.strip();
        int extraccion = json.indexOf("active");

        String mensaje = "Hola la palabra active esta en el bloque %s en la posición %d ".formatted(json,extraccion);
        System.out.println(mensaje);


    }
}