package defpackage;

import com.taurus.dgmobilemx.MainActivity;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ir implements iw {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ir(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iw
    public final Object g(Object obj) {
        String strConcat;
        StringBuilder sb;
        int i;
        int i2 = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                hr hrVar = (hr) obj;
                String str = ((hr) obj2) == hrVar ? " > " : "   ";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (hrVar instanceof xf) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    xf xfVar = (xf) hrVar;
                    sb.append(xfVar.a.e.length());
                    sb.append(", newCursorPosition=");
                    i = xfVar.b;
                } else {
                    if (!(hrVar instanceof eu0)) {
                        if (hrVar instanceof du0) {
                            strConcat = ((du0) hrVar).toString();
                        } else if (hrVar instanceof sn) {
                            strConcat = ((sn) hrVar).toString();
                        } else if (hrVar instanceof tn) {
                            strConcat = ((tn) hrVar).toString();
                        } else if (hrVar instanceof fu0) {
                            strConcat = ((fu0) hrVar).toString();
                        } else if (hrVar instanceof ht) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (hrVar instanceof rn) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strB = em0.a(hrVar.getClass()).b();
                            if (strB == null) {
                                strB = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strB);
                        }
                        sb2.append(strConcat);
                        return sb2.toString();
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    eu0 eu0Var = (eu0) hrVar;
                    sb.append(eu0Var.a.e.length());
                    sb.append(", newCursorPosition=");
                    i = eu0Var.b;
                }
                strConcat = b8.h(sb, i, ')');
                sb2.append(strConcat);
                return sb2.toString();
            case 1:
                y31 y31Var = (y31) obj;
                return ((kv) obj2).a(new y31(null, y31Var.b, y31Var.c, y31Var.d, y31Var.e)).d;
            case 2:
                MainActivity mainActivity = (MainActivity) obj2;
                String str2 = (String) obj;
                c10.p(str2, "inputPin");
                mainActivity.removeDeviceOwner(mainActivity, str2);
                return j41.a;
            case 3:
                String str3 = (String) obj;
                c10.p(str3, "it");
                zg0 zg0Var = q70.a;
                ((za0) obj2).setValue(str3);
                return j41.a;
            case 4:
                ((ob0) obj2).d(null);
                return j41.a;
            case 5:
                ((oi) obj2).y(obj);
                return j41.a;
            case 6:
                sl0 sl0Var = (sl0) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (sl0Var.b) {
                    try {
                        r10 r10Var = sl0Var.c;
                        if (r10Var != null) {
                            zw0 zw0Var = sl0Var.t;
                            ol0 ol0Var = ol0.e;
                            zw0Var.getClass();
                            zw0Var.h(null, ol0Var);
                            r10Var.a(cancellationException);
                            sl0Var.q = null;
                            r10Var.t(new qx(2, sl0Var, th));
                        } else {
                            sl0Var.d = cancellationException;
                            zw0 zw0Var2 = sl0Var.t;
                            ol0 ol0Var2 = ol0.d;
                            zw0Var2.getClass();
                            zw0Var2.h(null, ol0Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return j41.a;
            case 7:
                gv0 gv0Var = (gv0) ((iw) obj2).g((lv0) obj);
                synchronized (ov0.c) {
                    ov0.d = ov0.d.e(gv0Var.g());
                }
                return gv0Var;
            case 8:
                ua0 ua0Var = (ua0) obj2;
                if (obj instanceof ex0) {
                    ((ex0) obj).f(4);
                }
                ua0Var.a(obj);
                return j41.a;
            default:
                bw0 bw0Var = (bw0) obj2;
                synchronized (bw0Var.g) {
                    aw0 aw0Var = bw0Var.i;
                    c10.m(aw0Var);
                    Object obj3 = aw0Var.b;
                    c10.m(obj3);
                    int i3 = aw0Var.d;
                    la0 la0Var = aw0Var.c;
                    if (la0Var == null) {
                        la0Var = new la0();
                        aw0Var.c = la0Var;
                        aw0Var.f.l(obj3, la0Var);
                    }
                    aw0Var.c(obj, i3, obj3, la0Var);
                }
                return j41.a;
        }
    }

    public /* synthetic */ ir(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
    }
}
