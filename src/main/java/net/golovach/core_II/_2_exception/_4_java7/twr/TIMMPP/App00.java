package net.golovach.core_II._2_exception._4_java7.twr.TIMMPP;

public class App00 {

	public static void main(String[] args) throws Exception {
		try (X x  = new X()) {
			
		}

	}

}

class X implements AutoCloseable {

	@Override
	public void close() throws Exception {
				
	}
	
}
