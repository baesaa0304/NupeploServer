package SpaceServer.com.SpaceServer.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class JwtProperties {
    @Value("${JWT_SECRET}")
    private String secret;
}
