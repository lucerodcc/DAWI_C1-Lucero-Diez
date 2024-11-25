package pe.edu.cibertec.i201111613.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import java.util.*;

@Entity
public class Country {

    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private double surfaceArea;
    private Integer indepYear;
    private int population;
    private Double lifeExpectancy;
    private Double gnp;
    private Double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    // Relación con City (1 a muchos)
    @OneToMany(mappedBy = "country", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<City> cities;

    // Relación con CountryLanguage (1 a muchos)
    @OneToMany(mappedBy = "country", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<CountryLanguage> languages;

    public Country() {
    }

    public Country(String code, String name, String continent, String region, double surfaceArea, Integer indepYear, int population, Double lifeExpectancy, Double gnp, Double gnpOld, String localName, String governmentForm, String headOfState, Integer capital, String code2, List<City> cities, List<CountryLanguage> languages) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
        this.cities = cities;
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code2='" + code2 + '\'' +
                ", capital=" + capital +
                ", headOfState='" + headOfState + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", localName='" + localName + '\'' +
                ", gnpOld=" + gnpOld +
                ", gnp=" + gnp +
                ", lifeExpectancy=" + lifeExpectancy +
                ", population=" + population +
                ", indepYear=" + indepYear +
                ", surfaceArea=" + surfaceArea +
                ", region='" + region + '\'' +
                ", continent='" + continent + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Double getGnp() {
        return gnp;
    }

    public void setGnp(Double gnp) {
        this.gnp = gnp;
    }

    public Double getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(Double gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(List<CountryLanguage> languages) {
        this.languages = languages;
    }
}

