package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class di implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ di(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return c10.w(((l10) obj).b, ((l10) obj2).b);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                ng0 ng0Var = (ng0) obj;
                ng0 ng0Var2 = (ng0) obj2;
                return (((Number) ng0Var.e).intValue() - ((Number) ng0Var.d).intValue()) - (((Number) ng0Var2.e).intValue() - ((Number) ng0Var2.d).intValue());
            default:
                t30 t30Var = (t30) obj;
                t30 t30Var2 = (t30) obj2;
                float f = t30Var.H.p.G;
                float f2 = t30Var2.H.p.G;
                return f == f2 ? c10.w(t30Var.u(), t30Var2.u()) : Float.compare(f, f2);
        }
    }
}
