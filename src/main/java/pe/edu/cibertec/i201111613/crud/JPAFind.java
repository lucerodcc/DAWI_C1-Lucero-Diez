package pe.edu.cibertec.i201111613.crud;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.i201111613.entity.Country;

public class JPAFind {

    public static void main(String[] args) {

        // Referencia al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        try {
            // Buscar el país con el código "PER" (Perú)
            Country country = em.find(Country.class, "PER");

            if (country != null) {
                System.out.println("Ciudades de Perú con población > 700k:");

                // Filtrar las ciudades con población > 700k usando una función lambda
                country.getCities().stream()
                        .filter(city -> city.getPopulation() > 700000) // Filtrar ciudades con población > 700k
                        .forEach(city -> System.out.println(city.getName())); // Imprimir el nombre de la ciudad
            } else {
                System.out.println("El país con código 'PER' no se encontró.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
