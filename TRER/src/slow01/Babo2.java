package slow01;

import java.util.Scanner;

public class Babo2 {
	public static void main(String [] args) {
		//준비
		int row=3;
		int col=4;
		int count=1;
		int[][] arr= new int[row][col];
		//계산
		for(int i=0; i<col; i++) {
			for(int k=0; k<row; k++) {
				arr[k][i]=count;
				count++;
			}
		}
		//출력
	for(int i=0; i<row; i++) {
		for(int k=0; k<col; k++) {
			System.out.print(arr[i][k]);
			System.out.print("\t");
		}
		System.out.println();
	}
		
	}
	}	