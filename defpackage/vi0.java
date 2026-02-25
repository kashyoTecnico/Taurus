package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class vi0 {
    public static final vi0 b = new vi0(false);
    public final boolean a;

    public vi0() {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vi0) {
            return this.a == ((vi0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public vi0(boolean z) {
        this.a = z;
    }
}
