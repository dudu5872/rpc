package gai.test;

import gai.annotation.Service;
import gai.api.ByeService;

/**
 *
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
