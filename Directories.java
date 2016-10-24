import java.io.File;


public class Directories {
	public static void main(String []args){
		String dirname = "C:/Program Files/java/jdk1.8.0_65";
		File f1 = new File(dirname);
		if(f1.isDirectory()){
			System.out.println("Directory of " + dirname);
			String s[] = f1.list();
			for(int i=0;i<s.length;i++){
				File f = new File(dirname + "\\" + s[i]);
				if(f.isDirectory()){
					System.out.println(s[i] + " is a directory");
				}
				else{
					System.out.println(s[i] + " is a file");
				}
			}
		}
		else{
			System.out.println(dirname + " is not a directory");
		}
	}
}

//~ class Directories{
	//~ public void value(int i){
		//~ int count = 0;
		//~ while(true){
			//~ if(count == i)break;
			//~ count++;
			//~ System.out.println(count);
		//~ }
	//~ }
	//~ public static void main(String []args){
		//~ Directories ob = new Directories();
		//~ ob.value(-10);
	//~ }
//~ }