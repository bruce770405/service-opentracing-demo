package com.bruce.serviceopentracing;

import io.opentracing.contrib.java.spring.jaeger.starter.TracerBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.jaegertracing.internal.MDCScopeManager;

@Configuration
public class TracingConfig {

    @Bean
    public TracerBuilderCustomizer mdcBuilderCustomizer() {
        return builder -> builder.withScopeManager(new MDCScopeManager.Builder().build());
    }

}
