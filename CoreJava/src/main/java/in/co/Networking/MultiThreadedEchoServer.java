package in.co.Networking;

import java.io.*;
import java.net.*;

public class MultiThreadedEchoServer extends Thread {
	private Socket client = null;

	public MultiThreadedEchoServer(Socket clientSocket) {
		this.client = clientSocket;
	}

	public void run() {
		try {
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String inputLine, outputLine;
			inputLine = in.readLine();
			while (inputLine != null) {
				System.out.println("Server Recived " + inputLine);
				out.println(inputLine + " .. " + inputLine);
				if (inputLine.equals("Bye."))
					break;
				inputLine = in.readLine();
			}
			out.close();
			in.close();
			client.close();

		} catch (IOException e) {

		}

	}

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = null;

		MultiThreadedEchoServer multiThreadedEchoServer = null;

		serverSocket = new ServerSocket(4444);

		System.out.println("Echo Server Started");

		Socket clientSocket = null;

		boolean flag = true;

		while (flag) {

			clientSocket = serverSocket.accept();

			multiThreadedEchoServer = new MultiThreadedEchoServer(clientSocket);

			multiThreadedEchoServer.start();

		}
		System.out.println("Echo Server Stoped");
		serverSocket.close();
	}
}
