public class OpenNodesList 
{

    OpenNode[] openNodes = new OpenNode[20];
    int listTail = -1;

    public OpenNodesList() 
    {

    }

    public void addNode(GraphNode node)
    {
        if (listTail == openNodes.length - 1)
        {
            OpenNode[] newOpenNodes = new OpenNode[openNodes.length * 2];
            for (int i = 0; i < openNodes.length; ++i)
            {
                newOpenNodes[i] = openNodes[i];
            }
            openNodes = newOpenNodes;
        }

        
        listTail += 1;
        openNodes[listTail] = (OpenNode) node;
    }
    
    public void printNodes()
    {
        for (int i = 0; i <= listTail; ++i)
        {
            System.out.print("Node: (" + openNodes[i].getPosX() + ", " + openNodes[i].getPosY() + ")");
            System.out.print(" G Cost: " + openNodes[i].getGCost());
            System.out.print(", H Cost: " + openNodes[i].getHCost());
            System.out.println(", F Cost: " + openNodes[i].getFCost());
        }
    }
}
