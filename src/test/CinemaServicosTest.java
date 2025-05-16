/*package test;

public class CinemaServicosTest {
package academy.devdojo.maratonajava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class CinemaServiceTest {

        @Test
        public void testIdadeInvalidaParaBatman() {
            assertFalse(CinemaService.idadeValida(1, 15));
        }

        @Test
        public void testIdadeValidaParaSuperman() {
            assertTrue(CinemaService.idadeValida(2, 10));
        }

        @Test
        public void testCalculoTotalCorreto() {
            assertEquals(60, CinemaService.calcularTotal(20, 3));
        }

        @Test
        public void testQuantidadeZeroGeraErro() {
            assertThrows(IllegalArgumentException.class, () -> {
                CinemaService.calcularTotal(20, 0);
            });
        }

        @Test
        public void testFormaPagamentoValida() {
            assertTrue(CinemaService.formaPagamentoValida("pix"));
        }

        @Test
        public void testFormaPagamentoInvalida() {
            assertFalse(CinemaService.formaPagamentoValida("dinheiro"));
            assertFalse(CinemaService.formaPagamentoValida(null));
        }
    }
}

 */
