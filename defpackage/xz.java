package defpackage;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimation;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.gestures.a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class xz implements as, vt, ff0, rp0 {
    public static final xz g;
    public final /* synthetic */ int d;
    public Object e;
    public Object f;

    static {
        Object obj = null;
        g = new xz(1, obj, obj);
    }

    public /* synthetic */ xz(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    public static xz j(xz xzVar, nc0 nc0Var, o11 o11Var, int i) {
        Object obj = nc0Var;
        if ((i & 1) != 0) {
            obj = (d30) xzVar.e;
        }
        if ((i & 2) != 0) {
            o11Var = (o11) xzVar.f;
        }
        return new xz(1, obj, o11Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d90] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void l(t30 t30Var) {
        if (t30Var.O > 0) {
            if (t30Var.H.d == p30.h && !t30Var.o() && !t30Var.p() && !t30Var.P && t30Var.I()) {
                d90 d90Var = t30Var.G.f;
                if ((d90Var.g & 256) != 0) {
                    while (d90Var != null) {
                        if ((d90Var.f & 256) != 0) {
                            mn mnVarI = d90Var;
                            ?? eb0Var = 0;
                            while (mnVarI != 0) {
                                if (mnVarI instanceof xw) {
                                    xw xwVar = (xw) mnVarI;
                                    xwVar.u(d80.x(xwVar, 256));
                                } else if ((mnVarI.f & 256) != 0 && (mnVarI instanceof mn)) {
                                    d90 d90Var2 = mnVarI.s;
                                    int i = 0;
                                    mnVarI = mnVarI;
                                    eb0Var = eb0Var;
                                    while (d90Var2 != null) {
                                        if ((d90Var2.f & 256) != 0) {
                                            i++;
                                            eb0Var = eb0Var;
                                            if (i == 1) {
                                                mnVarI = d90Var2;
                                            } else {
                                                if (eb0Var == 0) {
                                                    eb0Var = new eb0(new d90[16]);
                                                }
                                                if (mnVarI != 0) {
                                                    eb0Var.b(mnVarI);
                                                    mnVarI = 0;
                                                }
                                                eb0Var.b(d90Var2);
                                            }
                                        }
                                        d90Var2 = d90Var2.i;
                                        mnVarI = mnVarI;
                                        eb0Var = eb0Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                mnVarI = d80.i(eb0Var);
                            }
                        }
                        if ((d90Var.g & 256) == 0) {
                            break;
                        } else {
                            d90Var = d90Var.i;
                        }
                    }
                }
            }
            t30Var.N = false;
            eb0 eb0VarX = t30Var.x();
            Object[] objArr = eb0VarX.d;
            int i2 = eb0VarX.f;
            for (int i3 = 0; i3 < i2; i3++) {
                l((t30) objArr[i3]);
            }
        }
    }

    @Override // defpackage.as
    public Object a() {
        return (l41) this.e;
    }

    @Override // defpackage.vt
    public Object b(wt wtVar, lk lkVar) {
        Object objB = ((sd) this.e).b(new zt(new zl0(), wtVar, (pl0) this.f), lkVar);
        return objB == xl.d ? objB : j41.a;
    }

    @Override // defpackage.ff0
    public List c(Integer num) {
        List listC = ((ff0) this.e).c(null);
        ev0 ev0Var = (ev0) this.f;
        int i = ev0Var.v;
        return i < 0 ? listC : ue.a0(m20.m(ev0Var, num, i, Integer.valueOf(ev0Var.D(ev0Var.b, i))), listC);
    }

    @Override // defpackage.rp0
    public Object d(Object obj) {
        return ((iw) this.f).g(obj);
    }

    @Override // defpackage.as
    public boolean f(CharSequence charSequence, int i, int i2, w31 w31Var) {
        if ((w31Var.c & 4) > 0) {
            return true;
        }
        if (((l41) this.e) == null) {
            this.e = new l41(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((v71) this.f).getClass();
        ((l41) this.e).setSpan(new x31(w31Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.rp0
    public Object g(zo0 zo0Var, Object obj) {
        return ((kw) this.e).e(zo0Var, obj);
    }

    public boolean h(long j) {
        Object obj;
        List list = (List) ((xz) this.f).e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (mj0.a(((pj0) obj).a, j)) {
                break;
            }
            i++;
        }
        pj0 pj0Var = (pj0) obj;
        if (pj0Var != null) {
            return pj0Var.h;
        }
        return false;
    }

    public a11 i(List list) {
        hr hrVar;
        Exception e;
        hr hrVar2;
        try {
            int size = list.size();
            int i = 0;
            hrVar = null;
            while (i < size) {
                try {
                    hrVar2 = (hr) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    hrVar2.a((jr) this.f);
                    i++;
                    hrVar = hrVar2;
                } catch (Exception e3) {
                    e = e3;
                    hrVar = hrVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((jr) this.f).a.b());
                    sb2.append(", composition=");
                    sb2.append(((jr) this.f).c());
                    sb2.append(", selection=");
                    jr jrVar = (jr) this.f;
                    sb2.append((Object) w11.g(no0.a(jrVar.b, jrVar.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    ue.V(list, sb, new ir(0, hrVar, this), 60);
                    String string = sb.toString();
                    c10.o(string, "toString(...)");
                    throw new RuntimeException(string, e);
                }
            }
            jr jrVar2 = (jr) this.f;
            jrVar2.getClass();
            q8 q8Var = new q8(jrVar2.a.toString());
            jr jrVar3 = (jr) this.f;
            long jA = no0.a(jrVar3.b, jrVar3.c);
            w11 w11Var = w11.f(((a11) this.e).b) ? null : new w11(jA);
            a11 a11Var = new a11(q8Var, w11Var != null ? w11Var.a : no0.a(w11.d(jA), w11.e(jA)), ((jr) this.f).c());
            this.e = a11Var;
            return a11Var;
        } catch (Exception e4) {
            hrVar = null;
            e = e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0839 A[LOOP:9: B:410:0x081c->B:421:0x0839, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0840 A[EDGE_INSN: B:647:0x0840->B:423:0x0840 BREAK  A[LOOP:9: B:410:0x081c->B:421:0x0839], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v91, types: [ks] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.z0 k(int r50) {
        /*
            Method dump skipped, instructions count: 3168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz.k(int):z0");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h40, java.lang.Object] */
    public InputMethodManager m() {
        return (InputMethodManager) this.f.getValue();
    }

    public l80 n() {
        return (l80) ((zg0) this.f).getValue();
    }

    public p00 o() {
        Matcher matcher = (Matcher) this.e;
        return c10.a0(matcher.start(), matcher.end());
    }

    public AutofillId p(long j) {
        return ((ContentCaptureSession) this.f).newAutofillId(((View) this.e).getAutofillId(), j);
    }

    public int q(int i) {
        switch (this.d) {
            case 8:
                TextPaint textPaint = (TextPaint) this.f;
                CharSequence charSequence = (CharSequence) this.e;
                return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        }
        do {
            i = ((ch0) this.f).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.e).charAt(i - 1)));
        return i;
    }

    public int r(int i) {
        switch (this.d) {
            case 8:
                TextPaint textPaint = (TextPaint) this.f;
                CharSequence charSequence = (CharSequence) this.e;
                int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
                if (textRunCursor == -1 || ((TextPaint) this.f).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
                    break;
                }
                break;
            default:
                CharSequence charSequence2 = (CharSequence) this.e;
                do {
                    i = ((ch0) this.f).i(i);
                    if (i == -1 || i == charSequence2.length()) {
                        break;
                    }
                } while (Character.isWhitespace(charSequence2.charAt(i)));
                break;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f50, java.lang.Object] */
    public void s(Bundle bundle) {
        np0 np0Var = (np0) this.e;
        ?? r0 = np0Var.a;
        if (!np0Var.e) {
            np0Var.a();
        }
        if (((h50) r0.getLifecycle()).c.compareTo(z40.g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((h50) r0.getLifecycle()).c).toString());
        }
        if (np0Var.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleH = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleH = jp0.h("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        np0Var.f = bundleH;
        np0Var.g = true;
    }

    public void t(Bundle bundle) {
        np0 np0Var = (np0) this.e;
        Bundle bundleV = b10.v((ng0[]) Arrays.copyOf(new ng0[0], 0));
        Bundle bundle2 = np0Var.f;
        if (bundle2 != null) {
            bundleV.putAll(bundle2);
        }
        synchronized (np0Var.c) {
            for (Map.Entry entry : np0Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((lp0) entry.getValue()).a();
                c10.p(str, "key");
                bundleV.putBundle(str, bundleA);
            }
        }
        if (bundleV.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleV);
    }

    public String toString() {
        switch (this.d) {
            case 26:
                return "Bounds{lower=" + ((d00) this.e) + " upper=" + ((d00) this.f) + "}";
            default:
                return super.toString();
        }
    }

    public int u(int i) {
        switch (this.d) {
            case 8:
                TextPaint textPaint = (TextPaint) this.f;
                CharSequence charSequence = (CharSequence) this.e;
                int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
                if (textRunCursor == -1 || ((TextPaint) this.f).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
                    return -1;
                }
                return textRunCursor;
        }
        do {
            i = ((ch0) this.f).j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.e).charAt(i - 1)));
        return i;
    }

    public int v(int i) {
        switch (this.d) {
            case 8:
                TextPaint textPaint = (TextPaint) this.f;
                CharSequence charSequence = (CharSequence) this.e;
                return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        }
        do {
            i = ((ch0) this.f).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.e).charAt(i)));
        return i;
    }

    public void w(r90 r90Var) {
        Object objG = ((ta0) this.f).g(r90Var);
        if (objG != null) {
            if (!(objG instanceof ma0)) {
                throw new ClassCastException();
            }
            ma0 ma0Var = (ma0) objG;
            Object[] objArr = ma0Var.a;
            if (ma0Var.b <= 0) {
                return;
            }
            c10.n(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public /* synthetic */ xz(Object obj, View view, int i) {
        this.d = i;
        this.f = obj;
        this.e = view;
    }

    public xz(np0 np0Var) {
        this.d = 20;
        this.e = np0Var;
        this.f = new mp0(np0Var);
    }

    public xz(t30 t30Var, l80 l80Var) {
        this.d = 10;
        this.e = t30Var;
        this.f = qo0.n(l80Var);
    }

    public xz(View view) {
        this.d = 0;
        this.e = view;
        this.f = m20.I(new b(12, this));
    }

    public xz(int i) {
        this.d = i;
        switch (i) {
            case 5:
                break;
            case 12:
                this.e = qo0.n(Boolean.FALSE);
                break;
            case 14:
                this.e = new ta0();
                this.f = new ta0();
                break;
            case 15:
                this.e = new eb0(new t30[16]);
                break;
            case 19:
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                break;
            case 23:
                this.e = new kc0(22);
                this.f = new d70(16);
                break;
            case 25:
                this.e = new eb0(new Reference[16]);
                this.f = new ReferenceQueue();
                break;
            default:
                this.e = new a1(this);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xz(c00 c00Var) {
        this(12);
        this.d = 12;
        this.f = qo0.n(c00Var);
        qo0.n(c00Var);
    }

    public xz(WindowInsetsAnimation.Bounds bounds) {
        this.d = 26;
        this.e = d00.c(bounds.getLowerBound());
        this.f = d00.c(bounds.getUpperBound());
    }

    public xz(Matcher matcher, CharSequence charSequence) {
        this.d = 11;
        c10.p(charSequence, "input");
        this.e = matcher;
        this.f = charSequence;
    }

    public xz(Window window) {
        this.d = 27;
        this.e = window.getInsetsController();
        this.f = window;
    }

    public xz(r1 r1Var) {
        this.d = 4;
        this.e = r1Var;
        this.f = a.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xz(w3 w3Var) {
        this(2);
        this.d = 2;
        this.f = w3Var;
    }
}
