public class NodeListItem 
{
    NodeListItem smallerListItem = null;
    NodeListItem largerListItem = null;

    private OpenNode listItemValue;

    public NodeListItem(OpenNode value)
    {
        listItemValue = value;
    }

    public void setListItemValue(OpenNode listItemValue) {
        this.listItemValue = listItemValue;
    }

    public OpenNode getListItemValue() {
        return listItemValue;
    }
}
