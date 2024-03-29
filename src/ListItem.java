public class ListItem {

    //
    // Public
    //
    public ListItem() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int d) {
        this.cost = d;
    }

    public ListItem getNext() {
        return next;
    }
    public void setNext(ListItem next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[ListItem name=" + this.name
                + " desc=" + this.desc
                + " cost=" + this.cost + "]";
    }

    //
    // Private
    //
    private String name;
    private String desc;
    private int cost;
    private ListItem next = null;
}