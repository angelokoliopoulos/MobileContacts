package model;

public class AbstractEntity implements  IdentifiableEntity{
    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
}
