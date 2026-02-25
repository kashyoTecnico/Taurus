package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class pz0 {
    public static final Layout.Alignment a;
    public static final Layout.Alignment b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (c10.i(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (c10.i(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        b = alignment2;
    }
}
