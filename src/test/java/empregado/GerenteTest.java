package empregado;

import com.dev.empregado.Gerente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GerenteTest {

    @Test
    public void deveCalcularSalario() {
        double salario = 1000.00;
        Gerente gerente = new Gerente(salario);
        gerente.setBonus(100.00);

        Assertions.assertEquals(gerente.calcularSalario(), 1100.00);
    }
}
