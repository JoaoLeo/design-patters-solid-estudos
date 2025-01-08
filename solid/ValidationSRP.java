package solid;

import java.util.Objects;

public class ValidationSRP {

    public boolean validateUser(String nome, String email) {
        return Objects.nonNull(nome) && Objects.nonNull(email);
    }
}
