//package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Everybody!");

        String[] nodeMapStrings = {
        "0100000000",
        "0000000000",
        "1000000000",
        "0000000000",
        "0000001110",
        "0000001010",
        "0000001110",
        "0000000000",
        "0000000000",
        "0000000000",
        };

        // Grid Setup
        Graph projectGraph = new Graph(10, nodeMapStrings);
        OpenNodesList openNodes = new OpenNodesList();
        GraphNode currentNode;

        // Pathfind Start and end
        projectGraph.setStartNode(0, 0);
        projectGraph.setEndNode(9, 9);

        // Pathfind start!
        currentNode = projectGraph.getNode(0, 5);


        projectGraph.printGraph();
        System.out.println(projectGraph.isNodeBlocked(1, 0));

        projectGraph.openNode(1, 2);
        openNodes.addNode(projectGraph.getNode(1, 2));

        currentNode = projectGraph.getNode(0, 5);
        GraphNode eastN = projectGraph.getNode(currentNode.getPosX() + 1, currentNode.getPosY());
        GraphNode westN = projectGraph.getNode(currentNode.getPosX() + -1, currentNode.getPosY());
        GraphNode northN = projectGraph.getNode(currentNode.getPosX(), currentNode.getPosY() - 1);
        GraphNode southN = projectGraph.getNode(currentNode.getPosX(), currentNode.getPosY() + 1);

        if (eastN != null)
        {
            if (!eastN.getIsBlocked())
            {
            openNodes.addNode(eastN);
            }
        }

        

        openNodes.printNodes();
    }
}
