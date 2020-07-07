package com.epizy.darubyminer360.Spiritual.server;

import java.net.InetAddress;

public class ServerClient {

	public String name;
	public InetAddress address;
	public int port;
	private final int ID;
	public int attempt = 1;

	public ServerClient(String name, InetAddress address, int port, final int ID) {
		this.name = name;
		this.address = address;
		this.port = port;
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}

}
