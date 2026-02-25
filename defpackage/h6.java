package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
/* loaded from: classes.dex */
public final class h6 implements rg0 {
    public final String a;
    public final c21 b;
    public final List c;
    public final List d;
    public final jv e;
    public final xn f;
    public final h7 g;
    public final CharSequence h;
    public final i30 i;
    public e9 j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x093c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [h6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h6(java.lang.String r39, defpackage.c21 r40, java.util.List r41, java.util.List r42, defpackage.jv r43, defpackage.xn r44) {
        /*
            Method dump skipped, instructions count: 2590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.<init>(java.lang.String, c21, java.util.List, java.util.List, jv, xn):void");
    }

    @Override // defpackage.rg0
    public final float a() {
        float f;
        i30 i30Var = this.i;
        float f2 = i30Var.e;
        TextPaint textPaint = i30Var.b;
        if (!Float.isNaN(f2)) {
            return i30Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = i30Var.a;
        lineInstance.setText(new wd(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new di(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new ng0(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                ng0 ng0Var = (ng0) priorityQueue.peek();
                if (ng0Var != null && ((Number) ng0Var.e).intValue() - ((Number) ng0Var.d).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new ng0(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            ng0 ng0Var2 = (ng0) it.next();
            float desiredWidth = Layout.getDesiredWidth(i30Var.b(), ((Number) ng0Var2.d).intValue(), ((Number) ng0Var2.e).intValue(), textPaint);
            while (it.hasNext()) {
                ng0 ng0Var3 = (ng0) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(i30Var.b(), ((Number) ng0Var3.d).intValue(), ((Number) ng0Var3.e).intValue(), textPaint));
            }
            f = desiredWidth;
        }
        i30Var.e = f;
        return f;
    }

    @Override // defpackage.rg0
    public final boolean b() {
        e9 e9Var = this.j;
        if (e9Var != null ? e9Var.v() : false) {
            return true;
        }
        if (!this.k) {
            ej0 ej0Var = this.b.c;
            r1 r1Var = yr.a;
            r1 r1Var2 = yr.a;
            ww0 ww0VarL = (ww0) r1Var2.e;
            if (ww0VarL == null) {
                if (tr.d()) {
                    ww0VarL = r1Var2.l();
                    r1Var2.e = ww0VarL;
                } else {
                    ww0VarL = c4.d;
                }
            }
            if (((Boolean) ww0VarL.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rg0
    public final float c() {
        return this.i.c();
    }
}
