package Exercici1;

import org.hamcrest.Description;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsEqual;

public class ModelPersonalMatcher extends TypeSafeMatcher<String> {

	private int longEstimada;

	public ModelPersonalMatcher(int longEstimada) {

		this.longEstimada = longEstimada;
	}

	@Override
	public void describeTo(Description text) {
		
		text.appendText( "No coincideix la longitud de la paraula" );
	
	}

	@Override
	protected boolean matchesSafely(String paraulaActual) {
		return paraulaActual.length() == longEstimada;
	}

	
	public static FeatureMatcher<String, Integer> longitud(int longEstimada) {


        return new FeatureMatcher<String, Integer>(IsEqual.equalTo(longEstimada),
                                                   "La longitud ha de ser :  ",
                                                   "La paraula té una longitud de : ") {
        	
            @Override
            protected Integer featureValueOf(String paraulaActual) {
                return paraulaActual.length();
            }
        };
    }
}
