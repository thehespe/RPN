package zajac.krzysztof.rpn;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import zajac.krzysztof.rpn.util.OperationType;
import zajac.krzysztof.rpn.util.OperationTypeUtil;
import zajac.krzysztof.rpn.util.MessageFactory;
import zajac.krzysztof.rpn.util.MessageType;
import zajac.krzysztof.rpn.util.OperationFactory;

public class ReversePolishNotation {
	private List<String> operations;

	public ReversePolishNotation() {
		operations = Arrays.asList(OperationType.values()).stream().map(e -> e.toString()).collect(Collectors.toList());
	}

	public void apply(String expression, MessageType messageType) {
		List<String> elements = Arrays.asList(expression.split(" "));

		Double result = calculate(elements);
		MessageFactory smf = new MessageFactory(result);
		smf.sendMessage(messageType);

	}

	public Double calculate(List<String> elements) {
		Stack<Double> stack = new Stack<>();
		for (String e : elements) {
			try {
				Double number = Double.valueOf(e);
				stack.push(number);
			} catch (NumberFormatException nfe) {
				if (operations.contains(e)) {
					OperationType operationType= new OperationTypeUtil().getOperationType(e);
					OperationFactory operationFactory = new OperationFactory();
					Double result = operationFactory.getResult(operationType, stack.pop(), stack.pop());
					stack.push(result);

				}
			}
		}

		return stack.get(0);
	}
}
