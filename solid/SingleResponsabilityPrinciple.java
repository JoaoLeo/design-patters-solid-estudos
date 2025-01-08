package solid;

public class SingleResponsabilityPrinciple {

    /**
     * Essa clase respeita o principio da responsabilidade unica pois a mesma tem apenas uma função
     * principal que é criar o usuario e apenas um motivo para ser alterada mantendo as logicas externas
     * em classes separadas
     */

    public String createUser(String nome, String email) {
        ValidationSRP validation = new ValidationSRP();
        if(!validation.validateUser(nome,email)) return "error";
        return "user created: " + nome + "-" + email;
    }

}
