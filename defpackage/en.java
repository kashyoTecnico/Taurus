package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class en implements d50 {
    public final /* synthetic */ int d = 1;
    public final Object e;
    public final Object f;

    public en(cn cnVar, d50 d50Var) {
        c10.p(cnVar, "defaultLifecycleObserver");
        this.e = cnVar;
        this.f = d50Var;
    }

    @Override // defpackage.d50
    public final void d(f50 f50Var, y40 y40Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.d) {
            case 0:
                cn cnVar = (cn) this.e;
                switch (dn.a[y40Var.ordinal()]) {
                    case 1:
                        cnVar.getClass();
                        break;
                    case 2:
                        cnVar.b(f50Var);
                        break;
                    case 3:
                        cnVar.c(f50Var);
                        break;
                    case 4:
                        cnVar.getClass();
                        break;
                    case 5:
                        cnVar.a(f50Var);
                        break;
                    case 6:
                        cnVar.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new fg();
                }
                d50 d50Var = (d50) this.f;
                if (d50Var != null) {
                    d50Var.d(f50Var, y40Var);
                    return;
                }
                return;
            case 1:
                if (y40Var == y40.ON_START) {
                    ((a50) this.e).b(this);
                    ((mp0) this.f).c();
                    return;
                }
                return;
            default:
                HashMap map = ((fe) this.f).a;
                List list = (List) map.get(y40Var);
                Object obj = this.e;
                fe.a(list, f50Var, y40Var, obj);
                fe.a((List) map.get(y40.ON_ANY), f50Var, y40Var, obj);
                return;
        }
    }

    public en(e50 e50Var) {
        this.e = e50Var;
        he heVar = he.c;
        Class<?> cls = e50Var.getClass();
        fe feVar = (fe) heVar.a.get(cls);
        this.f = feVar == null ? heVar.a(cls, null) : feVar;
    }

    public en(a50 a50Var, mp0 mp0Var) {
        this.e = a50Var;
        this.f = mp0Var;
    }
}
