package pg_ex01_1;

public class Num_onehandr {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=1; i<=100; i++){
			if(i%3==0 && i%4==0){
				System.out.print("◆ ");
			}else if(i%3==0){
				System.out.print("△ ");
			}else if(i%4==0){
				System.out.print("□ ");
			}else{
				System.out.print(i+" ");
			}
			if(i%10 == 0) System.out.print("\n");
		}

	}

}
