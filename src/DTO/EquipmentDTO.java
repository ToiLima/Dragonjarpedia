package DTO;

public class EquipmentDTO {
    //Atributos
    
    private Integer id;
    private String name;
    private String description;
    private float price;
    private String howObtain;
    private String type;

    public EquipmentDTO(Integer id, String name, String description, float price, String howObtain, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.howObtain = howObtain;
        this.type = type;
    }
    
    public EquipmentDTO() {
        this.id = null;
        this.name = null;
        this.description = null;
        this.price = 0;
        this.howObtain = null;
        this.type = null;
    }
    
    
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
}
