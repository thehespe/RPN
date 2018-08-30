package zajac.krzysztof.rpn.api.impl;

import zajac.krzysztof.rpn.api.Operation;

public class Subtraction implements Operation {

	@Override
	public Double apply(Double d1, Double d2) {
		return d2 - d1;
	}

}
