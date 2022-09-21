package allProjects;


public class SayıAsalmı {

	public static void main(String[] args) {
		int number = -1;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		//bulunduğu ana fonksiyonu bitirmeye yarıyor
		if(number == 1) {
			System.out.println("Asal sayı değil");
			return;
		}
		if(number<1) {
			System.out.println("geçersiz sayi");
		}
		for(int i = 2; i<number; i++) {
			
			if(number % i == 0) {
				isPrime = false;
			}
			
		}
		
		//isPrime ataması değiştiği için koşullar her zaman doğruyu kabul eder bu yüzden
		//doğru ise yani true ise if koşuluna girecek değilse direkt else gidecek
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir");
		}
	}

}
