package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ot0 {
    public final String a;
    public final kw b;
    public final boolean c;

    public ot0(String str, kw kwVar) {
        this.a = str;
        this.b = kwVar;
    }

    public final void a(ct0 ct0Var, Object obj) {
        ct0Var.d(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ ot0(String str) {
        this(str, kt0.o);
    }

    public ot0(String str, int i) {
        this(str);
        this.c = true;
    }

    public ot0(String str, boolean z, kw kwVar) {
        this(str, kwVar);
        this.c = z;
    }
}
