package Trees;

import java.util.*;

public class DFS {
    public LinkedList<Integer> adj[];

    public void  createGraph(int v){
        adj = new LinkedList[v];
        for (int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void createEdges(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public boolean dfs(int source, int destination){
        boolean[] visited = new boolean[adj.length];
        visited[source] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()){
            int current = stack.pop();
            if (current == destination) return true;

            for (int neighbours: adj[current]){
                if (!visited[neighbours]){
                    visited[neighbours] = true;
                    stack.push(neighbours);
                }
            }
        }
        return false;
    }


    public void printAllPaths(int source, int destination)
    {
        boolean[] visited = new boolean[adj.length];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(source);
        printAllPathsUtil(source, destination, visited, list);
    }
    private void printAllPathsUtil(Integer source, Integer  destination,
                                   boolean[] visited,
                                   List<Integer> list)
    {
        if (source == destination) {
            System.out.println(list);
            return;
        }
        visited[source] = true;
        for (Integer neighbor : adj[source]) {
            if (!visited[neighbor]) {
                list.add(neighbor);
                printAllPathsUtil(source, destination, visited, list);
                list.remove(neighbor);
            }
        }
        visited[source] = false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DFS d = new DFS();
        System.out.print("Enter no. of vertices: ");
        int v = input.nextInt();
        d.createGraph(v);
        System.out.print("Enter no. of edges: ");
        int e = input.nextInt();
        for (int i=0; i<e; i++){
            System.out.println("Enter edge " + (i+1) + " : ");
            int source = input.nextInt();
            int destination = input.nextInt();
            d.createEdges(source, destination);
        }
        System.out.println("Enter source and Destination: ");
        int source = input.nextInt();
        int destination = input.nextInt();
        //System.out.println("Path Exist between " + source + " and " + destination + " : " + d.dfs(source, destination));
        d.printAllPaths(source, destination);
    }
}
