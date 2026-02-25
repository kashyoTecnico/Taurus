package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cs implements as {
    public final /* synthetic */ int d;
    public final String e;

    public /* synthetic */ cs(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.as
    public boolean f(CharSequence charSequence, int i, int i2, w31 w31Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.e)) {
            return true;
        }
        w31Var.c = (w31Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.d) {
            case 1:
                return "<" + this.e + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.as
    public Object a() {
        return this;
    }
}
