package loop;


public class Task5{
	public static void main(String[] args) {
		//九九の計算
			for(int i = 1; i <= 9; i++) {
				for(int j = 1; j <= 9; j++) {
					//桁数判別
					if(i * j <10) {
						System.out.print("  " + i * j );
					}else {
						System.out.print(" " + i * j );
				    }

                }
				 System.out.println();
			}
	}
}

