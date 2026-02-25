package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public interface n80 extends x00 {
    m80 M(int i, int i2, Map map, iw iwVar, iw iwVar2);

    default m80 a0(int i, int i2, Map map, iw iwVar) {
        return M(i, i2, map, null, iwVar);
    }
}
