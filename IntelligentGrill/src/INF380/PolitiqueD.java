package INF380;

<<<<<<< HEAD
import java.util.Comparator;
import java.util.List;

public abstract class PolitiqueD {//politique de distribution
	
	abstract void distribuer(int pTotal, List<Integer>c,List<Integer>c_c);
	abstract int getPT();
	abstract List<Integer> getCC();
	abstract List<Integer> getCO();
	protected abstract Comparator<Integer> comparator();
=======
public abstract class PolitiqueD {//politique de distribution
	
	abstract void distribuer();
>>>>>>> bd2e3f7dd8119bf8ab9d4368d3b56ea3f0872c09

}
