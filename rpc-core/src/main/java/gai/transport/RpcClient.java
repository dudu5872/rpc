package gai.transport;

import gai.serializer.CommonSerializer;
import gai.entity.RpcRequest;

/**
 * 客户端类通用接口
 *
 *
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
