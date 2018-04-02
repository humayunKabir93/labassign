	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class FileReader {
		
	public static void main(String arg[]) throws FileNotFoundException {
		ArrayList<String> array = new ArrayList<>();
		String sta;
		String []string=new String[50];
		String []St=new String[30];
		String []stt=new String[30];
		String []stt1=new String[30];
		int a=0;
		String strr1[]=new String[20];
		File file=new File("test1.txt");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(file);	
		while(sc.hasNextLine()) {
			sta=sc.nextLine();
			String [] str=sta.split(" ");
			for(String j: str) {
				array.add(j);
				a++;
			}
		}
		String strr[]=new String[a];
		for(String i : array) {
			System.out.println(i);
			array.toArray(strr);
		}
		int k=0,m=0,l=0,n=0,o=0;
		for(int j=0;j<strr.length;j++) {
			if(strr[j].equals("a") || strr[j].equals("b") || strr[j].equals("c")) {
				strr1[k]=strr[j];
				k++;
			}
			else if(strr[j].equals("int") || strr[j].equals("String") || strr[j].equals("float") || strr[j].equals("if") || strr[j].equals("else")) {
				string[m]=strr[j];
				m++;
			}
			else if(strr[j].equals("0") || strr[j].equals("1") || strr[j].equals("2") || strr[j].equals("3") ||strr[j].equals("4") || strr[j].equals("5") || strr[j].equals("6") || strr[j].equals("7")
				|| strr[j].equals("8") || strr[j].equals("9") || strr[j].equals("10")) {
				St[l]=strr[j];
				l++;
			}
			else if(strr[j].equals(";")||strr[j].equals("}")||strr[j].equals("{")||strr[j].equals("(")||strr[j].equals(")")) {
				stt[n]=strr[j];
				n++;
			}
			else if(strr[j].equals("+")||strr[j].equals("-")||strr[j].equals("*")||strr[j].equals("/")||strr[j].equals("=")||strr[j].equals("<=")
					||strr[j].equals(">=")||strr[j].equals("==")||strr[j].equals("++")||strr[j].equals("--")||strr[j].equals("%")) {
				stt1[o]=strr[j];
				o++;
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(strr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<m;i++) {
			System.out.print(string[i]+" ");
		}
		System.out.println();
		for(int i=0;i<l;i++) {
			System.out.print(St[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(stt[i]+" ");
		}
		System.out.println();
		for(int i=0;i<0;i++) {
			System.out.print(stt1[i]+" ");
		}
		
	}
	}


