package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class xc0 implements InputConnection {
    public final h a;
    public ul0 b;

    public xc0(ul0 ul0Var, h hVar) {
        this.a = hVar;
        this.b = ul0Var;
    }

    public final void a(ul0 ul0Var) {
        ul0Var.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            if (ul0Var != null) {
                a(ul0Var);
                this.b = null;
            }
            this.a.g(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        ul0 ul0Var = this.b;
        if (ul0Var != null) {
            return ul0Var.setSelection(i, i2);
        }
        return false;
    }
}
