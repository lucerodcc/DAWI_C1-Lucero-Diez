package pe.edu.cibertec.i201111613.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.i201111613.entity.City;
import pe.edu.cibertec.i201111613.entity.Country;
import pe.edu.cibertec.i201111613.entity.CountryLanguage;
import java.util.ArrayList;
import java.util.List;

public class JPAPersist {

    public static void main(String[] args) {

        // Crear EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Iniciar la transacción
        em.getTransaction().begin();

        // Crear un país imaginario
        Country country = new Country("ZXZ", "Suerteistann", "Asia", "Colorado",
                5000.00, 2024, 100000, 75.5, 100000.00, 95000.00,
                "Nombre Local", "Gobierno", "Presidente", 1003, "XX", null, null);

        try {
            // Crear 2 lenguajes nativos
            List<CountryLanguage> languages = new ArrayList<>();
            languages.add(new CountryLanguage(country, "Chino", CountryLanguage.OfficialStatus.T, 50.0));
            languages.add(new CountryLanguage(country, "Escoces", CountryLanguage.OfficialStatus.F, 30.0));

            // Crear 3 ciudades
            List<City> cities = new ArrayList<>();
            cities.add(new City(5000, "Cansa", "Colon", 10000, country));
            cities.add(new City(5001, "Dreams", "Bolivar", 20000, country));
            cities.add(new City(5002, "Spring", "Miller", 10000, country));

            // Asignar las ciudades y los lenguajes al país
            country.setCities(cities);
            country.setLanguages(languages);

            // Persistir el país junto con las ciudades y lenguajes
            em.persist(country);

            // Confirmar la transacción
            em.getTransaction().commit();

             } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
             } finally {

            // Cerrar el EntityManager y EntityManagerFactory
              em.close();
              emf.close();
        }

    }

}
