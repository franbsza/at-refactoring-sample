package empregado;

import com.dev.empregado.Engenheiro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EngenheiroTest {

    @Test
    public void deveCalcularSalario() {
        double salario = 1000.00;
        Engenheiro engenheiro = new Engenheiro(salario);

        Assertions.assertEquals(engenheiro.calcularSalario(), salario);
    }
}