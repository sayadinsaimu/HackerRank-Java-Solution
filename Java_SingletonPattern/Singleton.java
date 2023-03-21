package Java_SingletonPattern;

public class Singleton {
	static Singleton intance = new Singleton();

	private Singleton() {
	}

	public String str;

	public static Singleton getSingleIntance() {
		return intance;
	}

}
