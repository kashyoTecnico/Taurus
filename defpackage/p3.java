package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.input.key.a;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.taurus.dgmobilemx.R;
import defpackage.d90;
import defpackage.ib;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class p3 extends ViewGroup implements eg0, bo0, f80, cn, jf0 {
    public static Class I0;
    public static Method J0;
    public static final ma0 K0 = new ma0();
    public static c3 L0;
    public final ArrayList A;
    public final b3 A0;
    public ArrayList B;
    public boolean B0;
    public boolean C;
    public final m3 C0;
    public final m90 D;
    public final sc D0;
    public final ce E;
    public boolean E0;
    public iw F;
    public final r1 F0;
    public final q2 G;
    public View G0;
    public final s2 H;
    public final k3 H0;
    public boolean I;
    public final w2 J;
    public final v2 K;
    public final gg0 L;
    public s7 M;
    public gj N;
    public boolean O;
    public final i80 P;
    public long Q;
    public final int[] R;
    public final float[] S;
    public final float[] T;
    public final float[] U;
    public long V;
    public boolean W;
    public long a0;
    public final zg0 b0;
    public final fo c0;
    public long d;
    public iw d0;
    public final boolean e;
    public final y2 e0;
    public final v30 f;
    public final z2 f0;
    public final zg0 g;
    public final a3 g0;
    public final View h;
    public final h11 h0;
    public final boolean i;
    public final f11 i0;
    public final qu j;
    public final AtomicReference j0;
    public ml k;
    public final nn k0;
    public final h5 l;
    public final v71 l0;
    public final l40 m;
    public final zg0 m0;
    public final r1 n;
    public int n0;
    public final q7 o;
    public final zg0 o0;
    public final e00 p;
    public final ym p0;
    public final t30 q;
    public final b00 q0;
    public final da0 r;
    public final f90 r0;
    public final yl0 s;
    public final i7 s0;
    public final p3 t;
    public MotionEvent t0;
    public final jt0 u;
    public long u0;
    public final w3 v;
    public final xz v0;
    public q4 w;
    public final ma0 w0;
    public final o2 x;
    public float x0;
    public final q5 y;
    public float y0;
    public final da z;
    public final n3 z0;

    /* JADX WARN: Type inference failed for: r1v34, types: [y2] */
    /* JADX WARN: Type inference failed for: r1v35, types: [z2] */
    /* JADX WARN: Type inference failed for: r1v36, types: [a3] */
    public p3(Context context, ml mlVar) {
        super(context);
        this.d = 9205357640488583168L;
        int i = 1;
        this.e = true;
        this.f = new v30();
        zn znVarF = r31.f(context);
        g2 g2Var = g2.N;
        this.g = new zg0(znVarF, g2Var);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        boolean z = i2 >= 35;
        this.i = z;
        ms msVar = new ms();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(msVar);
        i90 i90Var = new i90() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.i90
            public final d90 f() {
                return new ib();
            }

            @Override // defpackage.i90
            public final void g(d90 d90Var) {
                ((ib) d90Var).getClass();
            }

            public final int hashCode() {
                return this.a.hashCode();
            }
        };
        this.j = new qu(this, this);
        this.k = mlVar;
        this.l = new h5();
        this.m = new l40();
        e90 e90VarA = a.a(b90.a, new j3(this, i3));
        e90 e90VarA2 = androidx.compose.ui.input.rotary.a.a();
        this.n = new r1(4);
        this.o = new q7(ViewConfiguration.get(context));
        e00 e00Var = new e00();
        this.p = e00Var;
        t30 t30Var = new t30(3);
        t30Var.b0(co0.c);
        t30Var.Y(getDensity());
        t30Var.d0(getViewConfiguration());
        t30Var.c0(b.b(e00Var).c(emptySemanticsElement).c(e90VarA2).c(e90VarA).c(((qu) getFocusOwner()).e).c(m3getDragAndDropManager().c).c(i90Var));
        this.q = t30Var;
        da0 da0Var = l00.a;
        this.r = new da0();
        m4getLayoutNodes();
        this.s = new yl0();
        this.t = this;
        this.u = new jt0(getRoot(), msVar, m4getLayoutNodes());
        w3 w3Var = new w3(this);
        this.v = w3Var;
        this.w = new q4(this, new f3(0, this, c4.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 0));
        o2 o2Var = new o2();
        Object systemService = context.getSystemService("accessibility");
        c10.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.x = o2Var;
        this.y = new q5(this);
        this.z = new da();
        this.A = new ArrayList();
        this.D = new m90();
        t30 root = getRoot();
        ce ceVar = new ce();
        ceVar.b = root;
        ceVar.c = new dy(root.G.c);
        ceVar.d = new r1(17);
        ceVar.e = new gy();
        this.E = ceVar;
        this.F = e3.f;
        da autofillTree = getAutofillTree();
        q2 q2Var = new q2();
        q2Var.a = this;
        q2Var.b = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        q2Var.c = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw b8.f("Required value was null.");
        }
        q2Var.d = autofillId;
        this.G = q2Var;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw b8.f("Autofill service could not be located.");
        }
        this.H = new s2(new r1(14, autofillManager2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.J = new w2(context);
        getClipboardManager();
        this.K = new v2();
        this.L = new gg0(new j3(this, i));
        this.P = new i80(getRoot());
        long j = Integer.MAX_VALUE;
        this.Q = (j & 4294967295L) | (j << 32);
        this.R = new int[]{0, 0};
        this.S = e80.a();
        this.T = e80.a();
        this.U = e80.a();
        this.V = -1L;
        this.a0 = 9187343241974906880L;
        this.b0 = qo0.n(null);
        this.c0 = qo0.g(new m3(this, i));
        this.e0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: y2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.G();
            }
        };
        this.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: z2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.G();
            }
        };
        this.g0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: a3
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                this.a.q0.a.setValue(new zz(z2 ? 1 : 2));
            }
        };
        h11 h11Var = new h11(getView(), this);
        this.h0 = h11Var;
        this.i0 = new f11(h11Var);
        this.j0 = new AtomicReference(null);
        this.k0 = new nn(getTextInputService());
        this.l0 = new v71(3);
        this.m0 = new zg0(d80.o(context), g2Var);
        this.n0 = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        e30 e30Var = e30.d;
        e30 e30Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : e30.e : e30Var;
        this.o0 = qo0.n(e30Var2 != null ? e30Var2 : e30Var);
        this.p0 = new ym(this, 1);
        this.q0 = new b00(isInTouchMode() ? 1 : 2);
        f90 f90Var = new f90();
        new eb0(new ha[16]);
        new eb0(new rq[16]);
        new eb0(new t30[16]);
        new eb0(new rq[16]);
        this.r0 = f90Var;
        this.s0 = new i7(this);
        this.v0 = new xz(25);
        this.w0 = new ma0();
        this.z0 = new n3(this);
        this.A0 = new b3(i3, this);
        this.C0 = new m3(this, i3);
        this.D0 = new sc();
        addOnAttachStateChangeListener(this.w);
        setWillNotDraw(false);
        setFocusable(true);
        b4.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i4 = a61.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(w3Var.b);
        setOnDragListener(m3getDragAndDropManager());
        getRoot().d(this);
        x3.a.a(this);
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.h = view;
            addView(view, -1);
        }
        this.F0 = i2 >= 31 ? new r1(21) : null;
        this.H0 = new k3(this);
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof p3) {
                ((p3) childAt).t();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d3 get_viewTreeOwners() {
        return (d3) this.b0.getValue();
    }

    public static long h(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static void k(t30 t30Var) {
        t30Var.C();
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            k((t30) objArr[i2]);
        }
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !n90.a.a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(xn xnVar) {
        this.g.setValue(xnVar);
    }

    private void setFontFamilyResolver(jv jvVar) {
        this.m0.setValue(jvVar);
    }

    private void setLayoutDirection(e30 e30Var) {
        this.o0.setValue(e30Var);
    }

    private final void set_viewTreeOwners(d3 d3Var) {
        this.b0.setValue(d3Var);
    }

    public final boolean A() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void B(t30 t30Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (t30Var != null) {
            while (t30Var != null && t30Var.q() == r30.d) {
                if (!this.O) {
                    t30 t30VarT = t30Var.t();
                    if (t30VarT == null) {
                        break;
                    }
                    long j = t30VarT.G.c.g;
                    if (gj.f(j) && gj.e(j)) {
                        break;
                    }
                }
                t30Var = t30Var.t();
            }
            if (t30Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long C(long j) {
        y();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.a0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.a0 & 4294967295L));
        return e80.b((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.U);
    }

    public final int D(MotionEvent motionEvent) {
        Object obj;
        if (this.E0) {
            this.E0 = false;
            int metaState = motionEvent.getMetaState();
            this.m.getClass();
            t61.a.setValue(new sj0(metaState));
        }
        m90 m90Var = this.D;
        xz xzVarA = m90Var.a(motionEvent, this);
        ce ceVar = this.E;
        if (xzVarA == null) {
            if (!ceVar.a) {
                r60 r60Var = (r60) ((r1) ceVar.d).e;
                int i = r60Var.g;
                Object[] objArr = r60Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                r60Var.g = 0;
                r60Var.d = false;
                ((dy) ceVar.c).c();
            }
            return 0;
        }
        List list = (List) xzVarA.e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((pj0) obj).e) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
            obj = null;
        } else {
            obj = null;
        }
        pj0 pj0Var = (pj0) obj;
        if (pj0Var != null) {
            this.d = pj0Var.d;
        }
        int iC = ceVar.c(xzVarA, this, n(motionEvent));
        xzVarA.f = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iC & 1) != 0) {
            return iC;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        m90Var.c.delete(pointerId);
        m90Var.b.delete(pointerId);
        return iC;
    }

    public final void E(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jQ = q((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jQ >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jQ & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        xz xzVarA = this.D.a(motionEventObtain, this);
        c10.m(xzVarA);
        this.E.c(xzVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.kw r5, defpackage.mk r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.o3
            if (r0 == 0) goto L13
            r0 = r6
            o3 r0 = (defpackage.o3) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            o3 r0 = new o3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.g
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            defpackage.c10.X(r6)
            goto L49
        L2d:
            defpackage.c10.X(r6)
            j3 r6 = new j3
            r1 = 2
            r6.<init>(r4, r1)
            r0.i = r2
            y5 r1 = new y5
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r4 = r4.j0
            r1.<init>(r6, r4, r5, r2)
            java.lang.Object r4 = defpackage.nm.q(r1, r0)
            xl r5 = defpackage.xl.d
            if (r4 != r5) goto L49
            return
        L49:
            fg r4 = new fg
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3.F(kw, mk):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.R
            r0.getLocationOnScreen(r1)
            long r2 = r0.Q
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            r3 = 0
            r8 = r1[r3]
            r9 = 1
            if (r5 != r8) goto L27
            r10 = r1[r9]
            if (r2 != r10) goto L27
            long r10 = r0.V
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L44
        L27:
            r1 = r1[r9]
            long r10 = (long) r8
            long r10 = r10 << r4
            long r12 = (long) r1
            long r12 = r12 & r6
            long r10 = r10 | r12
            r0.Q = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L44
            if (r2 == r1) goto L44
            t30 r1 = r0.getRoot()
            w30 r1 = r1.H
            k80 r1 = r1.p
            r1.q0()
            r1 = r9
            goto L45
        L44:
            r1 = r3
        L45:
            r0.y()
            android.view.View r2 = r0.G0
            if (r2 != 0) goto L52
            android.view.View r2 = r0.getRootView()
            r0.G0 = r2
        L52:
            yl0 r5 = r0.getRectManager()
            long r10 = r0.Q
            long r12 = r0.a0
            long r12 = defpackage.c10.U(r12)
            int r8 = r2.getWidth()
            int r2 = r2.getHeight()
            r5.getClass()
            float[] r14 = r0.T
            int r15 = defpackage.nm.h(r14)
            p21 r3 = r5.b
            r15 = r15 & 2
            if (r15 != 0) goto L78
        L75:
            r16 = r6
            goto L7a
        L78:
            r14 = 0
            goto L75
        L7a:
            long r6 = r3.c
            boolean r6 = defpackage.m00.a(r12, r6)
            if (r6 != 0) goto L86
            r3.c = r12
            r6 = r9
            goto L87
        L86:
            r6 = 0
        L87:
            long r12 = r3.d
            boolean r7 = defpackage.m00.a(r10, r12)
            if (r7 != 0) goto L92
            r3.d = r10
            r6 = r9
        L92:
            if (r14 == 0) goto L95
            r6 = r9
        L95:
            long r7 = (long) r8
            long r7 = r7 << r4
            long r10 = (long) r2
            long r10 = r10 & r16
            long r7 = r7 | r10
            long r10 = r3.e
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 == 0) goto La4
            r3.e = r7
            r6 = r9
        La4:
            if (r6 != 0) goto Lad
            boolean r2 = r5.e
            if (r2 == 0) goto Lab
            goto Lad
        Lab:
            r3 = 0
            goto Lae
        Lad:
            r3 = r9
        Lae:
            r5.e = r3
            i80 r2 = r0.P
            r2.a(r1)
            yl0 r0 = r0.getRectManager()
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3.G():void");
    }

    public final void H(float f) {
        if (this.i) {
            if (f > 0.0f) {
                if (Float.isNaN(this.x0) || f > this.x0) {
                    this.x0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.y0) || f < this.y0) {
                    this.y0 = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        ct0 ct0VarV;
        iw iwVar;
        s2 s2Var = this.H;
        if (s2Var != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                if (autofillValue.isText()) {
                    t30 t30Var = (t30) s2Var.b.c.b(iKeyAt);
                    if (t30Var != null && (ct0VarV = t30Var.v()) != null) {
                        Object objG = ct0VarV.d.g(bt0.f);
                        if (objG == null) {
                            objG = null;
                        }
                        j0 j0Var = (j0) objG;
                        if (j0Var != null && (iwVar = (iw) j0Var.b) != null) {
                        }
                    }
                } else if (autofillValue.isDate()) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (autofillValue.isList()) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (autofillValue.isToggle()) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        q2 q2Var = this.G;
        if (q2Var != null) {
            da daVar = (da) q2Var.b;
            if (daVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (daVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new am("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new am("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new am("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.v.e(false, i, this.d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.v.e(true, i, this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        r(true);
        ov0.k().m();
        this.C = true;
        r1 r1Var = this.n;
        t2 t2Var = (t2) r1Var.e;
        Canvas canvas2 = t2Var.a;
        t2Var.a = canvas;
        getRoot().i(t2Var, null);
        ((t2) r1Var.e).a = canvas2;
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gx) ((dg0) arrayList.get(i))).g();
            }
        }
        int i2 = e61.d;
        arrayList.clear();
        this.C = false;
        ArrayList arrayList2 = this.B;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.i) {
            d9.a(this, this.x0);
            View view = this.h;
            if (view == null) {
                c10.Y("frameRateCategoryView");
                throw null;
            }
            d9.a(view, this.y0);
            if (!Float.isNaN(this.y0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.x0 = Float.NaN;
            this.y0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        jc0 jc0Var;
        do0 do0Var;
        int size;
        jc0 jc0Var2;
        d90 d90VarI;
        jc0 jc0Var3;
        if (this.B0) {
            b3 b3Var = this.A0;
            removeCallbacks(b3Var);
            if (motionEvent.getActionMasked() == 8) {
                this.B0 = false;
            } else {
                b3Var.run();
            }
        }
        if (m(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Float.floatToRawIntBits(x);
                Float.floatToRawIntBits(y);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                qu quVar = (qu) getFocusOwner();
                if (quVar.d.e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    av avVarR = m20.r(quVar.c);
                    if (avVarR != null) {
                        if (!avVarR.d.q) {
                            pz.b("visitAncestors called on an unattached node");
                        }
                        d90 d90Var = avVarR.d;
                        t30 t30VarZ = d80.z(avVarR);
                        while (t30VarZ != null) {
                            if ((t30VarZ.G.f.g & 2097152) != 0) {
                                while (d90Var != null) {
                                    if ((d90Var.f & 2097152) != 0) {
                                        d90 d90VarI2 = d90Var;
                                        eb0 eb0Var = null;
                                        while (d90VarI2 != null) {
                                            if ((d90VarI2.f & 2097152) != 0 && (d90VarI2 instanceof mn)) {
                                                int i = 0;
                                                for (d90 d90Var2 = ((mn) d90VarI2).s; d90Var2 != null; d90Var2 = d90Var2.i) {
                                                    if ((d90Var2.f & 2097152) != 0) {
                                                        i++;
                                                        if (i == 1) {
                                                            d90VarI2 = d90Var2;
                                                        } else {
                                                            if (eb0Var == null) {
                                                                eb0Var = new eb0(new d90[16]);
                                                            }
                                                            if (d90VarI2 != null) {
                                                                eb0Var.b(d90VarI2);
                                                                d90VarI2 = null;
                                                            }
                                                            eb0Var.b(d90Var2);
                                                        }
                                                    }
                                                }
                                                if (i == 1) {
                                                }
                                            }
                                            d90VarI2 = d80.i(eb0Var);
                                        }
                                    }
                                    d90Var = d90Var.h;
                                }
                            }
                            t30VarZ = t30VarZ.t();
                            d90Var = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (j(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        getContext();
        viewConfiguration.getScaledVerticalScrollFactor();
        getContext();
        viewConfiguration.getScaledHorizontalScrollFactor();
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        qu quVar2 = (qu) getFocusOwner();
        if (quVar2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        av avVarR2 = m20.r(quVar2.c);
        if (avVarR2 != null) {
            if (!avVarR2.d.q) {
                pz.b("visitAncestors called on an unattached node");
            }
            d90 d90Var3 = avVarR2.d;
            t30 t30VarZ2 = d80.z(avVarR2);
            loop0: while (true) {
                if (t30VarZ2 == null) {
                    d90VarI = null;
                    break;
                }
                if ((t30VarZ2.G.f.g & 16384) != 0) {
                    while (d90Var3 != null) {
                        if ((d90Var3.f & 16384) != 0) {
                            d90VarI = d90Var3;
                            eb0 eb0Var2 = null;
                            while (d90VarI != null) {
                                if (d90VarI instanceof do0) {
                                    break loop0;
                                }
                                if ((d90VarI.f & 16384) != 0 && (d90VarI instanceof mn)) {
                                    int i2 = 0;
                                    for (d90 d90Var4 = ((mn) d90VarI).s; d90Var4 != null; d90Var4 = d90Var4.i) {
                                        if ((d90Var4.f & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                d90VarI = d90Var4;
                                            } else {
                                                if (eb0Var2 == null) {
                                                    eb0Var2 = new eb0(new d90[16]);
                                                }
                                                if (d90VarI != null) {
                                                    eb0Var2.b(d90VarI);
                                                    d90VarI = null;
                                                }
                                                eb0Var2.b(d90Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                d90VarI = d80.i(eb0Var2);
                            }
                        }
                        d90Var3 = d90Var3.h;
                    }
                }
                t30VarZ2 = t30VarZ2.t();
                d90Var3 = (t30VarZ2 == null || (jc0Var3 = t30VarZ2.G) == null) ? null : jc0Var3.e;
            }
            do0Var = (do0) d90VarI;
        } else {
            do0Var = null;
        }
        if (do0Var != null) {
            do0 do0Var2 = do0Var;
            if (!do0Var2.d.q) {
                pz.b("visitAncestors called on an unattached node");
            }
            d90 d90Var5 = do0Var2.d.h;
            t30 t30VarZ3 = d80.z(do0Var);
            ArrayList arrayList = null;
            while (t30VarZ3 != null) {
                if ((t30VarZ3.G.f.g & 16384) != 0) {
                    while (d90Var5 != null) {
                        if ((d90Var5.f & 16384) != 0) {
                            d90 d90VarI3 = d90Var5;
                            eb0 eb0Var3 = null;
                            while (d90VarI3 != null) {
                                if (d90VarI3 instanceof do0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(d90VarI3);
                                } else if ((d90VarI3.f & 16384) != 0 && (d90VarI3 instanceof mn)) {
                                    int i3 = 0;
                                    for (d90 d90Var6 = ((mn) d90VarI3).s; d90Var6 != null; d90Var6 = d90Var6.i) {
                                        if ((d90Var6.f & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                d90VarI3 = d90Var6;
                                            } else {
                                                if (eb0Var3 == null) {
                                                    eb0Var3 = new eb0(new d90[16]);
                                                }
                                                if (d90VarI3 != null) {
                                                    eb0Var3.b(d90VarI3);
                                                    d90VarI3 = null;
                                                }
                                                eb0Var3.b(d90Var6);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                d90VarI3 = d80.i(eb0Var3);
                            }
                        }
                        d90Var5 = d90Var5.h;
                    }
                }
                t30VarZ3 = t30VarZ3.t();
                d90Var5 = (t30VarZ3 == null || (jc0Var2 = t30VarZ3.G) == null) ? null : jc0Var2.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    ((do0) arrayList.get(size)).getClass();
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            d90 d90VarI4 = do0Var2.d;
            eb0 eb0Var4 = null;
            while (d90VarI4 != null) {
                if (d90VarI4 instanceof do0) {
                } else if ((d90VarI4.f & 16384) != 0 && (d90VarI4 instanceof mn)) {
                    int i5 = 0;
                    for (d90 d90Var7 = ((mn) d90VarI4).s; d90Var7 != null; d90Var7 = d90Var7.i) {
                        if ((d90Var7.f & 16384) != 0) {
                            i5++;
                            if (i5 == 1) {
                                d90VarI4 = d90Var7;
                            } else {
                                if (eb0Var4 == null) {
                                    eb0Var4 = new eb0(new d90[16]);
                                }
                                if (d90VarI4 != null) {
                                    eb0Var4.b(d90VarI4);
                                    d90VarI4 = null;
                                }
                                eb0Var4.b(d90Var7);
                            }
                        }
                    }
                    if (i5 == 1) {
                    }
                }
                d90VarI4 = d80.i(eb0Var4);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                d90 d90VarI5 = do0Var2.d;
                eb0 eb0Var5 = null;
                while (d90VarI5 != null) {
                    if (d90VarI5 instanceof do0) {
                    } else if ((d90VarI5.f & 16384) != 0 && (d90VarI5 instanceof mn)) {
                        int i6 = 0;
                        for (d90 d90Var8 = ((mn) d90VarI5).s; d90Var8 != null; d90Var8 = d90Var8.i) {
                            if ((d90Var8.f & 16384) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    d90VarI5 = d90Var8;
                                } else {
                                    if (eb0Var5 == null) {
                                        eb0Var5 = new eb0(new d90[16]);
                                    }
                                    if (d90VarI5 != null) {
                                        eb0Var5.b(d90VarI5);
                                        d90VarI5 = null;
                                    }
                                    eb0Var5.b(d90Var8);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    d90VarI5 = d80.i(eb0Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        e3 e3Var = ((do0) arrayList.get(i7)).r;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        r5.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(r24);
        r5 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        if (r5 != r14) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        r2.e = r14;
        defpackage.w3.w(r2, r14, 128, null, 12);
        defpackage.w3.w(r2, r5, 256, null, 12);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((qu) getFocusOwner()).d(keyEvent, new g3(0, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.m.getClass();
        t61.a.setValue(new sj0(metaState));
        return ((qu) getFocusOwner()).d(keyEvent, si.m) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        jc0 jc0Var;
        if (isFocused()) {
            qu quVar = (qu) getFocusOwner();
            if (quVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                av avVarR = m20.r(quVar.c);
                if (avVarR != null) {
                    if (!avVarR.d.q) {
                        pz.b("visitAncestors called on an unattached node");
                    }
                    d90 d90Var = avVarR.d;
                    t30 t30VarZ = d80.z(avVarR);
                    while (t30VarZ != null) {
                        if ((t30VarZ.G.f.g & 131072) != 0) {
                            while (d90Var != null) {
                                if ((d90Var.f & 131072) != 0) {
                                    d90 d90VarI = d90Var;
                                    eb0 eb0Var = null;
                                    while (d90VarI != null) {
                                        if ((d90VarI.f & 131072) != 0 && (d90VarI instanceof mn)) {
                                            int i = 0;
                                            for (d90 d90Var2 = ((mn) d90VarI).s; d90Var2 != null; d90Var2 = d90Var2.i) {
                                                if ((d90Var2.f & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        d90VarI = d90Var2;
                                                    } else {
                                                        if (eb0Var == null) {
                                                            eb0Var = new eb0(new d90[16]);
                                                        }
                                                        if (d90VarI != null) {
                                                            eb0Var.b(d90VarI);
                                                            d90VarI = null;
                                                        }
                                                        eb0Var.b(d90Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        d90VarI = d80.i(eb0Var);
                                    }
                                }
                                d90Var = d90Var.h;
                            }
                        }
                        t30VarZ = t30VarZ.t();
                        d90Var = (t30VarZ == null || (jc0Var = t30VarZ.G) == null) ? null : jc0Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.B0) {
            b3 b3Var = this.A0;
            removeCallbacks(b3Var);
            MotionEvent motionEvent2 = this.t0;
            c10.m(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.B0 = false;
            } else {
                b3Var.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int iJ = j(motionEvent);
            if ((iJ & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iJ & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        xl0 xl0VarW;
        if (view == null || this.P.c) {
            return super.focusSearch(view, i);
        }
        Object obj = ku.f.get();
        c10.m(obj);
        View viewB = ((ku) obj).b(this, view, i);
        if (view == this) {
            av avVarR = m20.r(((qu) getFocusOwner()).c);
            xl0VarW = avVarR != null ? m20.t(avVarR) : null;
            if (xl0VarW == null) {
                xl0VarW = b10.w(view, this);
            }
        } else {
            xl0VarW = b10.w(view, this);
        }
        gu guVarJ0 = b10.j0(i);
        int i2 = guVarJ0 != null ? guVarJ0.a : 6;
        dm0 dm0Var = new dm0();
        if (((qu) getFocusOwner()).e(i2, xl0VarW, new h3(dm0Var, 0)) != null) {
            Object obj2 = dm0Var.d;
            if (obj2 != null) {
                if (viewB != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (no0.p(m20.t((av) obj2), b10.w(viewB, this), xl0VarW, i2)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    public final s7 getAndroidViewsHandler$ui_release() {
        if (this.M == null) {
            s7 s7Var = new s7(getContext());
            this.M = s7Var;
            addView(s7Var, -1);
            requestLayout();
        }
        s7 s7Var2 = this.M;
        c10.m(s7Var2);
        return s7Var2;
    }

    public aa getAutofill() {
        return this.G;
    }

    public ca getAutofillManager() {
        return this.H;
    }

    public da getAutofillTree() {
        return this.z;
    }

    public final iw getConfigurationChangeObserver() {
        return this.F;
    }

    public final q4 getContentCaptureManager$ui_release() {
        return this.w;
    }

    public ml getCoroutineContext() {
        return this.k;
    }

    public xn getDensity() {
        return (xn) this.g.getValue();
    }

    public xl0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            av avVarR = m20.r(((qu) getFocusOwner()).c);
            if (avVarR != null) {
                return m20.t(avVarR);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return b10.w(viewFindFocus, this);
        }
        return null;
    }

    public ou getFocusOwner() {
        return this.j;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        xl0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (c10.i(((qu) getFocusOwner()).e(6, null, e3.g), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public jv getFontFamilyResolver() {
        return (jv) this.m0.getValue();
    }

    public iv getFontLoader() {
        return this.l0;
    }

    public ex getGraphicsContext() {
        return this.y;
    }

    public yx getHapticFeedBack() {
        return this.p0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.P.b.u();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public a00 getInputModeManager() {
        return this.q0;
    }

    public final e00 getInsetsListener() {
        return this.p;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.V;
    }

    @Override // android.view.View, android.view.ViewParent
    public e30 getLayoutDirection() {
        return (e30) this.o0.getValue();
    }

    public long getMeasureIteration() {
        i80 i80Var = this.P;
        if (!i80Var.c) {
            pz.a("measureIteration should be only used during the measure/layout pass");
        }
        return i80Var.g;
    }

    public f90 getModifierLocalManager() {
        return this.r0;
    }

    public ni0 getPlacementScope() {
        int i = pi0.b;
        return new w60(1, this);
    }

    public lj0 getPointerIconService() {
        return this.H0;
    }

    public yl0 getRectManager() {
        return this.s;
    }

    public t30 getRoot() {
        return this.q;
    }

    public bo0 getRootForTest() {
        return this.t;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        r1 r1Var;
        if (Build.VERSION.SDK_INT < 31 || (r1Var = this.F0) == null) {
            return false;
        }
        return ((Boolean) ((zg0) r1Var.e).getValue()).booleanValue();
    }

    public jt0 getSemanticsOwner() {
        return this.u;
    }

    public v30 getSharedDrawScope() {
        return this.f;
    }

    public boolean getShowLayoutBounds() {
        return w8.a.a(this);
    }

    public gg0 getSnapshotObserver() {
        return this.L;
    }

    public cw0 getSoftwareKeyboardController() {
        return this.k0;
    }

    public f11 getTextInputService() {
        return this.i0;
    }

    public d21 getTextToolbar() {
        return this.s0;
    }

    public final ao0 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public c61 getViewConfiguration() {
        return this.o;
    }

    public final d3 getViewTreeOwners() {
        return (d3) this.c0.getValue();
    }

    public s61 getWindowInfo() {
        return this.m;
    }

    public final s2 get_autofillManager$ui_release() {
        return this.H;
    }

    public final void i(t30 t30Var, boolean z) {
        this.P.d(t30Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3.j(android.view.MotionEvent):int");
    }

    public final void l(t30 t30Var) {
        this.P.m(t30Var, false);
        eb0 eb0VarX = t30Var.x();
        Object[] objArr = eb0VarX.d;
        int i = eb0VarX.f;
        for (int i2 = 0; i2 < i; i2++) {
            l((t30) objArr[i2]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.t0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a50 lifecycle;
        f50 f50Var;
        super.onAttachedToWindow();
        this.p.onViewAttachedToWindow(this);
        if (L0 == null) {
            c3 c3Var = new c3();
            L0 = c3Var;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (I0 == null) {
                    I0 = Class.forName("android.os.SystemProperties");
                }
                if (J0 == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls = I0;
                    J0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                }
                Method method = J0;
                if (method != null) {
                    method.invoke(null, c3Var);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        ma0 ma0Var = K0;
        synchronized (ma0Var) {
            ma0Var.a(this);
        }
        this.m.a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.m.getClass();
        this.m.getClass();
        l(getRoot());
        k(getRoot());
        getSnapshotObserver().a.d();
        q2 q2Var = this.G;
        if (q2Var != null) {
            ba baVar = ba.a;
            baVar.getClass();
            ((AutofillManager) q2Var.c).registerCallback(baVar);
        }
        f50 f50VarF = dq0.f(this);
        op0 op0VarD = n2.d(this);
        d3 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (f50VarF != null && op0VarD != null && (f50VarF != (f50Var = viewTreeOwners.a) || op0VarD != f50Var))) {
            if (f50VarF == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (op0VarD == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.b(this);
            }
            f50VarF.getLifecycle().a(this);
            d3 d3Var = new d3(f50VarF, op0VarD);
            set_viewTreeOwners(d3Var);
            iw iwVar = this.d0;
            if (iwVar != null) {
                iwVar.g(d3Var);
            }
            this.d0 = null;
        }
        this.q0.a.setValue(new zz(isInTouchMode() ? 1 : 2));
        d3 viewTreeOwners2 = getViewTreeOwners();
        a50 lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw b8.f("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.w);
        getViewTreeObserver().addOnGlobalLayoutListener(this.e0);
        getViewTreeObserver().addOnScrollChangedListener(this.f0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.g0);
        if (Build.VERSION.SDK_INT >= 31) {
            z3.a.b(this);
        }
        s2 s2Var = this.H;
        if (s2Var != null) {
            ((qu) getFocusOwner()).g.a(s2Var);
            getSemanticsOwner().d.a(s2Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        cu0 cu0Var = (cu0) this.j0.get();
        m6 m6Var = (m6) (cu0Var != null ? cu0Var.b : null);
        if (m6Var == null) {
            return this.h0.d;
        }
        cu0 cu0Var2 = (cu0) m6Var.g.get();
        yz yzVar = (yz) (cu0Var2 != null ? cu0Var2.b : null);
        return yzVar != null && (yzVar.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(r31.f(getContext()));
        this.m.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.n0) {
            this.n0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(d80.o(getContext()));
        }
        this.F.g(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        cu0 cu0Var = (cu0) this.j0.get();
        m6 m6Var = (m6) (cu0Var != null ? cu0Var.b : null);
        if (m6Var == null) {
            h11 h11Var = this.h0;
            if (h11Var.d) {
                xy xyVar = h11Var.h;
                a11 a11Var = h11Var.g;
                int i2 = xyVar.d;
                if (i2 == 1) {
                    i = 0;
                } else if (i2 == 0) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 == 6) {
                    i = 5;
                } else if (i2 == 5) {
                    i = 7;
                } else if (i2 == 3) {
                    i = 3;
                } else if (i2 == 4) {
                    i = 4;
                } else {
                    if (i2 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    i = 6;
                }
                editorInfo.imeOptions = i;
                int i3 = xyVar.c;
                if (i3 == 1) {
                    editorInfo.inputType = 1;
                } else if (i3 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else if (i3 == 3) {
                    editorInfo.inputType = 2;
                } else if (i3 == 4) {
                    editorInfo.inputType = 3;
                } else if (i3 == 5) {
                    editorInfo.inputType = 17;
                } else if (i3 == 6) {
                    editorInfo.inputType = 33;
                } else if (i3 == 7) {
                    editorInfo.inputType = 129;
                } else if (i3 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i3 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                int i4 = editorInfo.inputType;
                if ((i4 & 1) == 1) {
                    editorInfo.inputType = i4 | 131072;
                    if (i2 == 1) {
                        editorInfo.imeOptions |= 1073741824;
                    }
                }
                int i5 = editorInfo.inputType;
                if ((i5 & 1) == 1) {
                    int i6 = xyVar.a;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (xyVar.b) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = a11Var.b;
                int i7 = w11.c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                editorInfo.setInitialSurroundingSubText(a11Var.a.e, 0);
                editorInfo.imeOptions |= 33554432;
                if (tr.d()) {
                    tr.a().g(editorInfo);
                }
                tl0 tl0Var = new tl0(h11Var.g, new r1(27, h11Var), h11Var.h.b);
                h11Var.i.add(new WeakReference(tl0Var));
                return tl0Var;
            }
        } else {
            cu0 cu0Var2 = (cu0) m6Var.g.get();
            yz yzVar = (yz) (cu0Var2 != null ? cu0Var2.b : null);
            if (yzVar != null) {
                synchronized (yzVar.c) {
                    if (yzVar.e) {
                        return null;
                    }
                    ul0 ul0VarA = yzVar.a.a(editorInfo);
                    h hVar = new h(19, yzVar);
                    InputConnection yc0Var = Build.VERSION.SDK_INT >= 34 ? new yc0(ul0VarA, hVar) : new xc0(ul0VarA, hVar);
                    yzVar.d.b(new p61(yc0Var));
                    return yc0Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        gt0 gt0Var;
        String strA;
        q4 q4Var = this.w;
        q4Var.getClass();
        for (long j : jArr) {
            it0 it0Var = (it0) q4Var.g().b((int) j);
            if (it0Var != null && (gt0Var = it0Var.a) != null) {
                x2.n();
                ViewTranslationRequest.Builder builderJ = x2.j(q4Var.d.getAutofillId(), gt0Var.g);
                Object objG = gt0Var.d.d.g(lt0.A);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = z50.a(list, "\n", null, 62)) != null) {
                    builderJ.setValue("android:text", TranslationRequestValue.forText(new q8(strA)));
                    consumer.accept(builderJ.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.onViewDetachedFromWindow(this);
        if (this.i) {
            View view = this.h;
            if (view == null) {
                c10.Y("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        ma0 ma0Var = K0;
        synchronized (ma0Var) {
            ma0Var.i(this);
        }
        bw0 bw0Var = getSnapshotObserver().a;
        pd0 pd0Var = bw0Var.h;
        if (pd0Var != null) {
            pd0Var.b();
        }
        bw0Var.a();
        this.m.getClass();
        d3 viewTreeOwners = getViewTreeOwners();
        a50 lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw b8.f("No lifecycle owner exists");
        }
        lifecycle.b(this.w);
        lifecycle.b(this);
        q2 q2Var = this.G;
        if (q2Var != null) {
            ba baVar = ba.a;
            baVar.getClass();
            ((AutofillManager) q2Var.c).unregisterCallback(baVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.e0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.g0);
        if (Build.VERSION.SDK_INT >= 31) {
            z3.a.a(this);
        }
        s2 s2Var = this.H;
        if (s2Var != null) {
            getSemanticsOwner().d.i(s2Var);
            ((qu) getFocusOwner()).g.i(s2Var);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        c10.q(((qu) getFocusOwner()).c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.V = 0L;
        this.P.h(this.C0);
        this.N = null;
        G();
        if (this.M != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        i80 i80Var = this.P;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long jH = h(i);
            long jH2 = h(i2);
            long jB = b10.B((int) (jH >>> 32), (int) (jH & 4294967295L), (int) (jH2 >>> 32), (int) (4294967295L & jH2));
            gj gjVar = this.N;
            if (gjVar == null) {
                this.N = new gj(jB);
                this.O = false;
            } else if (!gj.b(gjVar.a, jB)) {
                this.O = true;
            }
            i80Var.n(jB);
            i80Var.i();
            setMeasuredDimension(getRoot().H.p.d, getRoot().H.p.e);
            if (this.M != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().H.p.d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().H.p.e, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.e) {
            e30 e30Var = e30.d;
            e30 e30Var2 = i != 0 ? i != 1 ? null : e30.e : e30Var;
            if (e30Var2 != null) {
                e30Var = e30Var2;
            }
            setLayoutDirection(e30Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        r1 r1Var;
        if (Build.VERSION.SDK_INT < 31 || (r1Var = this.F0) == null) {
            return;
        }
        jt0 semanticsOwner = getSemanticsOwner();
        ml coroutineContext = getCoroutineContext();
        eb0 eb0Var = new eb0(new lq0[16]);
        h9.o(semanticsOwner.a(), 0, new kq0(1, eb0.class, eb0Var, "add", "add(Ljava/lang/Object;)Z"));
        y9.z0(eb0Var.d, new zf(0, new iw[]{s40.z, s40.A}), 0, eb0Var.f);
        int i = eb0Var.f;
        lq0 lq0Var = (lq0) (i == 0 ? null : eb0Var.d[i - 1]);
        if (lq0Var == null) {
            return;
        }
        q00 q00Var = lq0Var.c;
        oh ohVar = new oh(lq0Var.a, q00Var, nm.d(coroutineContext), r1Var, this);
        nc0 nc0Var = lq0Var.d;
        long j = (q00Var.a << 32) | (q00Var.b & 4294967295L);
        ScrollCaptureTarget scrollCaptureTargetF = x2.f(this, l81.Z(m20.L(l81.C(nc0Var).P(nc0Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), ohVar);
        scrollCaptureTargetF.setScrollBounds(l81.Z(q00Var));
        consumer.accept(scrollCaptureTargetF);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        q4 q4Var = this.w;
        q4Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (c10.i(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            d80.p(q4Var, longSparseArray);
        } else {
            q4Var.d.post(new o4(0, q4Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.m.a.setValue(Boolean.valueOf(z));
        this.E0 = true;
        super.onWindowFocusChanged(z);
    }

    public final void p(float[] fArr) {
        y();
        e80.e(fArr, this.T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.a0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.a0 & 4294967295L));
        float[] fArr2 = this.S;
        e80.d(fArr2);
        e80.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        float fN = c4.n(fArr2, 0, fArr, 0);
        float fN2 = c4.n(fArr2, 0, fArr, 1);
        float fN3 = c4.n(fArr2, 0, fArr, 2);
        float fN4 = c4.n(fArr2, 0, fArr, 3);
        float fN5 = c4.n(fArr2, 1, fArr, 0);
        float fN6 = c4.n(fArr2, 1, fArr, 1);
        float fN7 = c4.n(fArr2, 1, fArr, 2);
        float fN8 = c4.n(fArr2, 1, fArr, 3);
        float fN9 = c4.n(fArr2, 2, fArr, 0);
        float fN10 = c4.n(fArr2, 2, fArr, 1);
        float fN11 = c4.n(fArr2, 2, fArr, 2);
        float fN12 = c4.n(fArr2, 2, fArr, 3);
        float fN13 = c4.n(fArr2, 3, fArr, 0);
        float fN14 = c4.n(fArr2, 3, fArr, 1);
        float fN15 = c4.n(fArr2, 3, fArr, 2);
        float fN16 = c4.n(fArr2, 3, fArr, 3);
        fArr[0] = fN;
        fArr[1] = fN2;
        fArr[2] = fN3;
        fArr[3] = fN4;
        fArr[4] = fN5;
        fArr[5] = fN6;
        fArr[6] = fN7;
        fArr[7] = fN8;
        fArr[8] = fN9;
        fArr[9] = fN10;
        fArr[10] = fN11;
        fArr[11] = fN12;
        fArr[12] = fN13;
        fArr[13] = fN14;
        fArr[14] = fN15;
        fArr[15] = fN16;
    }

    public final long q(long j) {
        y();
        long jB = e80.b(j, this.T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.a0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.a0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public final void r(boolean z) {
        m3 m3Var;
        i80 i80Var = this.P;
        if (i80Var.b.u() || ((eb0) i80Var.e.e).f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    m3Var = this.C0;
                } finally {
                    Trace.endSection();
                }
            } else {
                m3Var = null;
            }
            if (i80Var.h(m3Var)) {
                requestLayout();
            }
            i80Var.a(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int iOrdinal = ((qu) getFocusOwner()).c.C0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (iOrdinal != 3) {
            throw new fg();
        }
        gu guVarJ0 = b10.j0(i);
        int i2 = guVarJ0 != null ? guVarJ0.a : 7;
        return c10.i(((qu) getFocusOwner()).e(i2, rect != null ? l81.c0(rect) : null, new l3(i2, 0)), Boolean.TRUE);
    }

    public final void s(dg0 dg0Var, boolean z) {
        ArrayList arrayList = this.A;
        if (!z) {
            if (this.C) {
                return;
            }
            arrayList.remove(dg0Var);
            ArrayList arrayList2 = this.B;
            if (arrayList2 != null) {
                arrayList2.remove(dg0Var);
                return;
            }
            return;
        }
        if (!this.C) {
            arrayList.add(dg0Var);
            return;
        }
        ArrayList arrayList3 = this.B;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.B = arrayList3;
        }
        arrayList3.add(dg0Var);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.v.h = j;
    }

    public final void setConfigurationChangeObserver(iw iwVar) {
        this.F = iwVar;
    }

    public final void setContentCaptureManager$ui_release(q4 q4Var) {
        this.w = q4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [d90] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eb0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eb0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void setCoroutineContext(ml mlVar) {
        this.k = mlVar;
        d90 d90Var = getRoot().G.f;
        if (d90Var instanceof py0) {
            ((py0) d90Var).C0();
        }
        if (!d90Var.d.q) {
            pz.b("visitSubtreeIf called on an unattached node");
        }
        eb0 eb0Var = new eb0(new d90[16]);
        d90 d90Var2 = d90Var.d;
        d90 d90Var3 = d90Var2.i;
        if (d90Var3 == null) {
            d80.h(eb0Var, d90Var2);
        } else {
            eb0Var.b(d90Var3);
        }
        while (true) {
            int i = eb0Var.f;
            if (i == 0) {
                return;
            }
            d90 d90Var4 = (d90) eb0Var.k(i - 1);
            if ((d90Var4.g & 16) != 0) {
                for (d90 d90Var5 = d90Var4; d90Var5 != null; d90Var5 = d90Var5.i) {
                    if ((d90Var5.f & 16) != 0) {
                        mn mnVarI = d90Var5;
                        ?? eb0Var2 = 0;
                        while (mnVarI != 0) {
                            if (mnVarI instanceof qj0) {
                                qj0 qj0Var = (qj0) mnVarI;
                                if (qj0Var instanceof py0) {
                                    ((py0) qj0Var).C0();
                                }
                            } else if ((mnVarI.f & 16) != 0 && (mnVarI instanceof mn)) {
                                d90 d90Var6 = mnVarI.s;
                                int i2 = 0;
                                mnVarI = mnVarI;
                                eb0Var2 = eb0Var2;
                                while (d90Var6 != null) {
                                    if ((d90Var6.f & 16) != 0) {
                                        i2++;
                                        eb0Var2 = eb0Var2;
                                        if (i2 == 1) {
                                            mnVarI = d90Var6;
                                        } else {
                                            if (eb0Var2 == 0) {
                                                eb0Var2 = new eb0(new d90[16]);
                                            }
                                            if (mnVarI != 0) {
                                                eb0Var2.b(mnVarI);
                                                mnVarI = 0;
                                            }
                                            eb0Var2.b(d90Var6);
                                        }
                                    }
                                    d90Var6 = d90Var6.i;
                                    mnVarI = mnVarI;
                                    eb0Var2 = eb0Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            mnVarI = d80.i(eb0Var2);
                        }
                    }
                }
            }
            d80.h(eb0Var, d90Var4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.V = j;
    }

    public final void setOnViewTreeOwnersAvailable(iw iwVar) {
        d3 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            iwVar.g(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.d0 = iwVar;
    }

    public void setUncaughtExceptionHandler(ao0 ao0Var) {
        this.P.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        if (this.I) {
            bw0 bw0Var = getSnapshotObserver().a;
            synchronized (bw0Var.g) {
                try {
                    eb0 eb0Var = bw0Var.f;
                    int i = eb0Var.f;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        aw0 aw0Var = (aw0) eb0Var.d[i3];
                        aw0Var.d();
                        if (!(aw0Var.f.e != 0)) {
                            i2++;
                        } else if (i2 > 0) {
                            Object[] objArr = eb0Var.d;
                            objArr[i3 - i2] = objArr[i3];
                        }
                    }
                    int i4 = i - i2;
                    y9.v0(eb0Var.d, i4, i);
                    eb0Var.f = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.I = false;
        }
        s7 s7Var = this.M;
        if (s7Var != null) {
            g(s7Var);
        }
        s2 s2Var = this.H;
        if (s2Var != null) {
            ea0 ea0Var = s2Var.g;
            if (ea0Var.d == 0 && s2Var.h) {
                ((AutofillManager) s2Var.a.e).commit();
                s2Var.h = false;
            }
            if (ea0Var.d != 0) {
                s2Var.h = true;
            }
        }
        while (this.w0.h() && this.w0.e(0) != null) {
            int i5 = this.w0.b;
            for (int i6 = 0; i6 < i5; i6++) {
                gw gwVar = (gw) this.w0.e(i6);
                ma0 ma0Var = this.w0;
                if (i6 < 0 || i6 >= ma0Var.b) {
                    ma0Var.m(i6);
                    throw null;
                }
                Object[] objArr2 = ma0Var.a;
                Object obj = objArr2[i6];
                objArr2[i6] = null;
                if (gwVar != null) {
                    gwVar.a();
                }
            }
            this.w0.k(0, i5);
        }
    }

    public final void u(t30 t30Var) {
        w3 w3Var = this.v;
        w3Var.A = true;
        if (w3Var.n()) {
            w3Var.o(t30Var);
        }
        q4 q4Var = this.w;
        q4Var.j = true;
        if (q4Var.h()) {
            q4Var.k.u(j41.a);
        }
    }

    public final void v(t30 t30Var, boolean z, boolean z2) {
        t30 t30VarT;
        t30 t30VarT2;
        i80 i80Var = this.P;
        if (!z) {
            if (i80Var.m(t30Var, z2)) {
                B(t30Var);
                return;
            }
            return;
        }
        e9 e9Var = i80Var.b;
        t30 t30Var2 = t30Var.j;
        w30 w30Var = t30Var.H;
        if (t30Var2 == null) {
            pz.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = w30Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new fg();
                }
                if (!w30Var.e || z2) {
                    w30Var.e = true;
                    w30Var.p.w = true;
                    if (t30Var.P) {
                        return;
                    }
                    if ((c10.i(t30Var.J(), Boolean.TRUE) || i80.f(t30Var)) && ((t30VarT = t30Var.t()) == null || !t30VarT.H.e)) {
                        e9Var.a(t30Var, k10.d);
                    } else if ((t30Var.I() || i80.g(t30Var)) && ((t30VarT2 = t30Var.t()) == null || !t30VarT2.p())) {
                        e9Var.a(t30Var, k10.f);
                    }
                    if (i80Var.d) {
                        return;
                    }
                    B(t30Var);
                    return;
                }
                return;
            }
        }
        i80Var.h.b(new h80(t30Var, true, z2));
    }

    public final void w(t30 t30Var, boolean z, boolean z2) {
        w30 w30Var = t30Var.H;
        k10 k10Var = k10.g;
        i80 i80Var = this.P;
        if (!z) {
            i80Var.getClass();
            int iOrdinal = w30Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new fg();
            }
            t30 t30VarT = t30Var.t();
            boolean z3 = t30VarT == null || t30VarT.I();
            if (!z2) {
                if (t30Var.p()) {
                    return;
                }
                if (t30Var.o() && t30Var.I() == z3 && t30Var.I() == w30Var.p.v) {
                    return;
                }
            }
            k80 k80Var = w30Var.p;
            k80Var.x = true;
            k80Var.y = true;
            if (!t30Var.P && k80Var.v && z3) {
                if ((t30VarT == null || !t30VarT.o()) && (t30VarT == null || !t30VarT.p())) {
                    i80Var.b.a(t30Var, k10Var);
                }
                if (i80Var.d) {
                    return;
                }
                B(null);
                return;
            }
            return;
        }
        e9 e9Var = i80Var.b;
        int iOrdinal2 = w30Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new fg();
                }
            }
        }
        if ((w30Var.e || w30Var.f) && !z2) {
            return;
        }
        w30Var.f = true;
        w30Var.g = true;
        k80 k80Var2 = w30Var.p;
        k80Var2.x = true;
        k80Var2.y = true;
        if (t30Var.P) {
            return;
        }
        t30 t30VarT2 = t30Var.t();
        if (c10.i(t30Var.J(), Boolean.TRUE) && ((t30VarT2 == null || !t30VarT2.H.e) && (t30VarT2 == null || !t30VarT2.H.f))) {
            e9Var.a(t30Var, k10.e);
        } else if (t30Var.I() && ((t30VarT2 == null || !t30VarT2.o()) && (t30VarT2 == null || !t30VarT2.p()))) {
            e9Var.a(t30Var, k10Var);
        }
        if (i80Var.d) {
            return;
        }
        B(null);
    }

    public final void x() {
        w3 w3Var = this.v;
        w3Var.A = true;
        if (w3Var.n() && !w3Var.L) {
            w3Var.L = true;
            w3Var.l.post(w3Var.N);
        }
        q4 q4Var = this.w;
        q4Var.j = true;
        if (!q4Var.h() || q4Var.q) {
            return;
        }
        q4Var.q = true;
        q4Var.l.post(q4Var.r);
    }

    public final void y() {
        if (this.W) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.V) {
            this.V = jCurrentAnimationTimeMillis;
            sc scVar = this.D0;
            float[] fArr = this.T;
            scVar.a(this, fArr);
            l81.J(fArr, this.U);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.R;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.a0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void z(MotionEvent motionEvent) {
        this.V = AnimationUtils.currentAnimationTimeMillis();
        sc scVar = this.D0;
        float[] fArr = this.T;
        scVar.a(this, fArr);
        l81.J(fArr, this.U);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = e80.b((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.a0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c10.m(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    /* renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public o2 m0getAccessibilityManager() {
        return this.x;
    }

    public v2 getClipboard() {
        return this.K;
    }

    public w2 getClipboardManager() {
        return this.J;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public h5 m3getDragAndDropManager() {
        return this.l;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public da0 m4getLayoutNodes() {
        return this.r;
    }

    public p3 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @ao
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @ao
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // defpackage.cn
    public final void c(f50 f50Var) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void setShowLayoutBounds(boolean z) {
    }

    public final void setUncaughtExceptionHandler$ui_release(ao0 ao0Var) {
    }
}
