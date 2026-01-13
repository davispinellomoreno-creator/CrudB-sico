public class Cadastro extends RuntimeException {
    private Usuario usuario;
    private Usuario nome;
    private Usuario email;
    private Usuario idade;

    public void cadastroDeUsuario(){
        if ( nome == null){
            System.out.println("O campo nome não pode estar vazio");


        }
        else if(email == null){
            System.out.println("O email não pode estar vazio");
        }



    }
    public void validarIdade(int idade){
        if(idade <= 0){

            trhow new IllegalArgumentException("Idade inválida");
        }
    }
        }



