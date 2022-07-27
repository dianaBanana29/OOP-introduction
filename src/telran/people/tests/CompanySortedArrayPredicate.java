package telran.people.tests;

import java.util.function.Predicate;

import telran.people.*;

public class CompanySortedArrayPredicate implements Predicate <CompanyArray>{

	@Override
	public boolean test(CompanyArray t) {
		
		return t instanceof CompanySortedArray;
	}

}
