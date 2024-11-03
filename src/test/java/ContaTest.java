import com.dev.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaTest {

    @Test
    public void deveCreditarSaldoNaConta(){
        String nome = "nome";
        double saldo = 1000.00;
        double especial = 0;
        double valor = 100;
        Conta conta = new Conta(nome, saldo, especial);

        conta.Creditar(valor);

        Assertions.assertEquals(conta.ConsultarSaldo(), 1100.00);
    }

    @Test
    public void deveCalcularSaldoEspecial(){
        String nome = "nome";
        double saldo = 1000.00;
        double especial = 200.00;

        Conta conta = new Conta(nome, saldo, especial);

        Assertions.assertEquals(conta.CalcularSaldoEspecial(), 1200.00);
    }

    @Test
    public void deveDebitarDaContaQuandoSaldoMaiorQueZero(){
        String nome = "nome";
        double saldo = 1000.00;
        double especial = 200.00;
        double valor = 100;

        Conta conta = new Conta(nome, saldo, especial);

        Assertions.assertEquals(conta.Debitar(valor), 1100.00);
    }

    @Test
    public void deveLancarExcecaoQuandoSaldoMenorQueZero(){
        String nome = "nome";
        double saldo = 100.00;
        double especial = 10.00;
        double valor = 120;

        Conta conta = new Conta(nome, saldo, especial);

        assertThrows(IllegalArgumentException.class, () -> conta.Debitar(valor));
    }
}
