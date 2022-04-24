public class Pathfinder {
    
    Graph graph;
    OpenNodesList openNodes = new OpenNodesList();
    GraphNode startNode;
    GraphNode endNode;

    final int[] nPosX = {0, 1, 0, -1};
    final int[] nPosY = {1, 0, -1, 0};

    public Pathfinder(Graph graph)
    {
        this.graph = graph;
    }

    public GraphNode[] path(int startX, int startY, int endX, int endY)
    {
        startNode = graph.getNode(startX, startY);
        endNode  = graph.getNode(endX, endY);
        GraphNode[] result;

        for (int i = 0; i < 4; ++i)
        {
            openNode(startNode.getPosX() + nPosX[i], startNode.getPosY() + nPosY[i]);
        }

        openNodes.printNodes();

        return null;
    }

    public void closeNode(OpenNode nodeToClose)
    {
        // add node to closed nodes

        // Tet for optimal path?

        // open new n nodes
        for (int i = 0; i < 4; ++i)
        {
            openNode(nodeToClose.getPosX() + nPosX[i], nodeToClose.getPosY() + nPosY[i]);
        }

    }

    public void openNode(int x, int y)
    {
        if (!graph.isNodeBlocked(x, y))
        {
            graph.nodes[x][y] = new OpenNode(graph.nodes[x][y], startNode, endNode);
            openNodes.addNode((OpenNode)graph.getNode(x, y));
        }
    }
}
