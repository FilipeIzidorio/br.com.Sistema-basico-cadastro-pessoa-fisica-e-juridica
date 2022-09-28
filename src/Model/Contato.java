package Model;

import java.util.UUID;

public class Contato {
   UUID id;
    String numeroContato;
     String email;

    public Contato(String numeroContato, String email) {
        this.id = UUID.randomUUID();
        this.numeroContato = numeroContato;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }



    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                ", numeroContato='" + numeroContato + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
