package allProjects;

public class MainIntro {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		// değişken isimleri javada camelCase olarak yani ilk harf küçük diğerkelimenin başı büyü
		String ortaMetin = "İginizi cekebilir";
		String altmetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		//double
		double dolarDun = 18.34334;
		double dolarBugun = 18.34234;
		
		//bool
		boolean dolarDustumu = true;
		
		String okYonu= "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		}
		else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);

		}
		else {
			okYonu ="equal.svg";
			System.out.println(okYonu);
		}
		
		//Array
		String[] krediler = {"Hızlı Kredi", "Maaş Çeki Halkbnak","Mutlu Emekli","Geleceğim KOBİsi"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
