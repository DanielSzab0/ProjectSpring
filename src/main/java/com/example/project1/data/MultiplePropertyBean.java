package com.example.project1.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "my.prefix")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MultiplePropertyBean {

    private String propA;
    private Integer propB;
    private List<String> propC;
    private Map<String, String> propD;
}
