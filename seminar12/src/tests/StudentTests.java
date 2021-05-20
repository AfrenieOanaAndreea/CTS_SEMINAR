package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Ionel";
		Student student=new Student(nume);
//		if(nume!=student.getNume()) {
//			fail("numele nu este corect");
//		}
		assertEquals(nume, student.getNume());	
	}
	@Test
	public void testConstructorFaraParametru() {
		Student student=new Student();
		assertEquals("Student", student.getNume());	
	}
	@Test
	public void testAreRestanta() {
		Student student=new Student();
		student.adaugaNota(3);
		student.adaugaNota(10);
		assertTrue("Studentul care are restanta este marcat ca nu are restanta",student.areRestante());
	}
	@Test
	public void testNuAreRestanta() {
		Student student=new Student();
		student.adaugaNota(7);
		student.adaugaNota(10);
		assertFalse("Studentul care nu are restanta este marcat ca avand restanta",student.areRestante());
	}
	@Test
	public void testAdaugaNota() {
		Student student=new Student();
		student.adaugaNota(7);
		assertEquals(1, student.getNote().size());
	}
	@Test
	public void testNotaAdaugataEsteCorecta() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

}
