package gai.test;

import gai.annotation.ServiceScan;
import gai.serializer.CommonSerializer;
import gai.transport.RpcServer;
import gai.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 *
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.KRYO_SERIALIZER);
        server.start();
    }

}
