package gai.test;

import gai.api.ByeService;
import gai.api.HelloObject;
import gai.api.HelloService;
import gai.serializer.CommonSerializer;
import gai.transport.RpcClientProxy;
import gai.transport.socket.client.SocketClient;

/**
 * 测试用消费者（客户端）
 *
 *
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
