package guru.springframework.sfgpetclinic1.model;

public class Speciality extends BaseEntity{

    private String Description;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
