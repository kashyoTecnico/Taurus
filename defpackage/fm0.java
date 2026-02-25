package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class fm0 {
    public static String a(qw qwVar) {
        String string = qwVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
