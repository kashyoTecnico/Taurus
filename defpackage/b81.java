package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.taurus.dgmobilemx.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class b81 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final xw0 a(Context context) {
        xw0 xw0Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object objX = linkedHashMap.get(context);
                if (objX == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    gc gcVarA = nm.a(-1, 6, null);
                    r1 r1Var = new r1(new wv0(contentResolver, uriFor, new a81(gcVarA, Handler.createAsync(Looper.getMainLooper())), gcVarA, context, null));
                    ay0 ay0Var = new ay0(null);
                    fn fnVar = xo.a;
                    objX = r31.X(r1Var, new kk(d80.v(ay0Var, r70.a)), new vw0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objX);
                }
                xw0Var = (xw0) objX;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xw0Var;
    }

    public static final hi b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof hi) {
            return (hi) tag;
        }
        return null;
    }
}
