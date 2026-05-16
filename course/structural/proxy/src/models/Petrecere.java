package models;

import java.util.List;

public class Petrecere implements IPetrecere {

    private String data;

    private List<String> listaInvitati;

    private List<Client> listaParticipanti;

    public Petrecere(String data, List<String> listaInvitati, List<Client> listaParticipanti) {
        this.data = data;
        this.listaInvitati = listaInvitati;
        this.listaParticipanti = listaParticipanti;
    }

    @Override
    public void adaugaParticipant(Client client) {
        listaParticipanti.add(client);
        System.out.println("Clientul " + client + " a fost adaugat la petrecere.");
    }
}
