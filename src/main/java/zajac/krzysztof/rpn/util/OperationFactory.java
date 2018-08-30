package zajac.krzysztof.rpn.util;

import zajac.krzysztof.rpn.api.impl.Addition;
import zajac.krzysztof.rpn.api.impl.Subtraction;

public class OperationFactory {

	public Double getResult(OperationType operationType, Double d1, Double d2) {
		switch (operationType) {
		case ADD:
			return new Addition().apply(d1, d2);
		case SUB:
			return new Subtraction().apply(d1, d2);
		default:
			break;
		}

		return null;
	}
}
