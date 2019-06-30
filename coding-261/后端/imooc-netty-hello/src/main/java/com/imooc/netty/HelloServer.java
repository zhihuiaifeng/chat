package com.imooc.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Description: ʵ�ֿͻ��˷���һ�����󣬷������᷵�� hello netty
 */
public class HelloServer {

	public static void main(String[] args) throws Exception {

		// ����һ���߳���
		// ���߳���, ���ڽ��ܿͻ��˵����ӣ����ǲ����κδ������ϰ�һ����������
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		// ���߳���, �ϰ��߳��������񶪸������������߳���ȥ������
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		
		try {
			// netty�������Ĵ���, ServerBootstrap ��һ��������
			ServerBootstrap serverBootstrap = new ServerBootstrap();
			serverBootstrap.group(bossGroup, workerGroup)			// ���������߳���
							.channel(NioServerSocketChannel.class)	// ����nio��˫��ͨ��
							.childHandler(new HelloServerInitializer()); // �Ӵ����������ڴ���workerGroup
			
			// ����server����������8088Ϊ�����Ķ˿ںţ�ͬʱ������ʽΪͬ��
			ChannelFuture channelFuture = serverBootstrap.bind(8088).sync();
			
			// �����رյ�channel������λͬ����ʽ
			channelFuture.channel().closeFuture().sync();
		} finally {
			bossGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
	}

}
