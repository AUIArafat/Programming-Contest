import java.io.*;


public class CopyFile {
	public static void main(String []args){
		int i = 0;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try{
			fin = new FileInputStream("C://Users//Md.Arafatul//Dropbox//TopUpIT(JAVA)//HomeTask//IOPractrise//ReadWriteFiles//src//Test.txt");
			fout = new FileOutputStream("C://Users//Md.Arafatul//Dropbox//TopUpIT(JAVA)//HomeTask//IOPractrise//ReadWriteFiles//src//Test1.txt");
			while(i!=-1){
				i = fin.read();
				if(i!=-1) {
					fout.write(i);
				}
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			try{
				if(fin!=null) fin.close();
			}
			catch(IOException e){
				System.out.println("Error Closing Input File" + e);
			}
			try{
				if(fout!=null) fout.close();
			}
			catch(IOException e){
				System.out.println("Error Closing Output File" + e);
			}
		}
	}
}
