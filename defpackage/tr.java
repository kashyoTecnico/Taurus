package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class tr {
    public static final Object j = new Object();
    public static volatile tr k;
    public final ReentrantReadWriteLock a;
    public final x9 b;
    public volatile int c;
    public final Handler d;
    public final pr e;
    public final sr f;
    public final v71 g;
    public final int h;
    public final xm i;

    public tr(tv tvVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        sr srVar = tvVar.a;
        this.f = srVar;
        int i = tvVar.b;
        this.h = i;
        this.i = tvVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new x9();
        this.g = new v71(17);
        pr prVar = new pr(this);
        this.e = prVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                srVar.a(new or(prVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static tr a() {
        tr trVar;
        synchronized (j) {
            try {
                trVar = k;
                if (!(trVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return trVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        r31.q(charSequence, "charSequence cannot be null");
        e9 e9Var = this.e.b;
        e9Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            x31[] x31VarArr = (x31[]) spanned.getSpans(i, i + 1, x31.class);
            if (x31VarArr.length > 0) {
                return spanned.getSpanStart(x31VarArr[0]);
            }
        }
        return ((bs) e9Var.w(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new bs(i))).e;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            pr prVar = this.e;
            tr trVar = prVar.a;
            try {
                trVar.f.a(new or(prVar));
            } catch (Throwable th) {
                trVar.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new rr(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void g(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        pr prVar = this.e;
        prVar.getClass();
        Bundle bundle = editorInfo.extras;
        v80 v80Var = (v80) prVar.c.a;
        int iA = v80Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) v80Var.g).getInt(iA + v80Var.d) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
