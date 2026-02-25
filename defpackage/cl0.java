package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.taurus.dgmobilemx.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class cl0 extends FrameLayout {
    public static final Object f = new Object();
    public final ArrayList d;
    public bl0 e;

    public cl0(Context context, List list) {
        super(context);
        this.d = new ArrayList();
        setProtections(list);
    }

    private ty0 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof ty0) {
            return (ty0) tag;
        }
        ty0 ty0Var = new ty0(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, ty0Var);
        return ty0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8 A[LOOP:0: B:6:0x0023->B:26:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lc9
        La:
            ty0 r1 = r13.getOrInstallSystemBarStateMonitor()
            bl0 r2 = new bl0
            r2.<init>(r1, r0)
            r13.e = r2
            int r0 = r13.getChildCount()
            bl0 r1 = r13.e
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto Lc9
            bl0 r4 = r13.e
            java.util.ArrayList r4 = r4.a
            java.lang.Object r4 = r4.get(r3)
            hf r4 = (defpackage.hf) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            al0 r7 = r4.b
            int r4 = r4.a
            r8 = 1
            r9 = 4
            r10 = -1
            if (r4 == r8) goto L6c
            r8 = 2
            if (r4 == r8) goto L67
            if (r4 == r9) goto L60
            r8 = 8
            if (r4 != r8) goto L4c
            int r4 = r7.b
            r8 = 80
            goto L70
        L4c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected side: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L60:
            int r4 = r7.a
            r8 = 5
        L63:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L70
        L67:
            int r4 = r7.b
            r8 = 48
            goto L70
        L6c:
            int r4 = r7.a
            r8 = 3
            goto L63
        L70:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            d00 r4 = r7.c
            int r8 = r4.a
            r11.leftMargin = r8
            int r8 = r4.b
            r11.topMargin = r8
            int r8 = r4.c
            r11.rightMargin = r8
            int r4 = r4.d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = defpackage.cl0.f
            r4.setTag(r5)
            float r5 = r7.f
            r4.setTranslationX(r5)
            float r5 = r7.g
            r4.setTranslationY(r5)
            float r5 = r7.h
            r4.setAlpha(r5)
            boolean r5 = r7.d
            if (r5 == 0) goto La5
            r9 = r2
        La5:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.e
            r4.setBackground(r5)
            xz r5 = new xz
            r8 = 18
            r5.<init>(r11, r4, r8)
            xz r8 = r7.i
            if (r8 != 0) goto Lc1
            r7.i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L23
        Lc1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            r13.<init>(r0)
            throw r13
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl0.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f) {
            bl0 bl0Var = this.e;
            int childCount = getChildCount() - (bl0Var != null ? bl0Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.e != null) {
            removeViews(getChildCount() - this.e.a.size(), this.e.a.size());
            int size = this.e.a.size();
            for (int i = 0; i < size; i++) {
                ((hf) this.e.a.get(i)).b.i = null;
            }
            bl0 bl0Var = this.e;
            ArrayList arrayList = bl0Var.a;
            if (!bl0Var.f) {
                bl0Var.f = true;
                bl0Var.b.b.remove(bl0Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((hf) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.e = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof ty0) {
            ty0 ty0Var = (ty0) tag;
            if (ty0Var.b.isEmpty()) {
                ty0Var.a.post(new b3(10, ty0Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<hf> list) {
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
