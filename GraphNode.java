public class GraphNode
{

    private GraphNode priviousGraphNode = null;

    private boolean isBlocked = false;
    private boolean isOpen = false;

    private int posX;
    private int posY;

    private int gCost;
    private int hCost;
    private int fCost;

    public GraphNode(boolean isBlocked, int posX, int posY)
    {
        this.isBlocked = isBlocked;
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public GraphNode getPriviousGraphNode() {
        return priviousGraphNode;
    }
    public void setPriviousGraphNode(GraphNode priviousGraphNode) {
        this.priviousGraphNode = priviousGraphNode;
    }
    public boolean isBlocked() {
        return isBlocked;
    }
    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public int getgCost() {
        return gCost;
    }
    public void setgCost(int gCost) {
        this.gCost = gCost;
    }
    public int gethCost() {
        return hCost;
    }
    public void sethCost(int hCost) {
        this.hCost = hCost;
    }
    public int getfCost() {
        return fCost;
    }
    public void setfCost(int fCost) {
        this.fCost = fCost;
    }

    
}