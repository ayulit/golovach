package net.golovach.core_II._2_exception._4_java7.twr.TIMMPP;

public class App00 {

	public static void main(String[] args) throws Exception {
		try (X x0  = new X("0"); X x1  = new X("1"); X x2  = new X("2");) {
			// System.exit(0); // kills JVM - no close() then
			throw new Exception();
		} finally {
			System.err.println("finally");
		}

	}

}

class X implements AutoCloseable {
	
	private String name;
	
	public X(String name) {		
		this.name = name;
		System.err.println("new:" + name);
	}

	@Override
	public void close() throws Exception {
		System.err.println("close:" + name);
		throw new RuntimeException(name);
	}
	
}
