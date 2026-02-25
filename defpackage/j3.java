package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class j3 extends y20 implements iw {
    public final /* synthetic */ int e;
    public final /* synthetic */ p3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(p3 p3Var, int i) {
        super(1);
        this.e = i;
        this.f = p3Var;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        gu guVar;
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((k20) obj).a;
                long jZ = m20.z(keyEvent);
                if (j20.a(jZ, j20.c)) {
                    guVar = new gu(2);
                } else if (j20.a(jZ, j20.d)) {
                    guVar = new gu(1);
                } else if (j20.a(jZ, j20.j)) {
                    guVar = new gu(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    guVar = j20.a(jZ, j20.h) ? new gu(4) : j20.a(jZ, j20.g) ? new gu(3) : (j20.a(jZ, j20.e) || j20.a(jZ, j20.m)) ? new gu(5) : (j20.a(jZ, j20.f) || j20.a(jZ, j20.n)) ? new gu(6) : (j20.a(jZ, j20.i) || j20.a(jZ, j20.k) || j20.a(jZ, j20.o)) ? new gu(7) : (j20.a(jZ, j20.b) || j20.a(jZ, j20.l)) ? new gu(8) : null;
                }
                if (guVar != null) {
                    int i = guVar.a;
                    if (m20.E(keyEvent) == 2) {
                        Integer numI0 = b10.i0(i);
                        p3 p3Var = this.f;
                        xl0 embeddedViewFocusRect = p3Var.getEmbeddedViewFocusRect();
                        Boolean boolE = ((qu) p3Var.getFocusOwner()).e(i, embeddedViewFocusRect, new i3(guVar, 1));
                        if (boolE != null ? boolE.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i == 1 || i == 2)) {
                            return Boolean.FALSE;
                        }
                        if (numI0 != null) {
                            int iIntValue = numI0.intValue();
                            Object obj2 = ku.f.get();
                            c10.m(obj2);
                            ku kuVar = (ku) obj2;
                            View viewB = p3Var;
                            while (true) {
                                if (viewB != null) {
                                    View rootView = p3Var.getRootView();
                                    c10.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewB = kuVar.b((ViewGroup) rootView, viewB, iIntValue);
                                    if (viewB != null) {
                                        if (!viewB.equals(p3Var)) {
                                            for (ViewParent parent = viewB.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == p3Var) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    viewB = null;
                                }
                            }
                            if (c10.i(viewB, p3Var)) {
                                viewB = null;
                            }
                            if (viewB != null) {
                                Rect rectA0 = embeddedViewFocusRect != null ? l81.a0(embeddedViewFocusRect) : null;
                                if (rectA0 == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                View rootView2 = p3Var.getRootView();
                                c10.n(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(p3Var, rectA0);
                                viewGroup.offsetRectIntoDescendantCoords(viewB, rectA0);
                                if (b10.e0(viewB, numI0, rectA0)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((qu) p3Var.getFocusOwner()).b(i, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolE2 = ((qu) p3Var.getFocusOwner()).e(i, null, new i3(guVar, 0));
                        return Boolean.valueOf(boolE2 != null ? boolE2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                gw gwVar = (gw) obj;
                p3 p3Var2 = this.f;
                Handler handler = p3Var2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    gwVar.a();
                } else {
                    Handler handler2 = p3Var2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new p1(gwVar, 1));
                    }
                }
                return j41.a;
            default:
                p3 p3Var3 = this.f;
                return new m6(p3Var3, p3Var3.getTextInputService(), (wl) obj);
        }
    }
}
