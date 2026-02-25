package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h61 extends j61 {
    public static h61 c;
    public static final kc0 d = new kc0(27);
    public final Application b;

    public h61(Application application) {
        this.b = application;
    }

    @Override // defpackage.j61, defpackage.i61
    public final f61 a(Class cls) {
        Application application = this.b;
        if (application == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
        if (!r7.class.isAssignableFrom(cls)) {
            return c10.A(cls);
        }
        try {
            f61 f61Var = (f61) cls.getConstructor(Application.class).newInstance(application);
            c10.m(f61Var);
            return f61Var;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
