package zajac.krzysztof.rpn.util;

import zajac.krzysztof.rpn.api.impl.ExpressionDatabase;
import zajac.krzysztof.rpn.api.impl.ExpressionFile;
	
public class ExpressionFactory {

	public String getExpression(MessageType messageType) {
		switch (messageType) {
		case FILE:
			return new ExpressionFile().read();
		case DATABASE:
			return new ExpressionDatabase().read();
		default:
			break;
		}
		
		return null;
	}
}
