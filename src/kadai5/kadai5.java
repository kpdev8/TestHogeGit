package kadai5;

import java.util.Arrays;

public class kadai5 {
	
	
//���\�b�h
//	public static void hello() {
//		System.out.println("hello world");
//		System.out.println("����΂��");
//	}
	
//		public static void main(String[] args){			
//			hello();		
//		}

//����
//		public static void hello(String name1,String name2) {		
//			System.out.println("���񂿂ɂ́A"+name1+"����B"+"���񂿂ɂ́A"+name2+"����B");
//		}
//		public static void main(String[] args){			
//				hello("���Y","�O�Y");
//				hello("���Y","�O�Y");
//				hello("�Ԏq","�O�Y");
//		}
		
//�߂�l�i�Ăяo���ꂽ���\�b�h����A�Ăяo�����̃��\�b�h�֒l��Ԃ����Ƃ��u�l��߂��v�Ƃ����A�߂����f�[�^��߂�l(�Ԃ�l)�Ƃ����j
	//���܂ł�void �͒l��߂��Ȃ��Ƃ����Ӗ�	

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
//				System.out.println(i + "�Ԗ� �\�[�g�O:" + array2[i] + " �\�[�g��:" + array1[i]);
//				System.out.println( array1[i]);
//			}
//				int array_sort = 0;
				return array1;
		}
			
//	//
}
