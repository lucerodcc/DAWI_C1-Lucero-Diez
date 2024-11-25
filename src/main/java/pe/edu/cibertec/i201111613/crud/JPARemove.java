package pe.edu.cibertec.i201111613.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.i201111613.entity.Country;

public class JPARemove {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        try {
            Country countryToRemove = em.find(Country.class, "YUG");

            if (countryToRemove != null) {
              em.remove(countryToRemove);
            }
            em.getTransaction().commit();
            System.out.println("El país y sus asociados han sido eliminados correctamente.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
