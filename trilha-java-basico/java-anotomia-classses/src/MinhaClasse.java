public class MinhaClasse {
    
public static void main(String[] args) {
    
    String primeiroNome = "Tatiana ";
    String segundoNome = "Martins";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
    
    System.out.println(nomeCompleto);

}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado o método " + primeiroNome.concat("").concat(segundoNome);
}

}
