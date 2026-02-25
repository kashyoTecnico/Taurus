package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ur implements cn {
    public final /* synthetic */ a50 d;

    public ur(EmojiCompatInitializer emojiCompatInitializer, a50 a50Var) {
        this.d = a50Var;
    }

    @Override // defpackage.cn
    public final void c(f50 f50Var) {
        yi.a(Looper.getMainLooper()).postDelayed(new xr(), 500L);
        this.d.b(this);
    }
}
