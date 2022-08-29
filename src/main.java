import java.lang.String;
import java.util.ArrayList;
import java.util.Vector;

public class main {
    public static void main(String[] args) {

        int num = 1;
        ArrayList<Integer> list = new ArrayList();
        for (int t = 0; t < 10; t++) {
            list.add(num);
            num++;
        }
        System.out.println(list);
        for (int m = 0; m < list.size(); m++) {
            int test = list.get(m);
            if (test%2 == 0) {
                list.remove(m);
            }
        }
        System.out.println(list);
        reverse("hola mundo");





        int numeros[][] = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10}
        };

        for (int k = 0; k < numeros.length; k++) {
            for (int j = 0; j < numeros[k].length; j++) {
                System.out.println("Estamos en: " + "[" + j + "]" + " " + "[" + k + "]" + " hay: " + numeros[k][j]);
            }
        }

        Vector<String> vector = new Vector();
        vector.add("Gonzalo");
        vector.add("Delfina");
        vector.add("Ciro");
        vector.add("Benjamin");
        vector.add("Tomas");
        vector.remove("Delfina");
        vector.remove("Ciro");
        System.out.println(vector);


    }


    public static String reverse(String texto) {
        String reverseCadena = "";
        for (int i = texto.length() -1; i >= 0; i--) {
            reverseCadena = reverseCadena + texto.charAt(i);
        }
        System.out.println(reverseCadena);
        return reverseCadena;
    }

}
