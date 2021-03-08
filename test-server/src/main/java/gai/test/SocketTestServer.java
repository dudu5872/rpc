package gai.test;

import gai.common.annotation.ServiceScan;
import gai.common.serializer.CommonSerializer;
import gai.common.transport.RpcServer;
import gai.common.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 *
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
