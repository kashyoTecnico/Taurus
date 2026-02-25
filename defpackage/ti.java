package defpackage;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class ti {
    public static final hx0 a = new hx0(d4.r);
    public static final hx0 b = new hx0(d4.s);
    public static final hx0 c = new hx0(d4.u);
    public static final hx0 d = new hx0(d4.t);
    public static final hx0 e = new hx0(d4.w);
    public static final hx0 f = new hx0(d4.v);
    public static final hx0 g = new hx0(d4.C);
    public static final hx0 h = new hx0(d4.y);
    public static final hx0 i = new hx0(d4.z);
    public static final hx0 j = new hx0(d4.B);
    public static final hx0 k = new hx0(d4.A);
    public static final hx0 l = new hx0(d4.D);
    public static final hx0 m = new hx0(d4.E);
    public static final hx0 n = new hx0(d4.F);
    public static final hx0 o = new hx0(si.f);
    public static final hx0 p = new hx0(nq0.f);
    public static final hx0 q = new hx0(si.g);
    public static final hx0 r = new hx0(si.h);
    public static final hx0 s = new hx0(si.i);
    public static final hx0 t = new hx0(si.j);
    public static final hx0 u = new hx0(d4.G);
    public static final vi v = new vi(d4.H);

    static {
        m20.J(d4.x);
    }

    public static final void a(eg0 eg0Var, p7 p7Var, kw kwVar, ci ciVar, int i2) {
        ciVar.W(1925803616);
        int i3 = i2 | (ciVar.f(eg0Var) ? 4 : 2) | (ciVar.f(p7Var) ? 32 : 16) | (ciVar.h(kwVar) ? 256 : 128);
        if (ciVar.N(i3 & 1, (i3 & 147) != 146)) {
            p3 p3Var = (p3) eg0Var;
            fl0 fl0VarA = a.a(p3Var.m0getAccessibilityManager());
            fl0 fl0VarA2 = b.a(p3Var.getAutofill());
            fl0 fl0VarA3 = d.a(p3Var.getAutofillManager());
            fl0 fl0VarA4 = c.a(p3Var.getAutofillTree());
            fl0 fl0VarA5 = e.a(p3Var.getClipboardManager());
            fl0 fl0VarA6 = f.a(p3Var.getClipboard());
            fl0 fl0VarA7 = h.a(p3Var.getDensity());
            fl0 fl0VarA8 = i.a(p3Var.getFocusOwner());
            fl0 fl0VarA9 = j.a(p3Var.getFontLoader());
            fl0VarA9.f = false;
            fl0 fl0VarA10 = k.a(p3Var.getFontFamilyResolver());
            fl0VarA10.f = false;
            c4.c(new fl0[]{fl0VarA, fl0VarA2, fl0VarA3, fl0VarA4, fl0VarA5, fl0VarA6, fl0VarA7, fl0VarA8, fl0VarA9, fl0VarA10, l.a(p3Var.getHapticFeedBack()), m.a(p3Var.getInputModeManager()), n.a(p3Var.getLayoutDirection()), o.a(p3Var.getTextInputService()), p.a(p3Var.getSoftwareKeyboardController()), q.a(p3Var.getTextToolbar()), r.a(p7Var), s.a(p3Var.getViewConfiguration()), t.a(p3Var.getWindowInfo()), u.a(p3Var.getPointerIconService()), g.a(p3Var.getGraphicsContext())}, kwVar, ciVar, ((i3 >> 3) & 112) | 8);
        } else {
            ciVar.Q();
        }
        nl0 nl0VarR = ciVar.r();
        if (nl0VarR != null) {
            nl0VarR.d = new g4(eg0Var, p7Var, kwVar, i2, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
