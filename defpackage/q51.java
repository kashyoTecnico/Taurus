package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class q51 {
    public final w9 a;
    public final w9 b;
    public final w9 c;

    public q51(w9 w9Var, w9 w9Var2, w9 w9Var3) {
        this.a = w9Var;
        this.b = w9Var2;
        this.c = w9Var3;
    }

    public abstract r51 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        w9 w9Var = this.c;
        Class cls2 = (Class) w9Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        w9Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        w9 w9Var = this.a;
        Method method = (Method) w9Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, q51.class.getClassLoader()).getDeclaredMethod("read", q51.class);
        w9Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        w9 w9Var = this.b;
        Method method = (Method) w9Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, q51.class);
        w9Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((r51) this).e.readParcelable(r51.class.getClassLoader());
    }

    public final s51 g() {
        String string = ((r51) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (s51) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(s51 s51Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (s51Var == null) {
            ((r51) this).e.writeString(null);
            return;
        }
        try {
            ((r51) this).e.writeString(b(s51Var.getClass()).getName());
            r51 r51VarA = a();
            try {
                d(s51Var.getClass()).invoke(null, s51Var, r51VarA);
                Parcel parcel = r51VarA.e;
                int i = r51VarA.i;
                if (i >= 0) {
                    int i2 = r51VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(s51Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
