package gai.common.transport;

import gai.common.serializer.CommonSerializer;
import gai.common.entity.RpcRequest;

/**
 * 客户端类通用接口
 *
 *
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
