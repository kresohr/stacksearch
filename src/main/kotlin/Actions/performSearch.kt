package Actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.editor.Editor

class performSearch: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val caretModel = (e.getData(LangDataKeys.EDITOR) as Editor).caretModel
        val currentCaret = caretModel.currentCaret
        val selectedText = currentCaret.selectedText

        val predefinedSearchText = "https://stackoverflow.com/search?q=" + selectedText;
        BrowserUtil.browse(predefinedSearchText )

    }
}