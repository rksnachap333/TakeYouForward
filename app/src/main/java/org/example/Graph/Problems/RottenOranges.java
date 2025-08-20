package org.example.Graph.Problems;

import org.example.BinaryTree.MediumProblem.BottomViewOfTree;
import org.example.BinaryTree.MediumProblem.BottomViewOfTree.Pair;

import java.util.*;

public class RottenOranges {

    public static int runner() {

        Queue<Pair<Pair<Integer, Integer>, Integer>> queue = new LinkedList<>();
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 1, 2));
        grid.add(Arrays.asList(0, 1, 1));
        grid.add(Arrays.asList(2, 1, 1));

        int n = grid.size();
        int m = grid.get(0).size();

        int[][] vList = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid.get(i).get(j) == 2) {
                    vList[i][j] = grid.get(i).get(j);
                    queue.offer(new Pair<>(new Pair<>(i, j), 0));
                } else {
                    vList[i][j] = 0;
                }

            }
        }

        int tm = 0;
        int[] delRow = new int[]{-1,0,1,0};
        int[] delCol = new int[]{0,1,0,-1};
        while(!queue.isEmpty()) {
            int r = queue.peek().getKey().getKey();
            int c = queue.peek().getKey().getValue();
            int t = queue.peek().getValue();
            tm = Math.max(t, tm);
            queue.poll();

            for(int i = 0; i< 4; i++) {
                int nrow = r + delRow[i];
                int ncol = c + delCol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vList[nrow][ncol] != 2
                 && grid.get(nrow).get(ncol) == 1) {
                    queue.offer(new Pair<>(new Pair<>(nrow, ncol), t + 1));
                    vList[nrow][ncol] = 2;
                }
            }
        }

        for(int i = 0; i< n;i ++) {
            for(int j = 0; j< m; j++) {
                if(vList[i][j] != 2 && grid.get(i).get(j) == 1) return -1;
            }
        }
        return tm;

    }
}
