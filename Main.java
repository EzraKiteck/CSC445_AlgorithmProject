//package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Hello, world!");

    String[] nodeMapStrings = {
        "0100000000",
        "0000000000",
        "1000000000",
        "0000000000",
        "0000000000",
        "0000000000",
        "0000000000",
        "0000000000",
        "0000000000",
        "0000000000",
    };

        Graph projectGraph = new Graph(10, nodeMapStrings);

        System.out.print(projectGraph.isNodeBlocked(0,0));
        System.out.print(projectGraph.isNodeBlocked(0,1));
        System.out.print(projectGraph.isNodeBlocked(1,0));
        System.out.print(projectGraph.isNodeBlocked(0,2));
    }
}
