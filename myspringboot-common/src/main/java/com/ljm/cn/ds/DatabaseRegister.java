package com.ljm.cn.ds;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lijms
 * @date 2021/3/5/005 7:37
 */
public class DatabaseRegister implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[0];
    }
}
