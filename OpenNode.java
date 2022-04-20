public class OpenNode extends DefaultNode
{

    private int gCost;
    private int hCost;
    private int fCost;

    public OpenNode(DefaultNode node, DefaultNode startNode, DefaultNode endNode)
    {
        super(node.getIsBlocked(), node.getPosX(), node.getPosY());
        this.gCost = getDistance(startNode.getPosX(), startNode.getPosY(), node.getPosX(), node.getPosY());
        this.hCost = getDistance(node.getPosX(), node.getPosY(), endNode.getPosX(), endNode.getPosY());
        this.fCost = gCost + hCost;
    }

    private int getDistance(int startX, int startY, int endX, int endY)
    {
        return (int) Math.round(Math.sqrt(Math.pow(Math.abs(startX - endX),2) + Math.pow(Math.abs(startY - endY),2)));
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
