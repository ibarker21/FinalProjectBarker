
public class CaesarCipher
{
	public static void main(String[] args)
	{
		StringBuilder result = encode("ian barker", 1);
		System.out.println(result);
		String goBack = result.toString();
		System.out.println(decode(goBack,1));
		
	}
	
	public static StringBuilder decode(String sInput, int iShift)
	{
		StringBuilder finalString = new StringBuilder();
		for(char character : sInput.toCharArray())
		{
			if (character != ' ') 
			{
		        int originalPosition = character - 'a';
		        int newAlphabetPosition = (originalPosition - iShift) % 26;
		        char newCharacter = (char) ('a' + newAlphabetPosition);
		        finalString.append(newCharacter);
		    } else {
		        finalString.append(character);
		    }
		}
		return finalString;
		
	}
	
	public static StringBuilder encode(String sInput, int iShift)
	{
		StringBuilder finalString = new StringBuilder();
		for(char character : sInput.toCharArray())
		{
			if (character != ' ') 
			{
		        int originalPosition = character - 'a';
		        int newAlphabetPosition = (originalPosition + iShift) % 26;
		        char newCharacter = (char) ('a' + newAlphabetPosition);
		        finalString.append(newCharacter);
		    } else {
		        finalString.append(character);
		    }
		}
		return finalString;
	}
}
