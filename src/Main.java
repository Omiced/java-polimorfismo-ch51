import com.generation.polimorfismo.animales.Animal;
import com.generation.polimorfismo.animales.Capibara;
import com.generation.polimorfismo.animales.Delfin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        Delfin flipy = new Delfin("flipy","rosa","pescado",3,0);
        Capibara pedro = new Capibara("pedro","cafe", "plants y pescado", 2, 4 );
        Animal gato = new Animal("garfield", "naranja", "lasagna", 2, 4);

        flipy.hacerRuido();
        pedro.hacerRuido();
        gato.hacerRuido();

        System.out.println(flipy.suma(2,2));
        System.out.println(flipy.suma(2,3,4));
        System.out.println(flipy.suma(2.10,2.15));
        System.out.println(flipy.suma(numeros));

    }
}