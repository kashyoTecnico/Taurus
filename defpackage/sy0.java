package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class sy0 extends v61 {
    public final HashMap e;
    public final /* synthetic */ ty0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(ty0 ty0Var) {
        super(0);
        this.f = ty0Var;
        this.e = new HashMap();
    }

    @Override // defpackage.v61
    public final void b(x61 x61Var) {
        ArrayList arrayList = this.f.b;
        if ((((WindowInsetsAnimation) x61Var.a.a).getTypeMask() & 519) != 0) {
            this.e.remove(x61Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bl0 bl0Var = (bl0) arrayList.get(size);
                int i = bl0Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                bl0Var.e = i2;
                if (z && i2 == 0) {
                    bl0Var.c();
                }
            }
        }
    }

    @Override // defpackage.v61
    public final void c(x61 x61Var) {
        ArrayList arrayList = this.f.b;
        if ((((WindowInsetsAnimation) x61Var.a.a).getTypeMask() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((bl0) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.v61
    public final n71 d(n71 n71Var, List list) {
        ArrayList arrayList = this.f.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            x61 x61Var = (x61) list.get(size);
            Integer num = (Integer) this.e.get(x61Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float alpha = ((WindowInsetsAnimation) x61Var.a.a).getAlpha();
                if ((iIntValue & 1) != 0) {
                    rectF.left = alpha;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = alpha;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = alpha;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = alpha;
                }
                i |= iIntValue;
            }
        }
        d00 d00VarA = d00.a(n71Var.a.f(519), n71Var.a.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            bl0 bl0Var = (bl0) arrayList.get(size2);
            d00 d00Var = bl0Var.d;
            ArrayList arrayList2 = bl0Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                hf hfVar = (hf) arrayList2.get(size3);
                int i2 = hfVar.a;
                if ((i2 & i) != 0) {
                    al0 al0Var = hfVar.b;
                    if (!al0Var.d) {
                        al0Var.d = true;
                        xz xzVar = al0Var.i;
                        if (xzVar != null) {
                            ((View) xzVar.e).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = d00Var.a;
                        if (i3 > 0) {
                            hfVar.b(d00VarA.a / i3);
                        }
                        hfVar.a(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = d00Var.b;
                        if (i4 > 0) {
                            hfVar.b(d00VarA.b / i4);
                        }
                        hfVar.a(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = d00Var.c;
                        if (i5 > 0) {
                            hfVar.b(d00VarA.c / i5);
                        }
                        hfVar.a(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = d00Var.d;
                        if (i6 > 0) {
                            hfVar.b(d00VarA.d / i6);
                        }
                        hfVar.a(rectF.bottom);
                    }
                }
            }
        }
        return n71Var;
    }

    @Override // defpackage.v61
    public final xz e(x61 x61Var, xz xzVar) {
        if ((((WindowInsetsAnimation) x61Var.a.a).getTypeMask() & 519) != 0) {
            d00 d00Var = (d00) xzVar.f;
            d00 d00Var2 = (d00) xzVar.e;
            int i = d00Var.a != d00Var2.a ? 1 : 0;
            if (d00Var.b != d00Var2.b) {
                i |= 2;
            }
            if (d00Var.c != d00Var2.c) {
                i |= 4;
            }
            if (d00Var.d != d00Var2.d) {
                i |= 8;
            }
            this.e.put(x61Var, Integer.valueOf(i));
        }
        return xzVar;
    }
}
