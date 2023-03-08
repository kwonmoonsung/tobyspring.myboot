package tobyspring.config.autoconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter@Setter
@MyConfigurationProperties(prefix = "server")
public class ServerProperties {
    private String contextPath;
    private int port;
}
