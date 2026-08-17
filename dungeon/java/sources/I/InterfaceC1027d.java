package I;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: I.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1027d {
    Object a();

    void b(int i10, int i11);

    void c(int i10, int i11, int i12);

    void clear();

    default void d(Function2 function2, Object obj) {
        function2.invoke(a(), obj);
    }

    void e(int i10, Object obj);

    default void f() {
    }

    void g(int i10, Object obj);

    void h(Object obj);

    void i();

    default void j() {
    }

    void k();
}
