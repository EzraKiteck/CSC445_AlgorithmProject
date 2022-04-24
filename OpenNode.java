public class OpenNode extends DefaultNode
{

    private int gCost;
    private int hCost;
    private int fCost;

    public OpenNode(GraphNode node, GraphNode startNode, GraphNode endNode)
    {
        super(node.getIsBlocked(), node.getPosX(), node.getPosY());
        this.gCost = getDistance(startNode.getPosX(), startNode.getPosY(), node.getPosX(), node.getPosY());
        this.hCost = getDistance(node.getPosX(), node.getPosY(), endNode.getPosX(), endNode.getPosY());
        this.fCost = gCost + hCost;
    }

    private int getDistance(int startX, int startY, int endX, int endY)
    {
        return (int) Math.round(Math.sqrt(Math.pow(Math.abs(startX - endX) * 5,2) + Math.pow(Math.abs(startY - endY) * 5,2)));
    }

    public int getGCost() {
        return gCost;
    }

    public int getHCost() {
        return hCost;
    }

    public int getFCost() {
        return fCost;
    }
}
