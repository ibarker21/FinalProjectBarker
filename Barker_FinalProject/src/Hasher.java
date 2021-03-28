

/**
 * @author Ian Barker
 * This is not my algorithm. To keep the idea of real life application, I chose the SHA-1 algorithm which is one of the most commonly used algorithms for hashing
 * I basically understand how this works, except for the 0xff part on line 20 and the actual java function for the algorithm.
 */
public class Hasher
{
	
	public String hasher(String sInput)
	{
		byte[] hash = sInput.getBytes();
		StringBuilder hexString = new StringBuilder(2 * hash.length);
	    for (int i = 0; i < hash.length; i++) {
	        String hex = Integer.toHexString(0xff & hash[i]);
	        if(hex.length() == 1) {
	            hexString.append('0');
	        }
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}
}
