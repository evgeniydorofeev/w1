package w1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

//@Configuration
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class DataSourceProperties {
    private String url;
}

