package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class t20 {
    public final int a;

    public t20(int i) {
        this.a = (i & 4) != 0 ? 0 : 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t20) && this.a == ((t20) obj).a;
    }

    public final int hashCode() {
        return b8.c(-1, b8.c(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) u20.a(this.a)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
