package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class mo extends k implements kd0 {
    public final Window l;
    public final zg0 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    public mo(Context context, Window window) {
        super(context);
        this.l = window;
        this.m = qo0.n(ah.a);
        int i = a61.a;
        w51.a(this, this);
        a61.a(this, new lo(this));
    }

    @Override // defpackage.kd0
    public final n71 a(View view, n71 n71Var) {
        if (!this.o) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return n71Var.a.j(iMax, iMax2, iMax3, iMax4);
            }
        }
        return n71Var;
    }

    @Override // defpackage.k
    public final void b(int i, ci ciVar) {
        ciVar.W(1735448596);
        int i2 = (ciVar.h(this) ? 4 : 2) | i;
        if (ciVar.N(i2 & 1, (i2 & 3) != 2)) {
            ((kw) this.m.getValue()).e(ciVar, 0);
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new j(i, 7, this);
        }
    }

    @Override // defpackage.k
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.k
    public final void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.l;
        int i3 = (mode != Integer.MIN_VALUE || this.n || this.o || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.o || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.n) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // defpackage.k
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.q;
    }
}
