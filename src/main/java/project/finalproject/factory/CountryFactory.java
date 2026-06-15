package project.finalproject.factory;

import project.finalproject.entity.Country;

public class CountryFactory {
	public static Country createCountry() {
		return new Country();
	}
}
