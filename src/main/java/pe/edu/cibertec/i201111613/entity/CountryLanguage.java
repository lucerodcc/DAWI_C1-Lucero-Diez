package pe.edu.cibertec.i201111613.entity;

import jakarta.persistence.*;

@Entity
public class CountryLanguage {

    @Id
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CountryCode", referencedColumnName = "code")
    private Country country;

    @Id
    private String language;

//    @Column(name = "isOfficial")
//    private boolean isOfficial;

    @Enumerated(EnumType.STRING) // Esto indica que estamos usando un Enum que se guardará como STRING (T/F)
    @Column(name = "isOfficial")
    OfficialStatus isOfficial;

    private double percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(Country country, String language, OfficialStatus isOfficial, double percentage) {
        this.country = country;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public enum OfficialStatus {
        T, // Representa 'True' o 'Oficial'
        F  // Representa 'False' o 'No oficial'
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }

    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public OfficialStatus getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(OfficialStatus isOfficial) {
        this.isOfficial = isOfficial;
    }

    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


}
