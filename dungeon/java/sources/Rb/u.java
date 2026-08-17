package Rb;

import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface u {

    public static final class a {
        public static void a(u uVar, CodedException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            uVar.reject(exception.getCode(), exception.getLocalizedMessage(), exception.getCause());
        }

        public static void b(u uVar) {
            uVar.resolve((Object) null);
        }

        public static void c(u uVar, double d10) {
            uVar.resolve(Double.valueOf(d10));
        }

        public static void d(u uVar, float f10) {
            uVar.resolve(Float.valueOf(f10));
        }

        public static void e(u uVar, int i10) {
            uVar.resolve(Integer.valueOf(i10));
        }

        public static void f(u uVar, String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            uVar.resolve((Object) result);
        }

        public static void g(u uVar, Collection result) {
            Intrinsics.checkNotNullParameter(result, "result");
            uVar.resolve(result);
        }

        public static void h(u uVar, Map result) {
            Intrinsics.checkNotNullParameter(result, "result");
            uVar.resolve(result);
        }

        public static void i(u uVar, boolean z10) {
            uVar.resolve(Boolean.valueOf(z10));
        }
    }

    void c();

    void d(boolean z10);

    void e(int i10);

    void f(double d10);

    void g(float f10);

    void h(Map map);

    void i(Collection collection);

    void j(CodedException codedException);

    void reject(String str, String str2, Throwable th);

    void resolve(Object obj);

    void resolve(String str);
}
