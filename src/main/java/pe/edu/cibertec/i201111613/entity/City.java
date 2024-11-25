package pe.edu.cibertec.i201111613.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class City {


        //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private String district;
    private int population;

    // Relación con Country (muchos a 1)
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CountryCode", referencedColumnName = "code")
    private Country country;

    public City() {
    }

    public City(int id, String name, String district, int population, Country country) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.population = population;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "population=" + population +
                ", district='" + district + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
