
public class Largest {
public static void main (String[] args){
	int[] numbers ={3,24,52,25,63};
	
	int first= numbers[0];
	for (int i=0;i< numbers.length;  i++){
		if(numbers [i]>first){
			first=numbers [i];
		}
		
	}
	System.out.println(first);
		}
}
