
public class Graph
{
    GraphNode[][] nodes;

    GraphNode startNode;
    GraphNode endNode;

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
                else if (row.charAt(x) == '1')
                {
                    nodes[x][y] = new DefaultNode(true, x, y); 
                }
                else if (row.charAt(x) == 'S')
                {
                    nodes[x][y] = new DefaultNode(false, x, y);
                    startNode = nodes[x][y];
                }
                else if (row.charAt(x) == 'E')
                {
                    nodes[x][y] = new DefaultNode(false, x, y);
                    endNode = nodes[x][y];
                }
            }
        }
    }

    public void printGraph() {
        for (int y = 0; y < nodes.length; ++y)
        {
            String row = "|";
            String block = "";
            for (int x = 0; x < nodes.length; ++x)
            {
                block = "";
                if(isNodeBlocked(x, y))
                {
                    block = "[]";
                    
                }
                else
                {
                    block = "``";
                }

                if(getNode(x, y) == startNode)
                {
                    block = "St";
                }

                if(getNode(x, y) == endNode)
                {
                    block = "En";
                }

                if(x != nodes.length - 1)
                {
                    block += "-";
                }
                else
                {
                    block += "|";
                }
                row += block;
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
        if (!isNodeBlocked(x, y))
        {
            nodes[x][y] = new OpenNode(nodes[x][y], startNode, endNode);
        }
    }
}
