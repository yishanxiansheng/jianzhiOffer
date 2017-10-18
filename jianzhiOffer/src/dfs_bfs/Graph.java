package dfs_bfs;

public class Graph {
	private final int Max_Verts = 20;
	private Vertex[] vertex;
	public int[][] adjMat;
	private int Current_vertex;
	private Stack stack;
	private Queue queue;

	public Graph() {
		vertex = new Vertex[Max_Verts];
		adjMat = new int[Max_Verts][Max_Verts];
		Current_vertex = 0;
		stack = new Stack();
		queue = new Queue();
	}

	public void addVertex(char lable) {
		vertex[Current_vertex++] = new Vertex(lable);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void displayVertex(int v) {
		System.out.println(vertex[v].label);
	}
	
	
	
	
	/**
	 * 判断与vertex[v]是否有相连还没有访问的节点
	 * @param v
	 * @return
	 */
	public int connected(int v){
		for (int i = 0; i < vertex.length; i++) {
			if(adjMat[v][i]==1&&vertex[i].isVisited==false){
				return i;
			}
		}
		return -1;
	}
	/**
	 * 深度优先搜索
	 */
	public void dfs(){
		vertex[0].isVisited=true;
		stack.push(0);
		displayVertex(0);
		while(!stack.isEmpty()){
			int e=connected(stack.peek());
			if (e==-1) {
				stack.pop();
			}else {
				stack.push(e);
				vertex[e].isVisited=true;
				displayVertex(e);
			}
		}
		for (int i = 0; i < vertex.length; i++) {
			vertex[i].isVisited=false;
		}
	}
	/**
	 * 广度优先搜索
	 */
	public void bfs(){
		queue.insert(0);
		vertex[0].isVisited=true;
		int v2;
		while(!queue.isEmpty()){
			int v1=queue.remove();
			vertex[v1].isVisited=true;
			displayVertex(v1);
			while(connected(v1)!=-1){
				v2=connected(v1);
				queue.insert(v2);
				vertex[v2].isVisited=true;
			}
		}
		for (int i = 0; i < vertex.length; i++) {
			if (vertex[i]!=null) {
				vertex[i].isVisited=false;
			}
			
		}
	}
	
	
	

}
