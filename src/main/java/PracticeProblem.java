public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(lettersToFive("asasasasasasas",'a'));
		System.out.println(lettersToFive("amazing",'a'));
		System.out.println(lettersToFive("he says this is so slow",'s'));
		System.out.println(countLetter("he says this is so slow",'s'));
		System.out.println(countLetter("he says this is so slow",'b'));
		System.out.println(oddSum(2,10));
		System.out.println(oddSum(26,22));
	}

	//q1
	public static int lettersToFive(String word, char character) {
		int count = 0;
		int index = 0;
		int length = word.length();
		while (index < length) {
			if (word.charAt(index) == character) {
				count++;
				if (count == 5){
					return index + 1;
				}
				
			}
			index++;
		}
		return -1;
		
	}

	//q2
	public static int countLetter(String word2, char character2) {
		int count2 = 0;
		int index2 = 0;
		int length2 = word2.length();
		while (index2 < length2) {
			if (word2.charAt(index2) == character2) {
				count2++;
			}
			index2++;
		}
		return count2;
	}

	//q3
	public static int oddSum(int num1, int num2){
		int sum = 0;
		int start = Math.min(num1,num2);
		int end = Math.max(num1,num2);
		while (start <= end) {
			if (start % 2 == 1){
				sum = sum + start; 
			}
			start++;
		}
		return sum;
	}
}
