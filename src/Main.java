//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Usuario user = new Usuario ();
        Usuario user02 = new Usuario ();

        user.setAtivo(true);
     user.setEmail("Joao@gmail.com");
     user.setIdade(13);
     user.setNome("João");
        System.out.println("Usuario :" + user);
     user.toString();

        user02.setAtivo(true);
        user02.setEmail("Joao@gmail.com");
        user02.setIdade(15);
        user02.setNome("João");
        System.out.println("Usuario :" + user02);
        user02.toString();


    }


}