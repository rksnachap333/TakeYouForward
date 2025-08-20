package org.example.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSTraversal {

    public static void runner(int startingVertex) {
        List<Integer> dfs = new ArrayList<>();
        List<List<Integer>> adjacencyList = GraphRepresentation.runner();
        int[] vList = new int[adjacencyList.size() + 1];
        Arrays.fill(vList,0);
        dfsHelper(startingVertex,dfs,adjacencyList,vList);
        System.out.println("DFS of the Graph ====>");
        for(Integer it : dfs) {
            System.out.print(it + " ");
        }
    }

    private static void dfsHelper(int node, List<Integer> dfs, List<List<Integer>> adjacencyList, int[] vList) {
        dfs.add(node);
        vList[node] = 1;
        for(Integer it : adjacencyList.get(node)) {
            if(vList[it] == 0)
                dfsHelper(it,dfs,adjacencyList,vList);
        }
    }
}
