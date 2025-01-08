package solid;

import java.util.Objects;

public class ViolationSingleResponsabilityPrinciple {
    /**
     * Essa clase viola o principio da responsabilidade unica pois contem duas funcionalidades logica,s
     * a classe deveria possuir a funcionalidade de apenas criar um
     * usuario e a logica de validação deveria ser externa (outra classe/modulo)
     */
    public String createUser(String nome, String email) {
        if(!validateUser(nome,email)) return "error";
        return "user created: " + nome + "-" + email;
    }

    private boolean validateUser(String nome, String email) {
        return Objects.nonNull(nome) && Objects.nonNull(email);
    }
}