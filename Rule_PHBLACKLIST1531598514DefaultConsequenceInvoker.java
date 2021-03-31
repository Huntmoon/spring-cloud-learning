
ClassLoader:                                                                                                                                                                                                 
+-org.drools.core.rule.JavaDialectRuntimeData$PackageClassLoader@27912e3                                                                                                                                     
  +-org.drools.core.common.ProjectClassLoader@3b8f0a79                                                                                                                                                       
    +-sun.misc.Launcher$AppClassLoader@18b4aac2                                                                                                                                                              
      +-sun.misc.Launcher$ExtClassLoader@7a07c5b4                                                                                                                                                            

Location:                                                                                                                                                                                                    
/Users/ndmicro_test/.m2/repository/org/drools/drools-core/6.4.0.Final/drools-core-6.4.0.Final.jar                                                                                                            

/*
 * Decompiled with CFR.
 */
package net.shuzun.bod.engine.result.drools;

import java.util.List;
import org.drools.core.WorkingMemory;
import org.drools.core.definitions.rule.impl.RuleImpl;
import org.drools.core.rule.builder.dialect.asm.ConsequenceGenerator;
import org.drools.core.rule.builder.dialect.asm.ConsequenceStub;
import org.drools.core.spi.CompiledInvoker;
import org.drools.core.spi.Consequence;
import org.drools.core.spi.KnowledgeHelper;
import org.drools.core.util.asm.MethodComparator;

public class Rule_PHBLACKLIST1531598514DefaultConsequenceInvoker
implements ConsequenceStub,
CompiledInvoker {
    private static final long serialVersionUID = 510L;
    private volatile Consequence consequence;

    public boolean equals(Object object) {
        if (object == null || !(object instanceof CompiledInvoker)) {
            return false;
        }
        return MethodComparator.compareBytecode(this.getMethodBytecode(), ((CompiledInvoker)object).getMethodBytecode());
    }

    public int hashCode() {
        return -1016117768;
    }

    @Override
    public String getName() {
        return "default";
    }

    @Override
    public String getMethodName() {
        return "defaultConsequence";
    }

    @Override
    public String getPackageName() {
        return "net.shuzun.bod.engine.result.drools";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void evaluate(KnowledgeHelper knowledgeHelper, WorkingMemory workingMemory) throws Exception {
        if (this.consequence == null) {
            Rule_PHBLACKLIST1531598514DefaultConsequenceInvoker rule_PHBLACKLIST1531598514DefaultConsequenceInvoker = this;
            synchronized (rule_PHBLACKLIST1531598514DefaultConsequenceInvoker) {
                if (this.consequence == null) {
                    ConsequenceGenerator.generate(this, knowledgeHelper, workingMemory);
                }
            }
        }
        this.consequence.evaluate(knowledgeHelper, workingMemory);
    }

    @Override
    public String[] getGlobals() {
        return new String[0];
    }

    @Override
    public String getInternalRuleClassName() {
        return "net/shuzun/bod/engine/result/drools/Rule_PHBLACKLIST1531598514";
    }

    @Override
    public String getInvokerClassName() {
        return "Rule_PHBLACKLIST1531598514DefaultConsequenceInvoker";
    }

    @Override
    public String[] getGlobalTypes() {
        return new String[0];
    }

    @Override
    public String getRuleClassName() {
        return "Rule_PHBLACKLIST1531598514";
    }

    @Override
    public String getGeneratedInvokerClassName() {
        return "Rule_PHBLACKLIST1531598514DefaultConsequenceInvokerGenerated";
    }

    @Override
    public String[] getExpectedDeclarationTypes() {
        return new String[0];
    }

    @Override
    public void setConsequence(Consequence consequence) {
        this.consequence = consequence;
    }

    @Override
    public Boolean[] getNotPatterns() {
        return new Boolean[0];
    }

    @Override
    public String[] getPackageImports() {
        return new String[]{"java.util.List", "net.shuzun.bod.engine.result.drools.*", "java.util.Map", "java.util.HashMap", "java.lang.Integer", "java.util.ArrayList"};
    }

    @Override
    public List getMethodBytecode() {
        return RuleImpl.getMethodBytecode(this.getClass(), "Rule_PHBLACKLIST1531598514", "net.shuzun.bod.engine.result.drools", "defaultConsequence", "net/shuzun/bod/engine/result/drools/Rule_PHBLACKLIST1531598514.class");
    }
}

Affect(row-cnt:1) cost in 372 ms.
