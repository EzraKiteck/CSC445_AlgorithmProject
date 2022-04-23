//package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Everybody!");

        String[] nodeMapStrings = {
        "0111100000",
        "00001E0000",
        "1010111110",
        "1010000010",
        "1010001010",
        "0111001000",
        "0000001110",
        "1110001111",
        "1110S00000",
        "1110001010",
        };

        // Grid Setup
        Graph projectGraph = new Graph(10, nodeMapStrings);
        OpenNodesList openNodes = new OpenNodesList();

        projectGraph.printGraph();
        //System.out.println(projectGraph.isNodeBlocked(1, 0));

        projectGraph.openNode(4, 2);
        projectGraph.openNode(2, 2);
        projectGraph.openNode(3, 3);
        projectGraph.openNode(3, 1);

        openNodes.addNode((OpenNode)projectGraph.getNode(4, 2));
        openNodes.addNode((OpenNode)projectGraph.getNode(2, 2));
        openNodes.addNode((OpenNode)projectGraph.getNode(3, 3));
        openNodes.addNode((OpenNode)projectGraph.getNode(3, 1));

        openNodes.printNodes();
    }
}
