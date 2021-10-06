import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Coliseu implements Iterable<Gladiador>{
    private List<Gladiador> gladiadores = new ArrayList<Gladiador>();

    public Coliseu(Gladiador... gladiadores){
        this.gladiadores = Arrays.asList(gladiadores);
    }
    @Override
    public Iterator<Gladiador> iterator(){
        return gladiadores.iterator();
    }
}
