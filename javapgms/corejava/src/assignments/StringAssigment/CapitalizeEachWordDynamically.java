package assignments.StringAssigment;

public class CapitalizeEachWordDynamically {

	public static void main(String[] args) {
	
		String str = "welcome to sg testing institute";
		String str1 = str.substring(11);
		System.out.println(str1);
		String st="";
		
		for(int i=0;i<str1.length();i++) {
			if(i==0) {
				 st=st+str1.substring(i,i+1).toUpperCase();
				
			}
			if((str1.substring(i,i+1)).equals(" ")) {
				st=st+str1.substring(i+1, i+2).toUpperCase();
				
				}
			if((str1.substring(i,i+1))!=" " && i!=0) {
				st=st+(str1.substring(i,i+1));
			}
		   
		}
		
System.out.println(st);
	}

}