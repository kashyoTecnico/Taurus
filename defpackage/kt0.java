package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class kt0 extends y20 implements kw {
    public static final kt0 f;
    public static final kt0 g;
    public static final kt0 h;
    public static final kt0 i;
    public static final kt0 j;
    public static final kt0 k;
    public static final kt0 l;
    public static final kt0 m;
    public static final kt0 n;
    public static final kt0 o;
    public static final kt0 p;
    public final /* synthetic */ int e;

    static {
        int i2 = 2;
        f = new kt0(i2, 0);
        g = new kt0(i2, 1);
        h = new kt0(i2, 2);
        i = new kt0(i2, 3);
        j = new kt0(i2, 4);
        k = new kt0(i2, 5);
        l = new kt0(i2, 6);
        m = new kt0(i2, 7);
        n = new kt0(i2, 8);
        o = new kt0(i2, 9);
        p = new kt0(i2, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt0(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.kw
    public final Object e(Object obj, Object obj2) {
        String str;
        ow owVar;
        switch (this.e) {
            case 0:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 1:
                zn0 zn0Var = (zn0) obj;
                int i2 = ((zn0) obj2).a;
                return zn0Var;
            case 2:
                return (ju0) obj;
            case 3:
                return (String) obj;
            case 4:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListE0 = ue.e0(list);
                arrayListE0.addAll(list2);
                return arrayListE0;
            case 5:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            case 6:
                return (String) obj;
            case 7:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 8:
                j0 j0Var = (j0) obj;
                j0 j0Var2 = (j0) obj2;
                if (j0Var == null || (str = j0Var.a) == null) {
                    str = j0Var2.a;
                }
                if (j0Var == null || (owVar = j0Var.b) == null) {
                    owVar = j0Var2.b;
                }
                return new j0(str, owVar);
            case 9:
                return obj == null ? obj2 : obj;
            default:
                gt0 gt0Var = (gt0) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                ct0 ct0Var = ((gt0) obj).d;
                ot0 ot0Var = lt0.s;
                Object objG = ct0Var.d.g(ot0Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = gt0Var.d.d.g(ot0Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
