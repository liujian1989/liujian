package net.liujian.cheer.demo.ch19;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) throws  Exception{
		InetAddress local =InetAddress.getLocalHost();
		System.out.println(local.getHostName());
		System.out.println(local.getHostAddress());
		InetAddress remoteZhao =InetAddress.getByName("DESKTOP-JGT88JA");
		System.out.println(remoteZhao.getHostAddress());
	}

}
