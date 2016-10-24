import java.io.*;


public class ShowFile {
	public static void main(String []args){
		int i = 0;
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("C://Users//Md.Arafatul//Dropbox//TopUpIT(JAVA)//HomeTask//IOPractrise//ReadWriteFiles//src//Test.txt");
			while(i!=-1){
				i = fin.read();
				if(i!=-1)
					System.out.print((char)i);
			}
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			try{
				if(fin!=null)
					fin.close();
			}
			catch(IOException e){
				System.out.println(e);
			}
		}
	}
}
