package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class wv0 extends jy0 implements kw {
    public final /* synthetic */ int h = 1;
    public int i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wv0(gw gwVar, lk lkVar) {
        super(2, lkVar);
        this.p = (y20) gwVar;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) throws Throwable {
        wt wtVar = (wt) obj;
        lk lkVar = (lk) obj2;
        switch (this.h) {
            case 0:
                ((wv0) k(lkVar, wtVar)).o(j41.a);
                return xl.d;
            default:
                return ((wv0) k(lkVar, wtVar)).o(j41.a);
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [gw, y20] */
    @Override // defpackage.ia
    public final lk k(lk lkVar, Object obj) {
        switch (this.h) {
            case 0:
                wv0 wv0Var = new wv0((y20) this.p, lkVar);
                wv0Var.o = obj;
                return wv0Var;
            default:
                wv0 wv0Var2 = new wv0((ContentResolver) this.l, (Uri) this.m, (a81) this.n, (gc) this.o, (Context) this.p, lkVar);
                wv0Var2.j = obj;
                return wv0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0257, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:77:0x01c0, B:89:0x01f1], limit reached: 164 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0273 A[LOOP:0: B:70:0x019b->B:130:0x0273, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #3 {all -> 0x0029, blocks: (B:9:0x0023, B:20:0x005b, B:24:0x006d, B:26:0x0075, B:16:0x003c, B:19:0x0052), top: B:148:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v3, types: [gw, y20] */
    /* JADX WARN: Type inference failed for: r4v7, types: [gw, y20] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0256 -> B:117:0x0257). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009a -> B:20:0x005b). Please report as a decompilation issue!!! */
    @Override // defpackage.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(ContentResolver contentResolver, Uri uri, a81 a81Var, gc gcVar, Context context, lk lkVar) {
        super(2, lkVar);
        this.l = contentResolver;
        this.m = uri;
        this.n = a81Var;
        this.o = gcVar;
        this.p = context;
    }
}
