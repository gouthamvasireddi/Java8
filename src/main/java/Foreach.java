import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Foreach {

	public static void main(String[] args) {

		
		List<Integer> l = Arrays.asList(1,2,3,4,5);
				
				
		Consumer<Integer> con = new Consumer<Integer>(){
			public void accept(Integer i){
				System.out.println(i);
			}
		};
	 	
		l.forEach(con);
	}

}
