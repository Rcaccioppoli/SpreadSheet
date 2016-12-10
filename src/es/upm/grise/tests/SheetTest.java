package es.upm.grise.tests;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

import es.upm.grise.Sheet;
import org.junit.Before;
import org.junit.Test;

public class SheetTest {

	private Sheet cells;

	@Before
	public void setUp() {
		cells = new Sheet();
	}

	@Test
	public void testSet() {
		cells.set("A1", "12");
	    assertEquals("12", cells.get("A1"));
	}

}
