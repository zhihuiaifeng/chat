package cn.itcast.nio.chat;

import java.io.IOException;
import java.util.Scanner;

//启动聊天程序客户端
public class TestChat {
    public static void main(String[] args) throws Exception {
        ChatClient chatClient=new ChatClient();

        new Thread(){
            public void run(){
                while(true){
                    try {
                        chatClient.receiveMsg();
                        Thread.sleep(2000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String msg=scanner.nextLine();
            chatClient.sendMsg(msg);
        }

    }
}
