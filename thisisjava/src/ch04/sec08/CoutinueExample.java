package ch04.sec08;

public class CoutinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i/52 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
