package com.zps.spring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * Created by zps on 2020/6/23 22:13
 */
public class WindowsCondition implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  the condition context
     * @param metadata metadata of the {@link AnnotationMetadata class}
     *                 or {@link MethodMetadata method} being checked
     * @return {@code true} if the condition matches and the component can be registered,
     * or {@code false} to veto the annotated component's registration
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String str = context.getEnvironment().getProperty("os.name");
        if (str.contains("Windows")) {
            return true;
        }
        return false;
    }
}
