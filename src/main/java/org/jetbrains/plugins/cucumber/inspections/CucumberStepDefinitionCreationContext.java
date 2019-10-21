package org.jetbrains.plugins.cucumber.inspections;

import com.intellij.psi.PsiFile;
import org.jetbrains.plugins.cucumber.BDDFrameworkType;

public class CucumberStepDefinitionCreationContext {
    private PsiFile psiFile;
    private BDDFrameworkType frameworkType;

    public PsiFile getPsiFile() {
        return psiFile;
    }
    public void setPsiFile(PsiFile psiFile) {
        this.psiFile = psiFile;
    }

    public BDDFrameworkType getFrameworkType() {
        return frameworkType;
    }
    public void setFrameworkType(BDDFrameworkType frameworkType) {
        this.frameworkType = frameworkType;
    }

    public CucumberStepDefinitionCreationContext() { }

    public CucumberStepDefinitionCreationContext(PsiFile psiFile, BDDFrameworkType frameworkType) {
        this.psiFile = psiFile;
        this.frameworkType = frameworkType;
    }
}
