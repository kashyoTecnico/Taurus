package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w31 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final q2 b;
    public volatile int c = 0;

    public w31(q2 q2Var, int i) {
        this.b = q2Var;
        this.a = i;
    }

    public final int a(int i) {
        u80 u80VarB = b();
        int iA = u80VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) u80VarB.g;
        int i2 = iA + u80VarB.d;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final u80 b() {
        ThreadLocal threadLocal = d;
        u80 u80Var = (u80) threadLocal.get();
        if (u80Var == null) {
            u80Var = new u80();
            threadLocal.set(u80Var);
        }
        v80 v80Var = (v80) this.b.a;
        int iA = v80Var.a(6);
        if (iA != 0) {
            int i = iA + v80Var.d;
            int i2 = (this.a * 4) + ((ByteBuffer) v80Var.g).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) v80Var.g).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) v80Var.g;
            u80Var.g = byteBuffer;
            if (byteBuffer != null) {
                u80Var.d = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                u80Var.e = i4;
                u80Var.f = ((ByteBuffer) u80Var.g).getShort(i4);
                return u80Var;
            }
            u80Var.d = 0;
            u80Var.e = 0;
            u80Var.f = 0;
        }
        return u80Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        u80 u80VarB = b();
        int iA = u80VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) u80VarB.g).getInt(iA + u80VarB.d) : 0));
        sb.append(", codepoints:");
        u80 u80VarB2 = b();
        int iA2 = u80VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + u80VarB2.d;
            i = ((ByteBuffer) u80VarB2.g).getInt(((ByteBuffer) u80VarB2.g).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
