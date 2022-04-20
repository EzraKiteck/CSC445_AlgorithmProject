public class DefaultNode implements GraphNode
{
    private boolean isBlocked;

    private int posX;
    private int posY;

    public DefaultNode(boolean isBlocked, int posX, int posY)
    {
        this.isBlocked = isBlocked;
        this.posX = posX;
        this.posY = posY;
    }

    public boolean getIsBlocked()
    {
        return isBlocked;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}