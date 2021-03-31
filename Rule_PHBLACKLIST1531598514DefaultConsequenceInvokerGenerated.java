
ClassLoader:                                                                                                                                                                                                 
+-org.drools.core.rule.JavaDialectRuntimeData$PackageClassLoader@27912e3                                                                                                                                     
  +-org.drools.core.common.ProjectClassLoader@3b8f0a79                                                                                                                                                       
    +-sun.misc.Launcher$AppClassLoader@18b4aac2                                                                                                                                                              
      +-sun.misc.Launcher$ExtClassLoader@7a07c5b4                                                                                                                                                            

Location:                                                                                                                                                                                                    
                                                                                                                                                                                                             

/*
 * Decompiled with CFR.
 */
package net.shuzun.bod.engine.result.drools;

import java.util.List;
import net.shuzun.bod.engine.result.drools.Rule_PHBLACKLIST1531598514;
import org.drools.core.WorkingMemory;
import org.drools.core.definitions.rule.impl.RuleImpl;
import org.drools.core.reteoo.LeftTuple;
import org.drools.core.reteoo.RuleTerminalNode;
import org.drools.core.rule.Declaration;
import org.drools.core.spi.CompiledInvoker;
import org.drools.core.spi.Consequence;
import org.drools.core.spi.KnowledgeHelper;
import org.drools.core.util.asm.MethodComparator;

public class Rule_PHBLACKLIST1531598514DefaultConsequenceInvokerGenerated
implements Consequence,
CompiledInvoker {
    private static final long serialVersionUID = 510L;

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
        return "Rule_PHBLACKLIST1531598514DefaultConsequenceInvokerGenerated";
    }

    @Override
    public void evaluate(KnowledgeHelper knowledgeHelper, WorkingMemory workingMemory) throws Exception {
        LeftTuple leftTuple = (LeftTuple)knowledgeHelper.getTuple();
        Declaration[] arrdeclaration = ((RuleTerminalNode)knowledgeHelper.getMatch().getTuple().getTupleSink()).getRequiredDeclarations();
        Rule_PHBLACKLIST1531598514.defaultConsequence(knowledgeHelper);
    }

    @Override
    public List getMethodBytecode() {
        return RuleImpl.getMethodBytecode(this.getClass(), "Rule_PHBLACKLIST1531598514", "net.shuzun.bod.engine.result.drools", "defaultConsequence", "net/shuzun/bod/engine/result/drools/Rule_PHBLACKLIST1531598514.class");
    }
}

Affect(row-cnt:1) cost in 488 ms.
