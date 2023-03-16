package com.dank.socket2;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * @ClassName: BaseSocketServer
 * @author: zyk
 * @createTime 2022年10月26日 23:30:00
 * @Description:
 */
@Slf4j
public class BaseSocketServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private int port;
    private static final int MAX_BUFFER_SIZE = 1024;

    public int getPort(){
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public BaseSocketServer(int port){
        this.port = port;
    }
    public void  run(){
        try {
            this.serverSocket = new ServerSocket(this.port);
            //log.info("服务端已经开启");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
