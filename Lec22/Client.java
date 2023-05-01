package Lec22;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyGraph gp = new MyGraph(7);
		
		gp.addEdge(1, 2, 10);
		gp.addEdge(2, 3, 20);
		gp.addEdge(3, 4, 30);
		gp.addEdge(1, 4, 60);
		gp.addEdge(4, 5, 80);
		gp.addEdge(5, 6, 90);
		gp.addEdge(6, 7, 7);
		gp.addEdge(5, 7, 15);
		
		
		gp.display();
		gp.removeVertex(4);
		System.out.println();
		gp.display();
		
		

	}

}
