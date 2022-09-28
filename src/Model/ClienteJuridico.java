package Model;


public class ClienteJuridico extends Cliente {
    String cnpj;
    String razaoSocial;
    String nomeFantasia;

    String inscricaoEstatual;
    String inscricaoMunicipal;

    public ClienteJuridico(boolean clienteAtivo, String cadastro, String cnpj, String razaoSocial, String nomeFantasia,String inscricaoEstatual, String inscricaoMunicipal, String cep, String uf, String cidade, String bairro, String logradouro, String complemento) {
        super(cep, uf, cidade, bairro, logradouro, complemento, clienteAtivo, cadastro);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;

        this.inscricaoEstatual = inscricaoEstatual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }



    public String getInscricaoEstatual() {
        return inscricaoEstatual;
    }

    public void setInscricaoEstatual(String inscricaoEstatual) {
        this.inscricaoEstatual = inscricaoEstatual;
    }

    public String getIscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setIscricaoMunicipal(String iscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", inscricaoEstatual='" + inscricaoEstatual + '\'' +
                ", inscricaoMunicipal='" + inscricaoMunicipal + '\'' +
                '}'+super.toString();
    }
}