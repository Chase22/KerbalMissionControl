package org.chase.kspcontrol.common.data;

import java.io.IOException;

import krpc.client.RPCException;

/**
 * A Controllable Network object. It is advised to add a enum availableMethods to the class
 *
 * @param <T>
 */
public abstract class ControlObject<T> extends NetworkObject<T> {
	public abstract String parse(String method, Object... params) throws RPCException, IOException;
}
