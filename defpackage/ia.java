package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ia implements lk, yl, Serializable {
    public final lk d;

    public ia(lk lkVar) {
        this.d = lkVar;
    }

    @Override // defpackage.yl
    public yl d() {
        lk lkVar = this.d;
        if (lkVar instanceof yl) {
            return (yl) lkVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lk
    public final void h(Object obj) {
        while (true) {
            ia iaVar = this;
            lk lkVar = iaVar.d;
            c10.m(lkVar);
            try {
                obj = iaVar.o(obj);
                if (obj == xl.d) {
                    return;
                }
            } catch (Throwable th) {
                obj = c10.z(th);
            }
            iaVar.p();
            if (!(lkVar instanceof ia)) {
                lkVar.h(obj);
                return;
            }
            this = lkVar;
        }
    }

    public lk k(lk lkVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement n() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        mm mmVar = (mm) getClass().getAnnotation(mm.class);
        String str = null;
        if (mmVar == null) {
            return null;
        }
        int iV = mmVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? mmVar.l()[iIntValue] : -1;
        e9 e9Var = c4.e;
        e9 e9Var2 = c4.f;
        if (e9Var2 == null) {
            try {
                e9 e9Var3 = new e9(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                c4.f = e9Var3;
                e9Var2 = e9Var3;
            } catch (Exception unused2) {
                c4.f = e9Var;
                e9Var2 = e9Var;
            }
        }
        if (e9Var2 != e9Var) {
            Method method = (Method) e9Var2.a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) e9Var2.b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) e9Var2.c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = mmVar.c();
        } else {
            strC = str + '/' + mmVar.c();
        }
        return new StackTraceElement(strC, mmVar.m(), mmVar.f(), i);
    }

    public abstract Object o(Object obj);

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objN = n();
        if (objN == null) {
            objN = getClass().getName();
        }
        sb.append(objN);
        return sb.toString();
    }

    public void p() {
    }
}
