import java.util.Scanner;
class MagicOfString{
	// Length Of String...
	public int lengthOfString(String stringName){
		int length = 0;
		try{
		for(int i=0;stringName.charAt(i)!='\0' ;i++){
			++length;
		}
	}
	catch(Exception e){}
		return length;
	}
	//ToUpperCase...
	public void toUpperCase(String stringName){
		char []upperCase = new char[lengthOfString(stringName)];
		for(int i=0;i<lengthOfString(stringName);i++){
			if(stringName.charAt(i) > 96 && stringName.charAt(i)<123){
				upperCase[i] = (char)(stringName.charAt(i) - 32);
			}
			else
				upperCase[i] = (char)(stringName.charAt(i));
		}
		System.out.print("UpperCase Of "+ stringName+ " : ");
		for(int i=0;i<upperCase.length;i++){
			System.out.print(upperCase[i]);
		}
	}
	//ToLowerCase...
	public void toLowerCase(String stringName){
		char []lowerCase = new char[lengthOfString(stringName)];
		for(int i=0;i<lengthOfString(stringName);i++){
			if(stringName.charAt(i)>64 && stringName.charAt(i)<92){
				lowerCase[i] = (char)(stringName.charAt(i)+32);
			}
			else
				lowerCase[i] = (char)(stringName.charAt(i));
		}
		System.out.print("LowerCase Of "+ stringName+ " : ");
		for(int i=0;i<lowerCase.length;i++){
			System.out.print(lowerCase[i]);
		}
	}
	//SpaceCount...
	public int spaceCount(String stringName){
		int count = 0;
		for(int i=0;i<lengthOfString(stringName);i++){
			if(stringName.charAt(i) == ' '){ 
				++count;
			}
		}
		return count;
	}
	//VowelCount...
	public int vowelCount(String stringName){
		int count = 0;
		for(int i=0;i<lengthOfString(stringName);i++){
			if(stringName.charAt(i) == 'a' || stringName.charAt(i) == 'e'  || stringName.charAt(i) == 'i' || stringName.charAt(i) == 'o' || stringName.charAt(i) == 'u'  || stringName.charAt(i) == 'A' || stringName.charAt(i) == 'E' || stringName.charAt(i) == 'I' || stringName.charAt(i) == 'O' || stringName.charAt(i) == 'U'){ 
				++count;
			}
		}
		return count;
	}
	//Reverse
	public void reverseString(String strName){
		char str[] = new char[lengthOfString(strName)];
		int k = 0;
		for(int i=lengthOfString(strName)-1;i>=0;i--){
			str[k] = strName.charAt(i);
			++k;
		}
		System.out.print("Reverse Of "+ strName+ " : ");
		for(int i=0;i<lengthOfString(strName);i++){
			System.out.print(str[i]);
		}
	}
	//Palindrom
	public void palindromString(String strName){
		String reverse = "";
		for(int i=lengthOfString(strName)-1;i>=0;i--){
			reverse = reverse + strName.charAt(i);
		}
		if(reverse.equals(strName)){
			System.out.println(strName + " is a Palindrome");
		}
		else System.out.println(strName + " is not a Palindrome");
	}
	public String trimString(String strName){
		String trim = "";
		for(int i=0;i<lengthOfString(strName);i++){
			if(strName.charAt(i) == ' '){
				trim = trim;
			}
			else{
				trim = trim + strName.charAt(i);
			}
		}
		return trim;
	}
	public static void main(String []abc){
		MagicOfString mos = new MagicOfString();
		Scanner input = new Scanner(System.in);
		String strName = input.nextLine();
		System.out.println("Length of " + strName + " : "+mos.lengthOfString(strName));
		mos.toUpperCase(strName);
		System.out.println();
		mos.toLowerCase(strName);
		System.out.println("\nSpace of " + strName + " : "+mos.spaceCount(strName));
		System.out.println("Vowel of " + strName + " : "+mos.vowelCount(strName));
		mos.reverseString(strName);
		System.out.println();
		mos.palindromString(strName);
		System.out.println("After Trimming of " + strName + " : "  +mos.trimString(strName));
	}
}