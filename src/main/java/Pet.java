public class Pet {
    private String name;
    private String type;

    public void setName(String name){
        this.name = name;
    }

    public void setType(String name){
        this.type = name;
    }

    public String getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public String speak(){
        return " \"Pet sounds\"";
    }

    public String toString(){
        return " is a " + getType() + " named " + getName() + " " + speak();
    }
}
