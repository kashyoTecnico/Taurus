package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class or extends c4 {
    public final /* synthetic */ pr p;

    public or(pr prVar) {
        this.p = prVar;
    }

    @Override // defpackage.c4
    public final void B(Throwable th) {
        this.p.a.f(th);
    }

    @Override // defpackage.c4
    public final void C(q2 q2Var) {
        pr prVar = this.p;
        prVar.c = q2Var;
        q2 q2Var2 = prVar.c;
        tr trVar = prVar.a;
        v71 v71Var = trVar.g;
        xm xmVar = trVar.i;
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? zr.a() : nm.s();
        e9 e9Var = new e9();
        e9Var.a = v71Var;
        e9Var.b = q2Var2;
        e9Var.c = xmVar;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                e9Var.w(str, 0, str.length(), 1, true, new cs(str, 0));
            }
        }
        prVar.b = e9Var;
        tr trVar2 = prVar.a;
        trVar2.getClass();
        ArrayList arrayList = new ArrayList();
        trVar2.a.writeLock().lock();
        try {
            trVar2.c = 1;
            arrayList.addAll(trVar2.b);
            trVar2.b.clear();
            trVar2.a.writeLock().unlock();
            trVar2.d.post(new rr(arrayList, trVar2.c, null));
        } catch (Throwable th) {
            trVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
