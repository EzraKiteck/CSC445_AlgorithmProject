import java.util.ArrayList;

public class Pathfinder {
    
    Graph graph;
    ArrayList<GraphNode> openNodes = new ArrayList<>();
    ArrayList<GraphNode> closedNodes = new ArrayList<>();
    GraphNode startNode;
    GraphNode endNode;
    GraphNode currentNode;

    final int[] nPosX = {0, 1, 0, -1};
    final int[] nPosY = {1, 0, -1, 0};

    

    public Pathfinder(Graph graph)
    {
        this.graph = graph;
    }

    public GraphNode path(int startX, int startY, int endX, int endY)
    {
        startNode = graph.getNode(startX, startY);
        endNode  = graph.getNode(endX, endY);

        openNodes.add(startNode);
        while(openNodes.size() > 0)
        {
            currentNode = getSmallestFCost();
            System.out.println(currentNode.getPosX() +", " + currentNode.getPosY());

            if (currentNode == endNode)
            {
                return currentNode;
            }

            for (int i = 0; i < 4; ++i)
            {
                openNode(graph.getNode(currentNode.getPosX() + nPosX[i], currentNode.getPosY() + nPosY[i]));
            }

            openNodes.remove(currentNode);
            closedNodes.add(currentNode);

        }
        

        return null;
    }

    public void openNode(GraphNode nodeToOpen)
    {
        
            if (!nodeToOpen.isBlocked())
        {
            if (!closedNodes.contains(nodeToOpen) && !openNodes.contains(nodeToOpen))
        {
            nodeToOpen.setgCost(getDistance(startNode.getPosX(), startNode.getPosY(), nodeToOpen.getPosX(), nodeToOpen.getPosY()));
            nodeToOpen.sethCost(getDistance(nodeToOpen.getPosX(), nodeToOpen.getPosY(), endNode.getPosX(), endNode.getPosY()));
            nodeToOpen.setfCost(nodeToOpen.getgCost() + nodeToOpen.gethCost());

            openNodes.add(nodeToOpen);
            nodeToOpen.setPriviousGraphNode(currentNode);
        }
        else
        {
            if (nodeToOpen != startNode)
            {
                if(currentNode.getfCost() < nodeToOpen.getPriviousGraphNode().getfCost())
            {
                nodeToOpen.setPriviousGraphNode(currentNode);
                if (closedNodes.contains(nodeToOpen))
                {
                    closedNodes.remove(nodeToOpen);
                    openNodes.add(nodeToOpen);
                }
            }
            }
        }
        }
        
        
    }

    private int getDistance(int startX, int startY, int endX, int endY)
    {
        return (int) Math.round(Math.sqrt(Math.pow(Math.abs(startX - endX) * 5,2) + Math.pow(Math.abs(startY - endY) * 5,2)));
    }

    private GraphNode getSmallestFCost()
    {
        GraphNode result = openNodes.get(0);
        for (GraphNode graphNode : openNodes) {
            if (graphNode.getfCost() < result.getfCost())
            {
                result = graphNode;
            }
        }
        return result;
    }
}
