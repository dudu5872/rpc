package gai.test;

import gai.api.ByeService;
import gai.api.HelloObject;
import gai.api.HelloService;
import gai.common.serializer.CommonSerializer;
import gai.common.transport.RpcClient;
import gai.common.transport.RpcClientProxy;
import gai.common.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 *
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
