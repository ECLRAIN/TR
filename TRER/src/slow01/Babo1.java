package slow01;

import java.util.Scanner;

public class Babo1 {
	public static void main(String[] args) {
		//준비
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("줄= ");
		int row = sc.nextInt();
		
		
		System.out.print("칸= ");
		int col = sc.nextInt();
		
		
		int[][] arr = new int[row][col];
		//arr.length는 row와 같다
		//arr[?].length는 col과 같다

		//계산
		int why = 1;
		for(int i=0; i < arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				//arr[i][k] = i * arr[i].length + k + 1;

				arr[i][k] = why;
				why++;

				//arr[i][k] = why++;//넣고 증가
				//arr[i][k] = ++count;//증가하고 넣어라
			}
		}

		//출력
		for(int i=0; i < arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				System.out.print(arr[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
		sc.close();
	}
}