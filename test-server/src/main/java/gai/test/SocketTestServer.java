package gai.test;

import gai.annotation.ServiceScan;
import gai.serializer.CommonSerializer;
import gai.transport.RpcServer;
import gai.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 *
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.KRYO_SERIALIZER);
        server.start();
    }

}
