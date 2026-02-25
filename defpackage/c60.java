package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class c60 {
    public final Locale a;

    public c60(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c60)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return c10.i(this.a.toLanguageTag(), ((c60) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
