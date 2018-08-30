package zajac.krzysztof.rpn.util;

import java.util.Arrays;
import java.util.List;

public class OperationTypeUtil {

	public OperationType getOperationType(String operation) {
		List<OperationType> types = Arrays.asList(OperationType.values());
		
		for (OperationType type : types) {
			if(type.toString().equals(operation)) {
				return type;	
			}
		}
		
		return null;
		
	}
}
