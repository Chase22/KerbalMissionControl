package org.chase.kspcontrol.common.data;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.chase.kspcontrol.common.KSPSerializeable;

import com.google.gson.Gson;

import krpc.client.RPCException;

public abstract class NetworkObject<T, wrappedClass> implements KSPSerializeable<T> {

	private transient Class<T> T = (Class<T>) this.getClass();
	
	public abstract String getPrefix();
	
	public abstract T createInstance(wrappedClass object) throws RPCException, IOException;
	
	public NetworkObject(){};
	
	public NetworkObject(wrappedClass object) throws RPCException, IOException {};

	public T deserialize(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, T);
	}

	public String serialize() {
		return new Gson().toJson(this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Method[] Methods = this.getClass().getMethods();

		for (Method m : Methods) {
			if (m.getName().startsWith("get")) {
				try {
					Object value = m.invoke(this);
					sb.append(String.format("%s : %s%n", m.getName().substring(3), value.toString()));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
}
