package defpackage;

import android.os.Bundle;
import com.taurus.dgmobilemx.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class mg implements ud0 {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ mg(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void a(sg sgVar) {
        c10.p(sgVar, "it");
        MainActivity mainActivity = this.a;
        Bundle bundleA = mainActivity.getSavedStateRegistry().a("android:support:activity-result");
        if (bundleA != null) {
            qg qgVar = mainActivity.l;
            LinkedHashMap linkedHashMap = qgVar.b;
            LinkedHashMap linkedHashMap2 = qgVar.a;
            Bundle bundle = qgVar.f;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                qgVar.c.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        r31.k(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                c10.o(num2, "get(...)");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                c10.o(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                qgVar.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }
}
