package tn.esprit.twin.projectspring.services;

import tn.esprit.twin.projectspring.entities.Client;

import java.util.List;

public interface IClientServices {
    List<Client> retrieveALLClients();

    Client addClient(Client e);

    Client updateClient(Client e);

    Client retrieveClient(Long idClient);

    void removeClient(Long idClient);

    List<Client> addClients (List<Client> Clients);

    List<Client> findByIdentifiant(String identifiant);
    List<Client> findClientsWithManyCommandes();

}
