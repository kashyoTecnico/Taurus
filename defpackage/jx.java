package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jx extends t41 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = bf.g;
    public List f;
    public boolean g;
    public i6 h;
    public iw i;
    public final h j;
    public String k;
    public float l;
    public float m;
    public boolean n;

    public jx() {
        int i = a51.a;
        this.f = ks.d;
        this.g = true;
        this.j = new h(18, this);
        this.k = "";
        this.l = 1.0f;
        this.m = 1.0f;
        this.n = true;
    }

    @Override // defpackage.t41
    public final void a(sq sqVar) {
        if (this.n) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = e80.a();
                this.b = fArrA;
            } else {
                e80.d(fArrA);
            }
            e80.f(fArrA, 0.0f, 0.0f);
            if (fArrA.length >= 16) {
                double d = 0.0f * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f = fArrA[0];
                float f2 = fArrA[4];
                float f3 = (fSin * f2) + (fCos * f);
                float f4 = -fSin;
                float f5 = (f2 * fCos) + (f * f4);
                float f6 = fArrA[1];
                float f7 = fArrA[5];
                float f8 = (fSin * f7) + (fCos * f6);
                float f9 = (f7 * fCos) + (f6 * f4);
                float f10 = fArrA[2];
                float f11 = fArrA[6];
                float f12 = (fSin * f11) + (fCos * f10);
                float f13 = (f11 * fCos) + (f10 * f4);
                float f14 = fArrA[3];
                float f15 = fArrA[7];
                fArrA[0] = f3;
                fArrA[1] = f8;
                fArrA[2] = f12;
                fArrA[3] = (fSin * f15) + (fCos * f14);
                fArrA[4] = f5;
                fArrA[5] = f9;
                fArrA[6] = f13;
                fArrA[7] = (fCos * f15) + (f4 * f14);
            }
            float f16 = this.l;
            float f17 = this.m;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f16;
                fArrA[1] = fArrA[1] * f16;
                fArrA[2] = fArrA[2] * f16;
                fArrA[3] = fArrA[3] * f16;
                fArrA[4] = fArrA[4] * f17;
                fArrA[5] = fArrA[5] * f17;
                fArrA[6] = fArrA[6] * f17;
                fArrA[7] = fArrA[7] * f17;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            e80.f(fArrA, -0.0f, -0.0f);
            this.n = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                i6 i6VarA = this.h;
                if (i6VarA == null) {
                    i6VarA = k6.a();
                    this.h = i6VarA;
                }
                nm.I(this.f, i6VarA);
            }
            this.g = false;
        }
        e9 e9VarD = sqVar.D();
        long jS = e9VarD.s();
        e9VarD.o().l();
        try {
            e9 e9Var = (e9) ((r1) e9VarD.a).e;
            float[] fArr = this.b;
            if (fArr != null) {
                e9Var.o().p(fArr);
            }
            i6 i6Var = this.h;
            if (!this.f.isEmpty() && i6Var != null) {
                e9Var.o().r(i6Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((t41) arrayList.get(i)).a(sqVar);
            }
        } finally {
            b8.m(e9VarD, jS);
        }
    }

    @Override // defpackage.t41
    public final iw b() {
        return this.i;
    }

    @Override // defpackage.t41
    public final void d(h hVar) {
        this.i = hVar;
    }

    public final void e(int i, t41 t41Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, t41Var);
        } else {
            arrayList.add(t41Var);
        }
        g(t41Var);
        t41Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = a51.a;
            if (bf.h(j2) == bf.h(j) && bf.g(j2) == bf.g(j) && bf.e(j2) == bf.e(j)) {
                return;
            }
            this.d = false;
            this.e = bf.g;
        }
    }

    public final void g(t41 t41Var) {
        if (t41Var instanceof eh0) {
            fw0 fw0Var = ((eh0) t41Var).b;
            if (this.d && fw0Var != null) {
                f(fw0Var.a);
                return;
            }
            return;
        }
        if (t41Var instanceof jx) {
            jx jxVar = (jx) t41Var;
            if (jxVar.d && this.d) {
                f(jxVar.e);
            } else {
                this.d = false;
                this.e = bf.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t41 t41Var = (t41) arrayList.get(i);
            sb.append("\t");
            sb.append(t41Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
