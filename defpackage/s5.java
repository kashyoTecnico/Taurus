package defpackage;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s5 {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return RemoveSpaceGesture.class;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder f(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder g(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture h(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture i(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture j(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture k(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return SelectGesture.class;
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return DeleteGesture.class;
    }
}
