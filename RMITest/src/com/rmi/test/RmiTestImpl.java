package com.rmi.test;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiTestImpl implements RmiTestInterface {

	@Override
	public String getTest(String str) throws RemoteException {
		// TODO Auto-generated method stub
		return str+" is a dog";
	}

	public static void main(String[] args) throws AlreadyBoundException ,RemoteException{
		// TODO Auto-generated method stub
		RmiTestImpl t = new RmiTestImpl();
		RmiTestInterface tt = (RmiTestInterface) UnicastRemoteObject.exportObject(t, 1);
		Registry registry = LocateRegistry.createRegistry(2001);
		registry.bind("test", tt);
		System.out.println("RMI server is start.");
		
	}

}
