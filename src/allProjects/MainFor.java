package allProjects;


public class MainFor {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			//++ birer arttırma, -- birer ekisltme
			System.out.println(i);
			
		}
		System.out.println("Döngü bitti");
		
		//while
		int i = 1;
		while(i<10){
			System.out.println(i);
			i++;
		}
		System.out.println("Döngü bitti");
		
		//do-while
		int a = 1;
		do {
			System.out.println(a);
			a++;
			
		}while(a<10);

	}

}
