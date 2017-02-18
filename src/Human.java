import java.util.Date;
import java.util.Objects;

public class Human {
    public Human(String name, String lastName, Integer dateOfBirth){
        setName(name);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
    }
    private String name;
    private String lastName;
    private Integer dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getName() == human.getName() &&
                Objects.equals(getLastName(), human.getLastName()) &&
                Objects.equals(getDateOfBirth(), human.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getDateOfBirth());
    }
}
