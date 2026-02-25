package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class jo extends RuntimeException {
    public final List d;

    public jo(List list) {
        this.d = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        x50 x50Var = new x50(10);
        List list = this.d;
        c10.p(list, "<this>");
        cn0 cn0Var = new cn0(list);
        if (cn0Var.a() > 0) {
            ((qh) cn0Var.get(0)).getClass();
            throw null;
        }
        x50 x50VarK = d80.k(x50Var);
        c10.p(x50VarK, "<this>");
        cn0 cn0Var2 = new cn0(x50VarK);
        int iA = cn0Var2.a();
        for (int i = 0; i < iA; i++) {
            sb.append("\tat " + ((String) cn0Var2.get(i)));
            sb.append('\n');
        }
        String string = sb.toString();
        c10.o(string, "toString(...)");
        return string;
    }
}
