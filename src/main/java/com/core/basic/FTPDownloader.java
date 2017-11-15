package com.core.basic;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FTPDownloader {

	 public static void main(String[] args) {
	        String serverAddress = "localhost"; // ftp server address 
	        int port = 21; // ftp uses default port Number 21
	        String username = "nitya";// username of ftp server
	        String password = "nitya@123"; // password of ftp server
	  
	        FTPClient ftpClient = new FTPClient();
	        try {
	  
	            ftpClient.connect(serverAddress, port);
	            ftpClient.login(username,password);
	            ftpClient.enterLocalPassiveMode();
	            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
	            String remoteFilePath = "/business_law_tutorial.pdf";
	            File localfile = new File("G:\\business_law_tutorial.pdf");
	            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(localfile));
	            boolean success = ftpClient.retrieveFile(remoteFilePath, outputStream);
	            outputStream.close();
	  
	            if (success) {
	                System.out.println("Ftp file successfully download.");
	            }
	  
	        } catch (IOException ex) {
	            System.out.println("Error occurs in downloading files from ftp Server : " + ex.getMessage());
	        } finally {
	            try {
	                if (ftpClient.isConnected()) {
	                    ftpClient.logout();
	                    ftpClient.disconnect();
	                }
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
	}

