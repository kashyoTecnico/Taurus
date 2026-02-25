package androidx.compose.foundation;

import defpackage.b8;
import defpackage.bf;
import defpackage.c10;
import defpackage.d90;
import defpackage.fa;
import defpackage.i90;
import defpackage.ju0;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
final class BackgroundElement extends i90 {
    public final long a;
    public final float b = 1.0f;
    public final ju0 c;

    public BackgroundElement(long j, ju0 ju0Var) {
        this.a = j;
        this.c = ju0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && bf.c(this.a, backgroundElement.a) && this.b == backgroundElement.b && c10.i(this.c, backgroundElement.c);
    }

    @Override // defpackage.i90
    public final d90 f() {
        fa faVar = new fa();
        faVar.r = this.a;
        faVar.s = this.c;
        faVar.t = 9205357640488583168L;
        return faVar;
    }

    @Override // defpackage.i90
    public final void g(d90 d90Var) {
        fa faVar = (fa) d90Var;
        faVar.r = this.a;
        faVar.s = this.c;
    }

    public final int hashCode() {
        int i = bf.h;
        return this.c.hashCode() + b8.b(this.b, Long.hashCode(this.a) * 961, 31);
    }
}
