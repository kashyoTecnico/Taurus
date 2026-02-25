package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class s10 extends CancellationException {
    public final transient y10 d;

    public s10(String str, Throwable th, y10 y10Var) {
        super(str);
        this.d = y10Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s10)) {
            return false;
        }
        s10 s10Var = (s10) obj;
        return c10.i(s10Var.getMessage(), getMessage()) && c10.i(s10Var.d, this.d) && c10.i(s10Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        c10.m(message);
        int iHashCode = (this.d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.d;
    }
}
