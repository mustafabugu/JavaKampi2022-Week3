package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { // final olan method override edilemez.
		return tutar * 1.18;
	}
}
