package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vn implements xt0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ vn(Object obj, iw iwVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = iwVar;
    }

    @Override // defpackage.xt0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new un(this);
            case 1:
                return new vw(this);
            default:
                return new a31(this);
        }
    }

    public vn(CharSequence charSequence, j jVar) {
        this.a = 0;
        c10.p(charSequence, "input");
        this.b = charSequence;
        this.c = jVar;
    }
}
