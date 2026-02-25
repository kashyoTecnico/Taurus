package defpackage;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class a9 {
    public static final a9 a = new a9();

    public final void a(r40 r40Var, u01 u01Var, HandwritingGesture handwritingGesture, c61 c61Var, Executor executor, final IntConsumer intConsumer, iw iwVar) {
        final int i = r40Var != null ? wx.a.i(r40Var, handwritingGesture, u01Var, c61Var, iwVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: z8
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(i);
                }
            });
        } else {
            intConsumer.accept(i);
        }
    }

    public final boolean b(r40 r40Var, u01 u01Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (r40Var != null) {
            return wx.a.A(r40Var, previewableHandwritingGesture, u01Var, cancellationSignal);
        }
        return false;
    }
}
