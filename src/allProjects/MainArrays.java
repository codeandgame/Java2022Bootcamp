package allProjects;


public class MainArrays {

	public static void main(String[] args) {
		String ogrenci = "Engin";
		String ogrenci1 = "Derin";
		String ogrenci2 = "Salih";
		String ogrenci3 = "İbrahim";
		
		System.out.println(ogrenci);
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("---------------------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		//ogrenciler[3] = "İbrahim";
		
		for(int i = 0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);	
		}
		System.out.println("-----------------------------");
		//string sonrası istediğimiz bir ism belirleyip ogrenciler dizisini ekledik
		//ogrenciler dizisini tek tek dolaşan bir döngü
		for(String ogrenci0:ogrenciler) {
			
			System.out.println(ogrenci0);
		}
		System.out.println("-------------------------");
		//RecapDemo2
		
		double[] myList = {1.2,3.4,5.1,2.7};
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			if(max<number) {
				max = number;
			}
			System.out.println(number);
			total = total + number;
		}
		System.out.println(total);
		System.out.println(max);
		
		//Çok boyutlu diziler
		//Bir matris için []{} kullanılır
		
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="bursa";
		sehirler[0][2]="izmit";
		sehirler[1][0]="ankara";
		sehirler[1][1]="konya";
		sehirler[1][2]="kayseri";
		sehirler[2][0]="diyarbakır";
		sehirler[2][1]="urfa";
		sehirler[2][2]="antep";

		for(int i=0;i <=2;i++) {
			for(int j=0;j<=2;j++) {
				
				System.out.println(sehirler[i][j]);
			}
			
		}

		
	}

}
