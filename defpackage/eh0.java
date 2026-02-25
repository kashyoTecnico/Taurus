package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class eh0 extends t41 {
    public fw0 b;
    public List c;
    public float d;
    public boolean e;
    public boolean f;
    public final i6 g;
    public i6 h;
    public final Object i;

    public eh0() {
        int i = a51.a;
        this.c = ks.d;
        this.d = 1.0f;
        this.e = true;
        i6 i6VarA = k6.a();
        this.g = i6VarA;
        this.h = i6VarA;
        this.i = m20.I(si.t);
    }

    @Override // defpackage.t41
    public final void a(sq sqVar) {
        if (this.e) {
            nm.I(this.c, this.g);
            e();
        } else if (this.f) {
            e();
        }
        this.e = false;
        this.f = false;
        fw0 fw0Var = this.b;
        if (fw0Var != null) {
            sq.t(sqVar, this.h, fw0Var, 1.0f, null, 56);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [h40, java.lang.Object] */
    public final void e() {
        float f = this.d;
        i6 i6Var = this.g;
        if (f == 1.0f) {
            this.h = i6Var;
            return;
        }
        if (c10.i(this.h, i6Var)) {
            this.h = k6.a();
        } else {
            Path.FillType fillType = this.h.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.h.a.rewind();
            Path path = this.h.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r0 = this.i;
        ((j6) r0.getValue()).a.setPath(i6Var != null ? i6Var.a : null, false);
        float length = ((j6) r0.getValue()).a.getLength();
        float f2 = 0.0f * length;
        float f3 = ((this.d + 0.0f) % 1.0f) * length;
        if (f2 <= f3) {
            ((j6) r0.getValue()).a(f2, f3, this.h);
        } else {
            ((j6) r0.getValue()).a(f2, length, this.h);
            ((j6) r0.getValue()).a(0.0f, f3, this.h);
        }
    }

    public final String toString() {
        return this.g.toString();
    }
}
