package proxy;

import models.Client;
import models.IPetrecere;

public class PetrecereProxy implements IPetrecere {

    private IPetrecere petrecere;

    public PetrecereProxy(IPetrecere petrecere) {
        this.petrecere = petrecere;
    }

    @Override
    public void adaugaParticipant(Client client) {
        if (client.getVarsta() >= 18) {
            petrecere.adaugaParticipant(client);
        } else {
            System.out.println("Clientul " + client + " nu a fost adaugat la petrecere.");
        }
    }
}
