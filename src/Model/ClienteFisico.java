package Model;


import java.util.UUID;

public class ClienteFisico extends Cliente {

    String nomeCompleto;
    String cpf;
    String rg;
    String orgaoEmissor;
    Endereco endereco;

    public ClienteFisico(String nomeCompleto, String cpf, String rg, String orgaoEmissor,String cep, String uf, String cidade, String bairro, String logradouro, String complemento, boolean clienteAtivo, String cadastro) {
        super(cep, uf, cidade, bairro, logradouro, complemento, clienteAtivo, cadastro);
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }




    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public boolean isClienteAtivo() {
        return super.isClienteAtivo();
    }

    @Override
    public void setClienteAtivo(boolean clienteAtivo) {
        super.setClienteAtivo(clienteAtivo);
    }

    @Override
    public String getCadastro() {
        return super.getCadastro();
    }

    @Override
    public void setCadastro(String cadastro) {
        super.setCadastro(cadastro);
    }

    @Override
    public String getCep() {
        return super.getCep();
    }

    @Override
    public void setCep(String cep) {
        super.setCep(cep);
    }

    @Override
    public String getUf() {
        return super.getUf();
    }

    @Override
    public void setUf(String uf) {
        super.setUf(uf);
    }

    @Override
    public String getCidade() {
        return super.getCidade();
    }

    @Override
    public void setCidade(String cidade) {
        super.setCidade(cidade);
    }

    @Override
    public String getBairro() {
        return super.getBairro();
    }

    @Override
    public void setBairro(String bairro) {
        super.setBairro(bairro);
    }

    @Override
    public String getLogradouro() {
        return super.getLogradouro();
    }

    @Override
    public void setLogradouro(String logradouro) {
        super.setLogradouro(logradouro);
    }

    @Override
    public String getComplemento() {
        return super.getComplemento();
    }

    @Override
    public void setComplemento(String complemento) {
        super.setComplemento(complemento);
    }

    @Override
    public String toString() {
        return "ClienteFisico{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", orgaoEmissor='" + orgaoEmissor + '\'' +
                '}'+super.toString();
    }
}

