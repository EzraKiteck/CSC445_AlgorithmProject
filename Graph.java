public class Graph
{
    GraphNode[][] nodes;

    public Graph(int size, String[] buildStrings)
    {

        nodes = new GraphNode[size][size];

        for (int i = 0; i < buildStrings.length; ++i)
        {
            for (int j = 0; j < buildStrings[i].length(); ++j)
            {
                if (buildStrings[i].charAt(j) == '0')
                {
                    nodes[i][j] = new GraphNode(false);
                }
                else
                {
                    nodes[i][j] = new GraphNode(true); 
                }
            }
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
            return false;
        }
    }
}
