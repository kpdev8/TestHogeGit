package kadai5;

import java.util.Arrays;

public class kadai5 {
	
	
//メソッド
//	public static void hello() {
//		System.out.println("hello world");
//		System.out.println("こんばんは");
//	}
	
//		public static void main(String[] args){			
//			hello();		
//		}

//引数
//		public static void hello(String name1,String name2) {		
//			System.out.println("こんちには、"+name1+"さん。"+"こんちには、"+name2+"さん。");
//		}
//		public static void main(String[] args){			
//				hello("太郎","三郎");
//				hello("次郎","三郎");
//				hello("花子","三郎");
//		}
		
//戻り値（呼び出されたメソッドから、呼び出し元のメソッドへ値を返すことを「値を戻す」といい、戻されるデータを戻り値(返り値)という）
	//今までのvoid は値を戻さないという意味	

//	public static void main(String[] args){				
//		int x=10;
//		int y=8;		
//		int answer = add(x,y);		
//		System.out.println(answer);
//	}
//	public static int add(int num1,int num2) {
//	int sum = num1+num2;
//			return sum;
//	}			

		
		public static void main(String[] args){	
			
			int[]num= {10,33,100,90,54};	
			
			int answer[] = array_sort(num);
			
			System.out.println(answer[0]);
			System.out.println(answer[1]);
			System.out.println(answer[2]);
			System.out.println(answer[3]);
			System.out.println(answer[4]);
		}
			
		public static int array_sort(int[] num) {
			int[] array1 = numtest;
//			int[] array2 = array1.clone();
			Arrays.sort(array1);
//			for(int i=0;i<array1.length;i++) {
//				System.out.println(i + "番目 ソート前:" + array2[i] + " ソート後:" + array1[i]);
//				System.out.println( array1[i]);
//			}
//				int array_sort = 0;
				return array1;
		}
			
//	//
}
