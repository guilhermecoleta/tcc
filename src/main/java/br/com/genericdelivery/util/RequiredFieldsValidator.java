package br.com.genericdelivery.util;

import java.lang.reflect.Method;

import br.com.genericdelivery.util.annotations.Required;
import br.com.genericdelivery.util.annotations.RequiredObject;

public abstract class RequiredFieldsValidator {

	private final static String GET_ID_METHOD = "getId";

	public final static boolean validate(Object obj) {
		Class<? extends Object> objClass = obj.getClass();

		Method[] methods = objClass.getMethods();

		for (Method method : methods) {
			try {
				Object retObj;
				if (method.isAnnotationPresent(RequiredObject.class)) {
					retObj = method.invoke(obj);

					Method metodo = retObj.getClass().getMethod(GET_ID_METHOD);
					Object ret = metodo.invoke(retObj);
					if (ret == null) {
						return false;
					}
				} else if (method.isAnnotationPresent(Required.class)) {
					retObj = method.invoke(obj);
					if (retObj == null) {
						return false;
					} else if (retObj instanceof String) {
						if (((String) retObj).trim().isEmpty())
							return false;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return true;
	}
}
