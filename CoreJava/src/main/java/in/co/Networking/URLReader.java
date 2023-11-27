package in.co.Networking;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLReader {

	public static void main(String[] args) throws Exception {

		URL u = new URL("https://www.google.co.in/search");

		System.out.println("Protocol: " + u.getProtocol());
		System.out.println("Host Name: " + u.getHost());
		System.out.println("Port Number: " + u.getPort());
		System.out.println("File Name: " + u.getFile());

		InputStream iStr = u.openStream();

		Scanner in = new Scanner(iStr);

		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}

		in.close();

	}

}
