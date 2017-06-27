package swen2.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ClientInstance {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 5431);
			OutputStream out = socket.getOutputStream();
			PrintStream ps = new PrintStream(out);
			ps.print("test");
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
