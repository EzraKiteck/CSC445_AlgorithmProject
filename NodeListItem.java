public class NodeListItem 
{
    NodeListItem smallerListItem = null;
    NodeListItem largerListItem = null;

    private OpenNode listItemValue;

    public NodeListItem(OpenNode value)
    {
        listItemValue = value;
    }

    public OpenNode getListItemValue() {
        return listItemValue;
    }
}
