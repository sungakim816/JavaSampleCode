
public class WorkSpace {

	public static void main(String[] args) {
		String name = "Kim Sunga", new_name = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.substring(i, i + 1).equals(name.substring(i, i + 1).toLowerCase())) {
				new_name += name.substring(i, i + 1).toUpperCase();
			} else {
				new_name += name.substring(i, i + 1).toLowerCase();
			}
		}
		System.out.println(new_name);
	}
}