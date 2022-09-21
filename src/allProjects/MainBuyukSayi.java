package allProjects;


public class MainBuyukSayi {

	public static void main(String[] args) {

			int sayi = 20;
			int sayi1 = 25;
			int sayi2 = 12;
			int enBuyuk = sayi;
			
			if(enBuyuk<sayi1) {
				enBuyuk = sayi1;
			}
			else if(enBuyuk<sayi2) {
				enBuyuk = sayi2;
			}
			System.out.println("En Büyük: "+ enBuyuk);
	}

}
