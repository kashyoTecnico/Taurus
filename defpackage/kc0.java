package defpackage;

import android.content.ContentResolver;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public class kc0 implements lc0, hd0, xi0, nk0 {
    public static kc0 e;
    public final /* synthetic */ int d;

    public /* synthetic */ kc0(int i) {
        this.d = i;
    }

    public static final void i(kc0 kc0Var) {
        zw0 zw0Var;
        Object obj;
        gi0 gi0Var;
        zw0 zw0Var2 = sl0.x;
        do {
            zw0Var = sl0.x;
            obj = (hi0) zw0Var.getValue();
            gi0Var = (gi0) obj;
            xh0 xh0VarA = gi0Var.f;
            v50 v50Var = (v50) xh0VarA.get(kc0Var);
            if (v50Var != null) {
                Object obj2 = v50Var.a;
                Object obj3 = v50Var.b;
                l31 l31Var = xh0VarA.d;
                l31 l31VarV = l31Var.v(kc0Var != null ? kc0Var.hashCode() : 0, 0, kc0Var);
                if (l31Var != l31VarV) {
                    xh0VarA = l31VarV == null ? xh0.f : new xh0(l31VarV, xh0VarA.e - 1);
                }
                g2 g2Var = g2.C;
                if (obj2 != g2Var) {
                    Object obj4 = xh0VarA.get(obj2);
                    c10.m(obj4);
                    xh0VarA = xh0VarA.a(obj2, new v50(((v50) obj4).a, obj3));
                }
                if (obj3 != g2Var) {
                    Object obj5 = xh0VarA.get(obj3);
                    c10.m(obj5);
                    xh0VarA = xh0VarA.a(obj3, new v50(obj2, ((v50) obj5).b));
                }
                Object obj6 = obj2 != g2Var ? gi0Var.d : obj3;
                if (obj3 != g2Var) {
                    obj2 = gi0Var.e;
                }
                gi0Var = new gi0(obj6, obj2, xh0VarA);
            }
            if (obj == gi0Var) {
                return;
            }
            Object obj7 = b10.k;
            if (obj == null) {
                obj = obj7;
            }
        } while (!zw0Var.h(obj, gi0Var));
    }

    public static final t7 j(String str, int i) {
        WeakHashMap weakHashMap = p71.u;
        return new t7(str, i);
    }

    public static final int k(long j, int i) {
        int i2 = t21.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final v41 l(String str, int i) {
        WeakHashMap weakHashMap = p71.u;
        return new v41(new g00(0, 0, 0, 0), str);
    }

    public static Typeface m(String str, zv zvVar, int i) {
        if (i == 0 && c10.i(zvVar, zv.f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), zvVar.d, i == 1);
    }

    public static Font n(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(400, 0);
        Font font = fontFamily.getFont(0);
        int iQ = q(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int iQ2 = q(fontStyle, font2.getStyle());
            if (iQ2 < iQ) {
                font = font2;
                iQ = iQ2;
            }
        }
        return font;
    }

    public static int q(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.lc0
    public boolean b(d90 d90Var) {
        return false;
    }

    @Override // defpackage.lc0
    public int c() {
        return 8;
    }

    @Override // defpackage.lc0
    public void e(t30 t30Var, long j, gy gyVar, int i, boolean z) {
        jc0 jc0Var = t30Var.G;
        nc0 nc0Var = jc0Var.d;
        an0 an0Var = nc0.M;
        jc0Var.d.T0(nc0.Q, nc0Var.L0(j), gyVar, 1, z);
    }

    @Override // defpackage.lc0
    public boolean f(t30 t30Var) {
        ct0 ct0VarV = t30Var.v();
        boolean z = false;
        if (ct0VarV != null && ct0VarV.g) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.nk0
    public void g() {
        switch (this.d) {
            case 6:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.nk0
    public void h(int i, Object obj) {
        String str;
        switch (this.d) {
            case 6:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public FontFamily o(bw[] bwVarArr, ContentResolver contentResolver) throws IOException {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (bw bwVar : bwVarArr) {
            if (Objects.equals(bwVar.a.getScheme(), "systemfont")) {
                fontBuild = p(bwVar);
            } else {
                try {
                    Uri uri = bwVar.a;
                    str = bwVar.e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e2) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bwVar.c).setSlant(bwVar.d ? 1 : 0).setTtcIndex(bwVar.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font p(bw bwVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public String toString() {
        switch (this.d) {
            case 16:
                return "SharingStarted.Eagerly";
            case 17:
                return "SharingStarted.Lazily";
            case 18:
            default:
                return super.toString();
            case 19:
                return "ReusedSlotId";
        }
    }

    public kc0() {
        this.d = 25;
        new ConcurrentHashMap();
    }

    private final void r() {
    }

    @Override // defpackage.hd0
    public int a(int i) {
        return i;
    }

    @Override // defpackage.hd0
    public int d(int i) {
        return i;
    }

    private final void s(int i, Object obj) {
    }
}
