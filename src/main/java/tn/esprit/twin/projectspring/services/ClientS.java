package tn.esprit.twin.projectspring.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.twin.projectspring.entities.Client;
import tn.esprit.twin.projectspring.repository.ClientRepository;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class ClientS implements IClientServices {


    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveALLClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);

    }

    @Override
    public List<Client> addClients(List<Client> Clients) {
        return List.of();
    }

    @Override
    public List<Client> findByIdentifiant(String identifiant) {
        return clientRepository.findByIdentifiant(identifiant);
    }

    @Override
    public List<Client> findClientsWithManyCommandes() {
        return clientRepository.findClientsWithMultipleCommandes();
    }

}
