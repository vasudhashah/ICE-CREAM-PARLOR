/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VASUDHA SHAH
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    static ServerSocket Serversocket;
	static DataInputStream dis;
	static DataOutputStream dos;

	public static void main(String[] args) throws SocketException {

		try {
			int a[] = { 30, 40, 50, 60, 70, 80, 90, 100 };
			Serversocket = new ServerSocket(1200);
			System.out.println("waiting for connection");
			Socket client = Serversocket.accept();
			dis = new DataInputStream(client.getInputStream());
			dos = new DataOutputStream(client.getOutputStream());
			System.out.println("The retransmitted frame is:" + a.length);
			int y = a.length;
			dos.write(y);
			dos.flush();

			for (int i = 0; i < a.length; i++) {
				dos.write(a[i]);
				dos.flush();
			}

			int k = dis.read();

			dos.write(a[k]);
			dos.flush();

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				dis.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

    
}
