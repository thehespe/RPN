package zajac.krzysztof.rpn.util;

public enum MessageType {
	PRINT("PRINT"), FILE("FILE"), DATABASE("DATABASE"), MAIN("MAIN");

	private String type;

	private MessageType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type;
	}
}
