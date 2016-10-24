import java.io.File;
import java.io.FilenameFilter;


public class FileDemo {
	static void show(String s){
		System.out.println(s);
	}
	public static void main(String []args){
		File f2 = null;
		File f1 = new File("C://Users//Md.Arafatul//Dropbox//TopUpIT(JAVA)//HomeTask//IOPractrise//ReadWriteFiles//src//Test.txt");
		show("File Name : " + f1.getName());
		show("Path	: "	+ f1.getPath());
		show("Abs Path	: " + f1.getAbsolutePath());
		show("Parent	: " + f1.getParent());
		show(f1.exists() ? "exists" : "does not exist");
		show("File Size		: " + f1.length() + "bytes");
		try{
		String dirName = "C://Users//Md.Arafatul//Dropbox//TopUpIT(JAVA)//HomeTask//IOPractrise//ReadWriteFiles//src";
		f2 = new File(dirName);
		}
		catch(Exception e){System.out.println(e);}
		
		FilenameFilter only = new OnlyExt("txt");
		String s[] = f2.list(only);
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
}
