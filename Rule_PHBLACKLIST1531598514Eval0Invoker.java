
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
import org.drools.core.rule.Declaration;
import org.drools.core.rule.builder.dialect.asm.EvalGenerator;
import org.drools.core.rule.builder.dialect.asm.EvalStub;
import org.drools.core.spi.CompiledInvoker;
import org.drools.core.spi.EvalExpression;
import org.drools.core.spi.Tuple;
import org.drools.core.util.asm.MethodComparator;

public class Rule_PHBLACKLIST1531598514Eval0Invoker
implements EvalStub,
CompiledInvoker {
    private static final long serialVersionUID = 510L;
    private volatile EvalExpression eval;

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
    public String getMethodName() {
        return "eval0";
    }

    @Override
    public String getPackageName() {
        return "net.shuzun.bod.engine.result.drools";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean evaluate(Tuple tuple, Declaration[] arrdeclaration, WorkingMemory workingMemory, Object object) throws Exception {
        if (this.eval == null) {
            Rule_PHBLACKLIST1531598514Eval0Invoker rule_PHBLACKLIST1531598514Eval0Invoker = this;
            synchronized (rule_PHBLACKLIST1531598514Eval0Invoker) {
                if (this.eval == null) {
                    EvalGenerator.generate(this, tuple, arrdeclaration, workingMemory);
                }
            }
        }
        return this.eval.evaluate(tuple, arrdeclaration, workingMemory, object);
    }

    @Override
    public String[] getGlobals() {
        return new String[0];
    }

    @Override
    public void replaceDeclaration(Declaration declaration, Declaration declaration2) {
    }

    @Override
    public void setEval(EvalExpression evalExpression) {
        this.eval = evalExpression;
    }

    @Override
    public String getInternalRuleClassName() {
        return "net/shuzun/bod/engine/result/drools/Rule_PHBLACKLIST1531598514";
    }

    @Override
    public String getInvokerClassName() {
        return "Rule_PHBLACKLIST1531598514Eval0Invoker";
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
        return "Rule_PHBLACKLIST1531598514Eval0InvokerGenerated";
    }

    @Override
    public String[] getExpectedDeclarationTypes() {
        return new String[0];
    }

    @Override
    public String[] getPackageImports() {
        return new String[]{"java.util.List", "net.shuzun.bod.engine.result.drools.*", "java.util.Map", "java.util.HashMap", "java.lang.Integer", "java.util.ArrayList"};
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

Affect(row-cnt:1) cost in 306 ms.
