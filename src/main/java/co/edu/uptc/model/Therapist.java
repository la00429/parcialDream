package co.edu.uptc.model;

public class Therapist extends Psychologist{

    public Therapist(Long id, String name, String lastName, String age, String contact) {
        super(id, name, lastName, age, contact);
    }

    @Override
    public String getAge() {
        return super.getAge();
    }

    @Override
    public String getContact() {
        return super.getContact();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }

    @Override
    public void setContact(String contact) {
        super.setContact(contact);
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
