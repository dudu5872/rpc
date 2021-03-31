package gai.test;

import gai.api.ByeService;
import gai.api.HelloObject;
import gai.api.HelloService;
import gai.serializer.CommonSerializer;
import gai.transport.RpcClient;
import gai.transport.RpcClientProxy;
import gai.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 *
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
