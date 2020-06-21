package com.zps.spring.filter;


import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * Created by zps on 2020/2/18 20:33
 */
public class MyFilter implements TypeFilter {
    /**
     * @param metadataReader        获取本类的信息
     * @param metadataReaderFactory 获取其他类的信息
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前类的class信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的路径资源
        Resource resource = metadataReader.getResource();
        if (classMetadata.getClassName().contains("er")) {
            //只有是true的才能注册到spring容器中
            return true;
        } else {
            return false;
        }
    }
}
