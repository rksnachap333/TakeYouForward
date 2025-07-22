package org.example.GreedyAlgorithm.FractionalKnapsack;

public class Item {
    int val;
    int weight;
    double ratio;

    public Item(int val, int weight) {
        this.val = val;
        this.weight = weight;
        this.ratio = (double) val/weight;
    }
}
