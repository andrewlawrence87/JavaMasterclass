import java.util.List;

/**
 * Created by Andrew on 12-May-18.
 */
public abstract class ListItem {

    protected ListItem prevItem = null;
    protected ListItem nextItem = null;

    protected Object value;

    public String readNext(){
        return ((String) this.nextItem.getValue());
    }

    public String readPrev(){
        return ((String) this.prevItem.getValue());
    }

    public ListItem moveNext() {
        return this.nextItem;
    }

    public ListItem movePrev() {
        return null;
    }

    public int compareTo(ListItem item){
            if(item != null){
        return ((String) getValue()).compareTo((String) item.getValue());
    } else
            return 0;
}


    public abstract void setNext(ListItem listItem);

    public abstract void setPrev(ListItem listItem);

    public Object getValue(){
            return value;
    }
}
