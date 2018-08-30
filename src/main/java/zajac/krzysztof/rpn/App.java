package zajac.krzysztof.rpn;

import zajac.krzysztof.rpn.util.MessageType;
import zajac.krzysztof.rpn.util.ExpressionFactory;

public class App {
	public static void main(String[] args) {
		MessageType readMessageType = MessageType.valueOf(args[1]);
		MessageType sendMessageType = MessageType.valueOf(args[2]);
		String expression;
		if (readMessageType == MessageType.MAIN) {
			expression = args[0];
		} else {
			expression = new ExpressionFactory().getExpression(readMessageType);
		}
		ReversePolishNotation rpn = new ReversePolishNotation();
		rpn.apply(expression, sendMessageType);
		
	}
	
}
