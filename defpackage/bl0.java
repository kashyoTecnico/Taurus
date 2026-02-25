package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class bl0 {
    public final ArrayList a = new ArrayList();
    public final ty0 b;
    public d00 c;
    public d00 d;
    public int e;
    public boolean f;

    public bl0(ty0 ty0Var, ArrayList arrayList) {
        d00 d00Var = d00.e;
        this.c = d00Var;
        this.d = d00Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = ty0Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            d00 d00Var2 = ty0Var.c;
            d00 d00Var3 = ty0Var.d;
            this.c = d00Var2;
            this.d = d00Var3;
            c();
            b(ty0Var.e);
        }
        this.b = ty0Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hf hfVar = (hf) list.get(i);
            hfVar.getClass();
            if (true == z) {
                bl0 bl0Var = hfVar.e;
                if (bl0Var != null) {
                    throw new IllegalStateException(hfVar + " is already controlled by " + bl0Var);
                }
                hfVar.e = this;
                this.a.add(hfVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hf hfVar = (hf) arrayList.get(size);
            if (!hfVar.g) {
                ColorDrawable colorDrawable = hfVar.f;
                if (hfVar.h != i) {
                    hfVar.h = i;
                    colorDrawable.setColor(i);
                    al0 al0Var = hfVar.b;
                    al0Var.e = colorDrawable;
                    xz xzVar = al0Var.i;
                    if (xzVar != null) {
                        ((View) xzVar.e).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        d00 d00VarB;
        ArrayList arrayList = this.a;
        d00 d00Var = d00.e;
        d00 d00VarB2 = d00Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hf hfVar = (hf) arrayList.get(size);
            d00 d00Var2 = this.c;
            d00 d00Var3 = this.d;
            hfVar.c = d00Var2;
            al0 al0Var = hfVar.b;
            hfVar.d = d00Var3;
            if (!al0Var.c.equals(d00VarB2)) {
                al0Var.c = d00VarB2;
                xz xzVar = al0Var.i;
                if (xzVar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xzVar.f;
                    layoutParams.leftMargin = d00VarB2.a;
                    layoutParams.topMargin = d00VarB2.b;
                    layoutParams.rightMargin = d00VarB2.c;
                    layoutParams.bottomMargin = d00VarB2.d;
                    ((View) xzVar.e).setLayoutParams(layoutParams);
                }
            }
            int i2 = hfVar.a;
            if (i2 == 1) {
                i = hfVar.c.a;
                int i3 = hfVar.d.a;
                if (al0Var.a != i3) {
                    al0Var.a = i3;
                    xz xzVar2 = al0Var.i;
                    if (xzVar2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xzVar2.f;
                        layoutParams2.width = i3;
                        ((View) xzVar2.e).setLayoutParams(layoutParams2);
                    }
                }
                d00VarB = d00.b(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = hfVar.c.b;
                int i4 = hfVar.d.b;
                if (al0Var.b != i4) {
                    al0Var.b = i4;
                    xz xzVar3 = al0Var.i;
                    if (xzVar3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xzVar3.f;
                        layoutParams3.height = i4;
                        ((View) xzVar3.e).setLayoutParams(layoutParams3);
                    }
                }
                d00VarB = d00.b(0, i, 0, 0);
            } else if (i2 == 4) {
                i = hfVar.c.c;
                int i5 = hfVar.d.c;
                if (al0Var.a != i5) {
                    al0Var.a = i5;
                    xz xzVar4 = al0Var.i;
                    if (xzVar4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) xzVar4.f;
                        layoutParams4.width = i5;
                        ((View) xzVar4.e).setLayoutParams(layoutParams4);
                    }
                }
                d00VarB = d00.b(0, 0, i, 0);
            } else if (i2 != 8) {
                d00VarB = d00Var;
                i = 0;
            } else {
                i = hfVar.c.d;
                int i6 = hfVar.d.d;
                if (al0Var.b != i6) {
                    al0Var.b = i6;
                    xz xzVar5 = al0Var.i;
                    if (xzVar5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) xzVar5.f;
                        layoutParams5.height = i6;
                        ((View) xzVar5.e).setLayoutParams(layoutParams5);
                    }
                }
                d00VarB = d00.b(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (al0Var.d != z) {
                al0Var.d = z;
                xz xzVar6 = al0Var.i;
                if (xzVar6 != null) {
                    ((View) xzVar6.e).setVisibility(z ? 0 : 4);
                }
            }
            float f = 0.0f;
            hfVar.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            hfVar.b(f);
            d00VarB2 = d00.b(Math.max(d00VarB2.a, d00VarB.a), Math.max(d00VarB2.b, d00VarB.b), Math.max(d00VarB2.c, d00VarB.c), Math.max(d00VarB2.d, d00VarB.d));
        }
    }
}
