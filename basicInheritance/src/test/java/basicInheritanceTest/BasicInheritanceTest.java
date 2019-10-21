package basicInheritanceTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sakshi.inheritance.DemoInheritance;

public class BasicInheritanceTest extends DemoInheritance {

	@Test
	public void testSetter() {
		final DemoInheritance di = new DemoInheritance();
		di.setDate(07);
		di.setMonth(07);
		di.setYear(1991);

		assertEquals(di.getDate(), di.setDate(07));
		assertEquals(di.getMonth(), di.setMonth(07));
		assertEquals(di.getYear(), di.setYear(1991));
		System.out.println(di.getDate() + "/" + di.getMonth() + "/" + di.getYear());
	}

	@Test
	public void testSetter1() {
		final DemoInheritance di1 = new DemoInheritance();
		di1.setDate(03);
		di1.setMonth(03);
		di1.setYear(2001);

		assertEquals(di1.getDate(), di1.setDate(03));
		assertEquals(di1.getMonth(), di1.setMonth(03));
		assertEquals(di1.getYear(), di1.setYear(2001));
		System.out.println(di1.getDate() + "/" + di1.getMonth() + "/" + di1.getYear());

	}

}
