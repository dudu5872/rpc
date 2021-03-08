package gai.common.registry;

import com.alibaba.nacos.api.exception.NacosException;
import gai.common.enumeration.RpcError;
import gai.common.exception.RpcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gai.common.util.NacosUtil;

import java.net.InetSocketAddress;

/**
 * Nacos服务注册中心
 *
 */
public class NacosServiceRegistry implements ServiceRegistry {

    private static final Logger logger = LoggerFactory.getLogger(NacosServiceRegistry.class);

    @Override
    public void register(String serviceName, InetSocketAddress inetSocketAddress) {
        try {
            NacosUtil.registerService(serviceName, inetSocketAddress);
        } catch (NacosException e) {
            logger.error("注册服务时有错误发生:", e);
            throw new RpcException(RpcError.REGISTER_SERVICE_FAILED);
        }
    }

}
