package zajac.krzysztof.rpn.api.impl;

import zajac.krzysztof.rpn.api.Operation;

public class Addition implements Operation {

	@Override
	public Double apply(Double d1, Double d2) {
		return d1 + d2;
	}	
}
