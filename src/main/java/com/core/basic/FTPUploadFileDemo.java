package com.core.basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;

public class FTPUploadFileDemo {

	public static void main(String[] args) {

		FTPClient client = new FTPClient();

		FileInputStream fis = null;

		try {

			client.connect("localhost", 21);

			boolean flag = client.login("nitya", "nitya@123");

			// Create an InputStream of the file to be uploaded

			String filename = "D:\\LinkedListQuestion.txt";

			fis = new FileInputStream(filename);

			// Store file on server and logout

			boolean f = client.storeFile(filename, fis);
			System.out.println(client.isConnected());
			System.out.println(f);
			System.out.println(flag);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (client.isConnected()) {
					client.logout();
					client.disconnect();
					fis.close();
				}

			} catch (IOException e) {

				e.printStackTrace();

			}

		}
	}

}
