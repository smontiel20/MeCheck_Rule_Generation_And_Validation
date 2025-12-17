@Alternative
public class NotVetoed implements java,io.Serializable {
    private int id;
    private String name;

    public NotVetoed() {
        id = -1;
        name = "NAME_ME";
    }

    public void setId(int id) { 
        this.id = id; 
    }
  
    public int getId() { 
        return id; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }
  
    public String getName() { 
        return name; 
    }
}