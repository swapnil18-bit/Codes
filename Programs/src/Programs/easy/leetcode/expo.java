package Programs.easy.leetcode;

import java.util.*;
class expo2{
    public LinkedList<Integer> adj[];
    public void graph(int v){
        adj = new LinkedList[v];
        for (int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void fillEdges(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public int minDistance(int source, int destination){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adj.length];
        int[] parent = new int[adj.length];

        queue.add(source);
        visited[source] = true;
        parent[source] = -1;


        while (!queue.isEmpty()){
            int cur = queue.poll();
            if (cur == destination) break;

            for (int neighbour: adj[cur]){
                if (!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                    parent[neighbour] = cur;
                }
            }

        }
        int cur = destination;
        int distance = 0;
        while (parent[cur]!= -1){
            System.out.print(cur + "<-");
            cur = parent[cur];
            distance++;
        }
        System.out.print(0 + "\n");
        return distance;
    }

    public void printAllPaths(int source, int destination){
        ArrayList<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[adj.length];
        path.add(source);
        printPaths(source, destination, visited, path);
    }
    public void printPaths(Integer source, Integer destination, boolean[] visited, List<Integer> path){
        if (source == destination){
            System.out.println(path);
            return;
        }
        visited[source] = true;

        for (int neighbor: adj[source]){
            if(!visited[neighbor]){
                path.add(neighbor);
                printPaths(neighbor, destination, visited, path);
                path.remove(neighbor);
            }
        }
        visited[source] = false;
    }

}
public class expo {
    public static void main(String[] args) {

        expo2 ex = new expo2();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of vertices and edges: ");
        int v = input.nextInt();
        int e = input.nextInt();

        ex.graph(v);

        System.out.println("Enter " + e + " edges: ");
        int source,destination;
        for (int i=0; i<e; i++){
            source = input.nextInt();
            destination = input.nextInt();
            System.out.println();
            ex.fillEdges(source, destination);
        }

        System.out.println("Enter source and destination: ");
        source = input.nextInt();
        destination = input.nextInt();
        ex.printAllPaths(source, destination);
        //int min = ex.minDistance(source, destination);

        //System.out.println("Minimum distance between " + source + " and " + destination + " = " + min);
    }
}
