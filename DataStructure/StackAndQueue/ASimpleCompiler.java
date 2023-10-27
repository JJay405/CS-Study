public class ASimpleCompiler 
{

	public static void main(String[] args) 
	{

		ResizingArrayStack<Character> myStack = new ResizingArrayStack<>(10);

		String inputStr = "([)]{}{[()()]()}";

		boolean balanced = true;
		if(balanced = true)
		{
		for (int i = 0; i < inputStr.length(); i++) 
		{

			char currentChar = inputStr.charAt(i);

			if (currentChar == '[' || currentChar == '{' || currentChar == '(')

				myStack.push(inputStr.charAt(i));
			else if (currentChar == ']' || currentChar == '}' || currentChar == ')')
			{
				if (!myStack.isEmpty()) 
				{
					char temp = myStack.pop();

					if (temp != '(' && inputStr.charAt(i) == ')')

						balanced = false;

					else if (temp != '{' && inputStr.charAt(i) == '}')

						balanced = false;

					else if (temp != '[' && inputStr.charAt(i) == ']')

						balanced = false;
				} 
				else 
				{
					System.out.println(inputStr + "is not balanced.");

					balanced = false;
				}

			}
			else
				System.out.println(inputStr + " invalid input");
		}
		}
		if (!myStack.isEmpty()) 
		{
			System.out.println(inputStr + "is not balanced.");

			balanced = false;
		}
		if (balanced)

			System.out.println(inputStr + "is properly balanced.");

		else

			System.out.println(inputStr + "is not balanced.");

	}
}
