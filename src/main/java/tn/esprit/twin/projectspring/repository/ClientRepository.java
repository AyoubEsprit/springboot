package tn.esprit.twin.projectspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.twin.projectspring.entities.Client;

import java.util.List;

public interface    ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findByIdentifiant(String identifiant);

    @Query("SELECT c FROM Client c WHERE size(c.commandes) > 1")
    List<Client> findClientsWithMultipleCommandes();
}
