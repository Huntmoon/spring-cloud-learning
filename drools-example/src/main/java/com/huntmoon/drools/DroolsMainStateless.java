package com.huntmoon.drools;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.*;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.StatelessKnowledgeSession;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class DroolsMainStateless {
    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
//        KieServices kieServices = KieServices.Factory.get();
//        KieContainer kieContainer = kieServices.newKieClasspathContainer();
//        kieContainer.
//        KieSession kieSession = kieContainer.newKieSession();
//        kieSession.insert();
//        kieSession.fireAllRules();
//        kieSession.dispose();

        String str = "package net.shuzun.bod.engine.result.drools;\n" +
                "import java.util.Map;\n" +
                "import java.util.List;\n" +
                "import java.lang.Integer;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.HashMap;\n" +
//                "import net.shuzun.bod.engine.result.DroolsInputParam;\n" +
//                "import net.shuzun.bod.engine.result.DroolsResult;\n" +
//                "import net.shuzun.bod.knowledge.rule.model.RuleModel;\n" +
                "rule \"PHBLACKLIST\"\n" +
                "salience 0\n" +
                " when\n" +
                "Map(this['test']==1) &&   Map(this['test1']==2)" +
                " then\n" +
                " \tSystem.out.println(\"sdfsd\");\n" +
                " end";

        String str1 = "package net.shuzun.bod.engine.result.drools;\n" +
                "import java.util.Map;\n" +
                "import java.util.List;\n" +
                "import java.lang.Integer;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.HashMap;\n" +
//                "import net.shuzun.bod.engine.result.DroolsInputParam;\n" +
//                "import net.shuzun.bod.engine.result.DroolsResult;\n" +
//                "import net.shuzun.bod.knowledge.rule.model.RuleModel;\n" +
                "rule \"PHBLACKLIST2\"\n" +
                "salience 0\n" +
                " when\n" +
                "  Map(this['test']==1)" +
                " then\n" +
                " \tSystem.out.println(\"sdfsd1\");\n" +
                " end"
                ;
        String str2 = "package net.shuzun.bod.engine.result.drools;\n" +
                "import java.util.Map;\n" +
                "import java.util.List;\n" +
                "import java.lang.Integer;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.HashMap;\n" +
//                "import net.shuzun.bod.engine.result.DroolsInputParam;\n" +
//                "import net.shuzun.bod.engine.result.DroolsResult;\n" +
//                "import net.shuzun.bod.knowledge.rule.model.RuleModel;\n" +
                "rule \"PHBLACKLIST3\"\n" +
                "salience 0\n" +
                " when\n" +
                "  Map(this['test']==2)" +
                " then\n" +
                " \tSystem.out.println(\"sdfsd13333333\");\n" +
                " end"
                ;

        KnowledgeBase kBase = null;
        KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kb.add(ResourceFactory.newByteArrayResource(str.getBytes(StandardCharsets.UTF_8)), ResourceType.DRL);
        kb.add(ResourceFactory.newByteArrayResource(str1.getBytes(StandardCharsets.UTF_8)), ResourceType.DRL);
        kb.add(ResourceFactory.newByteArrayResource(str2.getBytes(StandardCharsets.UTF_8)), ResourceType.DRL);
//        try {
//            List<String> ruleStrs = ruleList.getRules();
//            for (int i = 0; i < ruleStrs.size(); i++) {
//                logger.debug("add rule {}", ruleStrs.get(i));
//                kb.add(ResourceFactory.newByteArrayResource(ruleStrs.get(i).getBytes("utf-8")), ResourceType.DRL);
//            }
//        } catch (UnsupportedEncodingException e) {
//            logger.error("规则编译异常", e);
//        }
        KnowledgeBuilderErrors errors = kb.getErrors();
        for (KnowledgeBuilderError error : errors) {
            System.out.println("规则错误:【" + error + "】");
        }
        kBase = KnowledgeBaseFactory.newKnowledgeBase();
        kBase.addKnowledgePackages(kb.getKnowledgePackages());
        StatelessKnowledgeSession statelessKnowledgeSession = kBase.newStatelessKnowledgeSession();

//        statefulKnowledgeSession.insert();
        HashMap<String, Integer> object = new HashMap<>();
        object.put("test", 1);
        object.put("test1", 2);
        HashMap<String, Integer> object2 = new HashMap<>();
        object2.put("test1", 2);
        HashMap<String, Integer> object3 = new HashMap<>();
        object3.put("test", 2);
        statelessKnowledgeSession.execute(object);
        statelessKnowledgeSession.execute(object2);
        statelessKnowledgeSession.execute(object3);

//        statefulKnowledgeSession.insert(a);
//        for (int i = 0; i < 1000; i++) {
//            Thread.sleep(100000);
//        }
//        System.out.println("sdfsd");

    }

    public static class A {
        private String a;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }
    }

}
