package com.core.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class FTPConnectAndLoginDemo {
	private static void showServerReply(FTPClient ftpClient) {
		String[] replies = ftpClient.getReplyStrings();
		if (replies != null && replies.length > 0) {
			for (String aReply : replies) {
				System.out.println("SERVER: " + aReply);
			}
		}
	}

	public static void main(String[] args) {
		String server = "localhost";
		int port = 21;
		String user = "nitya";
		String pass = "nitya@123";
		FTPClient ftpClient = new FTPClient();
		FileInputStream fis = null;
		try {
			ftpClient.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
			ftpClient.connect(server, port);
			showServerReply(ftpClient);
			int replyCode = ftpClient.getReplyCode();
			if (!FTPReply.isPositiveCompletion(replyCode)) {
				System.out.println("Operation failed. Server reply code: " + replyCode);
				return;
			}
			boolean success = ftpClient.login(user, pass);
			showServerReply(ftpClient);
			if (!success) {
				System.out.println("Could not login to the server");
				return;
			} else {
				System.out.println("LOGGED IN SERVER");
				String filename = "D:\\text.txt";
				fis = new FileInputStream(filename);
				ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
				ftpClient.enterLocalPassiveMode();
				boolean f = ftpClient.storeFile("/text1.txt", fis);
				showServerReply(ftpClient);

				System.out.println("..." + f);
				ftpClient.logout();

			}
		} catch (IOException ex) {
			System.out.println("Oops! Something wrong happened");
			ex.printStackTrace();
		}
	}
}
