package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ul0 implements InputConnection {
    public final r1 a;
    public final boolean b;
    public final r40 c;
    public final u01 d;
    public final c61 e;
    public int f;
    public a11 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public ul0(a11 a11Var, r1 r1Var, boolean z, r40 r40Var, u01 u01Var, c61 c61Var) {
        this.a = r1Var;
        this.b = z;
        this.c = r40Var;
        this.d = u01Var;
        this.e = c61Var;
        this.g = a11Var;
    }

    public final void a(hr hrVar) {
        this.f++;
        try {
            this.j.add(hrVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [iw, y20] */
    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((t40) this.a.e).c.g(ue.e0(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((t40) this.a.e).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (c10.i(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new xf(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new sn(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new tn(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new ht());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        a11 a11Var = this.g;
        return TextUtils.getCapsMode(a11Var.a.e, w11.e(a11Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return r31.j(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (w11.b(this.g.b)) {
            return null;
        }
        return n2.f(this.g).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return n2.g(this.g, i).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return n2.h(this.g, i).e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new fu0(0, this.g.a.e.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
                ((t40) this.a.e).d.g(new wy(i2));
            } else {
                i2 = 1;
                ((t40) this.a.e).d.g(new wy(i2));
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            a9.a.a(this.c, this.d, handwritingGesture, this.e, executor, intConsumer, new h(21, this));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return a9.a.b(this.c, this.d, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            r1 r9 = r9.a
            java.lang.Object r9 = r9.e
            t40 r9 = (defpackage.t40) r9
            n40 r9 = r9.m
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            a11 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul0.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [h40, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((t40) this.a.e).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new du0(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new eu0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new fu0(i, i2));
        return true;
    }
}
