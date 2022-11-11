import edu.escuela.gamepz.personajes.Personaje;
import java.util.Comparator;
public class ByVida implements Comparator<Personaje>{
	public int compare(Caricatura p1, Caricatura p2){
		if (p1.getVida() != o2.getVida()){
			return (o2.getVida()>o1.getVida())?(-1):(1);
		}
		if ((o1.getNombre().compareTo(o2.getNombre())) != 0){
			return (o1.getNombre().compareTo(o1.getNombre()));
		}
		return((o2.getSize() < o1.getSize())?)(-1):(1);	
	}
}