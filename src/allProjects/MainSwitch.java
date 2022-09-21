package allProjects;


public class MainSwitch {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniiz");
			break;
		case 'B':
			System.out.println("Çok iyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kötü : Kaldınız");
			break;
			default:
				System.out.println("Geçersiz not girdiniz");
		//break koşulu durdurmaya yarıyor diğer koşullara girmiyor,
		//default ise koşul dışı girdiler için sabit bir kod çalıştırır her zaman
		}
	}

}
