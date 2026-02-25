package androidx.compose.foundation.layout;

import defpackage.b8;
import defpackage.d90;
import defpackage.f81;
import defpackage.i90;
import defpackage.kw;
import defpackage.y20;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class WrapContentElement extends i90 {
    public final int a;
    public final y20 b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(int i, kw kwVar, Object obj) {
        this.a = i;
        this.b = (y20) kwVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.a == wrapContentElement.a && this.c.equals(wrapContentElement.c);
    }

    @Override // defpackage.i90
    public final d90 f() {
        f81 f81Var = new f81();
        f81Var.r = this.a;
        f81Var.s = this.b;
        return f81Var;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        f81 f81Var = (f81) d90Var;
        f81Var.r = this.a;
        f81Var.s = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + b8.d(b8.p(this.a) * 31, 31, false);
    }
}
