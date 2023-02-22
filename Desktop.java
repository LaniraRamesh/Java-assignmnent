package org.system;

public class Desktop extends Computer {

	public void desktopSize(int size) {
		System.out.println("Size of the desktop : "+size);
	}
	public static void main(String[] args) {
		Desktop computer=new Desktop();
		computer.powerOn();
		computer.enterPassword(1234);
		computer.desktopSize(23);
	}

}
