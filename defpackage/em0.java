package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class em0 {
    public static final fm0 a;

    static {
        fm0 fm0Var = null;
        try {
            fm0Var = (fm0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (fm0Var == null) {
            fm0Var = new fm0();
        }
        a = fm0Var;
    }

    public static ee a(Class cls) {
        a.getClass();
        return new ee(cls);
    }
}
