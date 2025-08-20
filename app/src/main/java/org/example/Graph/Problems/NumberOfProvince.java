package org.example.Graph.Problems;

import org.example.Graph.GraphRepresentation;

import java.util.Arrays;
import java.util.List;

public class NumberOfProvince {

    public static void runner() {
        int provCount = 0;
        List<List<Integer>> adjacencyList = GraphRepresentation.runner();
        int[] vList = new int[adjacencyList.size() + 1];
        Arrays.fill(vList,0);

        // if the node is 1 based and, if it is 0 based index start from 0
        for(int i = 1; i< adjacencyList.size();i++) {
            if(vList[i] == 0){
                provCount++;
                dfs(i,vList,adjacencyList);
            }
        }

        System.out.println("Total Province ==="+provCount);
    }

    private static void dfs(int node, int[] vList, List<List<Integer>> adjacencyList) {
        vList[node] = 1;
        for(Integer it : adjacencyList.get(node)) {
            if(vList[it] == 0)
                dfs(it,vList,adjacencyList);
        }
    }
}
