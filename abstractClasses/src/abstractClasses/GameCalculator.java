package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); // hesapla imzasını zorunlu kıldık.
									// FAKAT kullanıcı türüne göre herkes override etmelidir.

	public final void gameOver() { // final ile hiçbir zaman değişmeyecek kuralı belirledik.
		System.out.println("Oyun bitti...");
	}
}


// Abstract bir sınıfın Abstract olabilmesi için Abstract imzası ile beslenmesi gerekir.
//  public abstract class GameCalculator

// Abstract bir classta illa bir Abstract method olmak zorunda değildir. Yalnızca tamamlanmış operasyon bulunabilir.
// Veya sadece Abstract method olabilir.
// Abstract sınıflar asla new'lenemez. new'lene bilmesi için bütün operasyonlarını ovirride etmemiz gerekir.
	// buda önerilmez...