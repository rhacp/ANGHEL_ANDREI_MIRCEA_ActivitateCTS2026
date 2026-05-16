package program;

import models.Client;
import models.IPetrecere;
import models.Petrecere;
import proxy.PetrecereProxy;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Client client1 = new Client("John Doe", 16);
        Client client2 = new Client("John Doe", 19);

        IPetrecere petrecere = new Petrecere("12.12.2026", new ArrayList<>(), new ArrayList<>());
        PetrecereProxy petrecereProxy = new PetrecereProxy(petrecere);

        petrecereProxy.adaugaParticipant(client1);
        petrecereProxy.adaugaParticipant(client2);
    }
}
