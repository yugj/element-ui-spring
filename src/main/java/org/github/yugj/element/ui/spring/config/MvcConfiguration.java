package org.github.yugj.element.ui.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yugj
 * @date 2020/7/1 4:01 下午.
 */
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    /**
     * static res
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
