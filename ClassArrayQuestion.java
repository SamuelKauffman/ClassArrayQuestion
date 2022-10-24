import java.util.ArrayList;
public class ClassArrayQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Animals = new ArrayList<String>();
		Animals.add("Cat");
		Animals.add("Dog");
		Animals.add("Horse");
		Animals.add("Cow");
		Animals.add("Leopard");
		System.out.println(Animals.get(2));
		System.out.println(Animals.size());
		Animals.set(3, "Buffalo");
		Animals.set(4, "Tiger");
		Animals.remove(0);
		Animals.remove(0);
		for(String S: Animals) {
			System.out.println(S);
		}

	}

}
