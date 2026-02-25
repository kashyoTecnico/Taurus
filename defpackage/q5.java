package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class q5 implements ex {
    public final Object a;
    public boolean b;
    public Object c;
    public Object d;

    public q5() {
        this.a = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = true;
    }

    @Override // defpackage.ex
    public void a(fx fxVar) {
        synchronized (this.a) {
            if (!fxVar.s) {
                fxVar.s = true;
                fxVar.b();
            }
        }
    }

    @Override // defpackage.ex
    public fx b() {
        fx fxVar;
        synchronized (this.a) {
            ((p3) this.c).getUniqueDrawingId();
            fxVar = new fx(new ix());
        }
        return fxVar;
    }

    public q5(p3 p3Var) {
        this.c = p3Var;
        this.a = new Object();
        p5 p5Var = new p5(this);
        this.d = p5Var;
        if (p3Var.isAttachedToWindow()) {
            Context context = p3Var.getContext();
            if (!this.b) {
                context.getApplicationContext().registerComponentCallbacks(p5Var);
                this.b = true;
            }
        }
        p3Var.addOnAttachStateChangeListener(new s3(1, this));
    }
}
