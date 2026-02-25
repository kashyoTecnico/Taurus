package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wz {
    public final /* synthetic */ int a;
    public final ly b;
    public final ly c;
    public final ly d;
    public final ly e;
    public final Serializable f;

    public wz(String str) {
        this.a = 1;
        this.f = str;
        this.b = new ly(1, null);
        this.c = new ly(0, null);
        this.d = new ly(1, null);
        this.e = new ly(0, null);
    }

    public final ly a() {
        switch (this.a) {
        }
        return this.e;
    }

    public final ly b() {
        switch (this.a) {
        }
        return this.b;
    }

    public final ly c() {
        switch (this.a) {
        }
        return this.d;
    }

    public final ly d() {
        switch (this.a) {
        }
        return this.c;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                wz[] wzVarArr = (wz[]) this.f;
                c10.p(wzVarArr, "<this>");
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (wz wzVar : wzVarArr) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    jp0.f(sb, wzVar, null);
                }
                sb.append((CharSequence) ")");
                String string = sb.toString();
                c10.o(string, "toString(...)");
                return string;
            default:
                String str = (String) this.f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wz(wz[] wzVarArr) {
        this.a = 0;
        this.f = wzVarArr;
        int length = wzVarArr.length;
        ly[] lyVarArr = new ly[length];
        for (int i = 0; i < length; i++) {
            lyVarArr[i] = ((wz[]) this.f)[i].b();
        }
        this.b = new ly(1, new t51(lyVarArr, 0));
        int length2 = ((wz[]) this.f).length;
        ly[] lyVarArr2 = new ly[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            lyVarArr2[i2] = ((wz[]) this.f)[i2].d();
        }
        this.c = new ly(0, new ky(lyVarArr2, 0));
        int length3 = ((wz[]) this.f).length;
        ly[] lyVarArr3 = new ly[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            lyVarArr3[i3] = ((wz[]) this.f)[i3].c();
        }
        this.d = new ly(1, new t51(lyVarArr3, 1));
        int length4 = ((wz[]) this.f).length;
        ly[] lyVarArr4 = new ly[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            lyVarArr4[i4] = ((wz[]) this.f)[i4].a();
        }
        this.e = new ly(0, new ky(lyVarArr4, 1));
    }
}
