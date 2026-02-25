package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.taurus.dgmobilemx.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class w3 extends m0 {
    public static final ca0 Q;
    public boolean A;
    public t3 B;
    public da0 C;
    public final ea0 D;
    public final ba0 E;
    public final ba0 F;
    public final String G;
    public final String H;
    public final e9 I;
    public final da0 J;
    public ht0 K;
    public boolean L;
    public final ba0 M;
    public final b3 N;
    public final ArrayList O;
    public final v3 P;
    public final p3 d;
    public int e = Integer.MIN_VALUE;
    public final v3 f;
    public final AccessibilityManager g;
    public long h;
    public final q3 i;
    public final r3 j;
    public List k;
    public final Handler l;
    public final xz m;
    public int n;
    public int o;
    public z0 p;
    public z0 q;
    public boolean r;
    public final da0 s;
    public final da0 t;
    public final lw0 u;
    public final lw0 v;
    public int w;
    public Integer x;
    public final x9 y;
    public final gc z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = j00.a;
        ca0 ca0Var = new ca0(32);
        int i2 = ca0Var.b;
        if (i2 < 0) {
            qo0.s("");
            throw null;
        }
        int i3 = i2 + 32;
        ca0Var.b(i3);
        int[] iArr2 = ca0Var.a;
        int i4 = ca0Var.b;
        if (i2 != i4) {
            y9.p0(iArr2, iArr2, i3, i2, i4);
        }
        y9.s0(iArr, iArr2, i2, 0, 12);
        ca0Var.b += 32;
        Q = ca0Var;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [q3] */
    /* JADX WARN: Type inference failed for: r3v4, types: [r3] */
    public w3(p3 p3Var) {
        this.d = p3Var;
        int i = 0;
        this.f = new v3(this, i);
        Object systemService = p3Var.getContext().getSystemService("accessibility");
        c10.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: q3
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                w3 w3Var = this.a;
                w3Var.k = z ? w3Var.g.getEnabledAccessibilityServiceList(-1) : ks.d;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: r3
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                w3 w3Var = this.a;
                w3Var.k = w3Var.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new xz(this);
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new da0();
        this.t = new da0();
        this.u = new lw0();
        this.v = new lw0();
        this.w = -1;
        this.y = new x9();
        this.z = nm.a(1, 6, null);
        this.A = true;
        da0 da0Var = l00.a;
        c10.n(da0Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = da0Var;
        this.D = new ea0();
        this.E = new ba0();
        this.F = new ba0();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new e9(12);
        this.J = new da0();
        gt0 gt0VarA = p3Var.getSemanticsOwner().a();
        c10.n(da0Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.K = new ht0(gt0VarA, da0Var);
        int i2 = i00.a;
        this.M = new ba0();
        p3Var.addOnAttachStateChangeListener(new s3(i, this));
        this.N = new b3(2, this);
        this.O = new ArrayList();
        this.P = new v3(this, 1);
    }

    public static Rect D(nf0 nf0Var) {
        if (!(nf0Var instanceof lf0) && !(nf0Var instanceof mf0)) {
            return null;
        }
        xl0 xl0VarA = nf0Var.a();
        return new Rect((int) xl0VarA.a, (int) xl0VarA.b, (int) xl0VarA.c, (int) xl0VarA.d);
    }

    public static float[] E(nf0 nf0Var) {
        if (!(nf0Var instanceof mf0)) {
            return null;
        }
        fo0 fo0Var = ((mf0) nf0Var).a;
        long j = fo0Var.h;
        long j2 = fo0Var.g;
        long j3 = fo0Var.f;
        long j4 = fo0Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region F(nf0 nf0Var) {
        if (!(nf0Var instanceof kf0)) {
            return null;
        }
        kf0 kf0Var = (kf0) nf0Var;
        xl0 xl0VarA = kf0Var.a();
        Region region = new Region(new Rect((int) xl0VarA.a, (int) xl0VarA.b, (int) xl0VarA.c, (int) xl0VarA.d));
        Region region2 = new Region();
        i6 i6Var = kf0Var.a;
        if (!(i6Var instanceof i6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(i6Var.a, region);
        return region2;
    }

    public static CharSequence G(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                c10.n(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String m(gt0 gt0Var) {
        q8 q8Var;
        if (gt0Var != null) {
            ct0 ct0Var = gt0Var.d;
            ta0 ta0Var = ct0Var.d;
            ot0 ot0Var = lt0.a;
            if (ta0Var.c(ot0Var)) {
                return z50.a((List) ct0Var.b(ot0Var), ",", null, 62);
            }
            ot0 ot0Var2 = lt0.E;
            if (ta0Var.c(ot0Var2)) {
                Object objG = ta0Var.g(ot0Var2);
                if (objG == null) {
                    objG = null;
                }
                q8 q8Var2 = (q8) objG;
                if (q8Var2 != null) {
                    return q8Var2.e;
                }
            } else {
                Object objG2 = ta0Var.g(lt0.A);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (q8Var = (q8) ue.T(list)) != null) {
                    return q8Var.e;
                }
            }
        }
        return null;
    }

    public static final boolean p(jq0 jq0Var, float f) {
        qq0 qq0Var = jq0Var.a;
        if (f >= 0.0f || ((Number) qq0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) qq0Var.a()).floatValue() < ((Number) jq0Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean q(jq0 jq0Var) {
        qq0 qq0Var = jq0Var.a;
        if (((Number) qq0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) qq0Var.a()).floatValue();
        ((Number) jq0Var.b.a()).floatValue();
        return false;
    }

    public static final boolean r(jq0 jq0Var) {
        qq0 qq0Var = jq0Var.a;
        if (((Number) qq0Var.a()).floatValue() < ((Number) jq0Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) qq0Var.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void w(w3 w3Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        w3Var.v(i, i2, num, null);
    }

    public final void A(t30 t30Var, ea0 ea0Var) {
        ct0 ct0VarV;
        if (t30Var.H() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(t30Var)) {
            t30 t30Var2 = null;
            if (!t30Var.G.d(8)) {
                t30Var = t30Var.t();
                while (true) {
                    if (t30Var == null) {
                        t30Var = null;
                        break;
                    } else if (t30Var.G.d(8)) {
                        break;
                    } else {
                        t30Var = t30Var.t();
                    }
                }
            }
            if (t30Var == null || (ct0VarV = t30Var.v()) == null) {
                return;
            }
            if (!ct0VarV.f) {
                t30 t30VarT = t30Var.t();
                while (true) {
                    if (t30VarT != null) {
                        ct0 ct0VarV2 = t30VarT.v();
                        if (ct0VarV2 != null && ct0VarV2.f) {
                            t30Var2 = t30VarT;
                            break;
                        }
                        t30VarT = t30VarT.t();
                    } else {
                        break;
                    }
                }
                if (t30Var2 != null) {
                    t30Var = t30Var2;
                }
            }
            int i = t30Var.e;
            if (ea0Var.a(i)) {
                w(this, s(i), 2048, 1, 8);
            }
        }
    }

    public final void B(t30 t30Var) {
        if (t30Var.H() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(t30Var)) {
            int i = t30Var.e;
            jq0 jq0Var = (jq0) this.s.b(i);
            jq0 jq0Var2 = (jq0) this.t.b(i);
            if (jq0Var == null && jq0Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventG = g(i, 4096);
            if (jq0Var != null) {
                accessibilityEventG.setScrollX((int) ((Number) jq0Var.a.a()).floatValue());
                accessibilityEventG.setMaxScrollX((int) ((Number) jq0Var.b.a()).floatValue());
            }
            if (jq0Var2 != null) {
                accessibilityEventG.setScrollY((int) ((Number) jq0Var2.a.a()).floatValue());
                accessibilityEventG.setMaxScrollY((int) ((Number) jq0Var2.b.a()).floatValue());
            }
            u(accessibilityEventG);
        }
    }

    public final boolean C(gt0 gt0Var, int i, int i2, boolean z) {
        String strM;
        ct0 ct0Var = gt0Var.d;
        int i3 = gt0Var.g;
        ot0 ot0Var = bt0.h;
        if (ct0Var.d.c(ot0Var) && m20.h(gt0Var)) {
            lw lwVar = (lw) ((j0) gt0Var.d.b(ot0Var)).b;
            if (lwVar != null) {
                return ((Boolean) lwVar.c(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (strM = m(gt0Var)) != null) {
            if (i < 0 || i != i2 || i2 > strM.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = strM.length() > 0;
            u(i(s(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(strM.length()) : null, strM));
            y(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.H():void");
    }

    @Override // defpackage.m0
    public final xz a(View view) {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, z0 z0Var, String str, Bundle bundle) {
        gt0 gt0Var;
        Region regionF;
        float[] fArrE;
        Rect rectD;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i2;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = z0Var.a;
        it0 it0Var = (it0) l().b(i);
        if (it0Var == null || (gt0Var = it0Var.a) == null) {
            return;
        }
        ct0 ct0Var = gt0Var.d;
        ta0 ta0Var = ct0Var.d;
        String strM = m(gt0Var);
        if (c10.i(str, this.G)) {
            int iD = this.E.d(i);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (c10.i(str, this.H)) {
            int iD2 = this.F.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        nc0 nc0Var = null;
        if (ta0Var.c(bt0.a) && bundle != null && c10.i(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strM != null ? strM.length() : Integer.MAX_VALUE)) {
                    o11 o11VarM = no0.m(ct0Var);
                    if (o11VarM == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3 + i5;
                        if (i6 >= o11VarM.a.a.e.length()) {
                            arrayList.add(nc0Var);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i2 = i4;
                        } else {
                            xl0 xl0VarB = o11VarM.b(i6);
                            nc0 nc0VarD = gt0Var.d();
                            long jR = 0;
                            if (nc0VarD != null) {
                                if (!nc0VarD.O0().q) {
                                    nc0VarD = nc0Var;
                                }
                                if (nc0VarD != null) {
                                    jR = nc0VarD.R(0L);
                                }
                            }
                            xl0 xl0VarH = xl0VarB.h(jR);
                            xl0 xl0VarG = gt0Var.g();
                            if ((xl0VarH.f(xl0VarG) ? xl0VarH.d(xl0VarG) : nc0Var) != 0) {
                                p3 p3Var = this.d;
                                long jQ = p3Var.q((Float.floatToRawIntBits(r10.b) & 4294967295L) | (Float.floatToRawIntBits(r10.a) << 32));
                                long jQ2 = p3Var.q((Float.floatToRawIntBits(r10.c) << 32) | (Float.floatToRawIntBits(r10.d) & 4294967295L));
                                int i7 = (int) (jQ >> 32);
                                int i8 = (int) (jQ2 >> 32);
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                                int i9 = (int) (jQ & 4294967295L);
                                int i10 = (int) (jQ2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                            } else {
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i5++;
                        i4 = i2;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        nc0Var = null;
                    }
                    accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        ot0 ot0Var = lt0.y;
        if (ta0Var.c(ot0Var) && bundle != null && c10.i(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = ta0Var.g(ot0Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (c10.i(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, gt0Var.g);
            return;
        }
        if (c10.i(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = ta0Var.g(lt0.N);
            ju0 ju0Var = (ju0) (objG2 == null ? null : objG2);
            if (ju0Var != null) {
                nf0 nf0VarH = h(ju0Var, gt0Var);
                if (nf0VarH instanceof lf0) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(nf0VarH));
                    return;
                } else if (nf0VarH instanceof mf0) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(nf0VarH));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", E(nf0VarH));
                    return;
                } else {
                    if (!(nf0VarH instanceof kf0)) {
                        throw new fg();
                    }
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", F(nf0VarH));
                    return;
                }
            }
            return;
        }
        if (c10.i(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = ta0Var.g(lt0.N);
            ju0 ju0Var2 = (ju0) (objG3 == null ? null : objG3);
            if (ju0Var2 == null || (rectD = D(h(ju0Var2, gt0Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectD);
            return;
        }
        if (c10.i(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = ta0Var.g(lt0.N);
            ju0 ju0Var3 = (ju0) (objG4 == null ? null : objG4);
            if (ju0Var3 == null || (fArrE = E(h(ju0Var3, gt0Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrE);
            return;
        }
        if (c10.i(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = ta0Var.g(lt0.N);
            ju0 ju0Var4 = (ju0) (objG5 == null ? null : objG5);
            if (ju0Var4 == null || (regionF = F(h(ju0Var4, gt0Var))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionF);
        }
    }

    public final Rect c(it0 it0Var) {
        q00 q00Var = it0Var.b;
        float f = q00Var.a;
        float f2 = q00Var.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        p3 p3Var = this.d;
        long jQ = p3Var.q((Float.floatToRawIntBits(f2) & 4294967295L) | (jFloatToRawIntBits << 32));
        float f3 = q00Var.c;
        float f4 = q00Var.d;
        long jQ2 = p3Var.q((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        int i = (int) (jQ >> 32);
        int i2 = (int) (jQ2 >> 32);
        int i3 = (int) (jQ & 4294967295L);
        int i4 = (int) (jQ2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (defpackage.m20.p(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.mk r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.d(mk):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.e(boolean, int, long):boolean");
    }

    public final void f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (n()) {
                t(this.d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                z(l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    H();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent g(int i, int i2) {
        it0 it0Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        p3 p3Var = this.d;
        accessibilityEventObtain.setPackageName(p3Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(p3Var, i);
        if (n() && (it0Var = (it0) l().b(i)) != null) {
            gt0 gt0Var = it0Var.a;
            accessibilityEventObtain.setPassword(gt0Var.d.d.c(lt0.J));
            Object objG = gt0Var.d.d.g(lt0.n);
            if (objG == null) {
                objG = null;
            }
            boolean zI = c10.i(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                n0.f(accessibilityEventObtain, zI);
            }
        }
        return accessibilityEventObtain;
    }

    public final nf0 h(ju0 ju0Var, gt0 gt0Var) {
        nc0 nc0VarD = gt0Var.d();
        return ju0Var.a(d80.F(nc0VarD != null ? nc0VarD.f : 0L), gt0Var.c.A, this.d.getDensity());
    }

    public final AccessibilityEvent i(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventG = g(i, 8192);
        if (num != null) {
            accessibilityEventG.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventG.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventG.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventG.getText().add(charSequence);
        }
        return accessibilityEventG;
    }

    public final int j(gt0 gt0Var) {
        ct0 ct0Var = gt0Var.d;
        ct0 ct0Var2 = gt0Var.d;
        ot0 ot0Var = lt0.a;
        if (!ct0Var.d.c(lt0.a)) {
            ot0 ot0Var2 = lt0.F;
            if (ct0Var2.d.c(ot0Var2)) {
                return (int) (((w11) ct0Var2.b(ot0Var2)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int k(gt0 gt0Var) {
        ct0 ct0Var = gt0Var.d;
        ct0 ct0Var2 = gt0Var.d;
        ot0 ot0Var = lt0.a;
        if (!ct0Var.d.c(lt0.a)) {
            ot0 ot0Var2 = lt0.F;
            if (ct0Var2.d.c(ot0Var2)) {
                return (int) (((w11) ct0Var2.b(ot0Var2)).a >> 32);
            }
        }
        return this.w;
    }

    public final k00 l() {
        if (this.A) {
            this.A = false;
            p3 p3Var = this.d;
            this.C = l81.E(p3Var.getSemanticsOwner());
            if (n()) {
                da0 da0Var = this.C;
                Resources resources = p3Var.getContext().getResources();
                ba0 ba0Var = this.E;
                ba0Var.a();
                ba0 ba0Var2 = this.F;
                ba0Var2.a();
                it0 it0Var = (it0) da0Var.b(-1);
                gt0 gt0Var = it0Var != null ? it0Var.a : null;
                c10.m(gt0Var);
                ArrayList arrayListB = pt0.b(gt0Var, new h(3, da0Var), new h(4, resources), d80.t(gt0Var));
                int iL = ve.L(arrayListB);
                int i = 1;
                if (1 <= iL) {
                    while (true) {
                        int i2 = ((gt0) arrayListB.get(i - 1)).g;
                        int i3 = ((gt0) arrayListB.get(i)).g;
                        ba0Var.f(i2, i3);
                        ba0Var2.f(i3, i2);
                        if (i == iL) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean n() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void o(t30 t30Var) {
        if (this.y.add(t30Var)) {
            this.z.u(j41.a);
        }
    }

    public final int s(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.gt0 r20, defpackage.ht0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.s00.a
            ea0 r3 = new ea0
            r3.<init>()
            r4 = 4
            java.util.List r5 = defpackage.gt0.j(r4, r1)
            t30 r6 = r1.c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            gt0 r10 = (defpackage.gt0) r10
            k00 r11 = r0.l()
            int r10 = r10.g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            ea0 r11 = r2.b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3a
            r0.o(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            ea0 r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L80
            r0.o(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = defpackage.gt0.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            gt0 r3 = (defpackage.gt0) r3
            da0 r4 = r0.J
            int r5 = r3.g
            java.lang.Object r4 = r4.b(r5)
            ht0 r4 = (defpackage.ht0) r4
            if (r4 == 0) goto Lb6
            k00 r5 = r0.l()
            int r6 = r3.g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.t(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.t(gt0, ht0):void");
    }

    public final boolean u(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) this.f.g(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean v(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !n()) {
            return false;
        }
        AccessibilityEvent accessibilityEventG = g(i, i2);
        if (num != null) {
            accessibilityEventG.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventG.setContentDescription(z50.a(list, ",", null, 62));
        }
        return u(accessibilityEventG);
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventG = g(s(i), 32);
        accessibilityEventG.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventG.getText().add(str);
        }
        u(accessibilityEventG);
    }

    public final void y(int i) {
        t3 t3Var = this.B;
        if (t3Var != null) {
            gt0 gt0Var = t3Var.a;
            if (i != gt0Var.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - t3Var.f <= 1000) {
                AccessibilityEvent accessibilityEventG = g(s(gt0Var.g), 131072);
                accessibilityEventG.setFromIndex(t3Var.d);
                accessibilityEventG.setToIndex(t3Var.e);
                accessibilityEventG.setAction(t3Var.b);
                accessibilityEventG.setMovementGranularity(t3Var.c);
                accessibilityEventG.getText().add(m(gt0Var));
                u(accessibilityEventG);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.k00 r59) {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3.z(k00):void");
    }
}
