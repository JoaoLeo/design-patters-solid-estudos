package solid;

public class OpenClosedPrinciple extends InterfaceOpenClosedPrinciple {

    /**
     * Essa classe respeita o Principio do aberto/fechado pois utiliza um metodo abstrato e
     * altera o comportamento do metodo 'createUser' apenas para essa classe, isso nao altera o
     * metodo createUser original e permite que o metodo possa ser sobrescrito de outras maneiras
     * em outras classes - polimorfismo
     */

    @Override
    public String createUser(String nome) {
        return "user created using OpenClosedPrinciple: " + nome;
    }
}
