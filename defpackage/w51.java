package defpackage;

import android.view.View;
import com.taurus.dgmobilemx.R;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class w51 {
    public static void a(View view, kd0 kd0Var) {
        v51 v51Var = kd0Var != null ? new v51(view, kd0Var) : null;
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (v51Var != null) {
            view.setOnApplyWindowInsetsListener(v51Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
