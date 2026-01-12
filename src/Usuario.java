public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private long id;
    private boolean ativo;
    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario(String nome, String email, Integer idade, long id, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.id = id;
        this.ativo = ativo;
    }

    }


