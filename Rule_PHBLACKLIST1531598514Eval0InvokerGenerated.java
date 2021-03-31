
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
import org.drools.core.rule.Declaration;
import org.drools.core.spi.CompiledInvoker;
import org.drools.core.spi.EvalExpression;
import org.drools.core.spi.Tuple;
import org.drools.core.util.asm.MethodComparator;

public class Rule_PHBLACKLIST1531598514Eval0InvokerGenerated
implements EvalExpression,
CompiledInvoker {
    private static final long serialVersionUID = 510L;

    public boolean equals(Object object) {
        if (object == null || !(object instanceof CompiledInvoker)) {
            return false;
        }
        return MethodComparator.compareBytecode(this.getMethodBytecode(), ((CompiledInvoker)object).getMethodBytecode());
    }

    public int hashCode() {
        return 3569038;
    }

    @Override
    public EvalExpression clone() {
        return this;
    }

    @Override
    public boolean evaluate(Tuple tuple, Declaration[] arrdeclaration, WorkingMemory workingMemory, Object object) throws Exception {
        LeftTuple leftTuple = (LeftTuple)tuple;
        return Rule_PHBLACKLIST1531598514.eval0();
    }

    @Override
    public void replaceDeclaration(Declaration declaration, Declaration declaration2) {
    }

    @Override
    public Object createContext() {
        return null;
    }

    @Override
    public List getMethodBytecode() {
        return RuleImpl.getMethodBytecode(this.getClass(), "Rule_PHBLACKLIST1531598514", "net.shuzun.bod.engine.result.drools", "eval0", "net/shuzun/bod/engine/result/drools/Rule_PHBLACKLIST1531598514.class");
    }
}

Affect(row-cnt:1) cost in 197 ms.
