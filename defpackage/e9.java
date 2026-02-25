package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextPaint;
import android.util.SparseArray;
import com.taurus.dgmobilemx.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e9 implements f9 {
    public static volatile e9 d;
    public static final Object e = new Object();
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ e9(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static e9 p(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        e9 e9Var = new e9();
                        e9Var.c = context.getApplicationContext();
                        e9Var.b = new HashSet();
                        e9Var.a = new HashMap();
                        d = e9Var;
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void A(xn xnVar) {
        ((fd) this.c).d.a = xnVar;
    }

    public void B(e30 e30Var) {
        ((fd) this.c).d.b = e30Var;
    }

    public void C(long j) {
        ((fd) this.c).d.d = j;
    }

    public void D() {
        ta0 ta0Var = (ta0) this.a;
        String str = (String) this.b;
        List list = (List) ta0Var.j(str);
        if (list != null) {
            list.remove((g7) this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        ta0Var.l(str, list);
    }

    public void a(t30 t30Var, k10 k10Var) {
        r1 r1Var = (r1) this.a;
        r1 r1Var2 = (r1) this.b;
        r1 r1Var3 = (r1) this.c;
        int iOrdinal = k10Var.ordinal();
        if (iOrdinal == 0) {
            r1Var.i(t30Var);
            r1Var3.i(t30Var);
            return;
        }
        if (iOrdinal == 1) {
            r1Var2.i(t30Var);
            r1Var3.i(t30Var);
            return;
        }
        if (iOrdinal == 2) {
            if (t30Var.j != null) {
                r1Var3.i(t30Var);
                return;
            } else {
                r1Var.i(t30Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new fg();
        }
        if (t30Var.j != null) {
            r1Var3.i(t30Var);
        } else {
            r1Var2.i(t30Var);
        }
    }

    public void b() {
        ((ArrayList) this.b).clear();
        this.c = this.a;
        ((t30) this.a).P();
    }

    @Override // defpackage.f9
    public void c(int i, Object obj) {
        ((t30) this.c).z(i, (t30) obj);
    }

    @Override // defpackage.f9
    public void d(Object obj) {
        ((ArrayList) this.b).add(this.c);
        this.c = obj;
    }

    @Override // defpackage.f9
    public void e() {
        t30 t30Var = (t30) this.c;
        jc0 jc0Var = t30Var.G;
        if (!t30Var.H()) {
            pz.a("onReuse is only expected on attached node");
        }
        f40 f40Var = t30Var.I;
        if (f40Var != null) {
            f40Var.e(false);
        }
        t30Var.u = false;
        if (t30Var.P) {
            t30Var.P = false;
        } else {
            d90 d90Var = t30Var.G.e;
            for (d90 d90Var2 = d90Var; d90Var2 != null; d90Var2 = d90Var2.h) {
                if (d90Var2.q) {
                    d90Var2.v0();
                }
            }
            for (d90 d90Var3 = d90Var; d90Var3 != null; d90Var3 = d90Var3.h) {
                if (d90Var3.q) {
                    d90Var3.x0();
                }
            }
            while (d90Var != null) {
                if (d90Var.q) {
                    d90Var.r0();
                }
                d90Var = d90Var.h;
            }
        }
        int i = t30Var.e;
        t30Var.e = dt0.a.addAndGet(1);
        eg0 eg0Var = t30Var.p;
        if (eg0Var != null) {
            p3 p3Var = (p3) eg0Var;
            p3Var.m4getLayoutNodes().f(i);
            p3Var.m4getLayoutNodes().g(t30Var.e, t30Var);
        }
        for (d90 d90Var4 = jc0Var.f; d90Var4 != null; d90Var4 = d90Var4.i) {
            d90Var4.q0();
        }
        jc0Var.e();
        if (jc0Var.d(8)) {
            t30Var.F();
        }
        t30.V(t30Var);
        eg0 eg0Var2 = t30Var.p;
        if (eg0Var2 != null) {
            p3 p3Var2 = (p3) eg0Var2;
            s2 s2Var = p3Var2.H;
            if (s2Var != null) {
                p3 p3Var3 = s2Var.c;
                r1 r1Var = s2Var.a;
                ea0 ea0Var = s2Var.g;
                if (ea0Var.e(i)) {
                    r1Var.n(p3Var3, i, false);
                }
                ct0 ct0VarV = t30Var.v();
                if (ct0VarV != null && ct0VarV.d.b(lt0.q)) {
                    ea0Var.a(t30Var.e);
                    r1Var.n(p3Var3, t30Var.e, true);
                }
            }
            p3Var2.getRectManager().g(t30Var, true);
        }
    }

    @Override // defpackage.f9
    public /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // defpackage.f9
    public void g() {
        eg0 eg0Var = ((t30) this.a).p;
        if (eg0Var != null) {
            ((p3) eg0Var).t();
        }
    }

    @Override // defpackage.f9
    public void h(int i, int i2, int i3) {
        ((t30) this.c).K(i, i2, i3);
    }

    @Override // defpackage.f9
    public Object i() {
        return this.c;
    }

    @Override // defpackage.f9
    public void j(int i, int i2) {
        ((t30) this.c).Q(i, i2);
    }

    public void k(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (oz.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new fg(e2);
            }
        }
    }

    public Object l(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.a;
        if (v21.a()) {
            try {
                n2.b(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                oz ozVar = (oz) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = ozVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            l(cls2, hashSet);
                        }
                    }
                }
                objB = ozVar.b((Context) this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th) {
                throw new fg(th);
            }
        }
        return objB;
    }

    public Object n() {
        long jD = dq0.d();
        if (jD == o21.a) {
            return this.c;
        }
        l21 l21Var = (l21) ((AtomicReference) this.a).get();
        int iA = l21Var.a(jD);
        if (iA >= 0) {
            return l21Var.c[iA];
        }
        return null;
    }

    public dd o() {
        return ((fd) this.c).d.c;
    }

    @Override // defpackage.f9
    public void q() {
        this.c = ((ArrayList) this.b).remove(r0.size() - 1);
    }

    public s20 r() {
        s20 s20Var = (s20) this.b;
        if (s20Var != null) {
            return s20Var;
        }
        c10.Y("keyboardActions");
        throw null;
    }

    public long s() {
        return ((fd) this.c).d.d;
    }

    public boolean t(CharSequence charSequence, int i, int i2, w31 w31Var) {
        if ((w31Var.c & 3) == 0) {
            qr qrVar = (qr) this.c;
            u80 u80VarB = w31Var.b();
            int iA = u80VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) u80VarB.g).getShort(iA + u80VarB.d);
            }
            xm xmVar = (xm) qrVar;
            xmVar.getClass();
            ThreadLocal threadLocal = xm.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = xmVar.a;
            String string = sb.toString();
            int i3 = lg0.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = w31Var.c & 4;
            w31Var.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (w31Var.c & 3) == 2;
    }

    public boolean u() {
        return !(((gw0) ((r1) this.a).e).isEmpty() && ((gw0) ((r1) this.c).e).isEmpty() && ((gw0) ((r1) this.b).e).isEmpty());
    }

    public boolean v() {
        if (((ww0) this.a).getValue() != this.c) {
            return true;
        }
        e9 e9Var = (e9) this.b;
        return e9Var != null && e9Var.v();
    }

    public Object w(CharSequence charSequence, int i, int i2, int i3, boolean z, as asVar) {
        int i4;
        char c;
        ds dsVar = new ds((w80) ((q2) this.b).c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zF = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zF) {
                SparseArray sparseArray = dsVar.c.a;
                w80 w80Var = sparseArray == null ? null : (w80) sparseArray.get(iCodePointAt);
                if (dsVar.a == 2) {
                    if (w80Var != null) {
                        dsVar.c = w80Var;
                        dsVar.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            dsVar.a();
                        } else if (iCodePointAt != 65039) {
                            w80 w80Var2 = dsVar.c;
                            if (w80Var2.b != null) {
                                if (dsVar.f != 1) {
                                    dsVar.d = w80Var2;
                                    dsVar.a();
                                } else if (dsVar.b()) {
                                    dsVar.d = dsVar.c;
                                    dsVar.a();
                                } else {
                                    dsVar.a();
                                }
                                c = 3;
                            } else {
                                dsVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (w80Var == null) {
                    dsVar.a();
                    c = 1;
                } else {
                    dsVar.a = 2;
                    dsVar.c = w80Var;
                    dsVar.f = 1;
                    c = 2;
                }
                dsVar.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !t(charSequence, i4, iCharCount, dsVar.d.b)) {
                        zF = asVar.f(charSequence, i4, iCharCount, dsVar.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (dsVar.a == 2 && dsVar.c.b != null && ((dsVar.f > 1 || dsVar.b()) && i5 < i3 && zF && (z || !t(charSequence, i4, iCharCount, dsVar.c.b)))) {
            asVar.f(charSequence, i4, iCharCount, dsVar.c.b);
        }
        return asVar.a();
    }

    public void x() {
        ((CopyOnWriteArrayList) this.c).remove((Object) null);
        r80 r80Var = (r80) ((HashMap) this.a).remove(null);
        if (r80Var != null) {
            r80Var.a.b(r80Var.b);
            r80Var.b = null;
        }
        ((hg) this.b).run();
    }

    public void y(Object obj) {
        long jD = dq0.d();
        if (jD == o21.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            l21 l21Var = (l21) ((AtomicReference) this.a).get();
            int iA = l21Var.a(jD);
            if (iA < 0) {
                ((AtomicReference) this.a).set(l21Var.b(jD, obj));
            } else {
                l21Var.c[iA] = obj;
            }
        }
    }

    public void z(dd ddVar) {
        ((fd) this.c).d.c = ddVar;
    }

    public e9(int i) {
        switch (i) {
            case 3:
                this.a = new r1(8);
                this.b = new r1(8);
                this.c = new r1(8);
                break;
            case 10:
                this.a = new AtomicReference(c10.m);
                this.b = new Object();
                break;
            case 12:
                this.a = new WeakHashMap();
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                break;
            default:
                this.c = new kc0(22);
                break;
        }
    }

    public e9(z31 z31Var, e9 e9Var) {
        this.a = z31Var;
        this.b = e9Var;
        this.c = z31Var.d;
    }

    public e9(t30 t30Var) {
        this.a = t30Var;
        this.b = new ArrayList();
        this.c = t30Var;
    }
}
