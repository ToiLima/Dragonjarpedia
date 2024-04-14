package DTO;

public class EquipmentDTO {
    //Atributos
    
    private Integer id;
    private String name;
    private String description;
    private float price;
    private String howObtain;
    private String type;
    private boolean removed;
    
    //Métodos(Getter's e Setter's)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getHowObtain() {
        return howObtain;
    }

    public void setHowObtain(String howObtain) {
        this.howObtain = howObtain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }    
}
