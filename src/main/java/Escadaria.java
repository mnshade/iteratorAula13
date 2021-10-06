import java.util.Iterator;

public class Escadaria {
    public static Integer computarGladiadoresProntos(Coliseu coliseu){
        int valor = 0;
        for(Gladiador gladiador : coliseu){
            if(gladiador.isPreparado()){
                valor++;
            }
        }
        return valor;
    }
    public static Integer mostrarTotalDeGladiadores(Coliseu coliseu){
        int valor = 0;
        for (Iterator a =  coliseu.iterator(); a.hasNext();){
            valor ++;
            a.next();
        }
        return valor;
    }
}
