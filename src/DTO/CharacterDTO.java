package DTO;

public class CharacterDTO {
    //Atributos
    
    private Integer id;
    private String name;
    private String description;
    private String gender;
    private String age;
    private String race;
    private String classe;

    //Construtores
    public CharacterDTO(Integer id, String name, String description, String gender, String age, String race, String classe) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.gender = gender;
        this.age = age;
        this.race = race;
        this.classe = classe;
    }
    
    public CharacterDTO() {
        this.id = null;
        this.name = null;
        this.description = null;
        this.gender = null;
        this.age = null;
        this.race = null;
        this.classe = null;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

}
