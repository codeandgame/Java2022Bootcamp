package allProjects;


public class MainIfKosul {

	public static void main(String[] args) {
		
		int sayi = 23;
		
		if(sayi<20) {
			System.out.println("Sayı 20 de küçüktür");
		}
		//if olduğunda else olmak zorunda değil ama else varsa if olmak zorunda
		else if(sayi==20) {
			
			System.out.println("sayi 20 ye eşittir");
		}
		else {
			
			System.out.println("sayı 20 den büyüktür");
		}
		//else if ten önce else gelemez
		
	}

}
