package zajac.krzysztof.rpn.api.impl;

import zajac.krzysztof.rpn.api.Message;

public class MessagePrint implements Message {
	
	
	@Override
	public void send(Double result) {
		System.out.println(result);
	}

}
