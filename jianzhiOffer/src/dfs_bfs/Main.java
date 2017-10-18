package dfs_bfs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph fGraph = new Graph();
		for (int i = 0; i < 9; i++) {
			char a = (char) ('A' + i);
			fGraph.addVertex(a);
		}
		fGraph.addEdge(0, 1);
		fGraph.addEdge(0, 2);
		fGraph.addEdge(0, 3);
		fGraph.addEdge(0, 4);
		fGraph.addEdge(1, 5);
		fGraph.addEdge(5, 7);
		fGraph.addEdge(3, 6);
		fGraph.addEdge(6, 8);
//		fGraph.dfs();
		fGraph.bfs();

	}

}
