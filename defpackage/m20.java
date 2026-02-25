package defpackage;

import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.foundation.layout.b;
import com.taurus.dgmobilemx.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class m20 {
    public static final cs a;
    public static final cs b;
    public static final cs c;
    public static final cs d;
    public static final cs e;
    public static final cs f;
    public static final cs g;
    public static final cs h;
    public static final fs i = new fs(false);
    public static final fs j = new fs(true);
    public static final StackTraceElement[] k = new StackTraceElement[0];
    public static final xz l = new xz(21, new nl(5), new r8(4));
    public static final Object m = new Object();
    public static final kc0 n = new kc0(28);

    static {
        int i2 = 1;
        a = new cs("RESUME_TOKEN", i2);
        b = new cs("UNDEFINED", i2);
        c = new cs("REUSABLE_CLAIMED", i2);
        d = new cs("COMPLETING_ALREADY", i2);
        e = new cs("COMPLETING_WAITING_CHILDREN", i2);
        f = new cs("COMPLETING_RETRY", i2);
        g = new cs("TOO_LATE_TO_CANCEL", i2);
        h = new cs("SEALED", i2);
    }

    public static final int A(long j2, o11 o11Var) {
        if (ed0.e(j2) <= 0.0f) {
            return 0;
        }
        float fE = ed0.e(j2);
        u90 u90Var = o11Var.b;
        return fE >= u90Var.e ? o11Var.a.a.e.length() : u90Var.e(j2);
    }

    public static final ad B(lk lkVar) {
        ad adVar;
        ad adVar2;
        if (!(lkVar instanceof to)) {
            return new ad(1, lkVar);
        }
        to toVar = (to) lkVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = to.k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(toVar);
            adVar = null;
            cs csVar = c;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(toVar, csVar);
                adVar2 = null;
                break;
            }
            if (obj instanceof ad) {
                while (!atomicReferenceFieldUpdater.compareAndSet(toVar, obj, csVar)) {
                    if (atomicReferenceFieldUpdater.get(toVar) != obj) {
                        break;
                    }
                }
                adVar2 = (ad) obj;
                break loop0;
            }
            if (obj != csVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (adVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ad.j;
            Object obj2 = atomicReferenceFieldUpdater2.get(adVar2);
            if (!(obj2 instanceof cg) || ((cg) obj2).d == null) {
                ad.i.set(adVar2, 536870911);
                atomicReferenceFieldUpdater2.set(adVar2, i1.a);
                adVar = adVar2;
            } else {
                adVar2.p();
            }
            if (adVar != null) {
                return adVar;
            }
        }
        return new ad(2, lkVar);
    }

    public static final tj0 C(View view) {
        tj0 tj0Var = (tj0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (tj0Var != null) {
            return tj0Var;
        }
        tj0 tj0Var2 = new tj0();
        view.setTag(R.id.pooling_container_listener_holder_tag, tj0Var2);
        return tj0Var2;
    }

    public static final x60 D(x60 x60Var) {
        t30 t30Var = x60Var.r.r;
        while (true) {
            t30 t30VarT = t30Var.t();
            t30 t30Var2 = null;
            if ((t30VarT != null ? t30VarT.j : null) == null) {
                x60 x60VarM0 = t30Var.G.d.M0();
                c10.m(x60VarM0);
                return x60VarM0;
            }
            t30 t30VarT2 = t30Var.t();
            if (t30VarT2 != null) {
                t30Var2 = t30VarT2.j;
            }
            c10.m(t30Var2);
            t30 t30VarT3 = t30Var.t();
            c10.m(t30VarT3);
            t30Var = t30VarT3.j;
            c10.m(t30Var);
        }
    }

    public static final int E(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(qq qqVar) {
        if (((d90) qqVar).d.q) {
            d80.x(qqVar, 1).V0();
        }
    }

    public static final void G(ci ciVar, kw kwVar) {
        c10.n(kwVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        r31.m(2, kwVar);
        kwVar.e(ciVar, 1);
    }

    public static final boolean H(av avVar) {
        t30 t30Var;
        nc0 nc0Var;
        t30 t30Var2;
        nc0 nc0Var2 = avVar.k;
        return (nc0Var2 == null || (t30Var = nc0Var2.r) == null || !t30Var.I() || (nc0Var = avVar.k) == null || (t30Var2 = nc0Var.r) == null || !t30Var2.H()) ? false : true;
    }

    public static h40 I(gw gwVar) {
        g2 g2Var = g2.Y;
        o41 o41Var = new o41();
        o41Var.d = gwVar;
        o41Var.e = g2Var;
        return o41Var;
    }

    public static qy0 J(gw gwVar) {
        c10.p(gwVar, "initializer");
        return new qy0(gwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(defpackage.lk r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.to
            if (r0 == 0) goto Lae
            to r9 = (defpackage.to) r9
            pl r0 = r9.g
            mk r1 = r9.h
            java.lang.Throwable r2 = defpackage.zm0.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            eg r3 = new eg
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            ml r2 = r1.f()
            boolean r2 = r0.f(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.i = r3
            r9.f = r4
            ml r10 = r1.f()
            r0.d(r10, r9)
            return
        L2f:
            xs r0 = defpackage.k21.a()
            long r5 = r0.f
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.i = r3
            r9.f = r4
            r0.l(r9)
            goto La8
        L46:
            r0.o(r4)
            ml r2 = r1.f()     // Catch: java.lang.Throwable -> L69
            g2 r3 = defpackage.g2.E     // Catch: java.lang.Throwable -> L69
            kl r2 = r2.n(r3)     // Catch: java.lang.Throwable -> L69
            r10 r2 = (defpackage.r10) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.q()     // Catch: java.lang.Throwable -> L69
            ym0 r10 = defpackage.c10.z(r10)     // Catch: java.lang.Throwable -> L69
            r9.h(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.j     // Catch: java.lang.Throwable -> L69
            ml r3 = r1.f()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.b10.k0(r3, r2)     // Catch: java.lang.Throwable -> L69
            cs r5 = defpackage.b10.n     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            g41 r5 = defpackage.r31.e0(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.h(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.h0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            defpackage.b10.f0(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.u()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.h(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.h0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            defpackage.b10.f0(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.i(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.h(r4)
            throw r9
        Lae:
            r9.h(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.K(lk, java.lang.Object):void");
    }

    public static final q00 L(xl0 xl0Var) {
        return new q00(Math.round(xl0Var.a), Math.round(xl0Var.b), Math.round(xl0Var.c), Math.round(xl0Var.d));
    }

    public static final void M(z0 z0Var, gt0 gt0Var) {
        Object objG = gt0Var.k().d.g(lt0.f);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = gt0Var.k().d.g(lt0.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = gt0.j(4, gt0Var);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                gt0 gt0Var2 = (gt0) listJ.get(i2);
                if (gt0Var2.k().d.c(lt0.H)) {
                    arrayList.add(gt0Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zN = n(arrayList);
        z0Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zN ? 1 : arrayList.size(), zN ? arrayList.size() : 1, false, 0));
    }

    public static final void N(z0 z0Var, gt0 gt0Var) {
        Object objG = gt0Var.k().d.g(lt0.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        gt0 gt0VarL = gt0Var.l();
        if (gt0VarL == null) {
            return;
        }
        Object objG2 = gt0VarL.k().d.g(lt0.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = gt0VarL.k().d.g(lt0.f);
            if ((objG3 != null ? objG3 : null) != null) {
                throw new ClassCastException();
            }
            if (gt0Var.k().d.c(lt0.H)) {
                ArrayList arrayList = new ArrayList();
                List listJ = gt0.j(4, gt0VarL);
                int size = listJ.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    gt0 gt0Var2 = (gt0) listJ.get(i3);
                    if (gt0Var2.k().d.c(lt0.H)) {
                        arrayList.add(gt0Var2);
                        if (gt0Var2.c.u() < gt0Var.c.u()) {
                            i2++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zN = n(arrayList);
                int i4 = zN ? 0 : i2;
                int i5 = zN ? i2 : 0;
                Object objG4 = gt0Var.k().d.g(lt0.H);
                if (objG4 == null) {
                    objG4 = Boolean.FALSE;
                }
                z0Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, 1, i5, 1, false, ((Boolean) objG4).booleanValue()));
            }
        }
    }

    public static final void O(gf0 gf0Var, int i2, Object obj) {
        gf0Var.n[(gf0Var.o - gf0Var.j[gf0Var.k - 1].b) + i2] = obj;
    }

    public static final void P(gf0 gf0Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = gf0Var.o - gf0Var.j[gf0Var.k - 1].b;
        Object[] objArr = gf0Var.n;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [il0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList Q(av0 av0Var, int i2, Integer num) {
        ?? il0Var = new il0(av0Var);
        int iQ = av0Var.q(i2);
        m2 m2VarA = av0Var.a(i2);
        while (i2 >= 0) {
            il0Var.b(av0Var.a.f(i2), num);
            if (iQ >= 0) {
                m2 m2Var = m2VarA;
                m2VarA = av0Var.a(iQ);
                i2 = iQ;
                iQ = av0Var.q(iQ);
                num = m2Var;
            } else {
                i2 = iQ;
                num = m2VarA;
            }
        }
        return il0Var.a;
    }

    public static final Object R(Object obj) {
        bz bzVar;
        cz czVar = obj instanceof cz ? (cz) obj : null;
        return (czVar == null || (bzVar = czVar.a) == null) ? obj : bzVar;
    }

    public static final s4 a(String str) {
        Set setSingleton = Collections.singleton(str);
        c10.o(setSingleton, "singleton(...)");
        return new s4(setSingleton);
    }

    public static long b(float f2) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final long c(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void d(id0 id0Var, h2 h2Var, zg zgVar, ci ciVar, int i2) {
        int i3;
        ciVar.W(476043083);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ciVar.f(id0Var) : ciVar.h(id0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ciVar.f(h2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ciVar.h(zgVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            boolean z = true;
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !ciVar.f(id0Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objK = ciVar.K();
            if (z3 || objK == vh.a) {
                objK = new ox(h2Var, id0Var);
                ciVar.e0(objK);
            }
            u6.a((ox) objK, null, new yj0(false, nr0.d, false), zgVar, ciVar, ((i3 << 3) & 7168) | 384, 2);
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new c5(id0Var, h2Var, zgVar, i2, 1);
        }
    }

    public static final long e(int i2) {
        long j2 = (i2 << 32) | (0 & 4294967295L);
        int i3 = j20.p;
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.id0 r17, boolean r18, defpackage.um0 r19, boolean r20, long r21, defpackage.e90 r23, defpackage.ci r24, int r25) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.f(id0, boolean, um0, boolean, long, e90, ci, int):void");
    }

    public static final void g(e90 e90Var, gw gwVar, boolean z, ci ciVar, int i2) {
        int i3;
        ciVar.W(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (ciVar.f(e90Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 | (ciVar.h(gwVar) ? 32 : 16) | (ciVar.g(z) ? 256 : 128)) & 147) == 146 && ciVar.z()) {
            ciVar.Q();
        } else {
            h9.a(ciVar, r31.r(b.f(e90Var, js0.a, js0.b), new f7(gwVar, z)));
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new c7(e90Var, gwVar, z, i2);
        }
    }

    public static final boolean h(gt0 gt0Var) {
        ct0 ct0VarK = gt0Var.k();
        return !ct0VarK.d.c(lt0.i);
    }

    public static final boolean i(gt0 gt0Var, Resources resources) {
        Object objG = gt0Var.d.d.g(lt0.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !l81.K(gt0Var) && (gt0Var.d.f || (gt0Var.o() && ((list != null ? (String) ue.T(list) : null) != null || y(gt0Var) != null || x(gt0Var, resources) != null || w(gt0Var))));
    }

    public static void j(ev0 ev0Var, List list, oi oiVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iC = ev0Var.c((m2) list.get(i2));
            int iM = ev0Var.M(ev0Var.b, ev0Var.r(iC));
            Object obj = iM < ev0Var.g(ev0Var.b, ev0Var.r(iC + 1)) ? ev0Var.c[ev0Var.h(iM)] : vh.a;
            nl0 nl0Var = obj instanceof nl0 ? (nl0) obj : null;
            if (nl0Var != null) {
                nl0Var.a = oiVar;
            }
        }
    }

    public static final int k(int i2, int i3, ls0 ls0Var, long j2, rr0 rr0Var) {
        if (rr0Var == null) {
            return dq0.k(i2, i3);
        }
        int iCompare = ls0Var.f.compare(Long.valueOf(rr0Var.c), Long.valueOf(j2));
        if (iCompare < 0) {
            return 1;
        }
        return iCompare > 0 ? 3 : 2;
    }

    public static float l(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [il0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List m(ev0 ev0Var, Integer num, int i2, Integer num2) {
        int iD;
        ma0 ma0Var;
        if (ev0Var.w || ev0Var.p() == 0) {
            return ks.d;
        }
        ?? il0Var = new il0(ev0Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = ev0Var.v;
            if (iD < 0) {
                iD = ev0Var.D(ev0Var.b, i2);
            }
        }
        if (num == 0) {
            int iM = ev0Var.i - ev0Var.M(ev0Var.b, ev0Var.r(i2));
            da0 da0Var = ev0Var.s;
            num = Integer.valueOf(iM + ((da0Var == null || (ma0Var = (ma0) da0Var.b(i2)) == null) ? 0 : ma0Var.b));
        }
        while (i2 >= 0) {
            il0Var.b(ev0Var.N(i2), num);
            num = ev0Var.b(i2);
            if (iD >= 0) {
                int i3 = iD;
                iD = ev0Var.D(ev0Var.b, iD);
                i2 = i3;
            } else {
                i2 = iD;
            }
        }
        return il0Var.a;
    }

    public static final boolean n(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = ks.d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iL = ve.L(arrayList);
                int i2 = 0;
                while (i2 < iL) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    gt0 gt0Var = (gt0) obj2;
                    gt0 gt0Var2 = (gt0) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (gt0Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (gt0Var.g().b() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (gt0Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (gt0Var.g().b() & 4294967295L)));
                    arrayList2.add(new ed0((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((ed0) ue.S(list)).a;
            } else {
                if (list.isEmpty()) {
                    z50.b("Empty collection can't be reduced.");
                }
                Object objS = ue.S(list);
                int iL2 = ve.L(list);
                if (1 <= iL2) {
                    int i3 = 1;
                    while (true) {
                        objS = new ed0(ed0.g(((ed0) objS).a, ((ed0) list.get(i3)).a));
                        if (i3 == iL2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((ed0) objS).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.r5 o(defpackage.rc r20, float r21) {
        /*
            r0 = r20
            r3 = r21
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            r5 r2 = defpackage.nm.k
            t2 r4 = defpackage.nm.l
            fd r5 = defpackage.nm.m
            if (r2 == 0) goto L29
            android.graphics.Bitmap r6 = r2.a
            if (r4 == 0) goto L29
            int r7 = r6.getWidth()
            if (r1 > r7) goto L29
            int r6 = r6.getHeight()
            if (r1 <= r6) goto L26
            goto L29
        L26:
            r7 = r2
            r8 = r4
            goto L37
        L29:
            r2 = 1
            r5 r2 = defpackage.d80.d(r1, r1, r2)
            defpackage.nm.k = r2
            t2 r4 = defpackage.d80.a(r2)
            defpackage.nm.l = r4
            goto L26
        L37:
            android.graphics.Bitmap r1 = r7.a
            if (r5 != 0) goto L42
            fd r5 = new fd
            r5.<init>()
            defpackage.nm.m = r5
        L42:
            r9 = r5
            ed r15 = r9.d
            jc r2 = r0.d
            e30 r2 = r2.getLayoutDirection()
            int r4 = r1.getWidth()
            float r4 = (float) r4
            int r1 = r1.getHeight()
            float r1 = (float) r1
            long r4 = defpackage.dq0.a(r4, r1)
            xn r1 = r15.a
            e30 r6 = r15.b
            dd r10 = r15.c
            long r11 = r15.d
            r15.a = r0
            r15.b = r2
            r15.c = r8
            r15.d = r4
            r8.l()
            r0 = r10
            r4 = r11
            long r10 = defpackage.bf.b
            long r12 = r9.c()
            r14 = 58
            defpackage.sq.E(r9, r10, r12, r14)
            r16 = 4278190080(0xff000000, double:2.113706745E-314)
            long r10 = defpackage.r31.d(r16)
            long r12 = defpackage.dq0.a(r3, r3)
            r14 = 120(0x78, float:1.68E-43)
            defpackage.sq.E(r9, r10, r12, r14)
            long r10 = defpackage.r31.d(r16)
            r12 = r4
            long r4 = defpackage.nm.f(r3, r3)
            r2 = r6
            r6 = 120(0x78, float:1.68E-43)
            r18 = r10
            r11 = r0
            r10 = r2
            r0 = r9
            r9 = r1
            r1 = r18
            defpackage.sq.Y(r0, r1, r3, r4, r6)
            r8.i()
            r15.a = r9
            r15.b = r10
            r15.c = r11
            r15.d = r12
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.o(rc, float):r5");
    }

    public static final Object p(long j2, mk mkVar) {
        if (j2 > 0) {
            ad adVar = new ad(1, r31.I(mkVar));
            adVar.t();
            if (j2 < Long.MAX_VALUE) {
                kl klVarN = adVar.h.n(g2.v);
                kn knVar = klVarN instanceof kn ? (kn) klVarN : null;
                if (knVar == null) {
                    knVar = um.a;
                }
                knVar.c(j2, adVar);
            }
            Object objS = adVar.s();
            if (objS == xl.d) {
                return objS;
            }
        }
        return j41.a;
    }

    public static boolean q(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = q(file2) && z;
        }
        return z;
    }

    public static final av r(av avVar) {
        av avVar2 = ((qu) ((p3) d80.A(avVar)).getFocusOwner()).h;
        if (avVar2 == null || !avVar2.q) {
            return null;
        }
        return avVar2;
    }

    public static final Integer s(av0 av0Var, hi hiVar, int i2, int i3) {
        Integer numS;
        int[] iArr = av0Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (av0Var.j(i2) && av0Var.i(i2) == 206 && c10.i(av0Var.p(iArr, i2), fi.e)) {
                Object objH = av0Var.h(i2, 0);
                zh zhVar = objH instanceof zh ? (zh) objH : null;
                if (zhVar != null && zhVar.d.equals(hiVar)) {
                    return Integer.valueOf(i2);
                }
            }
            if (av0Var.d(i2) && (numS = s(av0Var, hiVar, i2 + 1, i4)) != null) {
                return Integer.valueOf(numS.intValue());
            }
            i2 = i4;
        }
    }

    public static final xl0 t(av avVar) {
        nc0 nc0Var = avVar.k;
        return nc0Var != null ? l81.C(nc0Var).P(nc0Var, false) : xl0.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.av u(defpackage.av r8) {
        /*
            d90 r0 = r8.d
            boolean r0 = r0.q
            r1 = 0
            if (r0 != 0) goto L9
            goto Lac
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.pz.b(r0)
        L10:
            eb0 r0 = new eb0
            r2 = 16
            d90[] r3 = new defpackage.d90[r2]
            r0.<init>(r3)
            d90 r8 = r8.d
            d90 r3 = r8.i
            if (r3 != 0) goto L23
            defpackage.d80.h(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f
            if (r8 == 0) goto Lac
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            d90 r8 = (defpackage.d90) r8
            int r3 = r8.g
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            defpackage.d80.h(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La9
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof defpackage.av
            r5 = 1
            if (r4 == 0) goto L6e
            av r8 = (defpackage.av) r8
            d90 r4 = r8.d
            boolean r4 = r4.q
            if (r4 == 0) goto La4
            yu r4 = r8.C0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6d
            if (r4 == r5) goto L6d
            r5 = 2
            if (r4 == r5) goto L6d
            r8 = 3
            if (r4 != r8) goto L67
            goto La4
        L67:
            fg r8 = new fg
            r8.<init>()
            throw r8
        L6d:
            return r8
        L6e:
            int r4 = r8.f
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La4
            boolean r4 = r8 instanceof defpackage.mn
            if (r4 == 0) goto La4
            r4 = r8
            mn r4 = (defpackage.mn) r4
            d90 r4 = r4.s
            r6 = 0
        L7e:
            if (r4 == 0) goto La1
            int r7 = r4.f
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9e
            int r6 = r6 + 1
            if (r6 != r5) goto L8c
            r8 = r4
            goto L9e
        L8c:
            if (r3 != 0) goto L95
            eb0 r3 = new eb0
            d90[] r7 = new defpackage.d90[r2]
            r3.<init>(r7)
        L95:
            if (r8 == 0) goto L9b
            r3.b(r8)
            r8 = r1
        L9b:
            r3.b(r4)
        L9e:
            d90 r4 = r4.i
            goto L7e
        La1:
            if (r6 != r5) goto La4
            goto L45
        La4:
            d90 r8 = defpackage.d80.i(r3)
            goto L45
        La9:
            d90 r8 = r8.i
            goto L3c
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.u(av):av");
    }

    public static final String[] v(rj rjVar) {
        c10.n(rjVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((s4) rjVar).b.toArray(new String[0]);
    }

    public static final boolean w(gt0 gt0Var) {
        Object objG = gt0Var.d.d.g(lt0.I);
        if (objG == null) {
            objG = null;
        }
        r21 r21Var = (r21) objG;
        ta0 ta0Var = gt0Var.d.d;
        Object objG2 = ta0Var.g(lt0.x);
        if (objG2 == null) {
            objG2 = null;
        }
        zn0 zn0Var = (zn0) objG2;
        boolean z = r21Var != null;
        Object objG3 = ta0Var.g(lt0.H);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (zn0Var != null && zn0Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String x(gt0 gt0Var, Resources resources) throws Resources.NotFoundException {
        ct0 ct0Var = gt0Var.d;
        ct0 ct0Var2 = gt0Var.d;
        Object objG = ct0Var.d.g(lt0.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        ta0 ta0Var = ct0Var2.d;
        Object objG2 = ta0Var.g(lt0.I);
        if (objG2 == null) {
            objG2 = null;
        }
        r21 r21Var = (r21) objG2;
        Object objG3 = ta0Var.g(lt0.x);
        if (objG3 == null) {
            objG3 = null;
        }
        zn0 zn0Var = (zn0) objG3;
        if (r21Var != null) {
            int iOrdinal = r21Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new fg();
                    }
                    if (objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (zn0Var != null && zn0Var.a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (zn0Var != null && zn0Var.a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = ta0Var.g(lt0.H);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((zn0Var == null || zn0Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = ta0Var.g(lt0.c);
        if (objG5 == null) {
            objG5 = null;
        }
        sk0 sk0Var = (sk0) objG5;
        if (sk0Var != null) {
            if (sk0Var != sk0.b) {
                if (objG == null) {
                    objG = resources.getString(R.string.template_percent, 0);
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        ot0 ot0Var = lt0.E;
        if (ta0Var.c(ot0Var)) {
            ta0 ta0Var2 = new gt0(gt0Var.a, true, gt0Var.c, ct0Var2).k().d;
            Object objG6 = ta0Var2.g(lt0.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = ta0Var2.g(lt0.A);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = ta0Var2.g(ot0Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final q8 y(gt0 gt0Var) {
        ct0 ct0Var = gt0Var.d;
        ot0 ot0Var = lt0.a;
        q8 q8Var = (q8) n2.e(ct0Var, lt0.E);
        List list = (List) n2.e(gt0Var.d, lt0.A);
        return q8Var == null ? list != null ? (q8) ue.T(list) : null : q8Var;
    }

    public static final long z(KeyEvent keyEvent) {
        return e(keyEvent.getKeyCode());
    }
}
