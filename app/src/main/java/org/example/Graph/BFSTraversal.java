package org.example.Graph;

import java.lang.reflect.Array;
import java.util.*;

public class BFSTraversal {

    public static void runner(int startingVertex) {
        List<Integer> bfS = new ArrayList<>();
        List<List<Integer>> adjacencyList = GraphRepresentation.runner();
        int[] vList = new int[adjacencyList.size() + 1];
        Arrays.fill(vList, 0);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startingVertex);
        vList[startingVertex] = 1;
        while(!queue.isEmpty()) {
            int data = queue.poll();
            bfS.add(data);
            for(Integer it : adjacencyList.get(data)) {
                if(vList[it] != 1) {
                    vList[it] = 1;
                    queue.offer(it);
                }
            }

        }

        System.out.println("BFS of the Graph ====>");
        for(Integer it : bfS) {
            System.out.print(it + " ");
        }

    }
}
