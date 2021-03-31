package com.huntmoon.drools;

import javassist.*;

public class JavassitTest {
    public static void main(String[] args) throws NotFoundException, IllegalAccessException, InstantiationException, CannotCompileException, ClassNotFoundException {
        ClassPool aDefault = ClassPool.getDefault();

        CtClass cc = aDefault.makeClass("com.rickiyang.learn.javassist.Person");

        // 2. 新增一个字段 private String name;
        // 字段名为name
        CtField param = new CtField(aDefault.get("java.lang.String"), "name", cc);
        // 访问级别是 private
        param.setModifiers(Modifier.PRIVATE);
        // 初始值是 "xiaoming"
        cc.addField(param, CtField.Initializer.constant("xiaoming"));

        // 3. 生成 getter、setter 方法
        cc.addMethod(CtNewMethod.setter("setName", param));
        cc.addMethod(CtNewMethod.getter("getName", param));
        CtClass test = aDefault.get("com.rickiyang.learn.javassist.Person");
        Object ctClass = test.toClass();
        Class<?> aClass = Class.forName("com.rickiyang.learn.javassist.Person");
        System.out.println(ctClass);
    }
}
