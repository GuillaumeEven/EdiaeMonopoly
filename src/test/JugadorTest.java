package test;

import org.junit.Before;
import org.junit.Test;

import com.monopoly.Jugador;

import static org.junit.Assert.*;

public class JugadorTest {
	
	Jugador jugador;
	
	@Before
	public void setup() {
		jugador = new Jugador("Max");
	}
	
    @Test
    public void monTest() {
        assertEquals(this.jugador.getNombre(), "Max");
    }
}
