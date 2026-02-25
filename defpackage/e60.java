package defpackage;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class e60 {
    public static final e60 a = new e60();

    public final void a(EditorInfo editorInfo, d60 d60Var) {
        if (c10.i(d60Var, d60.f)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(we.O(d60Var));
        Iterator it = d60Var.d.iterator();
        while (it.hasNext()) {
            arrayList.add(((c60) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
