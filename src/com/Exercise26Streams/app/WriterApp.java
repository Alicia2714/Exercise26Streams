package com.Exercise26Streams.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class WriterApp {

	public static void main(String[] args) {
		
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		int table = 0;
		final int LIMIT = 10;
		
		Scanner input = new Scanner(System.in);
		
		try {
			myFile = new File("c:\\a\\b.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			
			System.out.println("Imput the multiplication table: ");
			table = input.nextInt();
			
			for(int i=0; i<=LIMIT; i++) {
				myBuffer.write(String.format("%d X %d = %d \n", table, i, table*i));
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				myBuffer.close();
				myWriter = null;
				myFile = null;
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
