package slow01;

public class Babo3 {
	public static void main(String []args) {
	//준비
			int row = 3;
			int col = 4;
			int x=0;
			int y=0;
			int[][] arr = new int[row][col];
			for(int i=0; i<row*col; i++) {
				System.out.println(i+"를 x y에 대입합니다");
				arr[x][y]=i;
				//y++
			}
		}
	}