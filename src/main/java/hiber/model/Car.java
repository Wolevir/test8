package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "sereas")
    private  int sereas;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car(String model, int sereas) {
        this.model = model;
        this.sereas = sereas;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSereas() {
        return sereas;
    }

    public void setSereas(int sereas) {
        this.sereas = sereas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
