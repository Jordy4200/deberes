package diccionarios;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Brad
 */
public class TrabajoConDiccionarios {
    public static void main(String[] args) {
        
        // 1) Crear un "diccionario" usando Map
        Map<String, Object> informacion_personal = new LinkedHashMap<>();
        informacion_personal.put("nombre", "Jordy Velasco");
        informacion_personal.put("edad", 23);
        informacion_personal.put("ciudad", "Puyo");
        informacion_personal.put("profesion", "Tics");

        // 2) Acceder al valor de "ciudad" y modificarlo
        System.out.println("Ciudad actual: " + informacion_personal.get("ciudad"));
        informacion_personal.put("ciudad", "Quito");

        // 3) Modificar/Agregar la clave "profesion"
        informacion_personal.put("profesion", "Desarrollador Web");

        // 4) Verificar si existe "telefono"
        if (!informacion_personal.containsKey("telefono")) {
            informacion_personal.put("telefono", "+593 98 123 4567");
        }

        // 5) Eliminar la clave "edad"
        informacion_personal.remove("edad");

        // 6) Imprimir el diccionario final
        System.out.println("\nDiccionario final:");
        for (Map.Entry<String, Object> entrada : informacion_personal.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
