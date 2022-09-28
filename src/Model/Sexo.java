package Model;

import java.util.UUID;

public class Sexo {
    UUID id;
    String orientacaoSexual;

    public Sexo(String orientacaoSexual) {
        this.id = UUID.randomUUID();
        this.orientacaoSexual = orientacaoSexual;
    }

    public UUID getId() {
        return id;
    }



    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    @Override
    public String toString() {
        return "Sexo{" +
               ", orientacaoSexual='" + orientacaoSexual + '\'' +
                '}';
    }
}
