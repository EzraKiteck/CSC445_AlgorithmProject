public class Actor
{
    int posX;
    int posY;

    public Actor(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX()
    {
        return posX;
    }

    public int getPosY()
    {
        return posY;
    }

    public void setPos(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }
}
