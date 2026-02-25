package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vc implements ru {
    public static final vc a = new vc();
    public static Boolean b;

    @Override // defpackage.ru
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw b8.f("canFocus is read before it is written");
    }

    @Override // defpackage.ru
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }
}
