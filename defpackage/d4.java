package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class d4 extends y20 implements gw {
    public static final d4 A;
    public static final d4 B;
    public static final d4 C;
    public static final d4 D;
    public static final d4 E;
    public static final d4 F;
    public static final d4 G;
    public static final d4 H;
    public static final d4 f;
    public static final d4 g;
    public static final d4 h;
    public static final d4 i;
    public static final d4 j;
    public static final d4 k;
    public static final d4 l;
    public static final d4 m;
    public static final d4 n;
    public static final d4 o;
    public static final d4 p;
    public static final d4 q;
    public static final d4 r;
    public static final d4 s;
    public static final d4 t;
    public static final d4 u;
    public static final d4 v;
    public static final d4 w;
    public static final d4 x;
    public static final d4 y;
    public static final d4 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 0;
        f = new d4(i2, 0);
        g = new d4(i2, 1);
        h = new d4(i2, 2);
        i = new d4(i2, 3);
        j = new d4(i2, 4);
        k = new d4(i2, 5);
        l = new d4(i2, 6);
        m = new d4(i2, 7);
        n = new d4(i2, 8);
        o = new d4(i2, 9);
        p = new d4(i2, 10);
        q = new d4(i2, 11);
        r = new d4(i2, 12);
        s = new d4(i2, 13);
        t = new d4(i2, 14);
        u = new d4(i2, 15);
        v = new d4(i2, 16);
        w = new d4(i2, 17);
        x = new d4(i2, 18);
        y = new d4(i2, 19);
        z = new d4(i2, 20);
        A = new d4(i2, 21);
        B = new d4(i2, 22);
        C = new d4(i2, 23);
        D = new d4(i2, 24);
        E = new d4(i2, 25);
        F = new d4(i2, 26);
        G = new d4(i2, 27);
        H = new d4(i2, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gw
    public final Object a() throws Throwable {
        xs xsVarA;
        ml mlVarA;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.e) {
            case 0:
                m4.b("LocalConfiguration");
                throw null;
            case 1:
                m4.b("LocalContext");
                throw null;
            case 2:
                m4.b("LocalImageVectorCache");
                throw null;
            case 3:
                m4.b("LocalResourceIdCache");
                throw null;
            case 4:
                m4.b("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return "DEFAULT_TEST_TAG";
            case 7:
                return UUID.randomUUID();
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    fn fnVar = xo.a;
                    sx sxVar = r70.a;
                    kw j7Var = new j7(2, objArr == true ? 1 : 0, 0);
                    Thread threadCurrentThread = Thread.currentThread();
                    g2 g2Var = g2.v;
                    nk nkVar = (nk) sxVar.n(g2Var);
                    is isVar = is.d;
                    if (nkVar == null) {
                        xsVarA = k21.a();
                        mlVarA = r31.A(isVar, d80.v(sxVar, xsVarA), true);
                        fn fnVar2 = xo.a;
                        if (mlVarA != fnVar2 && mlVarA.n(g2Var) == null) {
                            mlVarA = mlVarA.k(fnVar2);
                        }
                    } else {
                        if (nkVar instanceof xs) {
                        }
                        xsVarA = (xs) k21.a.get();
                        mlVarA = r31.A(isVar, sxVar, true);
                        fn fnVar3 = xo.a;
                        if (mlVarA != fnVar3 && mlVarA.n(g2Var) == null) {
                            mlVarA = mlVarA.k(fnVar3);
                        }
                    }
                    va vaVar = new va(mlVarA, threadCurrentThread, xsVarA);
                    vaVar.g0(zl.d, vaVar, j7Var);
                    xs xsVar = vaVar.h;
                    if (xsVar != null) {
                        int i2 = xs.i;
                        xsVar.o(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long jS = xsVar != null ? xsVar.s() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y10.d;
                            if (atomicReferenceFieldUpdater.get(vaVar) instanceof bz) {
                                LockSupport.parkNanos(vaVar, jS);
                            } else {
                                if (xsVar != null) {
                                    int i3 = xs.i;
                                    xsVar.h(false);
                                }
                                Object objR = m20.R(atomicReferenceFieldUpdater.get(vaVar));
                                eg egVar = objR instanceof eg ? (eg) objR : null;
                                if (egVar != null) {
                                    throw egVar.a;
                                }
                                choreographer = (Choreographer) objR;
                            }
                        } catch (Throwable th) {
                            if (xsVar != null) {
                                int i4 = xs.i;
                                xsVar.h(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    vaVar.A(interruptedException);
                    throw interruptedException;
                }
                m7 m7Var = new m7(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return d80.v(m7Var, m7Var.o);
            case 9:
                return null;
            case 10:
                return lf.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 11:
                return Boolean.TRUE;
            case 12:
            case 13:
                return null;
            case 14:
                ti.b("LocalAutofillManager");
                throw null;
            case 15:
                ti.b("LocalAutofillTree");
                throw null;
            case 16:
                ti.b("LocalClipboard");
                throw null;
            case 17:
                ti.b("LocalClipboardManager");
                throw null;
            case 18:
                return Boolean.TRUE;
            case 19:
                ti.b("LocalDensity");
                throw null;
            case 20:
                ti.b("LocalFocusManager");
                throw null;
            case 21:
                ti.b("LocalFontFamilyResolver");
                throw null;
            case 22:
                ti.b("LocalFontLoader");
                throw null;
            case 23:
                ti.b("LocalGraphicsContext");
                throw null;
            case 24:
                ti.b("LocalHapticFeedback");
                throw null;
            case 25:
                ti.b("LocalInputManager");
                throw null;
            case 26:
                ti.b("LocalLayoutDirection");
                throw null;
            case 27:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
