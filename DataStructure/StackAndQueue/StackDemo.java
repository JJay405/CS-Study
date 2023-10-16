//Junhong Liu

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResizingArrayStack<String>  strStack= new ResizingArrayStack<>(10);
		
		ResizingArrayStack<Character>  charStack= new ResizingArrayStack<>(10);
		
		String str="Math140";
		String str2 = "";
		
		for( int i = 0; i <str.length();i++) {
			
			charStack.push(str.charAt(i));
			
		}
		
		while((!charStack.isEmpty())) {		
			
			str2=str2+charStack.pop();				
		}
		
		
		
		System.out.println(str2);
	}

}
