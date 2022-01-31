package org.test.junit;

import org.junit.*;
import org.testng.annotations.Test;

public class JunitSample1 {

@BeforeClass
	public static void method1() {
		System.out.println("Before class");
	}
@Before
public void method2() {
	System.out.println("Before");
}
@Test
public void test1() {
	System.out.println("test1");	
}
@Test(dependsOnMethods="test1")
public void test2() {
	System.out.println("test2");
//	Assert.assertTrue(false);
}
@Test(dependsOnMethods="test2")
public void test3() {
	System.out.println("test3");
}
@After
public void met3() {
	System.out.println("after");
}
@AfterClass
public static void m4() {
	System.out.println("afterclass");
}}




