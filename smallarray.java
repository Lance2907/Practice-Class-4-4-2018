
public class smallarray {
public static void main (String [] args){
	int [] list={7,29,18,72,20,12};
	int smallest= list[0];
	int secondsmallest= list[1];
	for (int i=0; i<list.length; i++){
		
	if (list [i]<smallest ){
		smallest= list [i];
		
		}
	}
	for (int i=0; i<list .length; i++){
		if (list [i]>smallest && list [i]< secondsmallest){
			secondsmallest= list [i];
		}
	}
}
}		

			