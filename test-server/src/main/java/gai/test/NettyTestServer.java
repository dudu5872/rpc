package gai.test;

import gai.common.annotation.ServiceScan;
import gai.common.serializer.CommonSerializer;
import gai.common.transport.RpcServer;
import gai.common.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 *
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
