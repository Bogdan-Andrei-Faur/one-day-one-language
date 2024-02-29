import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        final String nombre = "Andrei"; //"final" hace que la variable se convierta en constante.

        System.out.println("Mi nombre es " + nombre);

        Integer numero0 = 5;
        Integer numero1 = 4;

        Integer suma = numero0 + numero1;

        System.out.println("Resultado de la suma es " + suma + " es un Integer.");

        Double numero2 = 2.5;

        System.out.println("Esto es un numero Double: " + numero2); //Mayor precisión y rango de valores más amplio, pero ocupa más memoria.

        Float numero3 = 2.5f;

        System.out.println("Esto es un numero Float: " + numero3); //Menor precisión y rango de valores menos amplio, pero ocuma menos memoria.

        Boolean booleano = null;

        System.out.println("Esto es un Booleano: " + booleano);

        //Para evitar los null exception

        if (booleano != null) {
            System.out.println(numero0 + " es igual a Null");
        } else {
            System.out.println(numero0 + " es distinto a Null");
        }

        List<Integer> array = new ArrayList();
        array.add(numero0);
        array.add(numero1);

        System.out.println("Esto es un Array: " + array);
        
        Map<String, String> mapa = new HashMap();
        mapa.put("string", nombre);
        mapa.put("int", numero0.toString());
        System.out.println("Esto es un Objeto: " + mapa);

        for (int index = 0; index < array.size(); index++) {
            System.out.println("Esto es un FOR: " + array.get(index));
        }

        Prueba myMain = new Prueba();
        myMain.myFuncion0(3, 4);
        System.out.println(myMain.myFuncion1(5, 6));
    }
    
    public void myFuncion0(int numero0, int numero1) { //"void" hace que la funcion pueda no retornar nada.
        System.out.println(numero0 + numero1);
    }

    public int myFuncion1(int numero0, int numero1) { //La unica diferencia es que esta función retorna.
        return (numero0 + numero1);
    }
}
