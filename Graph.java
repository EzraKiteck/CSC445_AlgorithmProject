
public class Graph
{
    DefaultNode[][] nodes;

    DefaultNode startNode;
    DefaultNode endNode;

    public Graph(int size, String[] buildStrings)
    {
        nodes = new DefaultNode[size][size];

        for (int y = 0; y < size; ++y)
        {
            String row = buildStrings[y];
            for (int x = 0; x < row.length(); ++x)
            {
                if (row.charAt(x) == '0')
                {
                    nodes[x][y] = new DefaultNode(false, x, y);
                }
                else
                {
                    nodes[x][y] = new DefaultNode(true, x, y); 
                }
            }
        }
    }

    public void printGraph() {
        for (int y = 0; y < nodes.length; ++y)
        {
            String row = "|";
            for (int x = 0; x < nodes.length; ++x)
            {
                if(isNodeBlocked(x, y))
                {
                    row += "1";
                }
                else
                {
                    row += "0";
                }

                if(x != nodes.length - 1)
                {
                    row += "-";
                }
                else
                {
                    row += "|";
                }
            }
            System.out.println(row);
        }
    }

    public boolean isNodeBlocked(int x, int y)
    {
        if (x < nodes.length && y < nodes[0].length && x >= 0 && y >= 0)
        {
            return nodes[x][y].getIsBlocked();
        }
        else
        {
            System.out.print("This Node call is out of bounds!");
            return true;
        }
    }

    public void setStartNode(int x, int y)
    {
        startNode = nodes[x][y];
    }

    public void setEndNode(int x, int y)
    {
        endNode = nodes[x][y];
    }

    public GraphNode getNode(int x, int y)
    {
        if (x < nodes.length && y < nodes[0].length && x >= 0 && y >= 0)
        {
            return nodes[x][y];
        }
        else
        {
            return null;
        }
        
    }

    public void openNode(int x, int y)
    {
        nodes[x][y] = new OpenNode(nodes[x][y], startNode, endNode);
    }
}
