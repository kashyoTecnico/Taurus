package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class xd {
    public static final Charset a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        c10.o(charsetForName, "forName(...)");
        a = charsetForName;
        c10.o(Charset.forName("UTF-16"), "forName(...)");
        c10.o(Charset.forName("UTF-16BE"), "forName(...)");
        c10.o(Charset.forName("UTF-16LE"), "forName(...)");
        c10.o(Charset.forName("US-ASCII"), "forName(...)");
        c10.o(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
