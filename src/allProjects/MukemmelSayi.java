package allProjects;


public class MukemmelSayi {

	public static void main(String[] args) {
		// mükemmel sayi tam bölenleri toplamı eğer o sayıya eşit ise o sayı mükemmel
		// sayi

		int sayi = 6;
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {
				toplam = toplam +i;
			}

		}
		
		if(toplam == sayi) {
			System.out.println("Mükemmel sayidir");
			
		}
		else {
			System.out.println("Mükemmel sayi değil");
		}
	}
}