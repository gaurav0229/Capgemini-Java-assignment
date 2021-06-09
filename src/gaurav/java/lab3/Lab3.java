package gaurav.java.lab3;

import java.awt.image.ReplicateScaleFilter;

class GFG {

	boolean isVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return false;
		}
		return true;
	}


String replaceConsonants(char[] s) {

	for (int i = 0; i < s.length; i++) {
		if (!isVowel(s[i])) {

			if (s[i] == 'z') {
				s[i] = 'b';
			}

			else {
				s[i] = (char) (s[i] + 1);       heeltgosheelt

				if (isVowel(s[i])) {
					s[i] = (char) (s[i] + 1);
				}
			}
		}
	}
	return String.valueOf(s);
}
}


public class Lab3 {
	public void main(String[] args) {
		{
			String s = "geeksforgeeks";
				
			System.out.println(obj(s.toCharArray()));
		
	}

}
}

	

