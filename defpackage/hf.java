package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class hf {
    public final int a;
    public final al0 b;
    public d00 c;
    public d00 d;
    public bl0 e;
    public final ColorDrawable f;
    public final boolean g;
    public int h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public hf(int i, int i2) {
        al0 al0Var = new al0();
        al0Var.a = -1;
        al0Var.b = -1;
        d00 d00Var = d00.e;
        al0Var.c = d00Var;
        al0Var.d = false;
        al0Var.e = null;
        al0Var.f = 0.0f;
        al0Var.g = 0.0f;
        al0Var.h = 1.0f;
        this.b = al0Var;
        this.c = d00Var;
        this.d = d00Var;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            throw new IllegalArgumentException("Unexpected side: " + i);
        }
        this.a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            al0Var.e = colorDrawable;
            xz xzVar = al0Var.i;
            if (xzVar != null) {
                ((View) xzVar.e).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        al0 al0Var = this.b;
        if (al0Var.h != f2) {
            al0Var.h = f2;
            xz xzVar = al0Var.i;
            if (xzVar != null) {
                ((View) xzVar.e).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        al0 al0Var = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * al0Var.a;
            if (al0Var.f != f3) {
                al0Var.f = f3;
                xz xzVar = al0Var.i;
                if (xzVar != null) {
                    ((View) xzVar.e).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * al0Var.b;
            if (al0Var.g != f4) {
                al0Var.g = f4;
                xz xzVar2 = al0Var.i;
                if (xzVar2 != null) {
                    ((View) xzVar2.e).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * al0Var.a;
            if (al0Var.f != f5) {
                al0Var.f = f5;
                xz xzVar3 = al0Var.i;
                if (xzVar3 != null) {
                    ((View) xzVar3.e).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * al0Var.b;
        if (al0Var.g != f6) {
            al0Var.g = f6;
            xz xzVar4 = al0Var.i;
            if (xzVar4 != null) {
                ((View) xzVar4.e).setTranslationY(f6);
            }
        }
    }
}
