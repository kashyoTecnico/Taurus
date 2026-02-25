package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Method from annotation default annotation not found: i */
/* JADX WARN: Method from annotation default annotation not found: n */
/* JADX WARN: Method from annotation default annotation not found: s */
/* compiled from: r8-map-id-a8fcd33ccb3955d164982b21dfd7d15e244571037dfaf274f0981e5de3b0a2e0 */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface mm {
    String c() default "";

    String f() default "";

    int[] l() default {};

    String m() default "";

    int v() default 1;
}
