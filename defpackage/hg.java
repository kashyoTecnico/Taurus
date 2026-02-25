package defpackage;

import com.taurus.dgmobilemx.MainActivity;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ hg(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        MainActivity mainActivity = this.e;
        switch (i) {
            case 0:
                sg.a(mainActivity);
                break;
            default:
                mainActivity.invalidateMenu();
                break;
        }
    }
}
