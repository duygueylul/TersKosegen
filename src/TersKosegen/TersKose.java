package TersKosegen;
import java.util.Scanner;

public class TersKose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir Sayı Giriniz: ");
		int s = scan.nextInt();
		
		
		if(s >= 2) {
			int [][] array = new int[s][s];
			
			for(int i = 0; i < s; i++) {
				array[i][s - 1 - i] = 1;
			}
			
			
			for(int j = 0; j < s; j++) {
				for(int k = 0; k < s; k++) {
					System.out.print(array[j][k] + " ");
				}
				System.out.print(" ");
			}
		}
		else {
			System.out.println("Girilen Sayı 1'den Büyük Olmalıdır !!");
		}

	}

}
