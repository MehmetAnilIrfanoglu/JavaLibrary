package hw7;
import java.util.Collection;

public abstract class Semigroup<Gen> {
	
	
	
	@SuppressWarnings("unchecked")
	static <Gen> Gen combine(Collection<Gen> c) {
	Semigroup<Gen> r = null;
	
	for (Gen j: c) {
		if (r == null) {
		r = (Semigroup<Gen>)j;
		} 
		else {
		r = (Semigroup<Gen>) r.operator(j);
		}
	}
	
	return (Gen)r;
	}
	
	abstract Gen operator(Gen obj);
}