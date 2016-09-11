package ITS350;

/**
 * Created by Hussein on 5/8/16.
 */
class Vertex {
    public char label;
    public boolean isVisited;

    public Vertex(char label) {
        this.label = label;
        this.isVisited = false;
    }
}

class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    StackX theStack = new StackX();

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    public void dfs() {
        vertexList[0].isVisited = true;         // mark it
        displayVertex(0);                       // display it
        theStack.push(0);                       // push it

        while(!theStack.isEmpty()) {
            int v = getUnvisited(theStack.peek());
            if (v == -1)
                theStack.pop();
            else {
                vertexList[v].isVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        for (int j=0; j<nVerts; j++)
            vertexList[j].isVisited = false;
    }

    public int getUnvisited(int v) {
        for (int i = 0; i < nVerts; i++) {
            if(adjMat[v][i]==1 && vertexList[i].isVisited==false)
                return i;
        }
        return -1;
    }
}

class StackX {
    private final int SIZE = 20;
    private int[] st;
    private int top;

    public StackX() {
        st = new int[SIZE];
        top = -1;
    }

    public void push(int j) {
        st[++top] = j;
    }

    public int pop() {
        return st[top--];
    }

    public int peek() {
        return st[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class DFSApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 4);

        System.out.print("Visits: ");
        theGraph.dfs();
        System.out.println();
    }
}


