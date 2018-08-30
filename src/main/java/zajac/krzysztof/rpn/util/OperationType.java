package zajac.krzysztof.rpn.util;

public enum OperationType {
	ADD("+"), SUB("-");

	private String operation;

	private OperationType(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return this.operation; 
	}
}
