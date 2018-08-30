package zajac.krzysztof.rpn.util;

import zajac.krzysztof.rpn.api.impl.MessageDatabase;
import zajac.krzysztof.rpn.api.impl.MessageFile;
import zajac.krzysztof.rpn.api.impl.MessagePrint;

public class MessageFactory {
	private Double result;

	public MessageFactory(Double result) {
		super();
		this.result = result;
	}

	public void sendMessage(MessageType messageType) {
		switch (messageType) {
		case PRINT:
			new MessagePrint().send(result);
			break;
		case FILE:
			new MessageFile().send(result);
			break;
		case DATABASE:
			new MessageDatabase().send(result);
			break;
		default:
			break;
		}
	}
}
