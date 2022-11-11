import edu.escuela.gamepz.personajes.Personaje;
import java.util.Comparator;
public class BySize implements Comparator<Personaje>{
	public int compare(Caricatura o1, Caricatura o2){
		if (p1.getSize() != o2.getSize()){
			return (o2.getSize()<o1.getSize())?(-1):(1);
		}
		if ((o1.getNombre().compareTo(o2.getNombre)=0)){
			return o1.getNombre.compareTo(o2.getNombre());
		}
		
		return((o2.getVida() > o1.getVida())?(-1):(1));
	}
}