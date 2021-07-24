package Trees;

import java.util.*;

class BfsSearch{

    public LinkedList<Integer> adj[];

    public void createGraph(int v){
        adj = new LinkedList[v];
        for (int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void createEdges(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
    public int minDistanceByBFS(int source, int destination){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.length];
        int[] parent = new int[adj.length];

        q.add(source);
        visited[source] = true;
        parent[source] = -1;

        while (!q.isEmpty()){
            int cur = q.poll();
            if(cur == destination) break;

            for (int neighbour : adj[cur]){
                if (!visited[neighbour]){
                    visited[neighbour] = true;
                    parent[neighbour] = cur;
                    q.add(neighbour);
                }
            }
        }
        int cur = destination;
        int distance = 0;
        System.out.print("Path: ");
        while (parent[cur]!=-1){
            System.out.print(cur + " <- ");
            cur = parent[cur];
            distance++;
        }
        System.out.println(0);
        return distance;
    }

    public void print(){
        for (int i=0; i<adj.length; i++){
            System.out.print(i + "-> ");
            adj[i].forEach(System.out::print);
            System.out.print(" \n");
        }
    }
}
public class BFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BfsSearch b = new BfsSearch();
        System.out.print("Enter no of Vertices: ");
        int v = in.nextInt();
        b.createGraph(v);
        System.out.print("Enter no of Edges: ");
        int e = in.nextInt();
        for (int i=0; i<e; i++){
            System.out.print("Enter " + (i+1) + " Edge: \n");
            int source = in.nextInt();
            int destination = in.nextInt();
            b.createEdges(source, destination);
        }
        b.print();
        System.out.println("Enter source and destination of path: \n");
        int source = in.nextInt();
        int destination = in.nextInt();
        System.out.println("\nMinimum distance by BFS algo between " + source + " and " + destination + ": " + b.minDistanceByBFS(source, destination));
    }
}
