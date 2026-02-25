package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class ho {
    public final Executor a;
    public final nk0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public io[] g;
    public byte[] h;

    public ho(AssetManager assetManager, Executor executor, nk0 nk0Var, String str, File file) {
        this.a = executor;
        this.b = nk0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        this.c = i >= 31 ? c4.g : i != 30 ? null : c4.h;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.g();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: go
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b.h(i, serializable);
            }
        });
    }
}
