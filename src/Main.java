import com.generation.polimorfismo.animales.Animal;
import com.generation.polimorfismo.animales.Capibara;
import com.generation.polimorfismo.animales.Delfin;

public class Main {
    public static void main(String[] args) {
        Delfin flipy = new Delfin("flipy","rosa","pescado",3,0);
        Capibara pedro = new Capibara("pedro","cafe", "plants y pescado", 2, 4 );
        Animal gato = new Animal("garfield", "naranja", "lasagna", 2, 4);

        flipy.hacerRuido();
        pedro.hacerRuido();
        gato.hacerRuido();
    }
}