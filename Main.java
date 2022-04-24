//package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Everybody!");

        String[] nodeMapStrings = {
        "0111100000",
        "0000100000",
        "1010111110",
        "1010000010",
        "1010001010",
        "0111001000",
        "0000001110",
        "1110001111",
        "1110000000",
        "1110001010",
        };

        // Grid Setup
        Graph projectGraph = new Graph(10, nodeMapStrings);
        Pathfinder pathfinder = new Pathfinder(projectGraph);

        pathfinder.path(4, 8, 6, 1);
    }
}
