import java.io.*;


public class BReader {
	
	public static void main(String []args) throws IOException{
//		//Reading Character from console
//		char c = '\0';
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Characters, 'q' to quit.");
//		while(c!='q'){
//			c = (char) br.read();
//			System.out.println(c);
//		}
//		//Reading String from console
//		String str;
//		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter lines of text\nEnter 'stop' to quit");
//		do{
//			str = br1.readLine();
//			System.out.println(str);
//		}
//		while(!str.equals("stop"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		System.out.println("Enter lines of text\nEnter 'stop' to quit");
		for(int i=0;i<100;i++){
			str[i] = br.readLine();
			if(str[i].equals("stop")) break;
		}
		System.out.println("Here your file");
		for(int i=0;i<100;i++){
			if(str[i].equals("stop")) break;
			System.out.println(str[i]);
			System.out.write('\n');
		}
		
	}
}
