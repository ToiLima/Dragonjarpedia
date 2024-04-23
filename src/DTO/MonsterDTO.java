package DTO;

public class MonsterDTO {
    //Atributos
    
    private Integer id;
    private String name;
    private String description;
    private String family;

    public MonsterDTO(Integer id, String name, String description, String family) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.family = family;
    }
    
    public MonsterDTO() {
        this.id = null;
        this.name = null;
        this.description = null;
        this.family = null;
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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

}
