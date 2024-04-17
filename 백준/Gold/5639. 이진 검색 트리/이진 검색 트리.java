import java.util.Scanner;

public class Main {
	public static class Node {
		int id;
		Node par;
		Node left;
		Node right;

		public Node(int id, Node par) {
			this.id = id;
			this.par = par;
		}
	}

	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sb = new StringBuilder();

		Node root = new Node(sc.nextInt(), null);
		Node ex = root;

		while (sc.hasNextInt()) {
			int tempid = sc.nextInt();
			
			if (tempid < ex.id) {
				Node temp = new Node(tempid, ex);
				ex.left = temp;
				ex = temp;
			} else {
				Node tempex = ex;
				while (tempex.par != null && tempex.par.id < tempid ) {
					tempex = tempex.par;
					if(tempex.par != null && tempex.par.id < tempid)
						continue;
					if(tempex.right==null)
						break;
				}
				while (tempex.right!=null) {
					tempex = tempex.right;
				}
				Node temp = new Node(tempid, tempex);
				tempex.right = temp;
				ex = temp;
			}

		}
		post(root);

		System.out.println(sb);

	}

	public static void post(Node node) {
		
		if (node.left != null)
			post(node.left);
		if (node.right != null)
			post(node.right);
		sb.append(node.id + "\n");
	}
	
	public static String input = "50\r\n"
			+ "49\r\n"
			+ "48\r\n"
			+ "47\r\n"
			+ "46\r\n"
			+ "45\r\n"
			+ "44\r\n"
			+ "51\r\n"
			+ "52\r\n"
			+ "53\r\n"
			+ "54\r\n"
			+ "55\r\n"
			+ "56\r\n";

}
