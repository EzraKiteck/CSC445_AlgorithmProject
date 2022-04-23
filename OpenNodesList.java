public class OpenNodesList 
{

    NodeListItem smallestCostItem;

    int listSize = 0;

    public OpenNodesList() 
    {

    }

    public void addNode(OpenNode node)
    {
        if (listSize == 0)
        {
            //System.out.println("First Element in the List");
            smallestCostItem = new NodeListItem(node);
        }
        else
        {
            NodeListItem testingItem = smallestCostItem;
            NodeListItem newItem = new NodeListItem(node);

            if (smallestCostItem.getListItemValue().getFCost() > node.getFCost())
            {
                //System.out.println("New Item is at the front of the list");
                NodeListItem oldSmallestCostItem = smallestCostItem;
                smallestCostItem = new NodeListItem(node);
                smallestCostItem.largerListItem = oldSmallestCostItem;
                
            }
            else
            {
                while (newItem.getListItemValue().getFCost() > testingItem.getListItemValue().getFCost())
                {
                    if (testingItem.largerListItem != null)
                    {
                        testingItem = testingItem.largerListItem;
                    }
                    else
                    {
                        break;
                    }
                }
                if (testingItem.largerListItem != null)
                {
                    //System.out.println("New Item is in the middle of the list");
                    newItem.smallerListItem = testingItem;
                    newItem.largerListItem = testingItem.largerListItem;
                    testingItem.largerListItem = newItem;
                }
                else
                {
                    //System.out.println("New Item is at the end of the list");
                    newItem.smallerListItem = testingItem;
                    newItem.largerListItem = null;
                    testingItem.largerListItem = newItem;
                }
                
            }
        }
        listSize += 1;
    }
    
    public void printNodes()
    {
        if (listSize > 0)
        {
            NodeListItem outputItem = smallestCostItem;
            while (outputItem != null)
            {
                System.out.print("(Node: (" + outputItem.getListItemValue().getPosX() + ", " + outputItem.getListItemValue().getPosY() + ")");
                System.out.print(" G Cost: " + outputItem.getListItemValue().getGCost());
                System.out.print(", H Cost: " + outputItem.getListItemValue().getHCost());
                System.out.print(", F Cost: " + outputItem.getListItemValue().getFCost());
                System.out.println(") ->");

                outputItem = outputItem.largerListItem;
            } 
        }
    }
}
