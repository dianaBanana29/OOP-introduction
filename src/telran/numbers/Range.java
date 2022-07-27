package telran.numbers;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class Range implements Iterable<Integer> {
	
	//closed range
	private int min; //inclusive
	private int max; //inclusive 
	private Predicate<Integer> predicate;
	
	public Predicate<Integer> getPredicate() {
		return predicate;
	}
	public void setPredicate( Predicate<Integer> predicate) {
		this.predicate = predicate;
	}
	private class RangeIterator implements Iterator<Integer> {
        int current = min;
		@Override
		public boolean hasNext() {
			if(predicate == null) {
				return current <= max;
			}
			if(predicate.test(current)) {
				return current <= max;	
			}
			return ++current <= max;
		}

		@Override
		public Integer next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return current++;
		}
		
	}
	public Range(int min, int max) {
		
		this.min = min;
		this.max = max;
	}
	@Override
	public Iterator<Integer> iterator() {
		
		return new RangeIterator();
	}
	public int length () {
		return max - min + 1;
	}

}