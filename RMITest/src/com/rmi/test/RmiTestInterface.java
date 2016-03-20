package com.rmi.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiTestInterface extends Remote {
	public String getTest(String str) throws RemoteException;

}



