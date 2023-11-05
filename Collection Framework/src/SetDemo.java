import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		Set s1=new HashSet();
		s1.add(60);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		
		s1.addAll(s);
		System.out.println(s1);
	}

}
