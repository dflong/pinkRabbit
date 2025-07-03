package com.dfl.pinkRabbit.mybatis.context;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class DflongImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
                                        BeanNameGenerator importBeanNameGenerator) {
        Map<String, Object> allAnnotationAttributes = importingClassMetadata.getAnnotationAttributes(DflongScanner.class.getName());
        String path = (String) allAnnotationAttributes.get("value");
        System.out.println(path);

        DflongScanner2 dflongScanner2 = new DflongScanner2(registry);
        dflongScanner2.addIncludeFilter((metadataReader, metadataReaderFactory) -> true);
        dflongScanner2.scan(path);

//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition.setBeanClass(DflongFactoryBean.class);
//        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);
//        registry.registerBeanDefinition("userMapper", beanDefinition);
//
//        AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        beanDefinition1.setBeanClass(DflongFactoryBean.class);
//        beanDefinition1.getConstructorArgumentValues().addGenericArgumentValue(OrderMapper.class);
//        registry.registerBeanDefinition("orderMapper", beanDefinition1);
    }
}
