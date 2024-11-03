package empregado;

import com.dev.empregado.Vendedor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VendedorTest {

    @Test
    public void deveCalcularSalario() {
        double salario = 1000.00;
        Vendedor vendedor = new Vendedor(salario);
        vendedor.setComissao(100.00);

        Assertions.assertEquals(vendedor.calcularSalario(), 1100.00);
    }
}
