package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import defpackage.d90;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h5 implements View.OnDragListener, op {
    public final qp a;
    public final x9 b;
    public final AndroidDragAndDropManager$modifier$1 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public h5() {
        qp qpVar = new qp();
        qpVar.t = 0L;
        this.a = qpVar;
        this.b = new x9();
        this.c = new i90() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.i90
            public final d90 f() {
                return this.a.a;
            }

            @Override // defpackage.i90
            public final /* bridge */ /* synthetic */ void g(d90 d90Var) {
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        r1 r1Var = new r1(9, dragEvent);
        int action = dragEvent.getAction();
        i31 i31Var = i31.d;
        x9 x9Var = this.b;
        qp qpVar = this.a;
        switch (action) {
            case 1:
                zl0 zl0Var = new zl0();
                pp ppVar = new pp(r1Var, qpVar, zl0Var);
                if (ppVar.g(qpVar) == i31Var) {
                    h9.n(qpVar, ppVar);
                }
                boolean z = zl0Var.d;
                x9Var.getClass();
                s9 s9Var = new s9(x9Var);
                while (s9Var.hasNext()) {
                    ((qp) s9Var.next()).E0(r1Var);
                }
                break;
            case 2:
                qpVar.D0(r1Var);
                break;
            case 4:
                h hVar = new h(13, r1Var);
                if (hVar.g(qpVar) == i31Var) {
                    h9.n(qpVar, hVar);
                }
                x9Var.clear();
                break;
            case 5:
                qpVar.B0(r1Var);
                break;
            case 6:
                qpVar.C0(r1Var);
                break;
        }
        return false;
    }
}
