package org.example.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphRepresentation {

    public static List<List<Integer>> runner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of vertex : ");
        int n = scanner.nextInt();
        System.out.println("Enter number of edges : ");
        int m = scanner.nextInt();

        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjacencyList.add(new ArrayList < > ());
        }
        for(int i = 0; i < m ;i ++) {
            System.out.println("Enter the vertex detail between which the edge present(Undirectional !!)");
            System.out.println("Enter first vertex : ");
            int u = scanner.nextInt();
            System.out.println("Enter first vertex : ");
            int v = scanner.nextInt();
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        for(int i = 0; i< adjacencyList.size(); i++) {
            List<Integer> adjacent = adjacencyList.get(i);
            System.out.print(i+"---> ");
            for(Integer adjacents : adjacent) {
                System.out.print(adjacents + " ");
            }
            System.out.println();
        }
        return adjacencyList;
    }
}
