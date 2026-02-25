package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public abstract class qv {
    public static final d70 a = new d70(2);
    public static final di b = new di(1);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0005, B:4:0x000c, B:6:0x0012, B:8:0x001e, B:10:0x0025, B:13:0x002c, B:15:0x0038, B:19:0x0041, B:21:0x0047, B:28:0x0077, B:22:0x0056, B:24:0x0064, B:27:0x006e, B:29:0x007a), top: B:35:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c8 a(android.content.Context r8, java.util.List r9) {
        /*
            java.lang.String r0 = "FontProvider.getFontFamilyResult"
            defpackage.n2.b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L83
            r0.<init>()     // Catch: java.lang.Throwable -> L83
            r1 = 0
            r2 = r1
        Lc:
            int r3 = r9.size()     // Catch: java.lang.Throwable -> L83
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Throwable -> L83
            rv r3 = (defpackage.rv) r3     // Catch: java.lang.Throwable -> L83
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L83
            r5 = 31
            if (r4 < r5) goto L56
            java.lang.String r4 = r3.e     // Catch: java.lang.Throwable -> L83
            kc0 r5 = defpackage.u31.a     // Catch: java.lang.Throwable -> L83
            r5 = 0
            if (r4 == 0) goto L3f
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L2c
            goto L3f
        L2c:
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r4, r1)     // Catch: java.lang.Throwable -> L83
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT     // Catch: java.lang.Throwable -> L83
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r1)     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L3f
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r7 != 0) goto L3f
            r5 = r6
        L3f:
            if (r5 == 0) goto L56
            android.graphics.fonts.Font r5 = defpackage.u31.b(r5)     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto L56
            bw r5 = new bw     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r3.f     // Catch: java.lang.Throwable -> L83
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L83
            bw[] r3 = new defpackage.bw[]{r5}     // Catch: java.lang.Throwable -> L83
            r0.add(r3)     // Catch: java.lang.Throwable -> L83
            goto L77
        L56:
            android.content.pm.PackageManager r4 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L83
            android.content.res.Resources r5 = r8.getResources()     // Catch: java.lang.Throwable -> L83
            android.content.pm.ProviderInfo r4 = b(r4, r3, r5)     // Catch: java.lang.Throwable -> L83
            if (r4 != 0) goto L6e
            c8 r8 = new c8     // Catch: java.lang.Throwable -> L83
            r9 = 1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L83
            android.os.Trace.endSection()
            return r8
        L6e:
            java.lang.String r4 = r4.authority     // Catch: java.lang.Throwable -> L83
            bw[] r3 = c(r8, r3, r4)     // Catch: java.lang.Throwable -> L83
            r0.add(r3)     // Catch: java.lang.Throwable -> L83
        L77:
            int r2 = r2 + 1
            goto Lc
        L7a:
            c8 r8 = new c8     // Catch: java.lang.Throwable -> L83
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L83
            android.os.Trace.endSection()
            return r8
        L83:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv.a(android.content.Context, java.util.List):c8");
    }

    public static ProviderInfo b(PackageManager packageManager, rv rvVar, Resources resources) {
        di diVar = b;
        d70 d70Var = a;
        n2.b("FontProvider.getProvider");
        try {
            List listT = rvVar.d;
            String str = rvVar.a;
            String str2 = rvVar.b;
            if (listT == null) {
                listT = r31.T(resources, 0);
            }
            pv pvVar = new pv();
            pvVar.a = str;
            pvVar.b = str2;
            pvVar.c = listT;
            ProviderInfo providerInfo = (ProviderInfo) d70Var.a(pvVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, diVar);
            for (int i = 0; i < listT.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listT.get(i));
                Collections.sort(arrayList2, diVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    d70Var.b(pvVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static bw[] c(Context context, rv rvVar, String str) {
        n2.b("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                n2.b("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {rvVar.c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new bw(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (bw[]) arrayList.toArray(new bw[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
